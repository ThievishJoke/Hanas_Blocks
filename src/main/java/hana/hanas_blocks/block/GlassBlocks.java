package hana.hanas_blocks.block;

import hana.hanas_blocks.HanasBlocks;
import hana.hanas_blocks.block.custom.ModVerticalSlabBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GlassBlocks {

    public static final Block GLASS_STAIRS = registerBlock("glass_stairs",
            new StairsBlock(Blocks.GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GLASS).nonOpaque()));
    public static final Block GLASS_SLAB = registerBlock("glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GLASS).nonOpaque()));
    public static final Block GLASS_VERTICAL_SLAB = registerBlock("glass_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.GLASS).nonOpaque()));

    public static final Block RED_STAINED_GLASS_STAIRS = registerBlock("red_stained_glass_stairs",
            new StairsBlock(Blocks.RED_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS).nonOpaque()));
    public static final Block RED_STAINED_GLASS_SLAB = registerBlock("red_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS).nonOpaque()));
    public static final Block RED_STAINED_GLASS_VERTICAL_SLAB = registerBlock("red_stained_glass_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS).nonOpaque()));

    public static final Block ORANGE_STAINED_GLASS_STAIRS = registerBlock("orange_stained_glass_stairs",
            new StairsBlock(Blocks.ORANGE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS).nonOpaque()));
    public static final Block ORANGE_STAINED_GLASS_SLAB = registerBlock("orange_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS).nonOpaque()));
    public static final Block ORANGE_STAINED_GLASS_VERTICAL_SLAB = registerBlock("orange_stained_glass_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS).nonOpaque()));

    public static final Block YELLOW_STAINED_GLASS_STAIRS = registerBlock("yellow_stained_glass_stairs",
            new StairsBlock(Blocks.YELLOW_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS).nonOpaque()));
    public static final Block YELLOW_STAINED_GLASS_SLAB = registerBlock("yellow_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS).nonOpaque()));
    public static final Block YELLOW_STAINED_GLASS_VERTICAL_SLAB = registerBlock("yellow_stained_glass_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS).nonOpaque()));

    public static final Block LIME_STAINED_GLASS_STAIRS = registerBlock("lime_stained_glass_stairs",
            new StairsBlock(Blocks.LIME_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS).nonOpaque()));
    public static final Block LIME_STAINED_GLASS_SLAB = registerBlock("lime_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS).nonOpaque()));
    public static final Block LIME_STAINED_GLASS_VERTICAL_SLAB = registerBlock("lime_stained_glass_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS).nonOpaque()));

    public static final Block GREEN_STAINED_GLASS_STAIRS = registerBlock("green_stained_glass_stairs",
            new StairsBlock(Blocks.GREEN_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS).nonOpaque()));
    public static final Block GREEN_STAINED_GLASS_SLAB = registerBlock("green_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS).nonOpaque()));
    public static final Block GREEN_STAINED_GLASS_VERTICAL_SLAB = registerBlock("green_stained_glass_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS).nonOpaque()));

    public static final Block CYAN_STAINED_GLASS_STAIRS = registerBlock("cyan_stained_glass_stairs",
            new StairsBlock(Blocks.CYAN_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS).nonOpaque()));
    public static final Block CYAN_STAINED_GLASS_SLAB = registerBlock("cyan_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS).nonOpaque()));
    public static final Block CYAN_STAINED_GLASS_VERTICAL_SLAB = registerBlock("cyan_stained_glass_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS).nonOpaque()));

    public static final Block LIGHT_BLUE_STAINED_GLASS_STAIRS = registerBlock("light_blue_stained_glass_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).nonOpaque()));
    public static final Block LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("light_blue_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).nonOpaque()));
    public static final Block LIGHT_BLUE_STAINED_GLASS_VERTICAL_SLAB = registerBlock("light_blue_stained_glass_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).nonOpaque()));

    public static final Block BLUE_STAINED_GLASS_STAIRS = registerBlock("blue_stained_glass_stairs",
            new StairsBlock(Blocks.BLUE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS).nonOpaque()));
    public static final Block BLUE_STAINED_GLASS_SLAB = registerBlock("blue_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS).nonOpaque()));
    public static final Block BLUE_STAINED_GLASS_VERTICAL_SLAB = registerBlock("blue_stained_glass_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS).nonOpaque()));

    public static final Block PURPLE_STAINED_GLASS_STAIRS = registerBlock("purple_stained_glass_stairs",
            new StairsBlock(Blocks.PURPLE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS).nonOpaque()));
    public static final Block PURPLE_STAINED_GLASS_SLAB = registerBlock("purple_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS).nonOpaque()));
    public static final Block PURPLE_STAINED_GLASS_VERTICAL_SLAB = registerBlock("purple_stained_glass_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS).nonOpaque()));

    public static final Block MAGENTA_STAINED_GLASS_STAIRS = registerBlock("magenta_stained_glass_stairs",
            new StairsBlock(Blocks.MAGENTA_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS).nonOpaque()));
    public static final Block MAGENTA_STAINED_GLASS_SLAB = registerBlock("magenta_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS).nonOpaque()));
    public static final Block MAGENTA_STAINED_GLASS_VERTICAL_SLAB = registerBlock("magenta_stained_glass_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS).nonOpaque()));

    public static final Block PINK_STAINED_GLASS_STAIRS = registerBlock("pink_stained_glass_stairs",
            new StairsBlock(Blocks.PINK_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS).nonOpaque()));
    public static final Block PINK_STAINED_GLASS_SLAB = registerBlock("pink_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS).nonOpaque()));
    public static final Block PINK_STAINED_GLASS_VERTICAL_SLAB = registerBlock("pink_stained_glass_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS).nonOpaque()));

    public static final Block GRAY_STAINED_GLASS_STAIRS = registerBlock("gray_stained_glass_stairs",
            new StairsBlock(Blocks.GRAY_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS).nonOpaque()));
    public static final Block GRAY_STAINED_GLASS_SLAB = registerBlock("gray_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS).nonOpaque()));
    public static final Block GRAY_STAINED_GLASS_VERTICAL_SLAB = registerBlock("gray_stained_glass_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS).nonOpaque()));

    public static final Block LIGHT_GRAY_STAINED_GLASS_STAIRS = registerBlock("light_gray_stained_glass_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS).nonOpaque()));
    public static final Block LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("light_gray_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS).nonOpaque()));
    public static final Block LIGHT_GRAY_STAINED_GLASS_VERTICAL_SLAB = registerBlock("light_gray_stained_glass_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS).nonOpaque()));

    public static final Block BROWN_STAINED_GLASS_STAIRS = registerBlock("brown_stained_glass_stairs",
            new StairsBlock(Blocks.BROWN_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS).nonOpaque()));
    public static final Block BROWN_STAINED_GLASS_SLAB = registerBlock("brown_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS).nonOpaque()));
    public static final Block BROWN_STAINED_GLASS_VERTICAL_SLAB = registerBlock("brown_stained_glass_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS).nonOpaque()));

    public static final Block BLACK_STAINED_GLASS_STAIRS = registerBlock("black_stained_glass_stairs",
            new StairsBlock(Blocks.BLACK_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS).nonOpaque()));
    public static final Block BLACK_STAINED_GLASS_SLAB = registerBlock("black_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS).nonOpaque()));
    public static final Block BLACK_STAINED_GLASS_VERTICAL_SLAB = registerBlock("black_stained_glass_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS).nonOpaque()));

    public static final Block WHITE_STAINED_GLASS_STAIRS = registerBlock("white_stained_glass_stairs",
            new StairsBlock(Blocks.WHITE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS).nonOpaque()));
    public static final Block WHITE_STAINED_GLASS_SLAB = registerBlock("white_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS).nonOpaque()));
    public static final Block WHITE_STAINED_GLASS_VERTICAL_SLAB = registerBlock("white_stained_glass_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS).nonOpaque()));

    static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(HanasBlocks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(HanasBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        HanasBlocks.LOGGER.info("Registering ModBlocks for " + HanasBlocks.MOD_ID);
    }
}
