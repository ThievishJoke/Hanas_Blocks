package net.hana.hanas_blocks.block;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hana.hanas_blocks.block.custom.*;
import net.hana.hanas_blocks.HanasBlocks;
import net.minecraft.block.*;
import net.minecraft.block.Oxidizable.OxidationLevel;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.hana.hanas_blocks.block.custom.ModLampBlock.CLICKED;
import static net.minecraft.block.MapColor.*;
import static net.minecraft.block.Blocks.*;

public class ModBlocks {

    // Hana's Blocks
    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block",
        new Block(AbstractBlock.Settings.create().mapColor(GRAY).sounds(BlockSoundGroup.DEEPSLATE).strength(2.5f, 6.0f).burnable().requiresTool()));
    public static final Block POWDER_KEG = registerBlock("powder_keg",
        new TntBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).mapColor(SPRUCE_BROWN).solid().strength(0.1f, 1.0f).burnable().dropsLike(Blocks.DIRT)));
    //public static final Block GUNPOWDER_BLOCK = new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.SAND).strength(0.5f, 1.0f).burnable());
    public static final Block BURNING_BLAZE_POWDERED_BLOCK = registerBlock("burning_blaze_powdered_block",
            new FallingBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SAND).mapColor(MapColor.ORANGE).strength(0.5f, 1.0f).luminance(state -> 15).burnable()) {
                @Override
                protected MapCodec<? extends FallingBlock> getCodec() {
                    return null;
                }
            });

        // Valueables & SHEETS

    //Scrap & Netherite
    public static final Block RAW_SCRAP_BLOCK = registerBlock("raw_scrap_block",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.NETHERITE).strength(4.0f, 1200.0f).requiresTool()));
    public static final Block SCRAP_SHEET_BLOCK = registerBlock("scrap_sheet_block",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.NETHERITE).strength(4.0f, 1200.0f).requiresTool()));

    //public static final Block DULL_SCRAP_BLOCK =
    //public static final Block TARNISHED_SCRAP_BLOCK
    //public static final Block RUINED_SCRAP_BLOCK
    //public static final Block CRUMBLING_SCRAP_BLOCK

    public static final Block ANCIENT_NETHERITE_BRICK = registerBlock("ancient_netherite_brick",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.create().mapColor(DULL_RED).requiresTool().strength(3.0f, 12.0f).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block DULL_ANCIENT_NETHERITE_BRICK = registerBlock("dull_ancient_netherite_brick",
            new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(ModBlocks.ANCIENT_NETHERITE_BRICK)));
    public static final Block TARNISHED_ANCIENT_NETHERITE_BRICK = registerBlock("tarnished_ancient_netherite_brick",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(ModBlocks.ANCIENT_NETHERITE_BRICK)));
    public static final Block RUINED_ANCIENT_NETHERITE_BRICK = registerBlock("ruined_ancient_netherite_brick",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(ModBlocks.ANCIENT_NETHERITE_BRICK)));

    public static final Block ANCIENT_NETHERITE_BRICK_STAIRS = registerBlock("ancient_netherite_brick_stairs",
            new OxidizableStairsBlock(OxidationLevel.UNAFFECTED, ANCIENT_NETHERITE_BRICK.getDefaultState(), AbstractBlock.Settings.copy(ANCIENT_NETHERITE_BRICK)));
    public static final Block DULL_ANCIENT_NETHERITE_BRICK_STAIRS = registerBlock("dull_ancient_netherite_brick_stairs",
            new OxidizableStairsBlock(OxidationLevel.EXPOSED, DULL_ANCIENT_NETHERITE_BRICK.getDefaultState(), AbstractBlock.Settings.copy(ANCIENT_NETHERITE_BRICK)));
    public static final Block TARNISHED_ANCIENT_NETHERITE_BRICK_STAIRS = registerBlock("tarnished_ancient_netherite_brick_stairs",
            new OxidizableStairsBlock(OxidationLevel.WEATHERED, TARNISHED_ANCIENT_NETHERITE_BRICK.getDefaultState(), AbstractBlock.Settings.copy(ANCIENT_NETHERITE_BRICK)));
    public static final Block RUINED_ANCIENT_NETHERITE_BRICK_STAIRS = registerBlock("ruined_ancient_netherite_brick_stairs",
            new OxidizableStairsBlock(OxidationLevel.OXIDIZED, RUINED_ANCIENT_NETHERITE_BRICK.getDefaultState(), AbstractBlock.Settings.copy(ANCIENT_NETHERITE_BRICK)));

    public static final Block ANCIENT_NETHERITE_BRICK_SLAB = registerBlock("ancient_netherite_brick_slab",
            new OxidizableSlabBlock(OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(ANCIENT_NETHERITE_BRICK)));
    public static final Block DULL_ANCIENT_NETHERITE_BRICK_SLAB = registerBlock("dull_ancient_netherite_brick_slab",
            new OxidizableSlabBlock(OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(DULL_ANCIENT_NETHERITE_BRICK)));
    public static final Block TARNISHED_ANCIENT_NETHERITE_BRICK_SLAB = registerBlock("tarnished_ancient_netherite_brick_slab",
            new OxidizableSlabBlock(OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(TARNISHED_ANCIENT_NETHERITE_BRICK)));
    public static final Block RUINED_ANCIENT_NETHERITE_BRICK_SLAB = registerBlock("ruined_ancient_netherite_brick_slab",
            new OxidizableSlabBlock(OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(RUINED_ANCIENT_NETHERITE_BRICK)));

    public static final Block ANCIENT_NETHERITE_BRICK_WALL = registerBlock("ancient_netherite_brick_wall",
            new HanasOxidizableWallBlock(OxidationLevel.UNAFFECTED, ANCIENT_NETHERITE_BRICK.getDefaultState(),
                    AbstractBlock.Settings.copy(ANCIENT_NETHERITE_BRICK)));
    public static final Block DULL_ANCIENT_NETHERITE_BRICK_WALL = registerBlock("dull_netherite_brick_wall",
            new HanasOxidizableWallBlock(OxidationLevel.EXPOSED, DULL_ANCIENT_NETHERITE_BRICK.getDefaultState(),
                    AbstractBlock.Settings.copy(DULL_ANCIENT_NETHERITE_BRICK)));
    public static final Block TARNISHED_ANCIENT_NETHERITE_BRICK_WALL = registerBlock("tarnished_netherite_brick_wall",
            new HanasOxidizableWallBlock(OxidationLevel.WEATHERED, TARNISHED_ANCIENT_NETHERITE_BRICK.getDefaultState(),
                    AbstractBlock.Settings.copy(TARNISHED_ANCIENT_NETHERITE_BRICK)));
    public static final Block RUINED_ANCIENT_NETHERITE_BRICK_WALL = registerBlock("ruined_netherite_brick_wall",
            new HanasOxidizableWallBlock(OxidationLevel.OXIDIZED, RUINED_ANCIENT_NETHERITE_BRICK.getDefaultState(),
                    AbstractBlock.Settings.copy(RUINED_ANCIENT_NETHERITE_BRICK)));

    public static final Block SEALED_ANCIENT_NETHERITE_BRICK = registerBlock("sealed_ancient_netherite_brick",
            new Block(AbstractBlock.Settings.copy(ModBlocks.ANCIENT_NETHERITE_BRICK)));
    public static final Block SEALED_DULL_ANCIENT_NETHERITE_BRICK = registerBlock("sealed_dull_ancient_netherite_brick",
            new Block(AbstractBlock.Settings.copy(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK)));
    public static final Block SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK = registerBlock("sealed_tarnished_ancient_netherite_brick",
            new Block(AbstractBlock.Settings.copy(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK)));
    public static final Block SEALED_RUINED_ANCIENT_NETHERITE_BRICK = registerBlock("sealed_ruined_ancient_netherite_brick",
            new Block(AbstractBlock.Settings.copy(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK)));

    public static final Block SEALED_ANCIENT_NETHERITE_BRICK_STAIRS = registerBlock("sealed_ancient_netherite_brick_stairs",
            new StairsBlock(ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK.getDefaultState(), AbstractBlock.Settings.copy(SEALED_ANCIENT_NETHERITE_BRICK)));
    public static final Block SEALED_DULL_ANCIENT_NETHERITE_BRICK_STAIRS = registerBlock("sealed_dull_ancient_netherite_brick_stairs",
            new StairsBlock(ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK.getDefaultState(), AbstractBlock.Settings.copy(SEALED_DULL_ANCIENT_NETHERITE_BRICK)));
    public static final Block SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_STAIRS = registerBlock("sealed_tarnished_ancient_netherite_brick_stairs",
            new StairsBlock(ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK.getDefaultState(), AbstractBlock.Settings.copy(SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK)));
    public static final Block SEALED_RUINED_ANCIENT_NETHERITE_BRICK_STAIRS = registerBlock("sealed_ruined_ancient_netherite_brick_stairs",
            new StairsBlock(ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK.getDefaultState(), AbstractBlock.Settings.copy(SEALED_RUINED_ANCIENT_NETHERITE_BRICK)));

    public static final Block SEALED_ANCIENT_NETHERITE_BRICK_SLAB = registerBlock("sealed_ancient_netherite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SEALED_ANCIENT_NETHERITE_BRICK)));
    public static final Block SEALED_DULL_ANCIENT_NETHERITE_BRICK_SLAB = registerBlock("sealed_dull_ancient_netherite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SEALED_DULL_ANCIENT_NETHERITE_BRICK).requiresTool()));
    public static final Block SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_SLAB = registerBlock("sealed_tarnished_ancient_netherite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK).requiresTool()));
    public static final Block SEALED_RUINED_ANCIENT_NETHERITE_BRICK_SLAB = registerBlock("sealed_ruined_ancient_netherite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SEALED_RUINED_ANCIENT_NETHERITE_BRICK).requiresTool()));

    public static final Block SEALED_ANCIENT_NETHERITE_BRICK_WALL = registerBlock("sealed_ancient_netherite_brick_wall",
            new HanasOxidizableWallBlock(OxidationLevel.UNAFFECTED, ANCIENT_NETHERITE_BRICK.getDefaultState(),
                    AbstractBlock.Settings.copy(ANCIENT_NETHERITE_BRICK)));
    public static final Block SEALED_DULL_ANCIENT_NETHERITE_BRICK_WALL = registerBlock("sealed_dull_netherite_brick_wall",
            new HanasOxidizableWallBlock(OxidationLevel.EXPOSED, DULL_ANCIENT_NETHERITE_BRICK.getDefaultState(),
                    AbstractBlock.Settings.copy(DULL_ANCIENT_NETHERITE_BRICK)));
    public static final Block SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_WALL = registerBlock("sealed_tarnished_netherite_brick_wall",
            new HanasOxidizableWallBlock(OxidationLevel.WEATHERED, TARNISHED_ANCIENT_NETHERITE_BRICK.getDefaultState(),
                    AbstractBlock.Settings.copy(TARNISHED_ANCIENT_NETHERITE_BRICK)));
    public static final Block SEALED_RUINED_ANCIENT_NETHERITE_BRICK_WALL = registerBlock("sealed_ruined_netherite_brick_wall",
            new HanasOxidizableWallBlock(OxidationLevel.OXIDIZED, RUINED_ANCIENT_NETHERITE_BRICK.getDefaultState(),
                    AbstractBlock.Settings.copy(RUINED_ANCIENT_NETHERITE_BRICK)));

    public static final BlockFamily FAMILY_ANCIENT_NETHERITE_BRICK = BlockFamilies.register(ModBlocks.ANCIENT_NETHERITE_BRICK)
            .slab(ModBlocks.ANCIENT_NETHERITE_BRICK_SLAB)
            .stairs(ModBlocks.ANCIENT_NETHERITE_BRICK_STAIRS).noGenerateModels()
            .wall(ModBlocks.ANCIENT_NETHERITE_BRICK_WALL).build();
    public static final BlockFamily FAMILY_DULL_ANCIENT_NETHERITE_BRICK = BlockFamilies.register(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK)
            .slab(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_SLAB)
            .stairs(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_STAIRS).noGenerateModels()
            .wall(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_WALL).build();
    public static final BlockFamily FAMILY_TARNISHED_ANCIENT_NETHERITE_BRICK = BlockFamilies.register(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK)
            .slab(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_SLAB)
            .stairs(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_STAIRS).noGenerateModels()
            .wall(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_WALL).build();
    public static final BlockFamily FAMILY_RUINED_ANCIENT_NETHERITE_BRICK = BlockFamilies.register(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK)
            .slab(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_SLAB)
            .stairs(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_STAIRS).noGenerateModels()
            .wall(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_WALL).build();

    public static final BlockFamily FAMILY_SEALED_ANCIENT_NETHERITE_BRICK = BlockFamilies.register(ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK)
            .slab(ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_SLAB)
            .stairs(ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_STAIRS)
            .wall(ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_WALL)
            .group("sealed_ancient_netherite_brick").build();
    public static final BlockFamily FAMILY_SEALED_DULL_ANCIENT_NETHERITE_BRICK = BlockFamilies.register(ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK)
            .slab(ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_SLAB)
            .stairs(ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_STAIRS)
            .wall(ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_WALL)
            .group("sealed_dull_ancient_netherite_brick").noGenerateModels().build();
    public static final BlockFamily FAMILY_SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK = BlockFamilies.register(ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK)
            .slab(ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_SLAB)
            .stairs(ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_STAIRS)
            .wall(ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_WALL)
            .group("sealed_tarnished_ancient_netherite_brick").noGenerateModels().build();
    public static final BlockFamily FAMILY_SEALED_RUINED_ANCIENT_NETHERITE_BRICK = BlockFamilies.register(ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK)
            .slab(ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_SLAB)
            .stairs(ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_STAIRS)
            .wall(ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_WALL)
            .group("sealed_ruined_ancient_netherite_brick").noGenerateModels().build();

    //public static final Block MOD_LAMP = new ModLampBlock());

    //Copper
    public static final Block COPPER_SHEET_BLOCK = registerBlock("copper_sheet_block",
        new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.COPPER)));
    public static final Block OXIDIZED_COPPER_SHEET_BLOCK = registerBlock("oxidized_copper_sheet_block",
        new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(ModBlocks.COPPER_SHEET_BLOCK).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block WEATHERED_COPPER_SHEET_BLOCK = registerBlock("weathered_copper_sheet_block",
        new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(ModBlocks.COPPER_SHEET_BLOCK).mapColor(MapColor.DARK_AQUA)));
    public static final Block EXPOSED_COPPER_SHEET_BLOCK = registerBlock("exposed_copper_sheet_block",
        new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(ModBlocks.COPPER_SHEET_BLOCK).mapColor(MapColor.TEAL)));
    public static final Block WAXED_COPPER_SHEET_BLOCK = registerBlock("waxed_copper_sheet_block",
        new Block(AbstractBlock.Settings.copy(COPPER_SHEET_BLOCK)));
    public static final Block WAXED_OXIDIZED_COPPER_SHEET_BLOCK = registerBlock("waxed_oxidized_copper_sheet_block",
        new Block(AbstractBlock.Settings.copy(OXIDIZED_COPPER_SHEET_BLOCK)));
    public static final Block WAXED_WEATHERED_COPPER_SHEET_BLOCK = registerBlock("waxed_weathered_copper_sheet_block",
        new Block(AbstractBlock.Settings.copy(WEATHERED_COPPER_SHEET_BLOCK)));
    public static final Block WAXED_EXPOSED_COPPER_SHEET_BLOCK = registerBlock("waxed_exposed_copper_sheet_block",
        new Block(AbstractBlock.Settings.copy(EXPOSED_COPPER_SHEET_BLOCK)));

    public static final Block IRON_GRATE = registerBlock("iron_grate",
        new GrateBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.METAL).strength(3.0f, 6.0f).mapColor(MapColor.IRON_GRAY).nonOpaque().requiresTool().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block IRON_GRATE_STAIRS = registerBlock("iron_grate_stairs",
            new StairsBlock(IRON_GRATE.getDefaultState(), AbstractBlock.Settings.copy(IRON_GRATE)));
    public static final Block IRON_GRATE_SLAB = registerBlock("iron_grate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(IRON_GRATE).solid()));
    public static final Block IRON_GRATE_TRAPDOOR = registerBlock("iron_grate_trapdoor",
            new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block CHISELED_IRON = registerBlock("chiseled_iron",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.METAL).strength(3.0f, 6.0f).mapColor(MapColor.IRON_GRAY).requiresTool()));

    public static final Block IRON_SHEET_BLOCK = registerBlock("iron_sheet_block",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.METAL).strength(3.0f, 6.0f).requiresTool()));
    public static final Block GOLD_SHEET_BLOCK = registerBlock("gold_sheet_block",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.METAL).strength(3.0f, 6.0f).requiresTool()));
    
    public static final Block RAW_QUARTZ_BLOCK = registerBlock("raw_quartz_block",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.NETHER_ORE).strength(3.0f, 3.0f).requiresTool()));
    
    public static final Block OAK_PLANK_BOOKSHELF = registerBlock("oak_plank_bookshelf",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).mapColor(MapColor.OAK_TAN).strength(1.5f).burnable()));
    public static final Block SPRUCE_PLANK_BOOKSHELF = registerBlock("spruce_plank_bookshelf",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).mapColor(MapColor.SPRUCE_BROWN).strength(1.5f).burnable()));
    public static final Block BIRCH_PLANK_BOOKSHELF = registerBlock("birch_plank_bookshelf",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).mapColor(MapColor.PALE_YELLOW).strength(1.5f).burnable()));
    public static final Block JUNGLE_PLANK_BOOKSHELF = registerBlock("jungle_plank_bookshelf",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).mapColor(MapColor.DIRT_BROWN).strength(1.5f).burnable()));
    public static final Block ACACIA_PLANK_BOOKSHELF = registerBlock("acacia_plank_bookshelf",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).mapColor(MapColor.ORANGE).strength(1.5f).burnable()));
    public static final Block CHERRY_PLANK_BOOKSHELF = registerBlock("cherry_plank_bookshelf",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).mapColor(MapColor.PINK).strength(1.5f).burnable()));
    public static final Block DARK_OAK_PLANK_BOOKSHELF = registerBlock("dark_oak_plank_bookshelf",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).mapColor(MapColor.BROWN).strength(1.5f).burnable()));
    public static final Block MANGROVE_PLANK_BOOKSHELF = registerBlock("mangrove_plank_bookshelf",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).mapColor(MapColor.RED).strength(1.5f).burnable()));
    public static final Block BAMBOO_PLANK_BOOKSHELF = registerBlock("bamboo_plank_bookshelf",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).mapColor(MapColor.YELLOW).strength(1.5f).burnable()));
    public static final Block WARPED_PLANK_BOOKSHELF = registerBlock("warped_plank_bookshelf",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).mapColor(Blocks.WARPED_PLANKS.getDefaultMapColor()).strength(1.5f).burnable()));
    public static final Block CRIMSON_PLANK_BOOKSHELF = registerBlock("crimson_plank_bookshelf",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).mapColor(Blocks.CRIMSON_PLANKS.getDefaultMapColor()).strength(1.5f).burnable()));

    //Amethyst
    public static final Block CUT_CRYSTAL_AMETHYST = registerBlock("cut_crystal_amethyst",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));

    //Sculk Blocks
    public static final Block SCULKED_DEEPSLATE = registerBlock("sculked_deepslate",
        new SculkBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SCULK).mapColor(MapColor.BLACK).strength(3.0f, 6.0f).requiresTool()));
    public static final Block SCULKED_COBBLED_DEEPSLATE = registerBlock("sculked_cobbled_deepslate",
        new SculkBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SCULK).mapColor(MapColor.BLACK).strength(3.5f, 6.0f).requiresTool()));
    public static final Block SCULKED_DEEPSLATE_BRICK = registerBlock("sculked_deepslate_brick",
        new SculkBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SCULK).mapColor(MapColor.BLACK).strength(3.5f, 6.0f).requiresTool()));
    public static final Block SCULKED_DEEPSLATE_TILES = registerBlock("sculked_deepslate_tiles",
        new SculkBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SCULK).mapColor(MapColor.BLACK).strength(3.5f, 6.0f).requiresTool()));
    public static final Block SCULKED_POLISHED_DEEPSLATE = registerBlock("sculked_polished_deepslate",
        new SculkBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SCULK).mapColor(MapColor.BLACK).strength(3.5f, 6.0f).requiresTool()));
    public static final Block SCULKED_NETHERRACK = registerBlock("sculked_netherrack",
        new SculkBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SCULK).mapColor(MapColor.BLACK).strength(0.4f).requiresTool()));
    public static final Block SCULKED_NETHERRACK_BRICK = registerBlock("sculked_netherrack_brick",
        new SculkBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SCULK).mapColor(MapColor.BLACK).strength(0.4f).requiresTool()));
    public static final Block SCULKED_END_STONE = registerBlock("sculked_end_stone",
        new SculkBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SCULK).mapColor(MapColor.BLACK).strength(3.0f, 9.0f).requiresTool()));
    public static final Block SCULKED_END_STONE_BRICK = registerBlock("sculked_end_stone_brick",
        new SculkBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SCULK).mapColor(MapColor.BLACK).strength(3.0f, 9.0f).requiresTool()));
    public static final Block SCULKED_POLISHED_END_STONE = registerBlock("sculked_polished_end_stone",
        new SculkBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SCULK).mapColor(MapColor.BLACK).strength(3.0f, 9.0f).requiresTool()));

    //Polished Ice
    public static final Block POLISHED_ICE = registerBlock("polished_ice",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).strength(0.6f)));

    public static final Block POLISHED_ICE_BRICK = registerBlock("polished_ice_brick",
        new Block(AbstractBlock.Settings.copy(POLISHED_ICE).solid()));
    public static final Block CHISELED_POLISHED_ICE_BRICK = registerBlock("chiseled_polished_ice_brick",
        new Block(AbstractBlock.Settings.copy(POLISHED_ICE).solid()));
    public static final Block CRACKED_POLISHED_ICE_BRICK = registerBlock("cracked_polished_ice_brick",
        new Block(AbstractBlock.Settings.copy(POLISHED_ICE).solid()));
    
    //Frosted
    public static final Block FROSTED_ICE_BRICK = registerBlock("frosted_ice_brick",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).strength(0.6f)));
    
    //Crystal Ice
    public static final Block CUT_CRYSTAL_ICE_BLOCK = registerBlock("cut_crystal_ice_block",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).strength(0.6f)));
    
    //ICE
    public static final Block ICE_BRICK = registerBlock("ice_brick",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).strength(0.6f)));

    public static final Block ICE_BRICK_TILE = registerBlock("ice_brick_tile",
        new Block(AbstractBlock.Settings.copy(ICE_BRICK).solid()));
    public static final Block CHISELED_ICE_BRICK = registerBlock("chiseled_ice_brick",
        new Block(AbstractBlock.Settings.copy(ICE_BRICK).solid()));
    public static final Block CRACKED_ICE_BRICK = registerBlock("cracked_ice_brick",
        new Block(AbstractBlock.Settings.copy(ICE_BRICK).solid()));

    //Honey Comb
    public static final Block HONEY_COMB_BRICKS = registerBlock("honey_comb_bricks",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.CORAL).strength(0.6f)));
    public static final Block HONEY_COMB_BRICK_STAIRS = registerBlock("honey_comb_brick_stairs",
        new StairsBlock(HONEY_COMB_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(HONEY_COMB_BRICKS)));
    public static final Block HONEY_COMB_BRICK_SLAB = registerBlock("honey_comb_brick_slab",
         new SlabBlock(AbstractBlock.Settings.copy(HONEY_COMB_BRICKS).solid()));
    public static final Block HONEY_COMB_BRICK_WALL = registerBlock("honey_comb_brick_wall",
        new WallBlock(AbstractBlock.Settings.copy(HONEY_COMB_BRICKS).solid()));

    //Drip
    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK).solid()));
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK).solid()));

    //Smooth Sandstone
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE).solid()));

    //Stone
    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE).solid()));

    //Andesite
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE).solid()));

    //Diorite
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE).solid()));

    //Granite
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE).solid()));

    //Cracked Stone Brick
    public static final Block CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS).solid()));

    //Smooth Stone
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).solid()));

    //
    public static final Block SANDSTONE_BRICK = registerBlock( "sandstone_brick",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(0.8f)));
    public static final Block SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            new StairsBlock(ModBlocks.SANDSTONE_BRICK.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.SANDSTONE_BRICK)));
    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.SANDSTONE_BRICK).solid()));
    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.SANDSTONE_BRICK).solid()));

    //
    public static final Block CRACKED_SANDSTONE_BRICK = registerBlock( "cracked_sandstone_brick",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(0.7f)));
    public static final Block CRACKED_SANDSTONE_BRICK_STAIRS = registerBlock("cracked_sandstone_brick_stairs",
            new StairsBlock(ModBlocks.CRACKED_SANDSTONE_BRICK.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.CRACKED_SANDSTONE_BRICK)));
    public static final Block CRACKED_SANDSTONE_BRICK_SLAB = registerBlock("cracked_sandstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.CRACKED_SANDSTONE_BRICK).solid()));
    public static final Block CRACKED_SANDSTONE_BRICK_WALL = registerBlock("cracked_sandstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.CRACKED_SANDSTONE_BRICK).solid()));

    //
    public static final Block SANDSTONE_TILES = registerBlock("sandstone_tiles",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.2f)));
    public static final Block SANDSTONE_TILES_STAIRS = registerBlock("sandstone_tiles_stairs",
            new StairsBlock(ModBlocks.SANDSTONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.SANDSTONE_TILES)));
    public static final Block SANDSTONE_TILES_SLAB = registerBlock("sandstone_tiles_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.SANDSTONE_TILES).solid()));
    public static final Block SANDSTONE_TILES_WALL = registerBlock("sandstone_tiles_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.SANDSTONE_TILES).solid()));

    //
    public static final Block CRACKED_SANDSTONE_TILES = registerBlock( "cracked_sandstone_tiles",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block CRACKED_SANDSTONE_TILES_STAIRS = registerBlock("cracked_sandstone_tiles_stairs",
            new StairsBlock(ModBlocks.CRACKED_SANDSTONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.CRACKED_SANDSTONE_TILES)));
    public static final Block CRACKED_SANDSTONE_TILES_SLAB = registerBlock("cracked_sandstone_tiles_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.CRACKED_SANDSTONE_TILES).solid()));
    public static final Block CRACKED_SANDSTONE_TILES_WALL = registerBlock("cracked_sandstone_tiles_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.CRACKED_SANDSTONE_TILES).solid()));

    //
    public static final Block COBBLE_SANDSTONE = registerBlock( "cobble_sandstone",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block COBBLE_SANDSTONE_STAIRS = registerBlock("cobble_sandstone_stairs",
            new StairsBlock(ModBlocks.COBBLE_SANDSTONE.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.COBBLE_SANDSTONE)));
    public static final Block COBBLE_SANDSTONE_SLAB = registerBlock("cobble_sandstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.COBBLE_SANDSTONE).solid()));
    public static final Block COBBLE_SANDSTONE_WALL = registerBlock("cobble_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.COBBLE_SANDSTONE).solid()));

    //
    public static final Block COBBLING_SANDSTONE_BLOCK = registerBlock( "cobbling_sandstone_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block COBBLING_SANDSTONE_STAIRS = registerBlock("cobbling_sandstone_stairs",
            new StairsBlock(ModBlocks.COBBLING_SANDSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.COBBLING_SANDSTONE_BLOCK)));
    public static final Block COBBLING_SANDSTONE_SLAB = registerBlock("cobbling_sandstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.COBBLING_SANDSTONE_BLOCK).solid()));
    public static final Block COBBLING_SANDSTONE_WALL = registerBlock("cobbling_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.COBBLING_SANDSTONE_BLOCK).solid()));

    //
    public static final Block POLISHED_MARBLE = registerBlock("polished_marble",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block POLISHED_MARBLE_STAIRS = registerBlock("polished_marble_stairs",
            new StairsBlock(ModBlocks.POLISHED_MARBLE.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.POLISHED_MARBLE)));
    public static final Block POLISHED_MARBLE_SLAB = registerBlock("polished_marble_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.POLISHED_MARBLE).solid()));
    public static final Block POLISHED_MARBLE_WALL = registerBlock("polished_marble_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.POLISHED_MARBLE).solid()));

    //
    public static final Block POLISHED_MARBLE_BRICK = registerBlock("polished_marble_brick",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block POLISHED_MARBLE_BRICK_STAIRS = registerBlock("polished_marble_brick_stairs",
            new StairsBlock(ModBlocks.POLISHED_MARBLE_BRICK.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.POLISHED_MARBLE_BRICK)));
    public static final Block POLISHED_MARBLE_BRICK_SLAB = registerBlock("polished_marble_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.POLISHED_MARBLE_BRICK).solid()));
    public static final Block POLISHED_MARBLE_BRICK_WALL = registerBlock("polished_marble_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.POLISHED_MARBLE_BRICK).solid()));

    //
    public static final Block COBBLED_MARBLE = registerBlock("cobbled_marble",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block COBBLED_MARBLE_STAIRS = registerBlock("cobbled_marble_stairs",
            new StairsBlock(ModBlocks.COBBLED_MARBLE.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.COBBLED_MARBLE)));
    public static final Block COBBLED_MARBLE_SLAB = registerBlock("cobbled_marble_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.COBBLED_MARBLE).solid()));
    public static final Block COBBLED_MARBLE_WALL = registerBlock("cobbled_marble_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.COBBLED_MARBLE).solid()));

    //
    public static final Block MOSSY_COBBLED_MARBLE = registerBlock("mossy_cobbled_marble",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block MOSSY_COBBLED_MARBLE_STAIRS = registerBlock("mossy_cobbled_marble_stairs",
            new StairsBlock(ModBlocks.MOSSY_COBBLED_MARBLE.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.MOSSY_COBBLED_MARBLE)));
    public static final Block MOSSY_COBBLED_MARBLE_SLAB = registerBlock("mossy_cobbled_marble_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_COBBLED_MARBLE).solid()));
    public static final Block MOSSY_COBBLED_MARBLE_WALL = registerBlock("mossy_cobbled_marble_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_COBBLED_MARBLE).solid()));

    //
    public static final Block DENSE_MARBLE = registerBlock("dense_marble",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block DENSE_MARBLE_STAIRS = registerBlock("dense_marble_stairs",
            new StairsBlock(ModBlocks.DENSE_MARBLE.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.DENSE_MARBLE)));
    public static final Block DENSE_MARBLE_SLAB = registerBlock("dense_marble_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.DENSE_MARBLE).solid()));
    public static final Block DENSE_MARBLE_WALL = registerBlock("dense_marble_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.DENSE_MARBLE).solid()));

    //
    public static final Block MOSSY_STONE = registerBlock("mossy_stone",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block MOSSY_STONE_STAIRS = registerBlock("mossy_stone_stairs",
            new StairsBlock(ModBlocks.MOSSY_STONE.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.MOSSY_STONE)));
    public static final Block MOSSY_STONE_SLAB = registerBlock("mossy_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_STONE).solid()));
    public static final Block MOSSY_STONE_WALL = registerBlock("mossy_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_STONE).solid()));

    //
    public static final Block MOSSY_ANDESITE = registerBlock("mossy_andesite",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block MOSSY_ANDESITE_STAIRS = registerBlock("mossy_andesite_stairs",
            new StairsBlock(ModBlocks.MOSSY_ANDESITE.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.MOSSY_ANDESITE)));
    public static final Block MOSSY_ANDESITE_SLAB = registerBlock("mossy_andesite_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_ANDESITE).solid()));
    public static final Block MOSSY_ANDESITE_WALL = registerBlock("mossy_andesite_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_ANDESITE).solid()));

    //
    public static final Block MOSSY_POLISHED_ANDESITE = registerBlock("mossy_polished_andesite",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block MOSSY_POLISHED_ANDESITE_STAIRS = registerBlock("mossy_polished_andesite_stairs",
            new StairsBlock(ModBlocks.MOSSY_POLISHED_ANDESITE.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.MOSSY_POLISHED_ANDESITE)));
    public static final Block MOSSY_POLISHED_ANDESITE_SLAB = registerBlock("mossy_polished_andesite_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_POLISHED_ANDESITE).solid()));
    public static final Block MOSSY_POLISHED_ANDESITE_WALL = registerBlock("mossy_polished_andesite_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_POLISHED_ANDESITE).solid()));

    //
    public static final Block MOSSY_DIORITE = registerBlock("mossy_diorite",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block MOSSY_DIORITE_STAIRS = registerBlock("mossy_diorite_stairs",
            new StairsBlock(ModBlocks.MOSSY_DIORITE.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.MOSSY_DIORITE)));
    public static final Block MOSSY_DIORITE_SLAB = registerBlock("mossy_diorite_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_DIORITE).solid()));
    public static final Block MOSSY_DIORITE_WALL = registerBlock("mossy_diorite_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_DIORITE).solid()));

    //
    public static final Block MOSSY_POLISHED_DIORITE = registerBlock("mossy_polished_diorite",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block MOSSY_POLISHED_DIORITE_STAIRS = registerBlock("mossy_polished_diorite_stairs",
            new StairsBlock(ModBlocks.MOSSY_POLISHED_DIORITE.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.MOSSY_POLISHED_DIORITE)));
    public static final Block MOSSY_POLISHED_DIORITE_SLAB = registerBlock("mossy_polished_diorite_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_POLISHED_DIORITE).solid()));
    public static final Block MOSSY_POLISHED_DIORITE_WALL = registerBlock("mossy_polished_diorite_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_POLISHED_DIORITE).solid()));

    //
    public static final Block MOSSY_GRANITE = registerBlock("mossy_granite",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block MOSSY_GRANITE_STAIRS = registerBlock("mossy_granite_stairs",
            new StairsBlock(ModBlocks.MOSSY_GRANITE.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.MOSSY_GRANITE)));
    public static final Block MOSSY_GRANITE_SLAB = registerBlock("mossy_granite_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_GRANITE).solid()));
    public static final Block MOSSY_GRANITE_WALL = registerBlock("mossy_granite_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_GRANITE).solid()));

    //
    public static final Block MOSSY_POLISHED_GRANITE = registerBlock("mossy_polished_granite",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block MOSSY_POLISHED_GRANITE_STAIRS = registerBlock("mossy_polished_granite_stairs",
            new StairsBlock(MOSSY_POLISHED_GRANITE.getDefaultState(), AbstractBlock.Settings.copy(MOSSY_POLISHED_GRANITE)));
    public static final Block MOSSY_POLISHED_GRANITE_SLAB = registerBlock("mossy_polished_granite_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_POLISHED_GRANITE).solid()));
    public static final Block MOSSY_POLISHED_GRANITE_WALL = registerBlock("mossy_polished_granite_wall",
            new WallBlock(AbstractBlock.Settings.copy(MOSSY_POLISHED_GRANITE).solid()));

    //End Stone
    public static final Block POLISHED_END_STONE = registerBlock("polished_end_stone",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f, 9.0f).requiresTool()));
    public static final Block POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs",
        new StairsBlock(POLISHED_END_STONE.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_END_STONE)));
    public static final Block POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
        new SlabBlock(AbstractBlock.Settings.copy(POLISHED_END_STONE).solid()));
    public static final Block POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
        new WallBlock(AbstractBlock.Settings.copy(POLISHED_END_STONE).solid()));
    
    //Netherrack
    public static final Block NETHERRACK_BRICK = registerBlock("netherrack_brick",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.NETHERRACK).strength(0.4f).requiresTool()));
    public static final Block NETHERRACK_BRICK_STAIRS = registerBlock("netherrack_brick_stairs",
        new StairsBlock(NETHERRACK_BRICK.getDefaultState(), AbstractBlock.Settings.copy(NETHERRACK_BRICK)));
    public static final Block NETHERRACK_BRICK_SLAB = registerBlock("netherrack_brick_slab",
        new SlabBlock(AbstractBlock.Settings.copy(NETHERRACK_BRICK).solid()));
    public static final Block NETHERRACK_BRICK_WALL = registerBlock("netherrack_brick_wall",
        new WallBlock(AbstractBlock.Settings.copy(NETHERRACK_BRICK).solid()));

    //Cracked Nether Brick
    public static final Block CRACKED_NETHER_BRICK_STAIRS = registerBlock("cracked_nether_brick_stairs",
            new StairsBlock(Blocks.CRACKED_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(NETHERRACK_BRICK).solid()));
    public static final Block CRACKED_NETHER_BRICK_WALL = registerBlock("cracked_nether_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(NETHERRACK_BRICK).solid()));

    //Cracked Polished Blackstone Bricks
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs",
            new StairsBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(NETHERRACK_BRICK).solid()));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(NETHERRACK_BRICK).solid()));

    //Basalt
    public static final Block SMOOTHED_BASALT = registerBlock("smoothed_basalt",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BASALT).strength(1f, 4.2f).requiresTool()));
    public static final Block SMOOTHED_BASALT_STAIRS = registerBlock("smoothed_basalt_stairs",
            new StairsBlock(SMOOTHED_BASALT.getDefaultState(), AbstractBlock.Settings.copy(SMOOTHED_BASALT)));
    public static final Block SMOOTHED_BASALT_SLAB = registerBlock("smoothed_basalt_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SMOOTHED_BASALT)));
    public static final Block SMOOTHED_BASALT_WALL = registerBlock("smoothed_basalt_wall",
            new WallBlock(AbstractBlock.Settings.copy(SMOOTHED_BASALT).solid()));

    public static final Block POLISHED_BASALT_BRICK = registerBlock("polished_basalt_brick",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BASALT).strength(1.25f, 4.2f).requiresTool()));
    public static final Block POLISHED_BASALT_BRICK_STAIRS = registerBlock("polished_basalt_brick_stairs",
        new StairsBlock(POLISHED_BASALT_BRICK.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_BASALT_BRICK)));
    public static final Block POLISHED_BASALT_BRICK_SLAB = registerBlock("polished_basalt_brick_slab",
        new SlabBlock(AbstractBlock.Settings.copy(POLISHED_BASALT_BRICK)));
    public static final Block POLISHED_BASALT_BRICK_WALL = registerBlock("polished_basalt_brick_wall",
        new WallBlock(AbstractBlock.Settings.copy(POLISHED_BASALT_BRICK).solid()));
    
    //Prismarine
    public static final Block POLISHED_PRISMARINE = registerBlock("polished_prismarine",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f).requiresTool()));
    public static final Block POLISHED_PRISMARINE_STAIRS = registerBlock("polished_prismarine_stairs",
        new StairsBlock(POLISHED_PRISMARINE.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_PRISMARINE)));
    public static final Block POLISHED_PRISMARINE_SLAB = registerBlock("polished_prismarine_slab",
        new SlabBlock(AbstractBlock.Settings.copy(POLISHED_PRISMARINE)));
    public static final Block POLISHED_PRISMARINE_WALL = registerBlock("polished_prismarine_wall",
        new WallBlock(AbstractBlock.Settings.copy(POLISHED_PRISMARINE).solid()));

    //Pride Blocks
    public static final Block TRANSGENDER_BLOCK = registerBlock("transgender_block",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.CHERRY_WOOD).strength(0.1f, 1.0f)));

    // Vertical Slabs
    public static final Block OAK_VERTICAL_SLAB = registerBlock("oak_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(OAK_SLAB).nonOpaque()));
    public static final Block SPRUCE_VERTICAL_SLAB = registerBlock("spruce_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(SPRUCE_SLAB).nonOpaque()));
    public static final Block BIRCH_VERTICAL_SLAB = registerBlock("birch_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(BIRCH_SLAB).nonOpaque()));
    public static final Block JUNGLE_VERTICAL_SLAB = registerBlock("jungle_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(JUNGLE_SLAB).nonOpaque()));
    public static final Block ACACIA_VERTICAL_SLAB = registerBlock("acacia_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(ACACIA_SLAB).nonOpaque()));
    public static final Block DARK_OAK_VERTICAL_SLAB = registerBlock("dark_oak_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(DARK_OAK_SLAB).nonOpaque()));
    public static final Block MANGROVE_VERTICAL_SLAB = registerBlock("mangrove_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(MANGROVE_SLAB).nonOpaque()));
    public static final Block CHERRY_VERTICAL_SLAB = registerBlock("cherry_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(CHERRY_SLAB).nonOpaque()));
    public static final Block BAMBOO_VERTICAL_SLAB = registerBlock("bamboo_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(BAMBOO_SLAB).nonOpaque()));
    public static final Block BAMBOO_MOSAIC_VERTICAL_SLAB = registerBlock("bamboo_mosaic_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(BAMBOO_MOSAIC_SLAB).nonOpaque()));
    public static final Block CRIMSON_VERTICAL_SLAB = registerBlock("crimson_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(CRIMSON_SLAB).nonOpaque()));
    public static final Block WARPED_VERTICAL_SLAB = registerBlock("warped_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(WARPED_SLAB).nonOpaque()));
    public static final Block STONE_VERTICAL_SLAB = registerBlock("stone_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(STONE_SLAB).nonOpaque()));
    public static final Block COBBLESTONE_VERTICAL_SLAB = registerBlock("cobblestone_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(COBBLESTONE_SLAB).nonOpaque()));
    public static final Block MOSSY_COBBLESTONE_VERTICAL_SLAB = registerBlock("mossy_cobblestone_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(MOSSY_COBBLESTONE_SLAB).nonOpaque()));
    public static final Block SMOOTH_STONE_VERTICAL_SLAB = registerBlock("smooth_stone_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(SMOOTH_STONE_SLAB).nonOpaque()));
    public static final Block STONE_BRICK_VERTICAL_SLAB = registerBlock("stone_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(STONE_BRICK_SLAB).nonOpaque()));
    public static final Block MOSSY_STONE_BRICK_VERTICAL_SLAB = registerBlock("mossy_stone_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(MOSSY_STONE_BRICK_SLAB).nonOpaque()));
    public static final Block GRANITE_VERTICAL_SLAB = registerBlock("granite_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(GRANITE_SLAB).nonOpaque()));
    public static final Block POLISHED_GRANITE_VERTICAL_SLAB = registerBlock("polished_granite_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(POLISHED_GRANITE_SLAB).nonOpaque()));
    public static final Block DIORITE_VERTICAL_SLAB = registerBlock("diorite_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(DIORITE_SLAB).nonOpaque()));
    public static final Block POLISHED_DIORITE_VERTICAL_SLAB = registerBlock("polished_diorite_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(POLISHED_DIORITE_SLAB).nonOpaque()));
    public static final Block ANDESITE_VERTICAL_SLAB = registerBlock("andesite_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(ANDESITE_SLAB).nonOpaque()));
    public static final Block POLISHED_ANDESITE_VERTICAL_SLAB = registerBlock("polished_andesite_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(POLISHED_ANDESITE_SLAB).nonOpaque()));
    public static final Block COBBLED_DEEPSLATE_VERTICAL_SLAB = registerBlock("cobbled_deepslate_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(COBBLED_DEEPSLATE_SLAB).nonOpaque()));
    public static final Block POLISHED_DEEPSLATE_VERTICAL_SLAB = registerBlock("polished_deepslate_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(POLISHED_DEEPSLATE_SLAB).nonOpaque()));
    public static final Block DEEPSLATE_BRICK_VERTICAL_SLAB = registerBlock("deepslate_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(DEEPSLATE_BRICK_SLAB).nonOpaque()));
    public static final Block DEEPSLATE_TILE_VERTICAL_SLAB = registerBlock("deepslate_tile_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(DEEPSLATE_TILE_SLAB).nonOpaque()));
    public static final Block TUFF_VERTICAL_SLAB = registerBlock("tuff_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(TUFF_SLAB).nonOpaque()));
    public static final Block POLISHED_TUFF_VERTICAL_SLAB = registerBlock("polished_tuff_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(POLISHED_TUFF_SLAB).nonOpaque()));
    public static final Block TUFF_BRICK_VERTICAL_SLAB = registerBlock("tuff_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(TUFF_BRICK_SLAB).nonOpaque()));
    public static final Block BRICK_VERTICAL_SLAB = registerBlock("brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(BRICK_SLAB).nonOpaque()));
    public static final Block MUD_BRICK_VERTICAL_SLAB = registerBlock("mud_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(MUD_BRICK_SLAB).nonOpaque()));
    public static final Block SANDSTONE_VERTICAL_SLAB = registerBlock("sandstone_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(SANDSTONE_SLAB).nonOpaque()));
    public static final Block SMOOTH_SANDSTONE_VERTICAL_SLAB = registerBlock("smooth_sandstone_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(SMOOTH_SANDSTONE_SLAB).nonOpaque()));
    public static final Block CUT_SANDSTONE_VERTICAL_SLAB = registerBlock("cut_sandstone_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(CUT_SANDSTONE_SLAB).nonOpaque()));
    public static final Block RED_SANDSTONE_VERTICAL_SLAB = registerBlock("red_sandstone_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(RED_SANDSTONE_SLAB).nonOpaque()));
    public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = registerBlock("smooth_red_sandstone_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(SMOOTH_RED_SANDSTONE_SLAB).nonOpaque()));
    public static final Block CUT_RED_SANDSTONE_VERTICAL_SLAB = registerBlock("cut_red_sandstone_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(CUT_RED_SANDSTONE_SLAB).nonOpaque()));
    public static final Block PRISMARINE_VERTICAL_SLAB = registerBlock("prismarine_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(PRISMARINE_SLAB).nonOpaque()));
    public static final Block PRISMARINE_BRICK_VERTICAL_SLAB = registerBlock("prismarine_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(PRISMARINE_BRICK_SLAB).nonOpaque()));
    public static final Block DARK_PRISMARINE_VERTICAL_SLAB = registerBlock("dark_prismarine_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(DARK_PRISMARINE_SLAB).nonOpaque()));
    public static final Block NETHER_BRICK_VERTICAL_SLAB = registerBlock("nether_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(NETHER_BRICK_SLAB).nonOpaque()));
    public static final Block RED_NETHER_BRICK_VERTICAL_SLAB = registerBlock("red_nether_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(RED_NETHER_BRICK_SLAB).nonOpaque()));
    public static final Block BLACKSTONE_VERTICAL_SLAB = registerBlock("blackstone_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(BLACKSTONE_SLAB).nonOpaque()));
    public static final Block POLISHED_BLACKSTONE_VERTICAL_SLAB = registerBlock("polished_blackstone_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(POLISHED_BLACKSTONE_SLAB).nonOpaque()));
    public static final Block POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = registerBlock("polished_blackstone_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(POLISHED_BLACKSTONE_BRICK_SLAB).nonOpaque()));
    public static final Block END_STONE_BRICK_VERTICAL_SLAB = registerBlock("end_stone_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(END_STONE_BRICK_SLAB).nonOpaque()));
    public static final Block PURPUR_VERTICAL_SLAB = registerBlock("purpur_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(PURPUR_SLAB).nonOpaque()));
    public static final Block QUARTZ_VERTICAL_SLAB = registerBlock("quartz_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(QUARTZ_SLAB).nonOpaque()));
    public static final Block SMOOTH_QUARTZ_VERTICAL_SLAB = registerBlock("smooth_quartz_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(SMOOTH_QUARTZ_SLAB).nonOpaque()));
    public static final Block CUT_COPPER_VERTICAL_SLAB = registerBlock("cut_copper_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(CUT_COPPER_SLAB).nonOpaque()));
    public static final Block EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerBlock("exposed_cut_copper_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(EXPOSED_CUT_COPPER_SLAB).nonOpaque()));
    public static final Block WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerBlock("weathered_cut_copper_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(WEATHERED_CUT_COPPER_SLAB).nonOpaque()));
    public static final Block OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerBlock("oxidized_cut_copper_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(OXIDIZED_CUT_COPPER_SLAB).nonOpaque()));
    public static final Block WAXED_CUT_COPPER_VERTICAL_SLAB = registerBlock("waxed_cut_copper_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(WAXED_CUT_COPPER_SLAB).nonOpaque()));
    public static final Block WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerBlock("waxed_exposed_cut_copper_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(WAXED_EXPOSED_CUT_COPPER_SLAB).nonOpaque()));
    public static final Block WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerBlock("waxed_weathered_cut_copper_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(WAXED_WEATHERED_CUT_COPPER_SLAB).nonOpaque()));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerBlock("waxed_oxidized_cut_copper_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(WAXED_OXIDIZED_CUT_COPPER_SLAB).nonOpaque()));

    public static final Block ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB = registerBlock("ancient_netherite_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(ANCIENT_NETHERITE_BRICK_SLAB).nonOpaque()));
    public static final Block DULL_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB = registerBlock("dull_ancient_netherite_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(DULL_ANCIENT_NETHERITE_BRICK_SLAB).nonOpaque()));
    public static final Block TARNISHED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB = registerBlock("tarnished_ancient_netherite_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(TARNISHED_ANCIENT_NETHERITE_BRICK_SLAB).nonOpaque()));
    public static final Block RUINED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB = registerBlock("ruined_ancient_netherite_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(RUINED_ANCIENT_NETHERITE_BRICK_SLAB).nonOpaque()));
    public static final Block SEALED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB = registerBlock("sealed_ancient_netherite_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(SEALED_ANCIENT_NETHERITE_BRICK_SLAB).nonOpaque()));
    public static final Block SEALED_DULL_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB = registerBlock("sealed_dull_ancient_netherite_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(SEALED_DULL_ANCIENT_NETHERITE_BRICK_SLAB).nonOpaque()));
    public static final Block SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB = registerBlock("sealed_tarnished_ancient_netherite_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_SLAB).nonOpaque()));
    public static final Block SEALED_RUINED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB = registerBlock("sealed_ruined_ancient_netherite_brick_vertical_slab",
            new ModVerticalSlabBlock(AbstractBlock.Settings.copy(SEALED_RUINED_ANCIENT_NETHERITE_BRICK_SLAB).nonOpaque()));


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
