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
    //public static final ItemGroup BLAHAJ = Registry.register(Registries.ITEM_GROUP,
    //        Identifier.of(HanasBlocks.MOD_ID, "blahaj"),
    //        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blahaj"))
    //        .icon(() -> new ItemStack(ModItems.BLAHAJ)).entries((displayContext, entries) -> {
    //                entries.add(ModItems.PEARLARIUM_BLAHAJ);
    //                entries.add(ModItems.NIGRUM_PETRAMIUNIUM_BLAHAJ);
    //            }).build());

    public static final ItemGroup SHEET_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HanasBlocks.MOD_ID, "sheet_item_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.hanas_stuff"))
            .icon(() -> new ItemStack(ModItems.COPPER_SHEET)).entries((displayContext, entries) -> {
                    entries.add(ModItems.COPPER_SHEET);
                    entries.add(ModItems.IRON_SHEET);
                    entries.add(ModItems.GOLD_SHEET);
                    entries.add(ModItems.SCRAP_SHEET);

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

                    entries.add(ModItems.SCULK_MATERIAL);

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

                    entries.add(ModBlocks.OAK_VERTICAL_SLAB);
                    entries.add(ModBlocks.SPRUCE_VERTICAL_SLAB);
                    entries.add(ModBlocks.BIRCH_VERTICAL_SLAB);
                    entries.add(ModBlocks.JUNGLE_VERTICAL_SLAB);
                    entries.add(ModBlocks.ACACIA_VERTICAL_SLAB);
                    entries.add(ModBlocks.DARK_OAK_VERTICAL_SLAB);
                    entries.add(ModBlocks.MANGROVE_VERTICAL_SLAB);
                    entries.add(ModBlocks.CHERRY_VERTICAL_SLAB);
                    entries.add(ModBlocks.BAMBOO_VERTICAL_SLAB);
                    entries.add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB);
                    entries.add(ModBlocks.CRIMSON_VERTICAL_SLAB);
                    entries.add(ModBlocks.WARPED_VERTICAL_SLAB);
                    entries.add(ModBlocks.STONE_VERTICAL_SLAB);
                    entries.add(ModBlocks.COBBLESTONE_VERTICAL_SLAB);
                    entries.add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB);
                    entries.add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB);
                    entries.add(ModBlocks.STONE_BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.GRANITE_VERTICAL_SLAB);
                    entries.add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB);
                    entries.add(ModBlocks.DIORITE_VERTICAL_SLAB);
                    entries.add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB);
                    entries.add(ModBlocks.ANDESITE_VERTICAL_SLAB);
                    entries.add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB);
                    entries.add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB);
                    entries.add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB);
                    entries.add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB);
                    entries.add(ModBlocks.TUFF_VERTICAL_SLAB);
                    entries.add(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB);
                    entries.add(ModBlocks.TUFF_BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.MUD_BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.SANDSTONE_VERTICAL_SLAB);
                    entries.add(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB);
                    entries.add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB);
                    entries.add(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB);
                    entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB);
                    entries.add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB);
                    entries.add(ModBlocks.PRISMARINE_VERTICAL_SLAB);
                    entries.add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB);
                    entries.add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.BLACKSTONE_VERTICAL_SLAB);
                    entries.add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB);
                    entries.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.PURPUR_VERTICAL_SLAB);
                    entries.add(ModBlocks.QUARTZ_VERTICAL_SLAB);
                    entries.add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB);
                    entries.add(ModBlocks.CUT_COPPER_VERTICAL_SLAB);
                    entries.add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB);
                    entries.add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB);
                    entries.add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
                    entries.add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB);
                    entries.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
                    entries.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
                    entries.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);

                    //entries.add(ModBlocks.PEARLARIUM_VERTICAL_SLAB);
                    //entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_VERTICAL_SLAB);
                    entries.add(ModBlocks.ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
                    entries.add(ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB);
                }).build());


    public static void registerItemGroups() {
        HanasBlocks.LOGGER.info("Registering Item Groups for " + HanasBlocks.MOD_ID);
    }
}