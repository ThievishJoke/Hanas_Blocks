package hana.hanas_blocks.datagen;

import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonElement;
import hana.hanas_blocks.block.ModBlocks;
import hana.hanas_blocks.block.custom.ModLampBlock;
import hana.hanas_blocks.util.TrimHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import hana.hanas_blocks.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static hana.hanas_blocks.block.ModBlocks.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    //public static final TextureKey HANAFLOWERBED = TextureKey.of("hanaflowerbed");

    //public static TextureMap hanaflowerbed(Block block) {
    //    return new TextureMap().put(TextureKey.FLOWERBED, TextureMap.getId(block)).put(TextureKey.STEM, TextureMap.getSubId(block, "_stem"));
    //}

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
        blockStateModelGenerator.registerSingleton(ModBlocks.MAHOGANY_PLANK_BOOKSHELF, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerSimpleCubeAll(LOW_QUALITY_PEARLARIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(PEARLARIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(DEEPSLATE_PEARLARIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(PEARLARIUM_ALLOY_SHEET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(RAW_PEARLARIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(PEARLARIUM_CRYSTAL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool pearlarium_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(PEARLARIUM_BLOCK);
        pearlarium_Pool.slab(PEARLARIUM_SLAB);
        pearlarium_Pool.stairs(PEARLARIUM_STAIRS);
        pearlarium_Pool.wall(PEARLARIUM_WALL);
        blockStateModelGenerator.registerTrapdoor(PEARLARIUM_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(NIGRUM_PETRAMIUNIUM_TRAPDOOR);

        Identifier pearllampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.PEARLARIUM_LAMP, blockStateModelGenerator.modelCollector);
        Identifier pearllampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.PEARLARIUM_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.PEARLARIUM_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(ModLampBlock.CLICKED, pearllampOnIdentifier, pearllampOffIdentifier)));

        blockStateModelGenerator.registerSimpleCubeAll(LOW_QUALITY_NIGRUM_PETRAMIUNIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(NIGRUM_PETRAMIUNIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(DEEPSLATE_NIGRUM_PETRAMIUNIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(NIGRUM_PETRAMIUNIUM_ALLOY_SHEET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(RAW_NIGRUM_PETRAMIUNIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(NIGRUM_PETRAMIUNIUM_CRYSTAL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool nigrum_petramiumium_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(NIGRUM_PETRAMIUNIUM_BLOCK);
        nigrum_petramiumium_Pool.slab(NIGRUM_PETRAMIUNIUM_SLAB);
        nigrum_petramiumium_Pool.stairs(NIGRUM_PETRAMIUNIUM_STAIRS);
        nigrum_petramiumium_Pool.wall(NIGRUM_PETRAMIUNIUM_WALL);

        Identifier nigrumpetraminiumlampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.NIGRUM_PETRAMIUNIUM_LAMP, blockStateModelGenerator.modelCollector);
        Identifier nigrumpetraminiumlampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.NIGRUM_PETRAMIUNIUM_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.NIGRUM_PETRAMIUNIUM_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(ModLampBlock.CLICKED, nigrumpetraminiumlampOnIdentifier, nigrumpetraminiumlampOffIdentifier)));


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

        blockStateModelGenerator.registerFlowerPotPlant(GLOWING_WISTERIA, POTTED_GLOWING_WISTERIA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ACONITE, POTTED_ACONITE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(RED_ROSE, POTTED_RED_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(YELLOW_ROSE, POTTED_YELLOW_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(BLUE_ASTER, POTTED_BLUE_ASTER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(INDIGO_ASTER, POTTED_INDIGO_ASTER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(PINK_ASTER, POTTED_PINK_ASTER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(VIOLET_ASTER, POTTED_VIOLET_ASTER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(WHITE_ASTER, POTTED_WHITE_ASTER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(CYCLAMEN, POTTED_CYCLAMEN, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DUSTY_MILLER, POTTED_DUSTY_MILLER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(BLUE_FLOSSFLOWER, POTTED_BLUE_FLOSSFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(MAGENTA_FLOSSFLOWER, POTTED_MAGENTA_FLOSSFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(PINK_FLOSSFLOWER, POTTED_PINK_FLOSSFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(WHITE_FLOSSFLOWER, POTTED_WHITE_FLOSSFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(GLOBE_THISTLE, POTTED_GLOBE_THISTLE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(BUTTERCUP, POTTED_BUTTERCUP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(PINK_DAISY, POTTED_PINK_DAISY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(YELLOW_DAISY, POTTED_YELLOW_DAISY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(WHITE_DAISY, POTTED_WHITE_DAISY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(SILVER_MOUND_ARTEMISIA, POTTED_SILVER_MOUND_ARTEMISIA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(SOFT_PINK_HELIOTROPE, POTTED_SOFT_PINK_HELIOTROPE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(PINK_HELIOTROPE, POTTED_PINK_HELIOTROPE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(WHITE_HELIOTROPE, POTTED_WHITE_HELIOTROPE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(TRANS_HELIOTROPE, POTTED_TRANS_HELIOTROPE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(VIOLET_HELIOTROPE, POTTED_VIOLET_HELIOTROPE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ORANGE_HELIOTROPE, POTTED_ORANGE_HELIOTROPE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(BLACK_HELIOTROPE, POTTED_BLACK_HELIOTROPE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ICE_HELIOTROPE, POTTED_ICE_HELIOTROPE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(GOMPHRENA, POTTED_GOMPHRENA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(GOMPHRENA_PATCH, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DAHLIA, POTTED_DAHLIA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(BLOODROOT, POTTED_BLOODROOT, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerDoubleBlock(FOUNTAIN_GRASS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FOXGLOVE, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerbed(ModBlocks.VIOLET_AUBRIETA);
        
        blockStateModelGenerator.registerFlowerPotPlant(SCULK_TENDRIL, POTTED_SCULK_TENDRIL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(SCULK_ROSE, POTTED_SCULK_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(GLOWING_SCULK_WISTERIA, POTTED_GLOWING_SCULK_WISTERIA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(GLOWING_SCULK_WISTERIA_BUNDLE, POTTED_GLOWING_SCULK_WISTERIA_BUNDLE, BlockStateModelGenerator.TintType.NOT_TINTED);

        //blockStateModelGenerator.registerSimpleState(ModBlocks.SCULK_TABLE);

        blockStateModelGenerator.registerLog(MAHOGANY_LOG).log(MAHOGANY_LOG).wood(MAHOGANY_WOOD);
        blockStateModelGenerator.registerLog(STRIPPED_MAHOGANY_LOG).log(STRIPPED_MAHOGANY_LOG).wood(STRIPPED_MAHOGANY_WOOD);
        BlockStateModelGenerator.BlockTexturePool mahogany_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(MAHOGANY_PLANKS);
        mahogany_Pool.slab(MAHOGANY_SLAB);
        mahogany_Pool.stairs(MAHOGANY_STAIRS);
        mahogany_Pool.fence(MAHOGANY_FENCE);
        mahogany_Pool.fenceGate(MAHOGANY_FENCE_GATE);

        mahogany_Pool.button(ModBlocks.MAHOGANY_BUTTON);
        mahogany_Pool.pressurePlate(ModBlocks.MAHOGANY_PLATE);

        blockStateModelGenerator.registerTrapdoor(ModBlocks.MAHOGANY_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.MAHOGANY_DOOR);

        blockStateModelGenerator.registerSingleton(MAHOGANY_LEAVES, TexturedModel.LEAVES);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WHITE_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGENTA_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_BLUE_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIME_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_GRAY_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROWN_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_BLAHAJ, Models.GENERATED);

        itemModelGenerator.register(ModItems.NEON_PINK_BLAHAJ, Models.GENERATED);

        itemModelGenerator.register(ModItems.PEARLARIUM_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.NIGRUM_PETRAMIUNIUM_BLAHAJ, Models.GENERATED);

        itemModelGenerator.register(ModItems.PRIDE_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.TRANSGENDER_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEMIBOY_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEMIGIRL_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.GENDERFLUID_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.NON_BINARY_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.POLYGENDER_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.LESBIAN_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.LONG_BACON_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.GAY_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.PANSEXUAL_BLAHAJ, Models.GENERATED);
        itemModelGenerator.register(ModItems.BISEXUAL_BLAHAJ, Models.GENERATED);

        itemModelGenerator.register(ModItems.COPPER_SHEET, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_SHEET, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_SHEET, Models.GENERATED);
        itemModelGenerator.register(ModItems.SCRAP_SHEET, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_PEARLARIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEARLARIUM_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEARLARIUM_ALLOY_PLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEARLARIUM_ALLOY_SHEET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEARLARIUM_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRUSHED_PEARLARIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_NIGRUM_PETRAMIUNIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_SHEET, Models.GENERATED);
        itemModelGenerator.register(ModItems.NIGRUM_PETRAMIUNIUM_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRUSHED_NIGRUM_PETRAMIUNIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.PEARLARIUM_PLATED_SHIELD, Models.GENERATED);

        itemModelGenerator.register(ModItems.SCULK_MATERIAL, Models.GENERATED);

        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO_BREAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUNS, Models.GENERATED);
        itemModelGenerator.register(ModItems.HAMBURGER, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PEARLARIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PEARLARIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PEARLARIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PEARLARIUM_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PEARLARIUM_PLATE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PEARLARIUM_PLATE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PEARLARIUM_PLATE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PEARLARIUM_PLATE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NIGRUM_PETRAMINIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NIGRUM_PETRAMINIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NIGRUM_PETRAMINIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NIGRUM_PETRAMINIUM_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NIGRUM_PETRAMINIUM_PLATE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NIGRUM_PETRAMINIUM_PLATE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NIGRUM_PETRAMINIUM_PLATE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NIGRUM_PETRAMINIUM_PLATE_BOOTS));

    }
}
