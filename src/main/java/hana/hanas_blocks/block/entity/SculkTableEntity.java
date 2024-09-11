package hana.hanas_blocks.block.entity;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
//import hana.hanas_blocks.recipe.SculkTableRecipe;
//import hana.hanas_blocks.screen.SculkTableScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

/*
public class SculkTableEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory{
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(5, ItemStack.EMPTY);

    private static final int INPUT_SLOT_1 = 0;
    private static final int INPUT_SLOT_2 = 1;
    private static final int OUTPUT_SLOT_A = 2;
    private static final int OUTPUT_SLOT_B = 3;
    private static final int FUEL_SLOT = 4;

    private int fuelBurnTime = 0;
    private int maxFuelBurnTime = 1000;

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 72;

    public SculkTableEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SCULK_TABLE_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> SculkTableEntity.this.progress;
                    case 1 -> SculkTableEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> SculkTableEntity.this.progress = value;
                    case 1 -> SculkTableEntity.this.maxProgress = value;
                }
            }

            @Override
            public int size() {
                return 2;
            }
        };
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("blockentity.hanas_blockentities");
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("sculk_table.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
        progress = nbt.getInt("sculk_table.progress");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new SculkTableScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }

    public void tick(World world, BlockPos pos, BlockState state) {
        if(world.isClient()) {
            return;
        }
        
        ItemStack inputSlot1 = inventory.get(INPUT_SLOT_1);
        ItemStack inputSlot2 = inventory.get(INPUT_SLOT_2);
        ItemStack fuelSlot = inventory.get(FUEL_SLOT);

        if(!inputSlot1.isEmpty() && !inputSlot2.isEmpty() && !fuelSlot.isEmpty()) {
            if(this.hasRecipe()) {
                this.increaseCraftProgress();
                markDirty(world, pos, state);

                if(hasCraftingFinished()) {
                    this.craftItem();
                    this.resetProgress();
                }
                if (fuelBurnTime <= 0) {
                    // Determine how long the fuel will burn based on the item in the fuel slot
                    // Adjust the fuel consumption logic as needed
                    int fuelBurnTime = getFuelBurnTime(fuelSlot);
                    if (fuelBurnTime > 0) {
                        // Decrease the fuel item count
                        fuelSlot.decrement(1);
                        this.fuelBurnTime = maxFuelBurnTime; // Start burning the fuel
                    }
                }
            } else {
                this.resetProgress();
            }
        } else {
            this.resetProgress();
            fuelBurnTime--;
            markDirty(world, pos, state);
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private void craftItem() {
        Optional<RecipeEntry<SculkTableRecipe>> recipe = getCurrentRecipe();

        this.removeStack(INPUT_SLOT_1, 1);
        this.removeStack(INPUT_SLOT_2, 1);
        if (fuelBurnTime <= 0) {
            
        }
        this.removeStack(FUEL_SLOT, 1);

        this.setStack(OUTPUT_SLOT_A, new ItemStack(recipe.get().value().getResult(null).getItem(),
            getStack(OUTPUT_SLOT_A).getCount() + recipe.get().value().getResult(null).getCount()));

        this.setStack(OUTPUT_SLOT_B, new ItemStack(recipe.get().value().getResult(null).getItem(),
            getStack(OUTPUT_SLOT_B).getCount() + recipe.get().value().getResult(null).getCount()));
    }

    private boolean hasCraftingFinished() {
        return progress >= maxProgress;
    }

    private void increaseCraftProgress() {
        progress++;
    }
    
    private boolean hasRecipe() {
        Optional<RecipeEntry<SculkTableRecipe>> recipe = getCurrentRecipe();

        return recipe.isPresent() && canInsertAmountIntoOutputSlot(recipe.get().value().getResult(null))
                && canInsertItemIntoOutputSlot(recipe.get().value().getResult(null).getItem());
    }

    private Optional<RecipeEntry<SculkTableRecipe>> getCurrentRecipe() {
        SimpleInventory inv = new SimpleInventory(this.size());
        for(int i = 0; i < this.size(); i++) {
            inv.setStack(i, this.getStack(i));
        }

        return getWorld().getRecipeManager().getFirstMatch(SculkTableRecipe.Type.INSTANCE, inv, getWorld());
    }

    private boolean canInsertItemIntoOutputSlot(Item item) {
        return this.getStack(OUTPUT_SLOT_A).getItem() == item || this.getStack(OUTPUT_SLOT_A).isEmpty() || this.getStack(OUTPUT_SLOT_B).getItem() == item || this.getStack(OUTPUT_SLOT_B).isEmpty();
        
    }

    private boolean canInsertAmountIntoOutputSlot(ItemStack result) {
        return this.getStack(OUTPUT_SLOT_A).getCount() + result.getCount() <= getStack(OUTPUT_SLOT_A).getMaxCount() || this.getStack(OUTPUT_SLOT_B).getCount() + result.getCount() <= getStack(OUTPUT_SLOT_B).getMaxCount();
    }

    //private boolean isOutputSlotEmptyOrReceivable() {
    //    return this.getStack(OUTPUT_SLOT_A).isEmpty() || this.getStack(OUTPUT_SLOT_A).getCount() < this.getStack(OUTPUT_SLOT_A).getMaxCount() || this.getStack(OUTPUT_SLOT_B).isEmpty() || this.getStack(OUTPUT_SLOT_B).getCount() < this.getStack(OUTPUT_SLOT_B).getMaxCount();
    //}

    private int getFuelBurnTime(ItemStack fuel) {
        // Implement a method to calculate how long a fuel item will burn
        // You can use a map of items and their burn times or any other method
        // Return the burn time in ticks (e.g., 200 ticks for 10 seconds)
        return 200; // Adjust this value
    }

    @Override
    public Object getScreenOpeningData(ServerPlayerEntity player) {
        return null;
    }
}
*/