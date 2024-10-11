package hana.hanas_blocks.screen;

import hana.hanas_blocks.block.entity.SculkTableEntity;
import hana.hanas_blocks.util.ModTags;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.math.BlockPos;

public class SculkTableScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    private final PropertyDelegate propertyDelegate;
    public final SculkTableEntity blockEntity;

    public SculkTableScreenHandler(int syncId, PlayerInventory playerInventory, BlockPos pos) {
        this(syncId, playerInventory, playerInventory.player.getWorld().getBlockEntity(pos), new ArrayPropertyDelegate(2));
    }

    public SculkTableScreenHandler(int syncId, PlayerInventory playerInventory, BlockEntity blockEntity, PropertyDelegate arrayPropertyDelegate) {
        super(ModScreenHandlers.SCULK_TABLE_HANDLER, syncId);
        checkSize((Inventory) blockEntity, 5);
        this.inventory = (Inventory) blockEntity;
        this.propertyDelegate = arrayPropertyDelegate;
        this.blockEntity = (SculkTableEntity) blockEntity;

        // Slot for material dust
        this.addSlot(new Slot(inventory, 0, 54, 11) {
            @Override
            public boolean canInsert(ItemStack stack) {
                return isMaterialDust(stack);
            }
        });
        // Slot for alloy material
        this.addSlot(new Slot(inventory, 1, 80, 11) {
            @Override
            public boolean canInsert(ItemStack stack) {
                return isAlloyMaterial(stack);
            }
        });
        // Fuel slot
        this.addSlot(new Slot(inventory, 2, 106, 11) {
            @Override
            public boolean canInsert(ItemStack stack) {
                return isFuel(stack);
            }
        });
        // Result
        this.addSlot(new Slot(inventory, 3, 67, 59) {
            @Override
            public boolean canTakePartial(PlayerEntity player) {
                return true;
            }
        });
        // Waste
        this.addSlot(new Slot(inventory, 4, 94, 59) {
            @Override
            public boolean canTakePartial(PlayerEntity player) {
                return true;
            }
        });

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
        addProperties(arrayPropertyDelegate);
    }

    public boolean isCrafting() {
        return propertyDelegate.get(0) > 0;
    }

    public int getScaledProgress() {
        int progress = this.propertyDelegate.get(0);
        int maxProgress = this.propertyDelegate.get(1);
        int progressArrowSize = 26;

        return maxProgress != 0 && progress != 0 ? progress * progressArrowSize / maxProgress : 0;
    }

    private boolean isMaterialDust(ItemStack stack) {
        return stack.isIn(ModTags.Items.MATERIAL_DUST);
    }

    private boolean isAlloyMaterial(ItemStack stack) {
        return stack.isIn(ModTags.Items.ALLOY_MATERIAL);
    }

    private boolean isFuel(ItemStack stack) {
        return stack.isOf(Items.COAL) || stack.isOf(Items.CHARCOAL); // Example
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}
