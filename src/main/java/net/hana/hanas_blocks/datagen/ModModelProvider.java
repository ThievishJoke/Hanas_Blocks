package net.hana.hanas_blocks.datagen;

import net.hana.hanas_blocks.block.ConcreteBlocks;
import net.hana.hanas_blocks.block.GlassBlocks;
import net.hana.hanas_blocks.block.ModBlocks;
import net.hana.hanas_blocks.block.TintedGlassBlocks;
import net.hana.hanas_blocks.block.enums.VerticalSlabType;
import net.hana.hanas_blocks.property.ModProperties;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.hana.hanas_blocks.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.state.property.Properties;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    //public static final TextureKey HANAFLOWERBED = TextureKey.of("hanaflowerbed");

    //public static TextureMap hanaflowerbed(Block block) {
    //    return new TextureMap().put(TextureKey.FLOWERBED, TextureMap.getId(block)).put(TextureKey.STEM, TextureMap.getSubId(block, "_stem"));
    //}

    private static final String TOP_SUFFIX = "_top";
    private static final String SIDE_SUFFIX = "_side";
    private static final String BOTTOM_SUFFIX = "_bottom";

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BURNING_BLAZE_POWDERED_BLOCK);
        
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHARCOAL_BLOCK);

        BlockStateModelGenerator.BlockTexturePool iron_grate_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.IRON_GRATE);
        iron_grate_Pool.slab(ModBlocks.IRON_GRATE_SLAB);
        iron_grate_Pool.stairs(ModBlocks.IRON_GRATE_STAIRS);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.IRON_GRATE_TRAPDOOR);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_IRON);

        blockStateModelGenerator.registerSingleton(ModBlocks.OAK_PLANK_BOOKSHELF, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.SPRUCE_PLANK_BOOKSHELF, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.BIRCH_PLANK_BOOKSHELF, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.JUNGLE_PLANK_BOOKSHELF, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.ACACIA_PLANK_BOOKSHELF, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHERRY_PLANK_BOOKSHELF, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.DARK_OAK_PLANK_BOOKSHELF, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.MANGROVE_PLANK_BOOKSHELF, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.BAMBOO_PLANK_BOOKSHELF, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.WARPED_PLANK_BOOKSHELF, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CRIMSON_PLANK_BOOKSHELF, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SCRAP_BLOCK);
        
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRON_SHEET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GOLD_SHEET_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_QUARTZ_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COPPER_SHEET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_COPPER_SHEET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_COPPER_SHEET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_COPPER_SHEET_BLOCK);
        blockStateModelGenerator.registerParented(ModBlocks.COPPER_SHEET_BLOCK, ModBlocks.WAXED_COPPER_SHEET_BLOCK);
        blockStateModelGenerator.registerParented(ModBlocks.EXPOSED_COPPER_SHEET_BLOCK, ModBlocks.WAXED_EXPOSED_COPPER_SHEET_BLOCK);
        blockStateModelGenerator.registerParented(ModBlocks.WEATHERED_COPPER_SHEET_BLOCK, ModBlocks.WAXED_WEATHERED_COPPER_SHEET_BLOCK);
        blockStateModelGenerator.registerParented(ModBlocks.OXIDIZED_COPPER_SHEET_BLOCK, ModBlocks.WAXED_OXIDIZED_COPPER_SHEET_BLOCK);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_NETHERITE_BRICK)
                .family(ModBlocks.FAMILY_ANCIENT_NETHERITE_BRICK)
                .parented(ModBlocks.ANCIENT_NETHERITE_BRICK, ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK)
                .family(ModBlocks.FAMILY_SEALED_ANCIENT_NETHERITE_BRICK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK)
                .family(ModBlocks.FAMILY_DULL_ANCIENT_NETHERITE_BRICK)
                .parented(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK, ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK)
                .family(ModBlocks.FAMILY_SEALED_DULL_ANCIENT_NETHERITE_BRICK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK)
                .family(ModBlocks.FAMILY_TARNISHED_ANCIENT_NETHERITE_BRICK)
                .parented(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK, ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK)
                .family(ModBlocks.FAMILY_SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK)
                .family(ModBlocks.FAMILY_RUINED_ANCIENT_NETHERITE_BRICK)
                .parented(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK, ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK)
                .family(ModBlocks.FAMILY_SEALED_RUINED_ANCIENT_NETHERITE_BRICK);

        //Sculked Blocks

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_CRYSTAL_AMETHYST);

        BlockStateModelGenerator.BlockTexturePool honey_comb_bricks_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HONEY_COMB_BRICKS);
        honey_comb_bricks_Pool.slab(ModBlocks.HONEY_COMB_BRICK_SLAB);
        honey_comb_bricks_Pool.stairs(ModBlocks.HONEY_COMB_BRICK_STAIRS);
        honey_comb_bricks_Pool.wall(ModBlocks.HONEY_COMB_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool polished_prismarine_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_PRISMARINE);
        polished_prismarine_Pool.slab(ModBlocks.POLISHED_PRISMARINE_SLAB);
        polished_prismarine_Pool.stairs(ModBlocks.POLISHED_PRISMARINE_STAIRS);
        polished_prismarine_Pool.wall(ModBlocks.POLISHED_PRISMARINE_WALL);

        //Ice
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_ICE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_ICE_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_POLISHED_ICE_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_POLISHED_ICE_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FROSTED_ICE_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_CRYSTAL_ICE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_BRICK_TILE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_ICE_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_ICE_BRICK);

        // Concrete
        BlockStateModelGenerator.BlockTexturePool red_Concrete_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE);
        red_Concrete_Pool.slab(ConcreteBlocks.RED_CONCRETE_SLAB);
        red_Concrete_Pool.stairs(ConcreteBlocks.RED_CONCRETE_STAIRS);
        red_Concrete_Pool.wall(ConcreteBlocks.RED_CONCRETE_WALL);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.RED_CONCRETE, ConcreteBlocks.RED_CONCRETE_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool orange_Concrete_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE);
        orange_Concrete_Pool.slab(ConcreteBlocks.ORANGE_CONCRETE_SLAB);
        orange_Concrete_Pool.stairs(ConcreteBlocks.ORANGE_CONCRETE_STAIRS);
        orange_Concrete_Pool.wall(ConcreteBlocks.ORANGE_CONCRETE_WALL);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.ORANGE_CONCRETE, ConcreteBlocks.ORANGE_CONCRETE_VERTICAL_SLAB);

        BlockStateModelGenerator.BlockTexturePool yellow_Concrete_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE);
        yellow_Concrete_Pool.slab(ConcreteBlocks.YELLOW_CONCRETE_SLAB);
        yellow_Concrete_Pool.stairs(ConcreteBlocks.YELLOW_CONCRETE_STAIRS);
        yellow_Concrete_Pool.wall(ConcreteBlocks.YELLOW_CONCRETE_WALL);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.YELLOW_CONCRETE, ConcreteBlocks.YELLOW_CONCRETE_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool lime_Concrete_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE);
        lime_Concrete_Pool.slab(ConcreteBlocks.LIME_CONCRETE_SLAB);
        lime_Concrete_Pool.stairs(ConcreteBlocks.LIME_CONCRETE_STAIRS);
        lime_Concrete_Pool.wall(ConcreteBlocks.LIME_CONCRETE_WALL);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.LIME_CONCRETE, ConcreteBlocks.LIME_CONCRETE_VERTICAL_SLAB);

        BlockStateModelGenerator.BlockTexturePool green_Concrete_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE);
        green_Concrete_Pool.slab(ConcreteBlocks.GREEN_CONCRETE_SLAB);
        green_Concrete_Pool.stairs(ConcreteBlocks.GREEN_CONCRETE_STAIRS);
        green_Concrete_Pool.wall(ConcreteBlocks.GREEN_CONCRETE_WALL);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.GREEN_CONCRETE, ConcreteBlocks.GREEN_CONCRETE_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool cyan_Concrete_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE);
        cyan_Concrete_Pool.slab(ConcreteBlocks.CYAN_CONCRETE_SLAB);
        cyan_Concrete_Pool.stairs(ConcreteBlocks.CYAN_CONCRETE_STAIRS);
        cyan_Concrete_Pool.wall(ConcreteBlocks.CYAN_CONCRETE_WALL);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CYAN_CONCRETE, ConcreteBlocks.CYAN_CONCRETE_VERTICAL_SLAB);

        BlockStateModelGenerator.BlockTexturePool light_blue_Concrete_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE);
        light_blue_Concrete_Pool.slab(ConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        light_blue_Concrete_Pool.stairs(ConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        light_blue_Concrete_Pool.wall(ConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.LIGHT_BLUE_CONCRETE, ConcreteBlocks.LIGHT_BLUE_CONCRETE_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool blue_Concrete_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE);
        blue_Concrete_Pool.slab(ConcreteBlocks.BLUE_CONCRETE_SLAB);
        blue_Concrete_Pool.stairs(ConcreteBlocks.BLUE_CONCRETE_STAIRS);
        blue_Concrete_Pool.wall(ConcreteBlocks.BLUE_CONCRETE_WALL);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BLUE_CONCRETE, ConcreteBlocks.BLUE_CONCRETE_VERTICAL_SLAB);

        BlockStateModelGenerator.BlockTexturePool purple_Concrete_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE);
        purple_Concrete_Pool.slab(ConcreteBlocks.PURPLE_CONCRETE_SLAB);
        purple_Concrete_Pool.stairs(ConcreteBlocks.PURPLE_CONCRETE_STAIRS);
        purple_Concrete_Pool.wall(ConcreteBlocks.PURPLE_CONCRETE_WALL);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.PURPLE_CONCRETE, ConcreteBlocks.PURPLE_CONCRETE_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool magenta_Concrete_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE);
        magenta_Concrete_Pool.slab(ConcreteBlocks.MAGENTA_CONCRETE_SLAB);
        magenta_Concrete_Pool.stairs(ConcreteBlocks.MAGENTA_CONCRETE_STAIRS);
        magenta_Concrete_Pool.wall(ConcreteBlocks.MAGENTA_CONCRETE_WALL);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.MAGENTA_CONCRETE, ConcreteBlocks.MAGENTA_CONCRETE_VERTICAL_SLAB);

        BlockStateModelGenerator.BlockTexturePool pink_Concrete_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE);
        pink_Concrete_Pool.slab(ConcreteBlocks.PINK_CONCRETE_SLAB);
        pink_Concrete_Pool.stairs(ConcreteBlocks.PINK_CONCRETE_STAIRS);
        pink_Concrete_Pool.wall(ConcreteBlocks.PINK_CONCRETE_WALL);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.PINK_CONCRETE, ConcreteBlocks.PINK_CONCRETE_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool brown_Concrete_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE);
        brown_Concrete_Pool.slab(ConcreteBlocks.BROWN_CONCRETE_SLAB);
        brown_Concrete_Pool.stairs(ConcreteBlocks.BROWN_CONCRETE_STAIRS);
        brown_Concrete_Pool.wall(ConcreteBlocks.BROWN_CONCRETE_WALL);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BROWN_CONCRETE, ConcreteBlocks.BROWN_CONCRETE_VERTICAL_SLAB);

        BlockStateModelGenerator.BlockTexturePool black_Concrete_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE);
        black_Concrete_Pool.slab(ConcreteBlocks.BLACK_CONCRETE_SLAB);
        black_Concrete_Pool.stairs(ConcreteBlocks.BLACK_CONCRETE_STAIRS);
        black_Concrete_Pool.wall(ConcreteBlocks.BLACK_CONCRETE_WALL);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BLACK_CONCRETE, ConcreteBlocks.BLACK_CONCRETE_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool white_Concrete_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE);
        white_Concrete_Pool.slab(ConcreteBlocks.WHITE_CONCRETE_SLAB);
        white_Concrete_Pool.stairs(ConcreteBlocks.WHITE_CONCRETE_STAIRS);
        white_Concrete_Pool.wall(ConcreteBlocks.WHITE_CONCRETE_WALL);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.WHITE_CONCRETE, ConcreteBlocks.WHITE_CONCRETE_VERTICAL_SLAB);

        BlockStateModelGenerator.BlockTexturePool light_gray_Concrete_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE);
        light_gray_Concrete_Pool.slab(ConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        light_gray_Concrete_Pool.stairs(ConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        light_gray_Concrete_Pool.wall(ConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.LIGHT_GRAY_CONCRETE, ConcreteBlocks.LIGHT_GRAY_CONCRETE_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool gray_Concrete_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE);
        gray_Concrete_Pool.slab(ConcreteBlocks.GRAY_CONCRETE_SLAB);
        gray_Concrete_Pool.stairs(ConcreteBlocks.GRAY_CONCRETE_STAIRS);
        gray_Concrete_Pool.wall(ConcreteBlocks.GRAY_CONCRETE_WALL);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.GRAY_CONCRETE, ConcreteBlocks.GRAY_CONCRETE_VERTICAL_SLAB);

        // Normal Glass
        BlockStateModelGenerator.BlockTexturePool glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GLASS);
        glass_Pool.slab(GlassBlocks.GLASS_SLAB);
        glass_Pool.stairs(GlassBlocks.GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.GLASS, GlassBlocks.GLASS_VERTICAL_SLAB);

        BlockStateModelGenerator.BlockTexturePool red_stained_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_STAINED_GLASS);
        red_stained_glass_Pool.slab(GlassBlocks.RED_STAINED_GLASS_SLAB);
        red_stained_glass_Pool.stairs(GlassBlocks.RED_STAINED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.RED_STAINED_GLASS, GlassBlocks.RED_STAINED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool orange_stained_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_STAINED_GLASS);
        orange_stained_glass_Pool.slab(GlassBlocks.ORANGE_STAINED_GLASS_SLAB);
        orange_stained_glass_Pool.stairs(GlassBlocks.ORANGE_STAINED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.ORANGE_STAINED_GLASS, GlassBlocks.ORANGE_STAINED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool yellow_stained_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_STAINED_GLASS);
        yellow_stained_glass_Pool.slab(GlassBlocks.YELLOW_STAINED_GLASS_SLAB);
        yellow_stained_glass_Pool.stairs(GlassBlocks.YELLOW_STAINED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.YELLOW_STAINED_GLASS, GlassBlocks.YELLOW_STAINED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool lime_stained_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_STAINED_GLASS);
        lime_stained_glass_Pool.slab(GlassBlocks.LIME_STAINED_GLASS_SLAB);
        lime_stained_glass_Pool.stairs(GlassBlocks.LIME_STAINED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.LIME_STAINED_GLASS, GlassBlocks.LIME_STAINED_GLASS_VERTICAL_SLAB);

        BlockStateModelGenerator.BlockTexturePool green_stained_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_STAINED_GLASS);
        green_stained_glass_Pool.slab(GlassBlocks.GREEN_STAINED_GLASS_SLAB);
        green_stained_glass_Pool.stairs(GlassBlocks.GREEN_STAINED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.GREEN_STAINED_GLASS, GlassBlocks.GREEN_STAINED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool cyan_stained_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_STAINED_GLASS);
        cyan_stained_glass_Pool.slab(GlassBlocks.CYAN_STAINED_GLASS_SLAB);
        cyan_stained_glass_Pool.stairs(GlassBlocks.CYAN_STAINED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CYAN_STAINED_GLASS, GlassBlocks.CYAN_STAINED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool light_blue_stained_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_STAINED_GLASS);
        light_blue_stained_glass_Pool.slab(GlassBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB);
        light_blue_stained_glass_Pool.stairs(GlassBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.LIGHT_BLUE_STAINED_GLASS, GlassBlocks.LIGHT_BLUE_STAINED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool blue_stained_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_STAINED_GLASS);
        blue_stained_glass_Pool.slab(GlassBlocks.BLUE_STAINED_GLASS_SLAB);
        blue_stained_glass_Pool.stairs(GlassBlocks.BLUE_STAINED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BLUE_STAINED_GLASS, GlassBlocks.BLUE_STAINED_GLASS_VERTICAL_SLAB);

        BlockStateModelGenerator.BlockTexturePool purple_stained_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_STAINED_GLASS);
        purple_stained_glass_Pool.slab(GlassBlocks.PURPLE_STAINED_GLASS_SLAB);
        purple_stained_glass_Pool.stairs(GlassBlocks.PURPLE_STAINED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.PURPLE_STAINED_GLASS, GlassBlocks.PURPLE_STAINED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool magenta_stained_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_STAINED_GLASS);
        magenta_stained_glass_Pool.slab(GlassBlocks.MAGENTA_STAINED_GLASS_SLAB);
        magenta_stained_glass_Pool.stairs(GlassBlocks.MAGENTA_STAINED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.MAGENTA_STAINED_GLASS, GlassBlocks.MAGENTA_STAINED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool pink_stained_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_STAINED_GLASS);
        pink_stained_glass_Pool.slab(GlassBlocks.PINK_STAINED_GLASS_SLAB);
        pink_stained_glass_Pool.stairs(GlassBlocks.PINK_STAINED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.PINK_STAINED_GLASS, GlassBlocks.PINK_STAINED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool brown_stained_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_STAINED_GLASS);
        brown_stained_glass_Pool.slab(GlassBlocks.BROWN_STAINED_GLASS_SLAB);
        brown_stained_glass_Pool.stairs(GlassBlocks.BROWN_STAINED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BROWN_STAINED_GLASS, GlassBlocks.BROWN_STAINED_GLASS_VERTICAL_SLAB);

        BlockStateModelGenerator.BlockTexturePool black_stained_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_STAINED_GLASS);
        black_stained_glass_Pool.slab(GlassBlocks.BLACK_STAINED_GLASS_SLAB);
        black_stained_glass_Pool.stairs(GlassBlocks.BLACK_STAINED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BLACK_STAINED_GLASS, GlassBlocks.BLACK_STAINED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool white_stained_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_STAINED_GLASS);
        white_stained_glass_Pool.slab(GlassBlocks.WHITE_STAINED_GLASS_SLAB);
        white_stained_glass_Pool.stairs(GlassBlocks.WHITE_STAINED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.WHITE_STAINED_GLASS, GlassBlocks.WHITE_STAINED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool gray_stained_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_STAINED_GLASS);
        gray_stained_glass_Pool.slab(GlassBlocks.GRAY_STAINED_GLASS_SLAB);
        gray_stained_glass_Pool.stairs(GlassBlocks.GRAY_STAINED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.GRAY_STAINED_GLASS, GlassBlocks.GRAY_STAINED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool light_gray_stained_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_STAINED_GLASS);
        light_gray_stained_glass_Pool.slab(GlassBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB);
        light_gray_stained_glass_Pool.stairs(GlassBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.LIGHT_GRAY_STAINED_GLASS, GlassBlocks.LIGHT_GRAY_STAINED_GLASS_VERTICAL_SLAB);

        // Tinted Glass

        BlockStateModelGenerator.BlockTexturePool tinted_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.TINTED_GLASS);
        tinted_glass_Pool.slab(TintedGlassBlocks.TINTED_GLASS_SLAB);
        tinted_glass_Pool.stairs(TintedGlassBlocks.TINTED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.TINTED_GLASS, TintedGlassBlocks.TINTED_GLASS_VERTICAL_SLAB);

        BlockStateModelGenerator.BlockTexturePool red_stained_tinted_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(TintedGlassBlocks.RED_STAINED_TINTED_GLASS);
        red_stained_tinted_glass_Pool.slab(TintedGlassBlocks.RED_STAINED_TINTED_GLASS_SLAB);
        red_stained_tinted_glass_Pool.stairs(TintedGlassBlocks.RED_STAINED_TINTED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TintedGlassBlocks.RED_STAINED_TINTED_GLASS, TintedGlassBlocks.RED_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool orange_stained_tinted_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS);
        orange_stained_tinted_glass_Pool.slab(TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS_SLAB);
        orange_stained_tinted_glass_Pool.stairs(TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS, TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool yellow_stained_tinted_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS);
        yellow_stained_tinted_glass_Pool.slab(TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS_SLAB);
        yellow_stained_tinted_glass_Pool.stairs(TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS, TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool lime_stained_tinted_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(TintedGlassBlocks.LIME_STAINED_TINTED_GLASS);
        lime_stained_tinted_glass_Pool.slab(TintedGlassBlocks.LIME_STAINED_TINTED_GLASS_SLAB);
        lime_stained_tinted_glass_Pool.stairs(TintedGlassBlocks.LIME_STAINED_TINTED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TintedGlassBlocks.LIME_STAINED_TINTED_GLASS, TintedGlassBlocks.LIME_STAINED_TINTED_GLASS_VERTICAL_SLAB);

        BlockStateModelGenerator.BlockTexturePool green_stained_tinted_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS);
        green_stained_tinted_glass_Pool.slab(TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS_SLAB);
        green_stained_tinted_glass_Pool.stairs(TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS, TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool cyan_stained_tinted_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS);
        cyan_stained_tinted_glass_Pool.slab(TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS_SLAB);
        cyan_stained_tinted_glass_Pool.stairs(TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS, TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool light_blue_stained_tinted_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS);
        light_blue_stained_tinted_glass_Pool.slab(TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS_SLAB);
        light_blue_stained_tinted_glass_Pool.stairs(TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS, TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool blue_stained_tinted_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS);
        blue_stained_tinted_glass_Pool.slab(TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS_SLAB);
        blue_stained_tinted_glass_Pool.stairs(TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS, TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS_VERTICAL_SLAB);

        BlockStateModelGenerator.BlockTexturePool purple_stained_tinted_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS);
        purple_stained_tinted_glass_Pool.slab(TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS_SLAB);
        purple_stained_tinted_glass_Pool.stairs(TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS, TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool magenta_stained_tinted_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS);
        magenta_stained_tinted_glass_Pool.slab(TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS_SLAB);
        magenta_stained_tinted_glass_Pool.stairs(TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS, TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool pink_stained_tinted_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(TintedGlassBlocks.PINK_STAINED_TINTED_GLASS);
        pink_stained_tinted_glass_Pool.slab(TintedGlassBlocks.PINK_STAINED_TINTED_GLASS_SLAB);
        pink_stained_tinted_glass_Pool.stairs(TintedGlassBlocks.PINK_STAINED_TINTED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TintedGlassBlocks.PINK_STAINED_TINTED_GLASS, TintedGlassBlocks.PINK_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool brown_stained_tinted_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS);
        brown_stained_tinted_glass_Pool.slab(TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS_SLAB);
        brown_stained_tinted_glass_Pool.stairs(TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS, TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS_VERTICAL_SLAB);

        BlockStateModelGenerator.BlockTexturePool black_stained_tinted_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS);
        black_stained_tinted_glass_Pool.slab(TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS_SLAB);
        black_stained_tinted_glass_Pool.stairs(TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS, TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool white_stained_tinted_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS);
        white_stained_tinted_glass_Pool.slab(TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS_SLAB);
        white_stained_tinted_glass_Pool.stairs(TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS, TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool gray_stained_tinted_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS);
        gray_stained_tinted_glass_Pool.slab(TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS_SLAB);
        gray_stained_tinted_glass_Pool.stairs(TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS, TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        BlockStateModelGenerator.BlockTexturePool light_gray_stained_tinted_glass_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS);
        light_gray_stained_tinted_glass_Pool.slab(TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS_SLAB);
        light_gray_stained_tinted_glass_Pool.stairs(TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS_STAIRS);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS, TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS_VERTICAL_SLAB);

        /*
        BlockStateModelGenerator.BlockTexturePool polished_ice_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ICE);
        POLISHED_ICE
        BlockStateModelGenerator.BlockTexturePool polished_ice_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ICE);
        POLISHED_ICE_BRICK
        BlockStateModelGenerator.BlockTexturePool polished_ice_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ICE);
        CHISELED_POLISHED_ICE_BRICK
        BlockStateModelGenerator.BlockTexturePool polished_ice_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ICE);
        CRACKED_POLISHED_ICE_BRICK
        BlockStateModelGenerator.BlockTexturePool polished_ice_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ICE);
        FROSTED_ICE_BRICK
        BlockStateModelGenerator.BlockTexturePool polished_ice_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ICE);
        CUT_CRYSTAL_ICE_BLOCK
        BlockStateModelGenerator.BlockTexturePool polished_ice_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ICE);
        ICE_BRICK
        BlockStateModelGenerator.BlockTexturePool polished_ice_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ICE);
        ICE_BRICK_TILE
        BlockStateModelGenerator.BlockTexturePool polished_ice_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ICE);
        CHISELED_ICE_BRICK
        BlockStateModelGenerator.BlockTexturePool polished_ice_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ICE);
        CRACKED_ICE_BRICK
        */

        BlockStateModelGenerator.BlockTexturePool hanas_dripstone_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DRIPSTONE_BLOCK);
        hanas_dripstone_Pool.slab(ModBlocks.DRIPSTONE_SLAB);
        hanas_dripstone_Pool.stairs(ModBlocks.DRIPSTONE_STAIRS);
        hanas_dripstone_Pool.wall(ModBlocks.DRIPSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_stone_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        hanas_stone_Pool.wall(ModBlocks.STONE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_smooth_sandstone_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_SANDSTONE);
        hanas_smooth_sandstone_Pool.wall(ModBlocks.SMOOTH_SANDSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_polished_andesite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        hanas_polished_andesite_Pool.wall(ModBlocks.POLISHED_ANDESITE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_polished_diorite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
        hanas_polished_diorite_Pool.wall(ModBlocks.POLISHED_DIORITE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_polished_granite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        hanas_polished_granite_Pool.wall(ModBlocks.POLISHED_GRANITE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_cracked_stone_brick_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_STONE_BRICKS);
        hanas_cracked_stone_brick_Pool.wall(ModBlocks.CRACKED_STONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_smooth_stone_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE);
        hanas_smooth_stone_Pool.stairs(ModBlocks.SMOOTH_STONE_STAIRS);
        hanas_smooth_stone_Pool.wall(ModBlocks.SMOOTH_STONE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_sandstone_brick_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SANDSTONE_BRICK);
        hanas_sandstone_brick_Pool.slab(ModBlocks.SANDSTONE_BRICK_SLAB);
        hanas_sandstone_brick_Pool.stairs(ModBlocks.SANDSTONE_BRICK_STAIRS);
        hanas_sandstone_brick_Pool.wall(ModBlocks.SANDSTONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_cracked_sandstone_brick_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRACKED_SANDSTONE_BRICK);
        hanas_cracked_sandstone_brick_Pool.slab(ModBlocks.CRACKED_SANDSTONE_BRICK_SLAB);
        hanas_cracked_sandstone_brick_Pool.stairs(ModBlocks.CRACKED_SANDSTONE_BRICK_STAIRS);
        hanas_cracked_sandstone_brick_Pool.wall(ModBlocks.CRACKED_SANDSTONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_sandstone_tiles_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SANDSTONE_TILES);
        hanas_sandstone_tiles_Pool.slab(ModBlocks.SANDSTONE_TILES_SLAB);
        hanas_sandstone_tiles_Pool.stairs(ModBlocks.SANDSTONE_TILES_STAIRS);
        hanas_sandstone_tiles_Pool.wall(ModBlocks.SANDSTONE_TILES_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_cracked_sandstone_tiles_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRACKED_SANDSTONE_TILES);
        hanas_cracked_sandstone_tiles_Pool.slab(ModBlocks.CRACKED_SANDSTONE_TILES_SLAB);
        hanas_cracked_sandstone_tiles_Pool.stairs(ModBlocks.CRACKED_SANDSTONE_TILES_STAIRS);
        hanas_cracked_sandstone_tiles_Pool.wall(ModBlocks.CRACKED_SANDSTONE_TILES_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_cobble_sandstone_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBBLE_SANDSTONE);
        hanas_cobble_sandstone_Pool.slab(ModBlocks.COBBLE_SANDSTONE_SLAB);
        hanas_cobble_sandstone_Pool.stairs(ModBlocks.COBBLE_SANDSTONE_STAIRS);
        hanas_cobble_sandstone_Pool.wall(ModBlocks.COBBLE_SANDSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_cobbling_sandstone_block_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBBLING_SANDSTONE_BLOCK);
        hanas_cobbling_sandstone_block_Pool.slab(ModBlocks.COBBLING_SANDSTONE_SLAB);
        hanas_cobbling_sandstone_block_Pool.stairs(ModBlocks.COBBLING_SANDSTONE_STAIRS);
        hanas_cobbling_sandstone_block_Pool.wall(ModBlocks.COBBLING_SANDSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_polished_marble_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_MARBLE);
        hanas_polished_marble_Pool.slab(ModBlocks.POLISHED_MARBLE_SLAB);
        hanas_polished_marble_Pool.stairs(ModBlocks.POLISHED_MARBLE_STAIRS);
        hanas_polished_marble_Pool.wall(ModBlocks.POLISHED_MARBLE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_polished_marble_brick_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_MARBLE_BRICK);
        hanas_polished_marble_brick_Pool.slab(ModBlocks.POLISHED_MARBLE_BRICK_SLAB);
        hanas_polished_marble_brick_Pool.stairs(ModBlocks.POLISHED_MARBLE_BRICK_STAIRS);
        hanas_polished_marble_brick_Pool.wall(ModBlocks.POLISHED_MARBLE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_cobbled_marble_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBBLED_MARBLE);
        hanas_cobbled_marble_Pool.slab(ModBlocks.COBBLED_MARBLE_SLAB);
        hanas_cobbled_marble_Pool.stairs(ModBlocks.COBBLED_MARBLE_STAIRS);
        hanas_cobbled_marble_Pool.wall(ModBlocks.COBBLED_MARBLE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_mossy_cobbled_marble_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_COBBLED_MARBLE);
        hanas_mossy_cobbled_marble_Pool.slab(ModBlocks.MOSSY_COBBLED_MARBLE_SLAB);
        hanas_mossy_cobbled_marble_Pool.stairs(ModBlocks.MOSSY_COBBLED_MARBLE_STAIRS);
        hanas_mossy_cobbled_marble_Pool.wall(ModBlocks.MOSSY_COBBLED_MARBLE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_dense_marble_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DENSE_MARBLE);
        hanas_dense_marble_Pool.slab(ModBlocks.DENSE_MARBLE_SLAB);
        hanas_dense_marble_Pool.stairs(ModBlocks.DENSE_MARBLE_STAIRS);
        hanas_dense_marble_Pool.wall(ModBlocks.DENSE_MARBLE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_mossy_stone_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_STONE);
        hanas_mossy_stone_Pool.slab(ModBlocks.MOSSY_STONE_SLAB);
        hanas_mossy_stone_Pool.stairs(ModBlocks.MOSSY_STONE_STAIRS);
        hanas_mossy_stone_Pool.wall(ModBlocks.MOSSY_STONE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_mossy_andesite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_ANDESITE);
        hanas_mossy_andesite_Pool.slab(ModBlocks.MOSSY_ANDESITE_SLAB);
        hanas_mossy_andesite_Pool.stairs(ModBlocks.MOSSY_ANDESITE_STAIRS);
        hanas_mossy_andesite_Pool.wall(ModBlocks.MOSSY_ANDESITE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_mossy_polished_andesite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_POLISHED_ANDESITE);
        hanas_mossy_polished_andesite_Pool.slab(ModBlocks.MOSSY_POLISHED_ANDESITE_SLAB);
        hanas_mossy_polished_andesite_Pool.stairs(ModBlocks.MOSSY_POLISHED_ANDESITE_STAIRS);
        hanas_mossy_polished_andesite_Pool.wall(ModBlocks.MOSSY_POLISHED_ANDESITE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_mossy_diorite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_DIORITE);
        hanas_mossy_diorite_Pool.slab(ModBlocks.MOSSY_DIORITE_SLAB);
        hanas_mossy_diorite_Pool.stairs(ModBlocks.MOSSY_DIORITE_STAIRS);
        hanas_mossy_diorite_Pool.wall(ModBlocks.MOSSY_DIORITE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_mossy_polished_diorite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_POLISHED_DIORITE);
        hanas_mossy_polished_diorite_Pool.slab(ModBlocks.MOSSY_POLISHED_DIORITE_SLAB);
        hanas_mossy_polished_diorite_Pool.stairs(ModBlocks.MOSSY_POLISHED_DIORITE_STAIRS);
        hanas_mossy_polished_diorite_Pool.wall(ModBlocks.MOSSY_POLISHED_DIORITE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_mossy_granite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_GRANITE);
        hanas_mossy_granite_Pool.slab(ModBlocks.MOSSY_GRANITE_SLAB);
        hanas_mossy_granite_Pool.stairs(ModBlocks.MOSSY_GRANITE_STAIRS);
        hanas_mossy_granite_Pool.wall(ModBlocks.MOSSY_GRANITE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_mossy_polished_granite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_POLISHED_GRANITE);
        hanas_mossy_polished_granite_Pool.slab(ModBlocks.MOSSY_POLISHED_GRANITE_SLAB);
        hanas_mossy_polished_granite_Pool.stairs(ModBlocks.MOSSY_POLISHED_GRANITE_STAIRS);
        hanas_mossy_polished_granite_Pool.wall(ModBlocks.MOSSY_POLISHED_GRANITE_WALL);

        BlockStateModelGenerator.BlockTexturePool smoothed_basalt_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTHED_BASALT);
        smoothed_basalt_Pool.slab(ModBlocks.SMOOTHED_BASALT_SLAB);
        smoothed_basalt_Pool.stairs(ModBlocks.SMOOTHED_BASALT_STAIRS);
        smoothed_basalt_Pool.wall(ModBlocks.SMOOTHED_BASALT_WALL);
        
        BlockStateModelGenerator.BlockTexturePool netherrack_brick_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHERRACK_BRICK);
        netherrack_brick_Pool.slab(ModBlocks.NETHERRACK_BRICK_SLAB);
        netherrack_brick_Pool.stairs(ModBlocks.NETHERRACK_BRICK_STAIRS);
        netherrack_brick_Pool.wall(ModBlocks.NETHERRACK_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_cracked_nether_brick_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_NETHER_BRICKS);
        hanas_cracked_nether_brick_Pool.slab(ModBlocks.CRACKED_NETHER_BRICK_SLAB);
        hanas_cracked_nether_brick_Pool.stairs(ModBlocks.CRACKED_NETHER_BRICK_STAIRS);
        hanas_cracked_nether_brick_Pool.wall(ModBlocks.CRACKED_NETHER_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_cracked_polished_blackstone_brick_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        hanas_cracked_polished_blackstone_brick_Pool.slab(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
        hanas_cracked_polished_blackstone_brick_Pool.stairs(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        hanas_cracked_polished_blackstone_brick_Pool.wall(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool polished_basalt_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_BASALT_BRICK);
        polished_basalt_Pool.slab(ModBlocks.POLISHED_BASALT_BRICK_SLAB);
        polished_basalt_Pool.stairs(ModBlocks.POLISHED_BASALT_BRICK_STAIRS);
        polished_basalt_Pool.wall(ModBlocks.POLISHED_BASALT_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool polished_end_stone_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_END_STONE);
        polished_end_stone_Pool.slab(ModBlocks.POLISHED_END_STONE_SLAB);
        polished_end_stone_Pool.stairs(ModBlocks.POLISHED_END_STONE_STAIRS);
        polished_end_stone_Pool.wall(ModBlocks.POLISHED_END_STONE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TRANSGENDER_BLOCK);

        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.OAK_PLANKS, ModBlocks.OAK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, ModBlocks.CHERRY_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BAMBOO_MOSAIC, ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, ModBlocks.WARPED_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.STONE, ModBlocks.STONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.COBBLESTONE, ModBlocks.COBBLESTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.MOSSY_COBBLESTONE, ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB);
        registerSmoothStone(blockStateModelGenerator);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.STONE_BRICKS, ModBlocks.STONE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.MOSSY_STONE_BRICKS, ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.GRANITE, ModBlocks.GRANITE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.POLISHED_GRANITE, ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.DIORITE, ModBlocks.DIORITE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.POLISHED_DIORITE, ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.ANDESITE, ModBlocks.ANDESITE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.POLISHED_ANDESITE, ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.COBBLED_DEEPSLATE, ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.POLISHED_DEEPSLATE, ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.DEEPSLATE_BRICKS, ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.DEEPSLATE_TILES, ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.TUFF, ModBlocks.TUFF_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.POLISHED_TUFF, ModBlocks.POLISHED_TUFF_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.TUFF_BRICKS, ModBlocks.TUFF_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BRICKS, ModBlocks.BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.MUD_BRICKS, ModBlocks.MUD_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.SANDSTONE, Blocks.SANDSTONE, TOP_SUFFIX, "", BOTTOM_SUFFIX, ModBlocks.SANDSTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.SANDSTONE, Blocks.SMOOTH_SANDSTONE, TOP_SUFFIX, ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModelForCutSandstone(blockStateModelGenerator, Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, TOP_SUFFIX, "", BOTTOM_SUFFIX, ModBlocks.RED_SANDSTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE, TOP_SUFFIX, ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModelForCutSandstone(blockStateModelGenerator, Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.PRISMARINE, ModBlocks.PRISMARINE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.DARK_PRISMARINE, ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.NETHER_BRICKS, ModBlocks.NETHER_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.RED_NETHER_BRICKS, ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BLACKSTONE, ModBlocks.BLACKSTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.POLISHED_BLACKSTONE, ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.POLISHED_BLACKSTONE_BRICKS, ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.END_STONE_BRICKS, ModBlocks.END_STONE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.PURPUR_BLOCK, ModBlocks.PURPUR_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, TOP_SUFFIX, SIDE_SUFFIX, TOP_SUFFIX, ModBlocks.QUARTZ_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.QUARTZ_BLOCK, Blocks.SMOOTH_QUARTZ, BOTTOM_SUFFIX, ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CUT_COPPER, ModBlocks.CUT_COPPER_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.EXPOSED_CUT_COPPER, ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.WEATHERED_CUT_COPPER, ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.OXIDIZED_CUT_COPPER, ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CUT_COPPER, ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.EXPOSED_CUT_COPPER, ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.WEATHERED_CUT_COPPER, ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.OXIDIZED_CUT_COPPER, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);

        generateVerticalSlabBlockModel(blockStateModelGenerator, ModBlocks.ANCIENT_NETHERITE_BRICK, ModBlocks.ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, ModBlocks.DULL_ANCIENT_NETHERITE_BRICK, ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK, ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK, ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, ModBlocks.ANCIENT_NETHERITE_BRICK, ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, ModBlocks.DULL_ANCIENT_NETHERITE_BRICK, ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK, ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK, ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COPPER_SHEET, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_SHEET, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_SHEET, Models.GENERATED);
        itemModelGenerator.register(ModItems.SCRAP_SHEET, Models.GENERATED);

        itemModelGenerator.register(ModItems.SCULK_MATERIAL, Models.GENERATED);
    }

    private void registerSmoothStone(BlockStateModelGenerator blockStateModelGenerator) {
        TextureMap textureMap = new TextureMap().put(TextureKey.TOP, TextureMap.getId(Blocks.SMOOTH_STONE))
                .put(TextureKey.SIDE, TextureMap.getId(Blocks.SMOOTH_STONE_SLAB).withSuffixedPath("_side"))
                .put(TextureKey.BOTTOM, TextureMap.getId(Blocks.SMOOTH_STONE))
                .put(TextureKey.PARTICLE, TextureMap.getId(Blocks.SMOOTH_STONE));
        TextureMap textureMap2 = TextureMap.sideEnd(TextureMap.getSubId(Blocks.SMOOTH_STONE_SLAB, "_side"), textureMap.getTexture(TextureKey.TOP));

        Identifier modelId = ModModels.VERTICAL_SLAB.upload(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, textureMap, blockStateModelGenerator.modelCollector);
        Identifier leftModelId = ModModels.VERTICAL_SLAB_LEFT.upload(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "_left", textureMap, blockStateModelGenerator.modelCollector);
        Identifier rightModelId = ModModels.VERTICAL_SLAB_RIGHT.upload(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "_right", textureMap, blockStateModelGenerator.modelCollector);
        Identifier backModelId = ModModels.VERTICAL_SLAB_BACK.upload(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "_back", textureMap, blockStateModelGenerator.modelCollector);
        Identifier fullBlockId = Models.CUBE_COLUMN.uploadWithoutVariant(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "_double", textureMap2, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createVerticalSlabBlockState(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, modelId, leftModelId, rightModelId, backModelId, fullBlockId));
    }

    private void generateVerticalSlabBlockModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block block) {
        TextureMap textureMap = new TextureMap().put(TextureKey.TOP, TextureMap.getId(textureBlock))
                .put(TextureKey.SIDE, TextureMap.getId(textureBlock))
                .put(TextureKey.BOTTOM, TextureMap.getId(textureBlock))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));

        generateVerticalSlabBlockModel(blockStateModelGenerator, textureMap, textureBlock, block);
    }

    private void generateVerticalSlabBlockModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block fullBlock, String suffix, Block block) {
        generateVerticalSlabBlockModel(blockStateModelGenerator, textureBlock, fullBlock, suffix, suffix, suffix, block);
    }

    private void generateVerticalSlabBlockModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block fullBlock, String topSuffix, String sideSuffix, String bottomSuffix, Block block) {
        TextureMap textureMap = new TextureMap().put(TextureKey.TOP, TextureMap.getId(textureBlock).withSuffixedPath(topSuffix))
                .put(TextureKey.SIDE, TextureMap.getId(textureBlock).withSuffixedPath(sideSuffix))
                .put(TextureKey.BOTTOM, TextureMap.getId(textureBlock).withSuffixedPath(bottomSuffix))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock).withSuffixedPath(topSuffix));

        generateVerticalSlabBlockModel(blockStateModelGenerator, textureMap, fullBlock, block);
    }

    private void generateVerticalSlabBlockModelForCutSandstone(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block secondTextureBlock, Block block) {
        TextureMap textureMap = new TextureMap().put(TextureKey.TOP, TextureMap.getId(secondTextureBlock).withSuffixedPath(TOP_SUFFIX))
                .put(TextureKey.SIDE, TextureMap.getId(textureBlock))
                .put(TextureKey.BOTTOM, TextureMap.getId(secondTextureBlock).withSuffixedPath(BOTTOM_SUFFIX))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));

        generateVerticalSlabBlockModel(blockStateModelGenerator, textureMap, textureBlock, block);
    }

    private void generateVerticalSlabBlockModel(BlockStateModelGenerator blockStateModelGenerator, TextureMap textureMap, Block fullBlock, Block block) {
        Identifier modelId = ModModels.VERTICAL_SLAB.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier leftModelId = ModModels.VERTICAL_SLAB_LEFT.upload(block, "_left", textureMap, blockStateModelGenerator.modelCollector);
        Identifier rightModelId = ModModels.VERTICAL_SLAB_RIGHT.upload(block, "_right", textureMap, blockStateModelGenerator.modelCollector);
        Identifier backModelId = ModModels.VERTICAL_SLAB_BACK.upload(block, "_back", textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createVerticalSlabBlockState(block, modelId, leftModelId, rightModelId, backModelId, TextureMap.getId(fullBlock)));
    }

    public static BlockStateSupplier createVerticalSlabBlockState(Block verticalSlabBlock, Identifier modelId,
                                                                  Identifier leftModelId, Identifier rightModelId, Identifier backModelId, Identifier fullModelId) {
        return VariantsBlockStateSupplier.create(verticalSlabBlock)
                .coordinate(
                        BlockStateVariantMap.create(ModProperties.VERTICAL_SLAB_TYPE)
                                .register(VerticalSlabType.FRONT, BlockStateVariant.create().put(VariantSettings.MODEL, modelId))
                                .register(VerticalSlabType.LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, leftModelId))
                                .register(VerticalSlabType.RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, rightModelId))
                                .register(VerticalSlabType.BACK, BlockStateVariant.create().put(VariantSettings.MODEL, backModelId))
                                .register(VerticalSlabType.DOUBLE, BlockStateVariant.create().put(VariantSettings.MODEL, fullModelId))
                );
    }

}
