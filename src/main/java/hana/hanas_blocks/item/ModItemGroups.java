package hana.hanas_blocks.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import hana.hanas_blocks.HanasBlocks;
import hana.hanas_blocks.block.ModBlocks;
import net.minecraft.item.*;
//import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    //public static final ItemGroup PEARLARIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
    //        new Identifier(HanasBlocks.MOD_ID, "pearlarium_group"),
    //        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pearlarium_group"))
    //        .icon(() -> new ItemStack(ModItems.RAW_PEARLARIUM)).entries((displayContext, entries) -> {
    //                entries.add(ModItems.RAW_PEARLARIUM);
    //                
    //            }).build());
    public static final ItemGroup BLAHAJ = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HanasBlocks.MOD_ID, "blahaj"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blahaj"))
            .icon(() -> new ItemStack(ModItems.BLAHAJ)).entries((displayContext, entries) -> {
                    entries.add(ModItems.WHITE_BLAHAJ);
                    entries.add(ModItems.ORANGE_BLAHAJ);
                    entries.add(ModItems.MAGENTA_BLAHAJ);
                    entries.add(ModItems.LIGHT_BLUE_BLAHAJ);
                    entries.add(ModItems.YELLOW_BLAHAJ);
                    entries.add(ModItems.LIME_BLAHAJ);
                    entries.add(ModItems.PINK_BLAHAJ);
                    entries.add(ModItems.GRAY_BLAHAJ);
                    entries.add(ModItems.LIGHT_GRAY_BLAHAJ);
                    entries.add(ModItems.CYAN_BLAHAJ);
                    entries.add(ModItems.PURPLE_BLAHAJ);
                    entries.add(ModItems.BLAHAJ);
                    entries.add(ModItems.BROWN_BLAHAJ );
                    entries.add(ModItems.GREEN_BLAHAJ);
                    entries.add(ModItems.RED_BLAHAJ);
                    entries.add(ModItems.BLACK_BLAHAJ);

                    entries.add(ModItems.NEON_PINK_BLAHAJ);

                    entries.add(ModItems.PEARLARIUM_BLAHAJ);
                    entries.add(ModItems.NIGRUM_PETRAMIUNIUM_BLAHAJ);

                    entries.add(ModItems.PRIDE_BLAHAJ);
                    entries.add(ModItems.TRANSGENDER_BLAHAJ);
                    entries.add(ModItems.DEMIBOY_BLAHAJ);
                    entries.add(ModItems.DEMIGIRL_BLAHAJ);
                    entries.add(ModItems.GENDERFLUID_BLAHAJ);
                    entries.add(ModItems.NON_BINARY_BLAHAJ);
                    entries.add(ModItems.POLYGENDER_BLAHAJ);
                    entries.add(ModItems.LESBIAN_BLAHAJ);
                    entries.add(ModItems.LONG_BACON_BLAHAJ);
                    entries.add(ModItems.GAY_BLAHAJ);
                    entries.add(ModItems.PANSEXUAL_BLAHAJ);
                    entries.add(ModItems.BISEXUAL_BLAHAJ);

                }).build());

    public static final ItemGroup SHEET_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HanasBlocks.MOD_ID, "sheet_item_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.hanas_stuff"))
            .icon(() -> new ItemStack(ModItems.PEARLARIUM_ALLOY_SHEET)).entries((displayContext, entries) -> {
                    entries.add(ModItems.COPPER_SHEET);
                    entries.add(ModItems.IRON_SHEET);
                    entries.add(ModItems.GOLD_SHEET);
                    entries.add(ModItems.SCRAP_SHEET);
              
                    entries.add(ModItems.RAW_PEARLARIUM);
                    entries.add(ModItems.PEARLARIUM_ALLOY_INGOT);
                    entries.add(ModItems.PEARLARIUM_ALLOY_PLATE);
                    entries.add(ModItems.PEARLARIUM_ALLOY_SHEET);
                    entries.add(ModItems.PEARLARIUM_CRYSTAL);
                    entries.add(ModItems.CRUSHED_PEARLARIUM);

                    entries.add(ModItems.RAW_NIGRUM_PETRAMIUNIUM);
                    entries.add(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT);
                    entries.add(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE);
                    entries.add(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_SHEET);
                    entries.add(ModItems.NIGRUM_PETRAMIUNIUM_CRYSTAL);
                    entries.add(ModItems.CRUSHED_NIGRUM_PETRAMIUNIUM);

                    entries.add(ModItems.PEARLARIUM_HELMET);
                    entries.add(ModItems.PEARLARIUM_CHESTPLATE);
                    entries.add(ModItems.PEARLARIUM_LEGGINGS);
                    entries.add(ModItems.PEARLARIUM_BOOTS);
                    entries.add(ModItems.PEARLARIUM_PLATE_HELMET);
                    entries.add(ModItems.PEARLARIUM_PLATE_CHESTPLATE);
                    entries.add(ModItems.PEARLARIUM_PLATE_LEGGINGS);
                    entries.add(ModItems.PEARLARIUM_PLATE_BOOTS);

                    entries.add(ModItems.PEARLARIUM_PLATED_SHIELD);

                    entries.add(ModItems.NIGRUM_PETRAMINIUM_HELMET);
                    entries.add(ModItems.NIGRUM_PETRAMINIUM_CHESTPLATE);
                    entries.add(ModItems.NIGRUM_PETRAMINIUM_LEGGINGS);
                    entries.add(ModItems.NIGRUM_PETRAMINIUM_BOOTS);
                    entries.add(ModItems.NIGRUM_PETRAMINIUM_PLATE_HELMET);
                    entries.add(ModItems.NIGRUM_PETRAMINIUM_PLATE_CHESTPLATE);
                    entries.add(ModItems.NIGRUM_PETRAMINIUM_PLATE_LEGGINGS);
                    entries.add(ModItems.NIGRUM_PETRAMINIUM_PLATE_BOOTS);

                    entries.add(ModBlocks.ACACIA_PLANK_BOOKSHELF);
                    entries.add(ModBlocks.OAK_PLANK_BOOKSHELF);
                    entries.add(ModBlocks.BIRCH_PLANK_BOOKSHELF);
                    entries.add(ModBlocks.JUNGLE_PLANK_BOOKSHELF);
                    entries.add(ModBlocks.DARK_OAK_PLANK_BOOKSHELF);
                    entries.add(ModBlocks.BAMBOO_PLANK_BOOKSHELF);
                    entries.add(ModBlocks.MANGROVE_PLANK_BOOKSHELF);
                    entries.add(ModBlocks.CHERRY_PLANK_BOOKSHELF);
                    entries.add(ModBlocks.SPRUCE_PLANK_BOOKSHELF);
                    entries.add(ModBlocks.WARPED_PLANK_BOOKSHELF);
                    entries.add(ModBlocks.CRIMSON_PLANK_BOOKSHELF);

                    entries.add(ModBlocks.MAHOGANY_PLANK_BOOKSHELF);

                    entries.add(ModItems.SCULK_MATERIAL);
                    entries.add(ModBlocks.GLOWING_WISTERIA);
                    entries.add(ModBlocks.ACONITE);
                    entries.add(ModBlocks.RED_ROSE);
                    entries.add(ModBlocks.BLUE_ASTER);
                    entries.add(ModBlocks.INDIGO_ASTER);
                    entries.add(ModBlocks.PINK_ASTER);
                    entries.add(ModBlocks.VIOLET_ASTER);
                    entries.add(ModBlocks.WHITE_ASTER);
                    entries.add(ModBlocks.CYCLAMEN);
                    entries.add(ModBlocks.DUSTY_MILLER);
                    entries.add(ModBlocks.BLUE_FLOSSFLOWER);
                    entries.add(ModBlocks.MAGENTA_FLOSSFLOWER);
                    entries.add(ModBlocks.PINK_FLOSSFLOWER);
                    entries.add(ModBlocks.WHITE_FLOSSFLOWER);
                    entries.add(ModBlocks.GLOBE_THISTLE);
                    entries.add(ModBlocks.BUTTERCUP);
                    entries.add(ModBlocks.PINK_DAISY);
                    entries.add(ModBlocks.YELLOW_DAISY);
                    entries.add(ModBlocks.WHITE_DAISY);
                    entries.add(ModBlocks.SILVER_MOUND_ARTEMISIA);
                    entries.add(ModBlocks.SOFT_PINK_HELIOTROPE);
                    entries.add(ModBlocks.PINK_HELIOTROPE);
                    entries.add(ModBlocks.WHITE_HELIOTROPE);
                    entries.add(ModBlocks.TRANS_HELIOTROPE);
                    entries.add(ModBlocks.VIOLET_HELIOTROPE);
                    entries.add(ModBlocks.ORANGE_HELIOTROPE);
                    entries.add(ModBlocks.BLACK_HELIOTROPE);
                    entries.add(ModBlocks.ICE_HELIOTROPE);
                    entries.add(ModBlocks.GOMPHRENA);
                    entries.add(ModBlocks.GOMPHRENA_PATCH);
                    entries.add(ModBlocks.DAHLIA);
                    entries.add(ModBlocks.BLOODROOT);

                    entries.add(ModBlocks.FOUNTAIN_GRASS);
                    entries.add(ModBlocks.FOXGLOVE);

                    //entries.add(ModBlocks.VIOLET_AUBRIETA);

                    entries.add(ModBlocks.SCULK_TENDRIL);
                    entries.add(ModBlocks.SCULK_ROSE);
                    entries.add(ModBlocks.GLOWING_SCULK_WISTERIA);
                    entries.add(ModBlocks.GLOWING_SCULK_WISTERIA_BUNDLE);

                    entries.add(ModBlocks.SCULKED_DEEPSLATE);
                    entries.add(ModBlocks.SCULKED_COBBLED_DEEPSLATE);
                    entries.add(ModBlocks.SCULKED_POLISHED_DEEPSLATE);
                    entries.add(ModBlocks.SCULKED_DEEPSLATE_BRICK);
                    entries.add(ModBlocks.SCULKED_DEEPSLATE_TILES);
                    entries.add(ModBlocks.SCULKED_NETHERRACK);
                    entries.add(ModBlocks.SCULKED_NETHERRACK_BRICK);
                    entries.add(ModBlocks.SCULKED_END_STONE);
                    entries.add(ModBlocks.SCULKED_POLISHED_END_STONE);
                    entries.add(ModBlocks.SCULKED_END_STONE_BRICK);

                    entries.add(ModBlocks.COPPER_SHEET_BLOCK);
                    entries.add(ModBlocks.EXPOSED_COPPER_SHEET_BLOCK);
                    entries.add(ModBlocks.WEATHERED_COPPER_SHEET_BLOCK);
                    entries.add(ModBlocks.OXIDIZED_COPPER_SHEET_BLOCK);

                    entries.add(ModBlocks.IRON_SHEET_BLOCK);
                    entries.add(ModBlocks.GOLD_SHEET_BLOCK);

                    entries.add(ModBlocks.LOW_QUALITY_PEARLARIUM_ORE);
                    entries.add(ModBlocks.PEARLARIUM_ORE);
                    entries.add(ModBlocks.DEEPSLATE_PEARLARIUM_ORE);
                    entries.add(ModBlocks.PEARLARIUM_CRYSTAL_BLOCK);
                    entries.add(ModBlocks.PEARLARIUM_ALLOY_SHEET_BLOCK);
                    entries.add(ModBlocks.PEARLARIUM_BLOCK);
                    entries.add(ModBlocks.PEARLARIUM_SLAB);
                    entries.add(ModBlocks.PEARLARIUM_STAIRS);
                    entries.add(ModBlocks.PEARLARIUM_WALL);
                    entries.add(ModBlocks.PEARLARIUM_TRAPDOOR);

                    entries.add(ModBlocks.LOW_QUALITY_NIGRUM_PETRAMIUNIUM_ORE);
                    entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_ORE);
                    entries.add(ModBlocks.DEEPSLATE_NIGRUM_PETRAMIUNIUM_ORE);
                    entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_CRYSTAL_BLOCK);
                    entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_ALLOY_SHEET_BLOCK);
                    entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK);
                    entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_SLAB);
                    entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_STAIRS);
                    entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_WALL);
                    entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_TRAPDOOR);

                    entries.add(ModBlocks.ANCIENT_NETHERITE_BRICK);
                    entries.add(ModBlocks.ANCIENT_NETHERITE_BRICK_SLAB);
                    entries.add(ModBlocks.ANCIENT_NETHERITE_BRICK_STAIRS);
                    entries.add(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK);
                    entries.add(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_SLAB);
                    entries.add(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_STAIRS);
                    entries.add(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK);
                    entries.add(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_SLAB);
                    entries.add(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_STAIRS);
                    entries.add(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK);
                    entries.add(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_SLAB);
                    entries.add(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_STAIRS);

                    entries.add(ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK);
                    entries.add(ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_SLAB);
                    entries.add(ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_STAIRS);
                    entries.add(ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK);
                    entries.add(ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_SLAB);
                    entries.add(ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_STAIRS);
                    entries.add(ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK);
                    entries.add(ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_SLAB);
                    entries.add(ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_STAIRS);
                    entries.add(ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK);
                    entries.add(ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_SLAB);
                    entries.add(ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_STAIRS);


                    entries.add(ModBlocks.POLISHED_ICE);
                    entries.add(ModBlocks.POLISHED_ICE_BRICK);
                    entries.add(ModBlocks.CHISELED_POLISHED_ICE_BRICK);
                    entries.add(ModBlocks.CRACKED_POLISHED_ICE_BRICK);

                    entries.add(ModBlocks.FROSTED_ICE_BRICK);

                    entries.add(ModBlocks.CUT_CRYSTAL_ICE_BLOCK);

                    entries.add(ModBlocks.ICE_BRICK);
                    entries.add(ModBlocks.ICE_BRICK_TILE);
                    entries.add(ModBlocks.CHISELED_ICE_BRICK);
                    entries.add(ModBlocks.CRACKED_ICE_BRICK);

                    entries.add(ModBlocks.STONE_WALL);

                    entries.add(ModBlocks.DRIPSTONE_SLAB);
                    entries.add(ModBlocks.DRIPSTONE_STAIRS);
                    entries.add(ModBlocks.DRIPSTONE_WALL);

                    entries.add(ModBlocks.SANDSTONE_BRICK);
                    entries.add(ModBlocks.SANDSTONE_BRICK_STAIRS);
                    entries.add(ModBlocks.SANDSTONE_BRICK_SLAB);
                    entries.add(ModBlocks.SANDSTONE_BRICK_WALL);

                    entries.add(ModBlocks.CRACKED_SANDSTONE_BRICK);
                    entries.add(ModBlocks.CRACKED_SANDSTONE_BRICK_STAIRS);
                    entries.add(ModBlocks.CRACKED_SANDSTONE_BRICK_SLAB);
                    entries.add(ModBlocks.CRACKED_SANDSTONE_BRICK_WALL);

                    entries.add(ModBlocks.SANDSTONE_TILES);
                    entries.add(ModBlocks.SANDSTONE_TILES_STAIRS);
                    entries.add(ModBlocks.SANDSTONE_TILES_SLAB);
                    entries.add(ModBlocks.SANDSTONE_TILES_WALL);

                    entries.add(ModBlocks.CRACKED_SANDSTONE_TILES);
                    entries.add(ModBlocks.CRACKED_SANDSTONE_TILES_STAIRS);
                    entries.add(ModBlocks.CRACKED_SANDSTONE_TILES_SLAB);
                    entries.add(ModBlocks.CRACKED_SANDSTONE_TILES_WALL);

                    entries.add(ModBlocks.COBBLE_SANDSTONE);
                    entries.add(ModBlocks.COBBLE_SANDSTONE_STAIRS);
                    entries.add(ModBlocks.COBBLE_SANDSTONE_SLAB);
                    entries.add(ModBlocks.COBBLE_SANDSTONE_WALL);

                    entries.add(ModBlocks.COBBLING_SANDSTONE_BLOCK);
                    entries.add(ModBlocks.COBBLING_SANDSTONE_STAIRS);
                    entries.add(ModBlocks.COBBLING_SANDSTONE_SLAB);
                    entries.add(ModBlocks.COBBLING_SANDSTONE_WALL);

                    entries.add(ModBlocks.DIRTY_SAND);
                    entries.add(ModBlocks.DIRTY_SAND_STAIRS);
                    entries.add(ModBlocks.DIRTY_SAND_SLAB);
                    entries.add(ModBlocks.DIRTY_SAND_WALL);

                    entries.add(ModBlocks.POLISHED_MARBLE);
                    entries.add(ModBlocks.POLISHED_MARBLE_STAIRS);
                    entries.add(ModBlocks.POLISHED_MARBLE_SLAB);
                    entries.add(ModBlocks.POLISHED_MARBLE_WALL);

                    entries.add(ModBlocks.POLISHED_MARBLE_BRICK);
                    entries.add(ModBlocks.POLISHED_MARBLE_BRICK_STAIRS);
                    entries.add(ModBlocks.POLISHED_MARBLE_BRICK_SLAB);
                    entries.add(ModBlocks.POLISHED_MARBLE_BRICK_WALL);

                    entries.add(ModBlocks.COBBLED_MARBLE);
                    entries.add(ModBlocks.COBBLED_MARBLE_STAIRS);
                    entries.add(ModBlocks.COBBLED_MARBLE_SLAB);
                    entries.add(ModBlocks.COBBLED_MARBLE_WALL);

                    entries.add(ModBlocks.MOSSY_COBBLED_MARBLE);
                    entries.add(ModBlocks.MOSSY_COBBLED_MARBLE_STAIRS);
                    entries.add(ModBlocks.MOSSY_COBBLED_MARBLE_SLAB);
                    entries.add(ModBlocks.MOSSY_COBBLED_MARBLE_WALL);

                    entries.add(ModBlocks.DENSE_MARBLE);
                    entries.add(ModBlocks.DENSE_MARBLE_STAIRS);
                    entries.add(ModBlocks.DENSE_MARBLE_SLAB);
                    entries.add(ModBlocks.DENSE_MARBLE_WALL);

                    entries.add(ModBlocks.MOSSY_STONE);
                    entries.add(ModBlocks.MOSSY_STONE_STAIRS);
                    entries.add(ModBlocks.MOSSY_STONE_SLAB);
                    entries.add(ModBlocks.MOSSY_STONE_WALL);

                    entries.add(ModBlocks.MOSSY_ANDESITE);
                    entries.add(ModBlocks.MOSSY_ANDESITE_STAIRS);
                    entries.add(ModBlocks.MOSSY_ANDESITE_SLAB);
                    entries.add(ModBlocks.MOSSY_ANDESITE_WALL);

                    entries.add(ModBlocks.MOSSY_POLISHED_ANDESITE);
                    entries.add(ModBlocks.MOSSY_POLISHED_ANDESITE_STAIRS);
                    entries.add(ModBlocks.MOSSY_POLISHED_ANDESITE_SLAB);
                    entries.add(ModBlocks.MOSSY_POLISHED_ANDESITE_WALL);

                    entries.add(ModBlocks.MOSSY_DIORITE);
                    entries.add(ModBlocks.MOSSY_DIORITE_STAIRS);
                    entries.add(ModBlocks.MOSSY_DIORITE_SLAB);
                    entries.add(ModBlocks.MOSSY_DIORITE_WALL);

                    entries.add(ModBlocks.MOSSY_POLISHED_DIORITE);
                    entries.add(ModBlocks.MOSSY_POLISHED_DIORITE_STAIRS);
                    entries.add(ModBlocks.MOSSY_POLISHED_DIORITE_SLAB);
                    entries.add(ModBlocks.MOSSY_POLISHED_DIORITE_WALL);

                    entries.add(ModBlocks.MOSSY_GRANITE);
                    entries.add(ModBlocks.MOSSY_GRANITE_STAIRS);
                    entries.add(ModBlocks.MOSSY_GRANITE_SLAB);
                    entries.add(ModBlocks.MOSSY_GRANITE_WALL);

                    entries.add(ModBlocks.MOSSY_POLISHED_GRANITE);
                    entries.add(ModBlocks.MOSSY_POLISHED_GRANITE_STAIRS);
                    entries.add(ModBlocks.MOSSY_POLISHED_GRANITE_SLAB);
                    entries.add(ModBlocks.MOSSY_POLISHED_GRANITE_WALL);

                    entries.add(ModBlocks.HONEY_COMB_BRICKS);
                    entries.add(ModBlocks.HONEY_COMB_BRICK_SLAB);
                    entries.add(ModBlocks.HONEY_COMB_BRICK_STAIRS);
                    entries.add(ModBlocks.HONEY_COMB_BRICK_WALL);

                    entries.add(ModBlocks.POLISHED_PRISMARINE);
                    entries.add(ModBlocks.POLISHED_PRISMARINE_SLAB);
                    entries.add(ModBlocks.POLISHED_PRISMARINE_STAIRS);
                    entries.add(ModBlocks.POLISHED_PRISMARINE_WALL);

                    entries.add(ModBlocks.NETHERRACK_BRICK);
                    entries.add(ModBlocks.NETHERRACK_BRICK_SLAB);
                    entries.add(ModBlocks.NETHERRACK_BRICK_STAIRS);
                    entries.add(ModBlocks.NETHERRACK_BRICK_WALL);

                    entries.add(ModBlocks.CRACKED_NETHER_BRICK_STAIRS);
                    entries.add(ModBlocks.CRACKED_NETHER_BRICK_SLAB);
                    entries.add(ModBlocks.CRACKED_NETHER_BRICK_WALL);

                    entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
                    entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
                    entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);

                    entries.add(ModBlocks.SMOOTHED_BASALT);
                    entries.add(ModBlocks.SMOOTHED_BASALT_STAIRS);
                    entries.add(ModBlocks.SMOOTHED_BASALT_SLAB);
                    entries.add(ModBlocks.SMOOTHED_BASALT_WALL);

                    entries.add(ModBlocks.POLISHED_BASALT_BRICK);
                    entries.add(ModBlocks.POLISHED_BASALT_BRICK_STAIRS);
                    entries.add(ModBlocks.POLISHED_BASALT_BRICK_SLAB);
                    entries.add(ModBlocks.POLISHED_BASALT_BRICK_WALL);

                    //entries.add(ModBlocks.SCULK_TABLE);

                    entries.add(ModBlocks.MAHOGANY_LOG);
                    entries.add(ModBlocks.MAHOGANY_WOOD);
                    entries.add(ModBlocks.STRIPPED_MAHOGANY_LOG);
                    entries.add(ModBlocks.STRIPPED_MAHOGANY_WOOD);
                    entries.add(ModBlocks.MAHOGANY_PLANKS);
                    entries.add(ModBlocks.MAHOGANY_LEAVES);

                    entries.add(ModItems.TOMATO);
                    entries.add(ModItems.TOMATO_BREAD);
                    entries.add(ModItems.BUNS);
                    entries.add(ModItems.HAMBURGER);
                }).build());


    public static void registerItemGroups() {
        HanasBlocks.LOGGER.info("Registering Item Groups for " + HanasBlocks.MOD_ID);
    }
}