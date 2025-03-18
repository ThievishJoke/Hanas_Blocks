package net.hana.hanas_blocks.datagen;

import net.hana.hanas_blocks.block.ConcreteBlocks;
import net.hana.hanas_blocks.block.GlassBlocks;
import net.hana.hanas_blocks.block.TintedGlassBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.hana.hanas_blocks.block.ModBlocks;
import net.hana.hanas_blocks.item.ModItems;
import net.minecraft.item.Items;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;
import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider{

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registeryLookup) {
        super(dataOutput, registeryLookup);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.CHARCOAL_BLOCK);
        addDrop(ModBlocks.POWDER_KEG);
        addDrop(ModBlocks.BURNING_BLAZE_POWDERED_BLOCK);

        addDrop(ModBlocks.RAW_SCRAP_BLOCK);
        addDrop(ModBlocks.SCRAP_SHEET_BLOCK);

        addDrop(ModBlocks.ANCIENT_NETHERITE_BRICK);
        addDrop(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK);
        addDrop(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK);
        addDrop(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK);
        addDrop(ModBlocks.ANCIENT_NETHERITE_BRICK_STAIRS);
        addDrop(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_STAIRS);
        addDrop(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_STAIRS);
        addDrop(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_STAIRS);
        addDrop(ModBlocks.ANCIENT_NETHERITE_BRICK_SLAB, slabDrops(ModBlocks.ANCIENT_NETHERITE_BRICK_SLAB));
        addDrop(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_SLAB, slabDrops(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_SLAB));
        addDrop(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_SLAB, slabDrops(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_SLAB));
        addDrop(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_SLAB, slabDrops(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_SLAB));
        addDrop(ModBlocks.ANCIENT_NETHERITE_BRICK_WALL);
        addDrop(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_WALL);
        addDrop(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_WALL);
        addDrop(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_WALL);

        addDrop(ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK);
        addDrop(ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK);
        addDrop(ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK);
        addDrop(ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK);
        addDrop(ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_STAIRS);
        addDrop(ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_STAIRS);
        addDrop(ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_STAIRS);
        addDrop(ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_STAIRS);
        addDrop(ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_SLAB, slabDrops(ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_SLAB));
        addDrop(ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_SLAB, slabDrops(ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_SLAB));
        addDrop(ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_SLAB, slabDrops(ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_SLAB));
        addDrop(ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_SLAB, slabDrops(ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_SLAB));
        addDrop(ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_WALL);
        addDrop(ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_WALL);
        addDrop(ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_WALL);
        addDrop(ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_WALL);

        addDrop(ModBlocks.COPPER_SHEET_BLOCK);
        addDrop(ModBlocks.EXPOSED_COPPER_SHEET_BLOCK);
        addDrop(ModBlocks.WEATHERED_COPPER_SHEET_BLOCK);
        addDrop(ModBlocks.OXIDIZED_COPPER_SHEET_BLOCK);
        addDrop(ModBlocks.WAXED_COPPER_SHEET_BLOCK);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_SHEET_BLOCK);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_SHEET_BLOCK);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_SHEET_BLOCK);

        addDrop(ModBlocks.IRON_GRATE);
        addDrop(ModBlocks.IRON_GRATE_STAIRS);
        addDrop(ModBlocks.IRON_GRATE_SLAB, slabDrops(ModBlocks.IRON_GRATE_SLAB));
        addDrop(ModBlocks.IRON_GRATE_TRAPDOOR);
        addDrop(ModBlocks.CHISELED_IRON);

        addDrop(ModBlocks.IRON_SHEET_BLOCK);
        addDrop(ModBlocks.GOLD_SHEET_BLOCK);

        addDrop(ModBlocks.RAW_QUARTZ_BLOCK);

        addDrop(ModBlocks.OAK_PLANK_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.SPRUCE_PLANK_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.BIRCH_PLANK_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.JUNGLE_PLANK_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.ACACIA_PLANK_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.CHERRY_PLANK_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.DARK_OAK_PLANK_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.MANGROVE_PLANK_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.BAMBOO_PLANK_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.WARPED_PLANK_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.CRIMSON_PLANK_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));

        addDrop(ModBlocks.CUT_CRYSTAL_AMETHYST);

        addDrop(ModBlocks.SCULKED_DEEPSLATE, block -> this.drops(block, ModItems.SCULK_MATERIAL, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.SCULKED_COBBLED_DEEPSLATE, block -> this.drops(block, ModItems.SCULK_MATERIAL, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.SCULKED_DEEPSLATE_BRICK, block -> this.drops(block, ModItems.SCULK_MATERIAL, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.SCULKED_DEEPSLATE_TILES, block -> this.drops(block, ModItems.SCULK_MATERIAL, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.SCULKED_POLISHED_DEEPSLATE, block -> this.drops(block, ModItems.SCULK_MATERIAL, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.SCULKED_NETHERRACK, block -> this.drops(block, ModItems.SCULK_MATERIAL, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.SCULKED_NETHERRACK_BRICK, block -> this.drops(block, ModItems.SCULK_MATERIAL, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.SCULKED_END_STONE, block -> this.drops(block, ModItems.SCULK_MATERIAL, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.SCULKED_END_STONE_BRICK, block -> this.drops(block, ModItems.SCULK_MATERIAL, ConstantLootNumberProvider.create(3.0F)));
        addDrop(ModBlocks.SCULKED_POLISHED_END_STONE, block -> this.drops(block, ModItems.SCULK_MATERIAL, ConstantLootNumberProvider.create(3.0F)));

        addDrop(ModBlocks.POLISHED_ICE);

        addDrop(ModBlocks.POLISHED_ICE_BRICK);
        addDrop(ModBlocks.CHISELED_POLISHED_ICE_BRICK);
        addDrop(ModBlocks.CRACKED_POLISHED_ICE_BRICK);

        addDrop(ModBlocks.FROSTED_ICE_BRICK);

        addDrop(ModBlocks.CUT_CRYSTAL_ICE_BLOCK);

        addDrop(ModBlocks.ICE_BRICK);
        addDrop(ModBlocks.ICE_BRICK_TILE);
        addDrop(ModBlocks.CHISELED_ICE_BRICK);
        addDrop(ModBlocks.CRACKED_ICE_BRICK);

        addDrop(ModBlocks.HONEY_COMB_BRICKS);
        addDrop(ModBlocks.HONEY_COMB_BRICK_WALL);
        addDrop(ModBlocks.HONEY_COMB_BRICK_STAIRS);
        addDrop(ModBlocks.HONEY_COMB_BRICK_SLAB, slabDrops(ModBlocks.HONEY_COMB_BRICK_SLAB));

        addDrop(ModBlocks.DRIPSTONE_STAIRS);
        addDrop(ModBlocks.DRIPSTONE_SLAB, slabDrops(ModBlocks.DRIPSTONE_SLAB));
        addDrop(ModBlocks.DRIPSTONE_WALL);

        addDrop(ModBlocks.SMOOTH_SANDSTONE_WALL);

        addDrop(ModBlocks.STONE_WALL);

        addDrop(ModBlocks.POLISHED_ANDESITE_WALL);

        addDrop(ModBlocks.POLISHED_DIORITE_WALL);

        addDrop(ModBlocks.POLISHED_GRANITE_WALL);

        addDrop(ModBlocks.CRACKED_STONE_BRICK_WALL);

        addDrop(ModBlocks.SMOOTH_STONE_STAIRS);
        addDrop(ModBlocks.SMOOTH_STONE_WALL);

        addDrop(ModBlocks.SANDSTONE_BRICK);
        addDrop(ModBlocks.SANDSTONE_BRICK_WALL);
        addDrop(ModBlocks.SANDSTONE_BRICK_STAIRS);
        addDrop(ModBlocks.SANDSTONE_BRICK_SLAB, slabDrops(ModBlocks.SANDSTONE_BRICK_SLAB));

        addDrop(ModBlocks.CRACKED_SANDSTONE_BRICK);
        addDrop(ModBlocks.SANDSTONE_BRICK_WALL);
        addDrop(ModBlocks.SANDSTONE_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_SANDSTONE_BRICK_SLAB, slabDrops(ModBlocks.CRACKED_SANDSTONE_BRICK_SLAB));

        addDrop(ModBlocks.POLISHED_BASALT_BRICK);
        addDrop(ModBlocks.POLISHED_BASALT_BRICK_WALL);
        addDrop(ModBlocks.POLISHED_BASALT_BRICK_STAIRS);
        addDrop(ModBlocks.POLISHED_BASALT_BRICK_SLAB, slabDrops(ModBlocks.POLISHED_BASALT_BRICK_SLAB));

        addDrop(ModBlocks.SANDSTONE_TILES);
        addDrop(ModBlocks.SANDSTONE_TILES_WALL);
        addDrop(ModBlocks.SANDSTONE_TILES_STAIRS);
        addDrop(ModBlocks.SANDSTONE_TILES_SLAB, slabDrops(ModBlocks.SANDSTONE_TILES_SLAB));

        addDrop(ModBlocks.CRACKED_SANDSTONE_TILES);
        addDrop(ModBlocks.CRACKED_SANDSTONE_TILES_WALL);
        addDrop(ModBlocks.CRACKED_SANDSTONE_TILES_STAIRS);
        addDrop(ModBlocks.CRACKED_SANDSTONE_TILES_SLAB, slabDrops(ModBlocks.CRACKED_SANDSTONE_TILES_SLAB));

        addDrop(ModBlocks.COBBLE_SANDSTONE);
        addDrop(ModBlocks.COBBLE_SANDSTONE_WALL);
        addDrop(ModBlocks.COBBLE_SANDSTONE_STAIRS);
        addDrop(ModBlocks.COBBLE_SANDSTONE_SLAB, slabDrops(ModBlocks.COBBLE_SANDSTONE_SLAB));

        addDrop(ModBlocks.COBBLING_SANDSTONE_BLOCK);
        addDrop(ModBlocks.COBBLING_SANDSTONE_WALL);
        addDrop(ModBlocks.COBBLING_SANDSTONE_STAIRS);
        addDrop(ModBlocks.COBBLING_SANDSTONE_SLAB, slabDrops(ModBlocks.COBBLING_SANDSTONE_SLAB));

        addDrop(ModBlocks.POLISHED_MARBLE);
        addDrop(ModBlocks.POLISHED_MARBLE_WALL);
        addDrop(ModBlocks.POLISHED_MARBLE_STAIRS);
        addDrop(ModBlocks.POLISHED_MARBLE_SLAB, slabDrops(ModBlocks.POLISHED_MARBLE_SLAB));
        addDrop(ModBlocks.POLISHED_MARBLE_BRICK);
        addDrop(ModBlocks.POLISHED_MARBLE_BRICK_WALL);
        addDrop(ModBlocks.POLISHED_MARBLE_BRICK_STAIRS);
        addDrop(ModBlocks.POLISHED_MARBLE_BRICK_SLAB, slabDrops(ModBlocks.POLISHED_MARBLE_BRICK_SLAB));
        addDrop(ModBlocks.COBBLED_MARBLE);
        addDrop(ModBlocks.COBBLED_MARBLE_WALL);
        addDrop(ModBlocks.COBBLED_MARBLE_STAIRS);
        addDrop(ModBlocks.COBBLED_MARBLE_SLAB, slabDrops(ModBlocks.COBBLED_MARBLE_SLAB));
        addDrop(ModBlocks.MOSSY_COBBLED_MARBLE);
        addDrop(ModBlocks.MOSSY_COBBLED_MARBLE_WALL);
        addDrop(ModBlocks.MOSSY_COBBLED_MARBLE_STAIRS);
        addDrop(ModBlocks.MOSSY_COBBLED_MARBLE_SLAB, slabDrops(ModBlocks.MOSSY_COBBLED_MARBLE_SLAB));
        addDrop(ModBlocks.DENSE_MARBLE);
        addDrop(ModBlocks.DENSE_MARBLE_WALL);
        addDrop(ModBlocks.DENSE_MARBLE_STAIRS);
        addDrop(ModBlocks.DENSE_MARBLE_SLAB, slabDrops(ModBlocks.DENSE_MARBLE_SLAB));

        addDrop(ModBlocks.MOSSY_STONE);
        addDrop(ModBlocks.MOSSY_STONE_WALL);
        addDrop(ModBlocks.MOSSY_STONE_STAIRS);
        addDrop(ModBlocks.MOSSY_STONE_SLAB, slabDrops(ModBlocks.MOSSY_STONE_SLAB));

        addDrop(ModBlocks.MOSSY_POLISHED_ANDESITE);
        addDrop(ModBlocks.MOSSY_POLISHED_ANDESITE_WALL);
        addDrop(ModBlocks.MOSSY_POLISHED_ANDESITE_STAIRS);
        addDrop(ModBlocks.MOSSY_POLISHED_ANDESITE_SLAB, slabDrops(ModBlocks.MOSSY_POLISHED_ANDESITE_SLAB));

        addDrop(ModBlocks.MOSSY_STONE);
        addDrop(ModBlocks.MOSSY_STONE_WALL);
        addDrop(ModBlocks.MOSSY_STONE_STAIRS);
        addDrop(ModBlocks.MOSSY_STONE_SLAB, slabDrops(ModBlocks.MOSSY_STONE_SLAB));

        addDrop(ModBlocks.MOSSY_ANDESITE);
        addDrop(ModBlocks.MOSSY_ANDESITE_WALL);
        addDrop(ModBlocks.MOSSY_ANDESITE_STAIRS);
        addDrop(ModBlocks.MOSSY_ANDESITE_SLAB, slabDrops(ModBlocks.MOSSY_ANDESITE_SLAB));
        addDrop(ModBlocks.MOSSY_POLISHED_ANDESITE);
        addDrop(ModBlocks.MOSSY_POLISHED_ANDESITE_WALL);
        addDrop(ModBlocks.MOSSY_POLISHED_ANDESITE_STAIRS);
        addDrop(ModBlocks.MOSSY_POLISHED_ANDESITE_SLAB, slabDrops(ModBlocks.MOSSY_POLISHED_ANDESITE_SLAB));

        addDrop(ModBlocks.MOSSY_DIORITE);
        addDrop(ModBlocks.MOSSY_DIORITE_WALL);
        addDrop(ModBlocks.MOSSY_DIORITE_STAIRS);
        addDrop(ModBlocks.MOSSY_DIORITE_SLAB, slabDrops(ModBlocks.MOSSY_DIORITE_SLAB));
        addDrop(ModBlocks.MOSSY_POLISHED_DIORITE);
        addDrop(ModBlocks.MOSSY_POLISHED_DIORITE_WALL);
        addDrop(ModBlocks.MOSSY_POLISHED_DIORITE_STAIRS);
        addDrop(ModBlocks.MOSSY_POLISHED_DIORITE_SLAB, slabDrops(ModBlocks.MOSSY_POLISHED_DIORITE_SLAB));

        addDrop(ModBlocks.MOSSY_GRANITE);
        addDrop(ModBlocks.MOSSY_GRANITE_WALL);
        addDrop(ModBlocks.MOSSY_GRANITE_STAIRS);
        addDrop(ModBlocks.MOSSY_GRANITE_SLAB, slabDrops(ModBlocks.MOSSY_GRANITE_SLAB));
        addDrop(ModBlocks.MOSSY_POLISHED_GRANITE);
        addDrop(ModBlocks.MOSSY_POLISHED_GRANITE_WALL);
        addDrop(ModBlocks.MOSSY_POLISHED_GRANITE_STAIRS);
        addDrop(ModBlocks.MOSSY_POLISHED_GRANITE_SLAB, slabDrops(ModBlocks.MOSSY_POLISHED_GRANITE_SLAB));

        addDrop(ModBlocks.POLISHED_END_STONE);
        addDrop(ModBlocks.POLISHED_END_STONE_WALL);
        addDrop(ModBlocks.POLISHED_END_STONE_STAIRS);
        addDrop(ModBlocks.POLISHED_END_STONE_SLAB, slabDrops(ModBlocks.POLISHED_END_STONE_SLAB));

        addDrop(ModBlocks.POLISHED_END_STONE);
        addDrop(ModBlocks.POLISHED_END_STONE_WALL);
        addDrop(ModBlocks.POLISHED_END_STONE_STAIRS);
        addDrop(ModBlocks.POLISHED_END_STONE_SLAB, slabDrops(ModBlocks.POLISHED_END_STONE_SLAB));

        addDrop(ModBlocks.NETHERRACK_BRICK);
        addDrop(ModBlocks.NETHERRACK_BRICK_WALL);
        addDrop(ModBlocks.NETHERRACK_BRICK_STAIRS);
        addDrop(ModBlocks.NETHERRACK_BRICK_SLAB, slabDrops(ModBlocks.NETHERRACK_BRICK_SLAB));

        addDrop(ModBlocks.CRACKED_NETHER_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_SLAB, slabDrops(ModBlocks.CRACKED_NETHER_BRICK_SLAB));

        addDrop(ModBlocks.CRACKED_NETHER_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, slabDrops(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB));

        addDrop(ModBlocks.SMOOTHED_BASALT);
        addDrop(ModBlocks.SMOOTHED_BASALT_WALL);
        addDrop(ModBlocks.SMOOTHED_BASALT_STAIRS);
        addDrop(ModBlocks.SMOOTHED_BASALT_SLAB, slabDrops(ModBlocks.SMOOTHED_BASALT_SLAB));
        addDrop(ModBlocks.POLISHED_BASALT_BRICK);
        addDrop(ModBlocks.POLISHED_BASALT_BRICK_WALL);
        addDrop(ModBlocks.POLISHED_BASALT_BRICK_STAIRS);
        addDrop(ModBlocks.POLISHED_BASALT_BRICK_SLAB, slabDrops(ModBlocks.POLISHED_BASALT_BRICK_SLAB));

        addDrop(ModBlocks.POLISHED_PRISMARINE);
        addDrop(ModBlocks.POLISHED_PRISMARINE_WALL);
        addDrop(ModBlocks.POLISHED_PRISMARINE_STAIRS);
        addDrop(ModBlocks.POLISHED_PRISMARINE_SLAB, slabDrops(ModBlocks.POLISHED_PRISMARINE_SLAB));

        //Vertical Slabs
        addDrop(ModBlocks.OAK_VERTICAL_SLAB, slabDrops(ModBlocks.OAK_VERTICAL_SLAB));
        addDrop(ModBlocks.SPRUCE_VERTICAL_SLAB, slabDrops(ModBlocks.SPRUCE_VERTICAL_SLAB));
        addDrop(ModBlocks.BIRCH_VERTICAL_SLAB, slabDrops(ModBlocks.BIRCH_VERTICAL_SLAB));
        addDrop(ModBlocks.JUNGLE_VERTICAL_SLAB, slabDrops(ModBlocks.JUNGLE_VERTICAL_SLAB));
        addDrop(ModBlocks.ACACIA_VERTICAL_SLAB, slabDrops(ModBlocks.ACACIA_VERTICAL_SLAB));
        addDrop(ModBlocks.DARK_OAK_VERTICAL_SLAB, slabDrops(ModBlocks.DARK_OAK_VERTICAL_SLAB));
        addDrop(ModBlocks.MANGROVE_VERTICAL_SLAB, slabDrops(ModBlocks.MANGROVE_VERTICAL_SLAB));
        addDrop(ModBlocks.CHERRY_VERTICAL_SLAB, slabDrops(ModBlocks.CHERRY_VERTICAL_SLAB));
        addDrop(ModBlocks.BAMBOO_VERTICAL_SLAB, slabDrops(ModBlocks.BAMBOO_VERTICAL_SLAB));
        addDrop(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB, slabDrops(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB));
        addDrop(ModBlocks.CRIMSON_VERTICAL_SLAB, slabDrops(ModBlocks.CRIMSON_VERTICAL_SLAB));
        addDrop(ModBlocks.WARPED_VERTICAL_SLAB, slabDrops(ModBlocks.WARPED_VERTICAL_SLAB));
        addDrop(ModBlocks.STONE_VERTICAL_SLAB, slabDrops(ModBlocks.STONE_VERTICAL_SLAB));
        addDrop(ModBlocks.COBBLESTONE_VERTICAL_SLAB, slabDrops(ModBlocks.COBBLESTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB));
        addDrop(ModBlocks.STONE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.STONE_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.GRANITE_VERTICAL_SLAB, slabDrops(ModBlocks.GRANITE_VERTICAL_SLAB));
        addDrop(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB));
        addDrop(ModBlocks.DIORITE_VERTICAL_SLAB, slabDrops(ModBlocks.DIORITE_VERTICAL_SLAB));
        addDrop(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB));
        addDrop(ModBlocks.ANDESITE_VERTICAL_SLAB, slabDrops(ModBlocks.ANDESITE_VERTICAL_SLAB));
        addDrop(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB));
        addDrop(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, slabDrops(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB));
        addDrop(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB));
        addDrop(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB));

        addDrop(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, slabDrops(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB));
        addDrop(ModBlocks.TUFF_VERTICAL_SLAB, slabDrops(ModBlocks.TUFF_VERTICAL_SLAB));
        addDrop(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB));
        addDrop(ModBlocks.TUFF_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.TUFF_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.MUD_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.MUD_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.SANDSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.SANDSTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.PRISMARINE_VERTICAL_SLAB, slabDrops(ModBlocks.PRISMARINE_VERTICAL_SLAB));
        addDrop(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, slabDrops(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB));
        addDrop(ModBlocks.NETHER_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.NETHER_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.BLACKSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.BLACKSTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.PURPUR_VERTICAL_SLAB, slabDrops(ModBlocks.PURPUR_VERTICAL_SLAB));
        addDrop(ModBlocks.QUARTZ_VERTICAL_SLAB, slabDrops(ModBlocks.QUARTZ_VERTICAL_SLAB));
        addDrop(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB));
        addDrop(ModBlocks.CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.CUT_COPPER_VERTICAL_SLAB));
        addDrop(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB));
        addDrop(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB));
        addDrop(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB));
        addDrop(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB));
        addDrop(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB));
        addDrop(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB));
        addDrop(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB));

        addDrop(ModBlocks.ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB));

        // Concrete
        addDrop(ConcreteBlocks.RED_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.RED_CONCRETE_SLAB, slabDrops(ConcreteBlocks.RED_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.RED_CONCRETE_WALL);
        addDrop(ConcreteBlocks.RED_CONCRETE_VERTICAL_SLAB, slabDrops(ConcreteBlocks.RED_CONCRETE_VERTICAL_SLAB));
        addDrop(ConcreteBlocks.ORANGE_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.ORANGE_CONCRETE_SLAB, slabDrops(ConcreteBlocks.ORANGE_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.ORANGE_CONCRETE_WALL);
        addDrop(ConcreteBlocks.ORANGE_CONCRETE_VERTICAL_SLAB, slabDrops(ConcreteBlocks.ORANGE_CONCRETE_VERTICAL_SLAB));
        addDrop(ConcreteBlocks.YELLOW_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.YELLOW_CONCRETE_SLAB, slabDrops(ConcreteBlocks.YELLOW_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.YELLOW_CONCRETE_WALL);
        addDrop(ConcreteBlocks.YELLOW_CONCRETE_VERTICAL_SLAB, slabDrops(ConcreteBlocks.YELLOW_CONCRETE_VERTICAL_SLAB));
        addDrop(ConcreteBlocks.LIME_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.LIME_CONCRETE_SLAB, slabDrops(ConcreteBlocks.LIME_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.LIME_CONCRETE_WALL);
        addDrop(ConcreteBlocks.LIME_CONCRETE_VERTICAL_SLAB, slabDrops(ConcreteBlocks.LIME_CONCRETE_VERTICAL_SLAB));

        addDrop(ConcreteBlocks.GREEN_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.GREEN_CONCRETE_SLAB, slabDrops(ConcreteBlocks.GREEN_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.GREEN_CONCRETE_WALL);
        addDrop(ConcreteBlocks.GREEN_CONCRETE_VERTICAL_SLAB, slabDrops(ConcreteBlocks.GREEN_CONCRETE_VERTICAL_SLAB));
        addDrop(ConcreteBlocks.CYAN_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.CYAN_CONCRETE_SLAB, slabDrops(ConcreteBlocks.CYAN_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.CYAN_CONCRETE_WALL);
        addDrop(ConcreteBlocks.CYAN_CONCRETE_VERTICAL_SLAB, slabDrops(ConcreteBlocks.CYAN_CONCRETE_VERTICAL_SLAB));
        addDrop(ConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB, slabDrops(ConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL);
        addDrop(ConcreteBlocks.LIGHT_BLUE_CONCRETE_VERTICAL_SLAB, slabDrops(ConcreteBlocks.LIGHT_BLUE_CONCRETE_VERTICAL_SLAB));
        addDrop(ConcreteBlocks.BLUE_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.BLUE_CONCRETE_SLAB, slabDrops(ConcreteBlocks.BLUE_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.BLUE_CONCRETE_WALL);
        addDrop(ConcreteBlocks.BLUE_CONCRETE_VERTICAL_SLAB, slabDrops(ConcreteBlocks.BLUE_CONCRETE_VERTICAL_SLAB));

        addDrop(ConcreteBlocks.PURPLE_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.PURPLE_CONCRETE_SLAB, slabDrops(ConcreteBlocks.PURPLE_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.PURPLE_CONCRETE_WALL);
        addDrop(ConcreteBlocks.PURPLE_CONCRETE_VERTICAL_SLAB, slabDrops(ConcreteBlocks.PURPLE_CONCRETE_VERTICAL_SLAB));
        addDrop(ConcreteBlocks.MAGENTA_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.MAGENTA_CONCRETE_SLAB, slabDrops(ConcreteBlocks.MAGENTA_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.MAGENTA_CONCRETE_WALL);
        addDrop(ConcreteBlocks.MAGENTA_CONCRETE_VERTICAL_SLAB, slabDrops(ConcreteBlocks.MAGENTA_CONCRETE_VERTICAL_SLAB));
        addDrop(ConcreteBlocks.PINK_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.PINK_CONCRETE_SLAB, slabDrops(ConcreteBlocks.PINK_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.PINK_CONCRETE_WALL);
        addDrop(ConcreteBlocks.PINK_CONCRETE_VERTICAL_SLAB, slabDrops(ConcreteBlocks.PINK_CONCRETE_VERTICAL_SLAB));
        addDrop(ConcreteBlocks.BROWN_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.BROWN_CONCRETE_SLAB, slabDrops(ConcreteBlocks.BROWN_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.BROWN_CONCRETE_WALL);
        addDrop(ConcreteBlocks.BROWN_CONCRETE_VERTICAL_SLAB, slabDrops(ConcreteBlocks.BROWN_CONCRETE_VERTICAL_SLAB));

        addDrop(ConcreteBlocks.BLACK_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.BLACK_CONCRETE_SLAB, slabDrops(ConcreteBlocks.BLACK_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.BLACK_CONCRETE_WALL);
        addDrop(ConcreteBlocks.BLACK_CONCRETE_VERTICAL_SLAB, slabDrops(ConcreteBlocks.BLACK_CONCRETE_VERTICAL_SLAB));
        addDrop(ConcreteBlocks.WHITE_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.WHITE_CONCRETE_SLAB, slabDrops(ConcreteBlocks.WHITE_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.WHITE_CONCRETE_WALL);
        addDrop(ConcreteBlocks.WHITE_CONCRETE_VERTICAL_SLAB, slabDrops(ConcreteBlocks.WHITE_CONCRETE_VERTICAL_SLAB));
        addDrop(ConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB, slabDrops(ConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL);
        addDrop(ConcreteBlocks.LIGHT_GRAY_CONCRETE_VERTICAL_SLAB, slabDrops(ConcreteBlocks.LIGHT_GRAY_CONCRETE_VERTICAL_SLAB));
        addDrop(ConcreteBlocks.GRAY_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.GRAY_CONCRETE_SLAB, slabDrops(ConcreteBlocks.GRAY_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.GRAY_CONCRETE_WALL);
        addDrop(ConcreteBlocks.GRAY_CONCRETE_VERTICAL_SLAB, slabDrops(ConcreteBlocks.GRAY_CONCRETE_VERTICAL_SLAB));

        // Normal Glass
        addDrop(GlassBlocks.GLASS_STAIRS);
        addDrop(GlassBlocks.GLASS_SLAB, slabDrops(GlassBlocks.GLASS_SLAB));
        addDrop(GlassBlocks.GLASS_VERTICAL_SLAB, slabDrops(GlassBlocks.GLASS_VERTICAL_SLAB));

        addDrop(GlassBlocks.RED_STAINED_GLASS_STAIRS);
        addDrop(GlassBlocks.ORANGE_STAINED_GLASS_STAIRS);
        addDrop(GlassBlocks.YELLOW_STAINED_GLASS_STAIRS);
        addDrop(GlassBlocks.LIME_STAINED_GLASS_STAIRS);
        addDrop(GlassBlocks.GREEN_STAINED_GLASS_STAIRS);
        addDrop(GlassBlocks.CYAN_STAINED_GLASS_STAIRS);
        addDrop(GlassBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);
        addDrop(GlassBlocks.BLUE_STAINED_GLASS_STAIRS);
        addDrop(GlassBlocks.PURPLE_STAINED_GLASS_STAIRS);
        addDrop(GlassBlocks.MAGENTA_STAINED_GLASS_STAIRS);
        addDrop(GlassBlocks.PINK_STAINED_GLASS_STAIRS);
        addDrop(GlassBlocks.GRAY_STAINED_GLASS_STAIRS);
        addDrop(GlassBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);
        addDrop(GlassBlocks.BLACK_STAINED_GLASS_STAIRS);
        addDrop(GlassBlocks.BROWN_STAINED_GLASS_STAIRS);
        addDrop(GlassBlocks.WHITE_STAINED_GLASS_STAIRS);

        addDrop(GlassBlocks.RED_STAINED_GLASS_SLAB, slabDrops(GlassBlocks.RED_STAINED_GLASS_SLAB));
        addDrop(GlassBlocks.ORANGE_STAINED_GLASS_SLAB, slabDrops(GlassBlocks.ORANGE_STAINED_GLASS_SLAB));
        addDrop(GlassBlocks.YELLOW_STAINED_GLASS_SLAB, slabDrops(GlassBlocks.YELLOW_STAINED_GLASS_SLAB));
        addDrop(GlassBlocks.LIME_STAINED_GLASS_SLAB, slabDrops(GlassBlocks.LIME_STAINED_GLASS_SLAB));
        addDrop(GlassBlocks.GREEN_STAINED_GLASS_SLAB, slabDrops(GlassBlocks.GREEN_STAINED_GLASS_SLAB));
        addDrop(GlassBlocks.CYAN_STAINED_GLASS_SLAB, slabDrops(GlassBlocks.CYAN_STAINED_GLASS_SLAB));
        addDrop(GlassBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, slabDrops(GlassBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB));
        addDrop(GlassBlocks.BLUE_STAINED_GLASS_SLAB, slabDrops(GlassBlocks.BLUE_STAINED_GLASS_SLAB));
        addDrop(GlassBlocks.PURPLE_STAINED_GLASS_SLAB, slabDrops(GlassBlocks.PURPLE_STAINED_GLASS_SLAB));
        addDrop(GlassBlocks.MAGENTA_STAINED_GLASS_SLAB, slabDrops(GlassBlocks.MAGENTA_STAINED_GLASS_SLAB));
        addDrop(GlassBlocks.PINK_STAINED_GLASS_SLAB, slabDrops(GlassBlocks.PINK_STAINED_GLASS_SLAB));
        addDrop(GlassBlocks.GRAY_STAINED_GLASS_SLAB, slabDrops(GlassBlocks.GRAY_STAINED_GLASS_SLAB));
        addDrop(GlassBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, slabDrops(GlassBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB));
        addDrop(GlassBlocks.BLACK_STAINED_GLASS_SLAB, slabDrops(GlassBlocks.BLACK_STAINED_GLASS_SLAB));
        addDrop(GlassBlocks.BROWN_STAINED_GLASS_SLAB, slabDrops(GlassBlocks.BROWN_STAINED_GLASS_SLAB));
        addDrop(GlassBlocks.WHITE_STAINED_GLASS_SLAB, slabDrops(GlassBlocks.WHITE_STAINED_GLASS_SLAB));

        addDrop(GlassBlocks.RED_STAINED_GLASS_VERTICAL_SLAB, slabDrops(GlassBlocks.RED_STAINED_GLASS_VERTICAL_SLAB));
        addDrop(GlassBlocks.ORANGE_STAINED_GLASS_VERTICAL_SLAB, slabDrops(GlassBlocks.ORANGE_STAINED_GLASS_VERTICAL_SLAB));
        addDrop(GlassBlocks.YELLOW_STAINED_GLASS_VERTICAL_SLAB, slabDrops(GlassBlocks.YELLOW_STAINED_GLASS_VERTICAL_SLAB));
        addDrop(GlassBlocks.LIME_STAINED_GLASS_VERTICAL_SLAB, slabDrops(GlassBlocks.LIME_STAINED_GLASS_VERTICAL_SLAB));
        addDrop(GlassBlocks.GREEN_STAINED_GLASS_VERTICAL_SLAB, slabDrops(GlassBlocks.GREEN_STAINED_GLASS_VERTICAL_SLAB));
        addDrop(GlassBlocks.CYAN_STAINED_GLASS_VERTICAL_SLAB, slabDrops(GlassBlocks.CYAN_STAINED_GLASS_VERTICAL_SLAB));
        addDrop(GlassBlocks.LIGHT_BLUE_STAINED_GLASS_VERTICAL_SLAB, slabDrops(GlassBlocks.LIGHT_BLUE_STAINED_GLASS_VERTICAL_SLAB));
        addDrop(GlassBlocks.BLUE_STAINED_GLASS_VERTICAL_SLAB, slabDrops(GlassBlocks.BLUE_STAINED_GLASS_VERTICAL_SLAB));
        addDrop(GlassBlocks.PURPLE_STAINED_GLASS_VERTICAL_SLAB, slabDrops(GlassBlocks.PURPLE_STAINED_GLASS_VERTICAL_SLAB));
        addDrop(GlassBlocks.MAGENTA_STAINED_GLASS_VERTICAL_SLAB, slabDrops(GlassBlocks.MAGENTA_STAINED_GLASS_VERTICAL_SLAB));
        addDrop(GlassBlocks.PINK_STAINED_GLASS_VERTICAL_SLAB, slabDrops(GlassBlocks.PINK_STAINED_GLASS_VERTICAL_SLAB));
        addDrop(GlassBlocks.GRAY_STAINED_GLASS_VERTICAL_SLAB, slabDrops(GlassBlocks.GRAY_STAINED_GLASS_VERTICAL_SLAB));
        addDrop(GlassBlocks.LIGHT_GRAY_STAINED_GLASS_VERTICAL_SLAB, slabDrops(GlassBlocks.LIGHT_GRAY_STAINED_GLASS_VERTICAL_SLAB));
        addDrop(GlassBlocks.BLACK_STAINED_GLASS_VERTICAL_SLAB, slabDrops(GlassBlocks.BLACK_STAINED_GLASS_VERTICAL_SLAB));
        addDrop(GlassBlocks.BROWN_STAINED_GLASS_VERTICAL_SLAB, slabDrops(GlassBlocks.BROWN_STAINED_GLASS_VERTICAL_SLAB));
        addDrop(GlassBlocks.WHITE_STAINED_GLASS_VERTICAL_SLAB, slabDrops(GlassBlocks.WHITE_STAINED_GLASS_VERTICAL_SLAB));

        // Tinted Glass
        addDrop(TintedGlassBlocks.TINTED_GLASS_STAIRS);
        addDrop(TintedGlassBlocks.TINTED_GLASS_SLAB, slabDrops(TintedGlassBlocks.TINTED_GLASS_SLAB));
        addDrop(TintedGlassBlocks.TINTED_GLASS_VERTICAL_SLAB, slabDrops(TintedGlassBlocks.TINTED_GLASS_VERTICAL_SLAB));

        addDrop(TintedGlassBlocks.RED_STAINED_TINTED_GLASS);
        addDrop(TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS);
        addDrop(TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS);
        addDrop(TintedGlassBlocks.LIME_STAINED_TINTED_GLASS);
        addDrop(TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS);
        addDrop(TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS);
        addDrop(TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS);
        addDrop(TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS);
        addDrop(TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS);
        addDrop(TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS);
        addDrop(TintedGlassBlocks.PINK_STAINED_TINTED_GLASS);
        addDrop(TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS);
        addDrop(TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS);
        addDrop(TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS);
        addDrop(TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS);
        addDrop(TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS);

        addDrop(TintedGlassBlocks.RED_STAINED_TINTED_GLASS_STAIRS);
        addDrop(TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS_STAIRS);
        addDrop(TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS_STAIRS);
        addDrop(TintedGlassBlocks.LIME_STAINED_TINTED_GLASS_STAIRS);
        addDrop(TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS_STAIRS);
        addDrop(TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS_STAIRS);
        addDrop(TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS_STAIRS);
        addDrop(TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS_STAIRS);
        addDrop(TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS_STAIRS);
        addDrop(TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS_STAIRS);
        addDrop(TintedGlassBlocks.PINK_STAINED_TINTED_GLASS_STAIRS);
        addDrop(TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS_STAIRS);
        addDrop(TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS_STAIRS);
        addDrop(TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS_STAIRS);
        addDrop(TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS_STAIRS);
        addDrop(TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS_STAIRS);

        addDrop(TintedGlassBlocks.RED_STAINED_TINTED_GLASS_SLAB, slabDrops(TintedGlassBlocks.RED_STAINED_TINTED_GLASS_SLAB));
        addDrop(TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS_SLAB, slabDrops(TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS_SLAB));
        addDrop(TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS_SLAB, slabDrops(TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS_SLAB));
        addDrop(TintedGlassBlocks.LIME_STAINED_TINTED_GLASS_SLAB, slabDrops(TintedGlassBlocks.LIME_STAINED_TINTED_GLASS_SLAB));
        addDrop(TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS_SLAB, slabDrops(TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS_SLAB));
        addDrop(TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS_SLAB, slabDrops(TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS_SLAB));
        addDrop(TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS_SLAB, slabDrops(TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS_SLAB));
        addDrop(TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS_SLAB, slabDrops(TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS_SLAB));
        addDrop(TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS_SLAB, slabDrops(TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS_SLAB));
        addDrop(TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS_SLAB, slabDrops(TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS_SLAB));
        addDrop(TintedGlassBlocks.PINK_STAINED_TINTED_GLASS_SLAB, slabDrops(TintedGlassBlocks.PINK_STAINED_TINTED_GLASS_SLAB));
        addDrop(TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS_SLAB, slabDrops(TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS_SLAB));
        addDrop(TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS_SLAB, slabDrops(TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS_SLAB));
        addDrop(TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS_SLAB, slabDrops(TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS_SLAB));
        addDrop(TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS_SLAB, slabDrops(TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS_SLAB));
        addDrop(TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS_SLAB, slabDrops(TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS_SLAB));

        addDrop(TintedGlassBlocks.RED_STAINED_TINTED_GLASS_VERTICAL_SLAB, slabDrops(TintedGlassBlocks.RED_STAINED_TINTED_GLASS_VERTICAL_SLAB));
        addDrop(TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS_VERTICAL_SLAB, slabDrops(TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS_VERTICAL_SLAB));
        addDrop(TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS_VERTICAL_SLAB, slabDrops(TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS_VERTICAL_SLAB));
        addDrop(TintedGlassBlocks.LIME_STAINED_TINTED_GLASS_VERTICAL_SLAB, slabDrops(TintedGlassBlocks.LIME_STAINED_TINTED_GLASS_VERTICAL_SLAB));
        addDrop(TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS_VERTICAL_SLAB, slabDrops(TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS_VERTICAL_SLAB));
        addDrop(TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS_VERTICAL_SLAB, slabDrops(TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS_VERTICAL_SLAB));
        addDrop(TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS_VERTICAL_SLAB, slabDrops(TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS_VERTICAL_SLAB));
        addDrop(TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS_VERTICAL_SLAB, slabDrops(TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS_VERTICAL_SLAB));
        addDrop(TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS_VERTICAL_SLAB, slabDrops(TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS_VERTICAL_SLAB));
        addDrop(TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS_VERTICAL_SLAB, slabDrops(TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS_VERTICAL_SLAB));
        addDrop(TintedGlassBlocks.PINK_STAINED_TINTED_GLASS_VERTICAL_SLAB, slabDrops(TintedGlassBlocks.PINK_STAINED_TINTED_GLASS_VERTICAL_SLAB));
        addDrop(TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS_VERTICAL_SLAB, slabDrops(TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS_VERTICAL_SLAB));
        addDrop(TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS_VERTICAL_SLAB, slabDrops(TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS_VERTICAL_SLAB));
        addDrop(TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS_VERTICAL_SLAB, slabDrops(TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS_VERTICAL_SLAB));
        addDrop(TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS_VERTICAL_SLAB, slabDrops(TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS_VERTICAL_SLAB));
        addDrop(TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS_VERTICAL_SLAB, slabDrops(TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS_VERTICAL_SLAB));
    }
}


