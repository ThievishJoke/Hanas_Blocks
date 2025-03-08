package hana.hanas_blocks.datagen;

import hana.hanas_blocks.block.ModBlocks;
import hana.hanas_blocks.block.custom.ModLampBlock;
import hana.hanas_blocks.block.custom.ModVerticalSlabBlock;
import hana.hanas_blocks.block.enums.VerticalSlabType;
import hana.hanas_blocks.property.ModProperties;
import hana.hanas_blocks.registry.NarrowLogRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import hana.hanas_blocks.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static hana.hanas_blocks.HanasBlocks.MOD_ID;
import static hana.hanas_blocks.block.ModBlocks.*;
import static net.minecraft.block.Blocks.GLASS;

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

        blockStateModelGenerator.registerSimpleCubeAll(BURNING_BLAZE_POWDERED_BLOCK);
        
        blockStateModelGenerator.registerSimpleCubeAll(CHARCOAL_BLOCK);

        BlockStateModelGenerator.BlockTexturePool iron_grate_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(IRON_GRATE);
        iron_grate_Pool.slab(IRON_GRATE_SLAB);
        iron_grate_Pool.stairs(IRON_GRATE_STAIRS);
        blockStateModelGenerator.registerTrapdoor(IRON_GRATE_TRAPDOOR);

        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_IRON);

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

        blockStateModelGenerator.registerSimpleCubeAll(RAW_SCRAP_BLOCK);
        
        blockStateModelGenerator.registerSimpleCubeAll(IRON_SHEET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(GOLD_SHEET_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(RAW_QUARTZ_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(COPPER_SHEET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(EXPOSED_COPPER_SHEET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(WEATHERED_COPPER_SHEET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(OXIDIZED_COPPER_SHEET_BLOCK);
        blockStateModelGenerator.registerParented(COPPER_SHEET_BLOCK, WAXED_COPPER_SHEET_BLOCK);
        blockStateModelGenerator.registerParented(EXPOSED_COPPER_SHEET_BLOCK, WAXED_EXPOSED_COPPER_SHEET_BLOCK);
        blockStateModelGenerator.registerParented(WEATHERED_COPPER_SHEET_BLOCK, WAXED_WEATHERED_COPPER_SHEET_BLOCK);
        blockStateModelGenerator.registerParented(OXIDIZED_COPPER_SHEET_BLOCK, WAXED_OXIDIZED_COPPER_SHEET_BLOCK);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ANCIENT_NETHERITE_BRICK).family(FAMILY_ANCIENT_NETHERITE_BRICK).parented(ANCIENT_NETHERITE_BRICK, SEALED_ANCIENT_NETHERITE_BRICK).family(FAMILY_SEALED_ANCIENT_NETHERITE_BRICK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(DULL_ANCIENT_NETHERITE_BRICK).family(FAMILY_DULL_ANCIENT_NETHERITE_BRICK).parented(DULL_ANCIENT_NETHERITE_BRICK, SEALED_DULL_ANCIENT_NETHERITE_BRICK).family(FAMILY_SEALED_DULL_ANCIENT_NETHERITE_BRICK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(TARNISHED_ANCIENT_NETHERITE_BRICK).family(FAMILY_TARNISHED_ANCIENT_NETHERITE_BRICK).parented(TARNISHED_ANCIENT_NETHERITE_BRICK, SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK).family(FAMILY_SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(RUINED_ANCIENT_NETHERITE_BRICK).family(FAMILY_RUINED_ANCIENT_NETHERITE_BRICK).parented(RUINED_ANCIENT_NETHERITE_BRICK, SEALED_RUINED_ANCIENT_NETHERITE_BRICK).family(FAMILY_SEALED_RUINED_ANCIENT_NETHERITE_BRICK);

        //Sculked Blocks

        blockStateModelGenerator.registerSimpleCubeAll(CUT_CRYSTAL_AMETHYST);

        BlockStateModelGenerator.BlockTexturePool honey_comb_bricks_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(HONEY_COMB_BRICKS);
        honey_comb_bricks_Pool.slab(HONEY_COMB_BRICK_SLAB);
        honey_comb_bricks_Pool.stairs(HONEY_COMB_BRICK_STAIRS);
        honey_comb_bricks_Pool.wall(HONEY_COMB_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool polished_prismarine_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_PRISMARINE);
        polished_prismarine_Pool.slab(POLISHED_PRISMARINE_SLAB);
        polished_prismarine_Pool.stairs(POLISHED_PRISMARINE_STAIRS);
        polished_prismarine_Pool.wall(POLISHED_PRISMARINE_WALL);

        //Ice
        blockStateModelGenerator.registerSimpleCubeAll(POLISHED_ICE);
        blockStateModelGenerator.registerSimpleCubeAll(POLISHED_ICE_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_POLISHED_ICE_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(CRACKED_POLISHED_ICE_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(FROSTED_ICE_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(CUT_CRYSTAL_ICE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ICE_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ICE_BRICK_TILE);
        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_ICE_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(CRACKED_ICE_BRICK);

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
        hanas_dripstone_Pool.slab(DRIPSTONE_SLAB);
        hanas_dripstone_Pool.stairs(DRIPSTONE_STAIRS);
        hanas_dripstone_Pool.wall(DRIPSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_stone_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        hanas_stone_Pool.wall(STONE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_smooth_sandstone_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_SANDSTONE);
        hanas_smooth_sandstone_Pool.wall(SMOOTH_SANDSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_polished_andesite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        hanas_polished_andesite_Pool.wall(POLISHED_ANDESITE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_polished_diorite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
        hanas_polished_diorite_Pool.wall(POLISHED_DIORITE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_polished_granite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        hanas_polished_granite_Pool.wall(POLISHED_GRANITE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_cracked_stone_brick_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_STONE_BRICKS);
        hanas_cracked_stone_brick_Pool.wall(CRACKED_STONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_smooth_stone_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE);
        hanas_smooth_stone_Pool.stairs(SMOOTH_STONE_STAIRS);
        hanas_smooth_stone_Pool.wall(SMOOTH_STONE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_sandstone_brick_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(SANDSTONE_BRICK);
        hanas_sandstone_brick_Pool.slab(SANDSTONE_BRICK_SLAB);
        hanas_sandstone_brick_Pool.stairs(SANDSTONE_BRICK_STAIRS);
        hanas_sandstone_brick_Pool.wall(SANDSTONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_cracked_sandstone_brick_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(CRACKED_SANDSTONE_BRICK);
        hanas_cracked_sandstone_brick_Pool.slab(CRACKED_SANDSTONE_BRICK_SLAB);
        hanas_cracked_sandstone_brick_Pool.stairs(CRACKED_SANDSTONE_BRICK_STAIRS);
        hanas_cracked_sandstone_brick_Pool.wall(CRACKED_SANDSTONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_sandstone_tiles_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(SANDSTONE_TILES);
        hanas_sandstone_tiles_Pool.slab(SANDSTONE_TILES_SLAB);
        hanas_sandstone_tiles_Pool.stairs(SANDSTONE_TILES_STAIRS);
        hanas_sandstone_tiles_Pool.wall(SANDSTONE_TILES_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_cracked_sandstone_tiles_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(CRACKED_SANDSTONE_TILES);
        hanas_cracked_sandstone_tiles_Pool.slab(CRACKED_SANDSTONE_TILES_SLAB);
        hanas_cracked_sandstone_tiles_Pool.stairs(CRACKED_SANDSTONE_TILES_STAIRS);
        hanas_cracked_sandstone_tiles_Pool.wall(CRACKED_SANDSTONE_TILES_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_cobble_sandstone_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(COBBLE_SANDSTONE);
        hanas_cobble_sandstone_Pool.slab(COBBLE_SANDSTONE_SLAB);
        hanas_cobble_sandstone_Pool.stairs(COBBLE_SANDSTONE_STAIRS);
        hanas_cobble_sandstone_Pool.wall(COBBLE_SANDSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_cobbling_sandstone_block_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(COBBLING_SANDSTONE_BLOCK);
        hanas_cobbling_sandstone_block_Pool.slab(COBBLING_SANDSTONE_SLAB);
        hanas_cobbling_sandstone_block_Pool.stairs(COBBLING_SANDSTONE_STAIRS);
        hanas_cobbling_sandstone_block_Pool.wall(COBBLING_SANDSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_dirty_sand_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(DIRTY_SAND);
        hanas_dirty_sand_Pool.slab(DIRTY_SAND_SLAB);
        hanas_dirty_sand_Pool.stairs(DIRTY_SAND_STAIRS);
        hanas_dirty_sand_Pool.wall(DIRTY_SAND_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_polished_marble_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_MARBLE);
        hanas_polished_marble_Pool.slab(POLISHED_MARBLE_SLAB);
        hanas_polished_marble_Pool.stairs(POLISHED_MARBLE_STAIRS);
        hanas_polished_marble_Pool.wall(POLISHED_MARBLE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_polished_marble_brick_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_MARBLE_BRICK);
        hanas_polished_marble_brick_Pool.slab(POLISHED_MARBLE_BRICK_SLAB);
        hanas_polished_marble_brick_Pool.stairs(POLISHED_MARBLE_BRICK_STAIRS);
        hanas_polished_marble_brick_Pool.wall(POLISHED_MARBLE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_cobbled_marble_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(COBBLED_MARBLE);
        hanas_cobbled_marble_Pool.slab(COBBLED_MARBLE_SLAB);
        hanas_cobbled_marble_Pool.stairs(COBBLED_MARBLE_STAIRS);
        hanas_cobbled_marble_Pool.wall(COBBLED_MARBLE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_mossy_cobbled_marble_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_COBBLED_MARBLE);
        hanas_mossy_cobbled_marble_Pool.slab(MOSSY_COBBLED_MARBLE_SLAB);
        hanas_mossy_cobbled_marble_Pool.stairs(MOSSY_COBBLED_MARBLE_STAIRS);
        hanas_mossy_cobbled_marble_Pool.wall(MOSSY_COBBLED_MARBLE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_dense_marble_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(DENSE_MARBLE);
        hanas_dense_marble_Pool.slab(DENSE_MARBLE_SLAB);
        hanas_dense_marble_Pool.stairs(DENSE_MARBLE_STAIRS);
        hanas_dense_marble_Pool.wall(DENSE_MARBLE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_mossy_stone_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_STONE);
        hanas_mossy_stone_Pool.slab(MOSSY_STONE_SLAB);
        hanas_mossy_stone_Pool.stairs(MOSSY_STONE_STAIRS);
        hanas_mossy_stone_Pool.wall(MOSSY_STONE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_mossy_andesite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_ANDESITE);
        hanas_mossy_andesite_Pool.slab(MOSSY_ANDESITE_SLAB);
        hanas_mossy_andesite_Pool.stairs(MOSSY_ANDESITE_STAIRS);
        hanas_mossy_andesite_Pool.wall(MOSSY_ANDESITE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_mossy_polished_andesite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_POLISHED_ANDESITE);
        hanas_mossy_polished_andesite_Pool.slab(MOSSY_POLISHED_ANDESITE_SLAB);
        hanas_mossy_polished_andesite_Pool.stairs(MOSSY_POLISHED_ANDESITE_STAIRS);
        hanas_mossy_polished_andesite_Pool.wall(MOSSY_POLISHED_ANDESITE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_mossy_diorite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_DIORITE);
        hanas_mossy_diorite_Pool.slab(MOSSY_DIORITE_SLAB);
        hanas_mossy_diorite_Pool.stairs(MOSSY_DIORITE_STAIRS);
        hanas_mossy_diorite_Pool.wall(MOSSY_DIORITE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_mossy_polished_diorite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_POLISHED_DIORITE);
        hanas_mossy_polished_diorite_Pool.slab(MOSSY_POLISHED_DIORITE_SLAB);
        hanas_mossy_polished_diorite_Pool.stairs(MOSSY_POLISHED_DIORITE_STAIRS);
        hanas_mossy_polished_diorite_Pool.wall(MOSSY_POLISHED_DIORITE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_mossy_granite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_GRANITE);
        hanas_mossy_granite_Pool.slab(MOSSY_GRANITE_SLAB);
        hanas_mossy_granite_Pool.stairs(MOSSY_GRANITE_STAIRS);
        hanas_mossy_granite_Pool.wall(MOSSY_GRANITE_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_mossy_polished_granite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_POLISHED_GRANITE);
        hanas_mossy_polished_granite_Pool.slab(MOSSY_POLISHED_GRANITE_SLAB);
        hanas_mossy_polished_granite_Pool.stairs(MOSSY_POLISHED_GRANITE_STAIRS);
        hanas_mossy_polished_granite_Pool.wall(MOSSY_POLISHED_GRANITE_WALL);

        BlockStateModelGenerator.BlockTexturePool smoothed_basalt_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(SMOOTHED_BASALT);
        smoothed_basalt_Pool.slab(SMOOTHED_BASALT_SLAB);
        smoothed_basalt_Pool.stairs(SMOOTHED_BASALT_STAIRS);
        smoothed_basalt_Pool.wall(SMOOTHED_BASALT_WALL);
        
        BlockStateModelGenerator.BlockTexturePool netherrack_brick_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(NETHERRACK_BRICK);
        netherrack_brick_Pool.slab(NETHERRACK_BRICK_SLAB);
        netherrack_brick_Pool.stairs(NETHERRACK_BRICK_STAIRS);
        netherrack_brick_Pool.wall(NETHERRACK_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_cracked_nether_brick_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_NETHER_BRICKS);
        hanas_cracked_nether_brick_Pool.slab(CRACKED_NETHER_BRICK_SLAB);
        hanas_cracked_nether_brick_Pool.stairs(CRACKED_NETHER_BRICK_STAIRS);
        hanas_cracked_nether_brick_Pool.wall(CRACKED_NETHER_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool hanas_cracked_polished_blackstone_brick_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        hanas_cracked_polished_blackstone_brick_Pool.slab(CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
        hanas_cracked_polished_blackstone_brick_Pool.stairs(CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        hanas_cracked_polished_blackstone_brick_Pool.wall(CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool polished_basalt_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_BASALT_BRICK);
        polished_basalt_Pool.slab(POLISHED_BASALT_BRICK_SLAB);
        polished_basalt_Pool.stairs(POLISHED_BASALT_BRICK_STAIRS);
        polished_basalt_Pool.wall(POLISHED_BASALT_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool polished_end_stone_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_END_STONE);
        polished_end_stone_Pool.slab(POLISHED_END_STONE_SLAB);
        polished_end_stone_Pool.stairs(POLISHED_END_STONE_STAIRS);
        polished_end_stone_Pool.wall(POLISHED_END_STONE_WALL);
        
        
        blockStateModelGenerator.registerSimpleCubeAll(TRANSGENDER_BLOCK);


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

        generateVerticalSlabBlockModel(blockStateModelGenerator, ANCIENT_NETHERITE_BRICK, ModBlocks.ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, DULL_ANCIENT_NETHERITE_BRICK, ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TARNISHED_ANCIENT_NETHERITE_BRICK, ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, RUINED_ANCIENT_NETHERITE_BRICK, ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, ANCIENT_NETHERITE_BRICK, ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, DULL_ANCIENT_NETHERITE_BRICK, ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, TARNISHED_ANCIENT_NETHERITE_BRICK, ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, RUINED_ANCIENT_NETHERITE_BRICK, ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);

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
