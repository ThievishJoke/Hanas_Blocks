package hana.hanas_blocks.fluid;

import hana.hanas_blocks.HanasBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {
    public static final FlowableFluid STILL_BLOOD = Registry.register(Registries.FLUID,
            Identifier.of(HanasBlocks.MOD_ID, "liquid_blood"), new LiquidBloodFluid.Still());
    public static final FlowableFluid FLOWING_BLOOD = Registry.register(Registries.FLUID,
            Identifier.of(HanasBlocks.MOD_ID, "flowing_liquid_blood"), new LiquidBloodFluid.Flowing());

    public static final Block LIQUID_BLOOD_BLOCK = Registry.register(Registries.BLOCK, Identifier.of(HanasBlocks.MOD_ID,
            "liquid_blood_block"), new FluidBlock(ModFluids.STILL_BLOOD, AbstractBlock.Settings.copy(Blocks.WATER)
            .replaceable().liquid()));
    public static final Item LIQUID_BLOOD_BUCKET = Registry.register(Registries.ITEM, Identifier.of(HanasBlocks.MOD_ID,
            "liquid_blood_bucket"), new BucketItem(ModFluids.STILL_BLOOD,
            new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static void registerFluids() {
        HanasBlocks.LOGGER.info("Registering Fluid for " + HanasBlocks.MOD_ID);
    }
}
