package net.hana.hanas_blocks.block;

import net.hana.hanas_blocks.HanasBlocks;
import net.hana.hanas_blocks.block.custom.glass.TintedGlassSlabBlock;
import net.hana.hanas_blocks.block.custom.glass.TintedGlassStairsBlock;
import net.hana.hanas_blocks.block.custom.glass.TintedModGlassVerticalSlabBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class TintedGlassBlocks {

    public static final Block TINTED_GLASS_STAIRS = registerBlock("tinted_glass_stairs",
            new TintedGlassStairsBlock(Blocks.TINTED_GLASS.getDefaultState().getBlock(),
                    AbstractBlock.Settings.copy(Blocks.TINTED_GLASS).nonOpaque()));
    public static final Block TINTED_GLASS_SLAB = registerBlock("tinted_glass_slab",
            new TintedGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.TINTED_GLASS).nonOpaque()));
    public static final Block TINTED_GLASS_VERTICAL_SLAB = registerBlock("tinted_glass_vertical_slab",
            new TintedModGlassVerticalSlabBlock(AbstractBlock.Settings.copy(TintedGlassBlocks.TINTED_GLASS_SLAB)));

    public static final Block RED_STAINED_TINTED_GLASS = registerBlock("red_stained_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block RED_STAINED_TINTED_GLASS_STAIRS = registerBlock("red_stained_tinted_glass_stairs",
            new TintedGlassStairsBlock(TintedGlassBlocks.RED_STAINED_TINTED_GLASS.getDefaultState().getBlock(),
                    AbstractBlock.Settings.copy(RED_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block RED_STAINED_TINTED_GLASS_SLAB = registerBlock("red_stained_tinted_glass_slab",
            new TintedGlassSlabBlock(AbstractBlock.Settings.copy(RED_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block RED_STAINED_TINTED_GLASS_VERTICAL_SLAB = registerBlock("red_stained_tinted_glass_vertical_slab",
            new TintedModGlassVerticalSlabBlock(AbstractBlock.Settings.copy(RED_STAINED_TINTED_GLASS_SLAB).nonOpaque()));

    public static final Block ORANGE_STAINED_TINTED_GLASS = registerBlock("orange_stained_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block ORANGE_STAINED_TINTED_GLASS_STAIRS = registerBlock("orange_stained_tinted_glass_stairs",
            new TintedGlassStairsBlock(TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS.getDefaultState().getBlock(),
                    AbstractBlock.Settings.copy(ORANGE_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block ORANGE_STAINED_TINTED_GLASS_SLAB = registerBlock("orange_stained_tinted_glass_slab",
            new TintedGlassSlabBlock(AbstractBlock.Settings.copy(ORANGE_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block ORANGE_STAINED_TINTED_GLASS_VERTICAL_SLAB = registerBlock("orange_stained_tinted_glass_vertical_slab",
            new TintedModGlassVerticalSlabBlock(AbstractBlock.Settings.copy(ORANGE_STAINED_TINTED_GLASS_SLAB).nonOpaque()));

    public static final Block YELLOW_STAINED_TINTED_GLASS = registerBlock("yellow_stained_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block YELLOW_STAINED_TINTED_GLASS_STAIRS = registerBlock("yellow_stained_tinted_glass_stairs",
            new TintedGlassStairsBlock(YELLOW_STAINED_TINTED_GLASS.getDefaultState().getBlock(),
                    AbstractBlock.Settings.copy(YELLOW_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block YELLOW_STAINED_TINTED_GLASS_SLAB = registerBlock("yellow_stained_tinted_glass_slab",
            new TintedGlassSlabBlock(AbstractBlock.Settings.copy(YELLOW_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block YELLOW_STAINED_TINTED_GLASS_VERTICAL_SLAB = registerBlock("yellow_stained_tinted_glass_vertical_slab",
            new TintedModGlassVerticalSlabBlock(AbstractBlock.Settings.copy(YELLOW_STAINED_TINTED_GLASS_SLAB).nonOpaque()));

    public static final Block LIME_STAINED_TINTED_GLASS = registerBlock("lime_stained_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block LIME_STAINED_TINTED_GLASS_STAIRS = registerBlock("lime_stained_tinted_glass_stairs",
            new TintedGlassStairsBlock(LIME_STAINED_TINTED_GLASS.getDefaultState().getBlock(),
                    AbstractBlock.Settings.copy(LIME_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block LIME_STAINED_TINTED_GLASS_SLAB = registerBlock("lime_stained_tinted_glass_slab",
            new TintedGlassSlabBlock(AbstractBlock.Settings.copy(LIME_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block LIME_STAINED_TINTED_GLASS_VERTICAL_SLAB = registerBlock("lime_stained_tinted_glass_vertical_slab",
            new TintedModGlassVerticalSlabBlock(AbstractBlock.Settings.copy(LIME_STAINED_TINTED_GLASS_SLAB).nonOpaque()));

    public static final Block GREEN_STAINED_TINTED_GLASS = registerBlock("green_stained_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block GREEN_STAINED_TINTED_GLASS_STAIRS = registerBlock("green_stained_tinted_glass_stairs",
            new TintedGlassStairsBlock(GREEN_STAINED_TINTED_GLASS.getDefaultState().getBlock(),
                    AbstractBlock.Settings.copy(GREEN_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block GREEN_STAINED_TINTED_GLASS_SLAB = registerBlock("green_stained_tinted_glass_slab",
            new TintedGlassSlabBlock(AbstractBlock.Settings.copy(GREEN_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block GREEN_STAINED_TINTED_GLASS_VERTICAL_SLAB = registerBlock("green_stained_tinted_glass_vertical_slab",
            new TintedModGlassVerticalSlabBlock(AbstractBlock.Settings.copy(GREEN_STAINED_TINTED_GLASS_SLAB).nonOpaque()));

    public static final Block CYAN_STAINED_TINTED_GLASS = registerBlock("cyan_stained_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block CYAN_STAINED_TINTED_GLASS_STAIRS = registerBlock("cyan_stained_tinted_glass_stairs",
            new TintedGlassStairsBlock(CYAN_STAINED_TINTED_GLASS.getDefaultState().getBlock(),
                    AbstractBlock.Settings.copy(CYAN_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block CYAN_STAINED_TINTED_GLASS_SLAB = registerBlock("cyan_stained_tinted_glass_slab",
            new TintedGlassSlabBlock(AbstractBlock.Settings.copy(CYAN_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block CYAN_STAINED_TINTED_GLASS_VERTICAL_SLAB = registerBlock("cyan_stained_tinted_glass_vertical_slab",
            new TintedModGlassVerticalSlabBlock(AbstractBlock.Settings.copy(CYAN_STAINED_TINTED_GLASS_SLAB).nonOpaque()));

    public static final Block LIGHT_BLUE_STAINED_TINTED_GLASS = registerBlock("light_blue_stained_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block LIGHT_BLUE_STAINED_TINTED_GLASS_STAIRS = registerBlock("light_blue_stained_tinted_glass_stairs",
            new TintedGlassStairsBlock(LIGHT_BLUE_STAINED_TINTED_GLASS.getDefaultState().getBlock(),
                    AbstractBlock.Settings.copy(LIGHT_BLUE_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block LIGHT_BLUE_STAINED_TINTED_GLASS_SLAB = registerBlock("light_blue_stained_tinted_glass_slab",
            new TintedGlassSlabBlock(AbstractBlock.Settings.copy(LIGHT_BLUE_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block LIGHT_BLUE_STAINED_TINTED_GLASS_VERTICAL_SLAB = registerBlock("light_blue_stained_tinted_glass_vertical_slab",
            new TintedModGlassVerticalSlabBlock(AbstractBlock.Settings.copy(LIGHT_BLUE_STAINED_TINTED_GLASS_SLAB).nonOpaque()));

    public static final Block BLUE_STAINED_TINTED_GLASS = registerBlock("blue_stained_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block BLUE_STAINED_TINTED_GLASS_STAIRS = registerBlock("blue_stained_tinted_glass_stairs",
            new TintedGlassStairsBlock(BLUE_STAINED_TINTED_GLASS.getDefaultState().getBlock(),
                    AbstractBlock.Settings.copy(BLUE_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block BLUE_STAINED_TINTED_GLASS_SLAB = registerBlock("blue_stained_tinted_glass_slab",
            new TintedGlassSlabBlock(AbstractBlock.Settings.copy(BLUE_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block BLUE_STAINED_TINTED_GLASS_VERTICAL_SLAB = registerBlock("blue_stained_tinted_glass_vertical_slab",
            new TintedModGlassVerticalSlabBlock(AbstractBlock.Settings.copy(BLUE_STAINED_TINTED_GLASS_SLAB).nonOpaque()));

    public static final Block PURPLE_STAINED_TINTED_GLASS = registerBlock("purple_stained_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block PURPLE_STAINED_TINTED_GLASS_STAIRS = registerBlock("purple_stained_tinted_glass_stairs",
            new TintedGlassStairsBlock(PURPLE_STAINED_TINTED_GLASS.getDefaultState().getBlock(),
                    AbstractBlock.Settings.copy(PURPLE_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block PURPLE_STAINED_TINTED_GLASS_SLAB = registerBlock("purple_stained_tinted_glass_slab",
            new TintedGlassSlabBlock(AbstractBlock.Settings.copy(PURPLE_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block PURPLE_STAINED_TINTED_GLASS_VERTICAL_SLAB = registerBlock("purple_stained_tinted_glass_vertical_slab",
            new TintedModGlassVerticalSlabBlock(AbstractBlock.Settings.copy(PURPLE_STAINED_TINTED_GLASS_SLAB).nonOpaque()));

    public static final Block MAGENTA_STAINED_TINTED_GLASS = registerBlock("magenta_stained_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block MAGENTA_STAINED_TINTED_GLASS_STAIRS = registerBlock("magenta_stained_tinted_glass_stairs",
            new TintedGlassStairsBlock(MAGENTA_STAINED_TINTED_GLASS.getDefaultState().getBlock(),
                    AbstractBlock.Settings.copy(MAGENTA_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block MAGENTA_STAINED_TINTED_GLASS_SLAB = registerBlock("magenta_stained_tinted_glass_slab",
            new TintedGlassSlabBlock(AbstractBlock.Settings.copy(MAGENTA_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block MAGENTA_STAINED_TINTED_GLASS_VERTICAL_SLAB = registerBlock("magenta_stained_tinted_glass_vertical_slab",
            new TintedModGlassVerticalSlabBlock(AbstractBlock.Settings.copy(MAGENTA_STAINED_TINTED_GLASS_SLAB).nonOpaque()));

    public static final Block PINK_STAINED_TINTED_GLASS = registerBlock("pink_stained_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block PINK_STAINED_TINTED_GLASS_STAIRS = registerBlock("pink_stained_tinted_glass_stairs",
            new TintedGlassStairsBlock(PINK_STAINED_TINTED_GLASS.getDefaultState().getBlock(),
                    AbstractBlock.Settings.copy(PINK_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block PINK_STAINED_TINTED_GLASS_SLAB = registerBlock("pink_stained_tinted_glass_slab",
            new TintedGlassSlabBlock(AbstractBlock.Settings.copy(PINK_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block PINK_STAINED_TINTED_GLASS_VERTICAL_SLAB = registerBlock("pink_stained_tinted_glass_vertical_slab",
            new TintedModGlassVerticalSlabBlock(AbstractBlock.Settings.copy(PINK_STAINED_TINTED_GLASS_SLAB).nonOpaque()));

    public static final Block BROWN_STAINED_TINTED_GLASS = registerBlock("brown_stained_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block BROWN_STAINED_TINTED_GLASS_STAIRS = registerBlock("brown_stained_tinted_glass_stairs",
            new TintedGlassStairsBlock(BROWN_STAINED_TINTED_GLASS.getDefaultState().getBlock(),
                    AbstractBlock.Settings.copy(BROWN_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block BROWN_STAINED_TINTED_GLASS_SLAB = registerBlock("brown_stained_tinted_glass_slab",
            new TintedGlassSlabBlock(AbstractBlock.Settings.copy(BROWN_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block BROWN_STAINED_TINTED_GLASS_VERTICAL_SLAB = registerBlock("brown_stained_tinted_glass_vertical_slab",
            new TintedModGlassVerticalSlabBlock(AbstractBlock.Settings.copy(BROWN_STAINED_TINTED_GLASS_SLAB).nonOpaque()));

    public static final Block BLACK_STAINED_TINTED_GLASS = registerBlock("black_stained_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block BLACK_STAINED_TINTED_GLASS_STAIRS = registerBlock("black_stained_tinted_glass_stairs",
            new TintedGlassStairsBlock(BLACK_STAINED_TINTED_GLASS.getDefaultState().getBlock(),
                    AbstractBlock.Settings.copy(BLACK_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block BLACK_STAINED_TINTED_GLASS_SLAB = registerBlock("black_stained_tinted_glass_slab",
            new TintedGlassSlabBlock(AbstractBlock.Settings.copy(BLACK_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block BLACK_STAINED_TINTED_GLASS_VERTICAL_SLAB = registerBlock("black_stained_tinted_glass_vertical_slab",
            new TintedModGlassVerticalSlabBlock(AbstractBlock.Settings.copy(BLACK_STAINED_TINTED_GLASS_SLAB).nonOpaque()));

    public static final Block WHITE_STAINED_TINTED_GLASS = registerBlock("white_stained_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block WHITE_STAINED_TINTED_GLASS_STAIRS = registerBlock("white_stained_tinted_glass_stairs",
            new TintedGlassStairsBlock(WHITE_STAINED_TINTED_GLASS.getDefaultState().getBlock(),
                    AbstractBlock.Settings.copy(WHITE_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block WHITE_STAINED_TINTED_GLASS_SLAB = registerBlock("white_stained_tinted_glass_slab",
            new TintedGlassSlabBlock(AbstractBlock.Settings.copy(WHITE_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block WHITE_STAINED_TINTED_GLASS_VERTICAL_SLAB = registerBlock("white_stained_tinted_glass_vertical_slab",
            new TintedModGlassVerticalSlabBlock(AbstractBlock.Settings.copy(WHITE_STAINED_TINTED_GLASS_SLAB).nonOpaque()));

    public static final Block GRAY_STAINED_TINTED_GLASS = registerBlock("gray_stained_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block GRAY_STAINED_TINTED_GLASS_STAIRS = registerBlock("gray_stained_tinted_glass_stairs",
            new TintedGlassStairsBlock(GRAY_STAINED_TINTED_GLASS.getDefaultState().getBlock(),
                    AbstractBlock.Settings.copy(GRAY_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block GRAY_STAINED_TINTED_GLASS_SLAB = registerBlock("gray_stained_tinted_glass_slab",
            new TintedGlassSlabBlock(AbstractBlock.Settings.copy(GRAY_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block GRAY_STAINED_TINTED_GLASS_VERTICAL_SLAB = registerBlock("gray_stained_tinted_glass_vertical_slab",
            new TintedModGlassVerticalSlabBlock(AbstractBlock.Settings.copy(GRAY_STAINED_TINTED_GLASS_SLAB).nonOpaque()));

    public static final Block LIGHT_GRAY_STAINED_TINTED_GLASS = registerBlock("light_gray_stained_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block LIGHT_GRAY_STAINED_TINTED_GLASS_STAIRS = registerBlock("light_gray_stained_tinted_glass_stairs",
            new TintedGlassStairsBlock(LIGHT_GRAY_STAINED_TINTED_GLASS.getDefaultState().getBlock(),
                    AbstractBlock.Settings.copy(LIGHT_GRAY_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block LIGHT_GRAY_STAINED_TINTED_GLASS_SLAB = registerBlock("light_gray_stained_tinted_glass_slab",
            new TintedGlassSlabBlock(AbstractBlock.Settings.copy(LIGHT_GRAY_STAINED_TINTED_GLASS).nonOpaque()));
    public static final Block LIGHT_GRAY_STAINED_TINTED_GLASS_VERTICAL_SLAB = registerBlock("light_gray_stained_tinted_glass_vertical_slab",
            new TintedModGlassVerticalSlabBlock(AbstractBlock.Settings.copy(LIGHT_GRAY_STAINED_TINTED_GLASS_SLAB).nonOpaque()));

    static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(HanasBlocks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(HanasBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        HanasBlocks.LOGGER.info("Registering Tinted Glass for " + HanasBlocks.MOD_ID);
    }
}
