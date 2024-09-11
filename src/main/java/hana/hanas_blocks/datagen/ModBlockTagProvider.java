package hana.hanas_blocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import hana.hanas_blocks.block.ModBlocks;
import hana.hanas_blocks.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.SCULK_PLANTABLE_BLOCKS)
            .add(Blocks.SCULK)
            .add(Blocks.SCULK_CATALYST)
            .add(ModBlocks.SCULKED_DEEPSLATE)
            .add(ModBlocks.SCULKED_COBBLED_DEEPSLATE)
            .add(ModBlocks.SCULKED_DEEPSLATE_BRICK)
            .add(ModBlocks.SCULKED_DEEPSLATE_TILES)
            .add(ModBlocks.SCULKED_POLISHED_DEEPSLATE)
            .add(ModBlocks.SCULKED_NETHERRACK)
            .add(ModBlocks.SCULKED_NETHERRACK_BRICK)
            .add(ModBlocks.SCULKED_END_STONE)
            .add(ModBlocks.SCULKED_END_STONE_BRICK)
            .add(ModBlocks.SCULKED_POLISHED_END_STONE);
        getOrCreateTagBuilder(ModTags.Blocks.WATER_PLANT_PLANTABLE_BLOCKS)
            .add(Blocks.DIRT)
            .add(Blocks.COARSE_DIRT)
            .add(Blocks.CLAY)
            .add(Blocks.SAND)
            .add(Blocks.SUSPICIOUS_SAND)
            .add(Blocks.GRAVEL)
            .add(Blocks.SUSPICIOUS_GRAVEL);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(ModBlocks.CHARCOAL_BLOCK)
            .add(ModBlocks.DRIPSTONE_STAIRS)
            .add(ModBlocks.DRIPSTONE_SLAB)
            .add(ModBlocks.DRIPSTONE_WALL)
            .add(ModBlocks.SMOOTH_SANDSTONE_WALL)
            .add(ModBlocks.STONE_WALL)
            .add(ModBlocks.POLISHED_ANDESITE_WALL)
            .add(ModBlocks.POLISHED_DIORITE_WALL)
            .add(ModBlocks.POLISHED_GRANITE_WALL)
            .add(ModBlocks.CRACKED_STONE_BRICK_WALL)
            .add(ModBlocks.SMOOTH_STONE_STAIRS)
            .add(ModBlocks.SMOOTH_STONE_WALL)
            .add(ModBlocks.SANDSTONE_BRICK)
            .add(ModBlocks.SANDSTONE_BRICK_STAIRS)
            .add(ModBlocks.SANDSTONE_BRICK_SLAB)
            .add(ModBlocks.SANDSTONE_BRICK_WALL)
            .add(ModBlocks.CRACKED_SANDSTONE_BRICK)
            .add(ModBlocks.CRACKED_SANDSTONE_BRICK_STAIRS)
            .add(ModBlocks.CRACKED_SANDSTONE_BRICK_SLAB)
            .add(ModBlocks.CRACKED_SANDSTONE_BRICK_WALL)
            .add(ModBlocks.SANDSTONE_TILES)
            .add(ModBlocks.SANDSTONE_TILES_STAIRS)
            .add(ModBlocks.SANDSTONE_TILES_SLAB)
            .add(ModBlocks.SANDSTONE_TILES_WALL)
            .add(ModBlocks.CRACKED_SANDSTONE_TILES)
            .add(ModBlocks.CRACKED_SANDSTONE_TILES_STAIRS)
            .add(ModBlocks.CRACKED_SANDSTONE_TILES_SLAB)
            .add(ModBlocks.CRACKED_SANDSTONE_TILES_WALL)
            .add(ModBlocks.COBBLE_SANDSTONE)
            .add(ModBlocks.COBBLE_SANDSTONE_STAIRS)
            .add(ModBlocks.COBBLE_SANDSTONE_SLAB)
            .add(ModBlocks.COBBLE_SANDSTONE_WALL)
            .add(ModBlocks.COBBLING_SANDSTONE_BLOCK)
            .add(ModBlocks.COBBLING_SANDSTONE_STAIRS)
            .add(ModBlocks.COBBLING_SANDSTONE_SLAB)
            .add(ModBlocks.COBBLING_SANDSTONE_WALL)
            .add(ModBlocks.POLISHED_MARBLE)
            .add(ModBlocks.POLISHED_MARBLE_STAIRS)
            .add(ModBlocks.POLISHED_MARBLE_SLAB)
            .add(ModBlocks.POLISHED_MARBLE_WALL)
            .add(ModBlocks.POLISHED_MARBLE_BRICK)
            .add(ModBlocks.POLISHED_MARBLE_BRICK_STAIRS)
            .add(ModBlocks.POLISHED_MARBLE_BRICK_SLAB)
            .add(ModBlocks.POLISHED_MARBLE_BRICK_WALL)
            .add(ModBlocks.COBBLED_MARBLE)
            .add(ModBlocks.COBBLED_MARBLE_STAIRS)
            .add(ModBlocks.COBBLED_MARBLE_SLAB)
            .add(ModBlocks.COBBLED_MARBLE_WALL)
            .add(ModBlocks.MOSSY_COBBLED_MARBLE)
            .add(ModBlocks.MOSSY_COBBLED_MARBLE_STAIRS)
            .add(ModBlocks.MOSSY_COBBLED_MARBLE_SLAB)
            .add(ModBlocks.MOSSY_COBBLED_MARBLE_WALL)
            .add(ModBlocks.DENSE_MARBLE)
            .add(ModBlocks.DENSE_MARBLE_STAIRS)
            .add(ModBlocks.DENSE_MARBLE_SLAB)
            .add(ModBlocks.DENSE_MARBLE_WALL)
            .add(ModBlocks.MOSSY_STONE)
            .add(ModBlocks.MOSSY_STONE_STAIRS)
            .add(ModBlocks.MOSSY_STONE_SLAB)
            .add(ModBlocks.MOSSY_STONE_WALL)
            .add(ModBlocks.MOSSY_ANDESITE)
            .add(ModBlocks.MOSSY_ANDESITE_STAIRS)
            .add(ModBlocks.MOSSY_ANDESITE_SLAB)
            .add(ModBlocks.MOSSY_ANDESITE_WALL)
            .add(ModBlocks.MOSSY_POLISHED_ANDESITE)
            .add(ModBlocks.MOSSY_POLISHED_ANDESITE_STAIRS)
            .add(ModBlocks.MOSSY_POLISHED_ANDESITE_SLAB)
            .add(ModBlocks.MOSSY_POLISHED_ANDESITE_WALL)
            .add(ModBlocks.MOSSY_DIORITE)
            .add(ModBlocks.MOSSY_DIORITE_STAIRS)
            .add(ModBlocks.MOSSY_DIORITE_SLAB)
            .add(ModBlocks.MOSSY_DIORITE_WALL)
            .add(ModBlocks.MOSSY_POLISHED_DIORITE)
            .add(ModBlocks.MOSSY_POLISHED_DIORITE_STAIRS)
            .add(ModBlocks.MOSSY_POLISHED_DIORITE_SLAB)
            .add(ModBlocks.MOSSY_POLISHED_DIORITE_WALL)
            .add(ModBlocks.MOSSY_GRANITE)
            .add(ModBlocks.MOSSY_GRANITE_STAIRS)
            .add(ModBlocks.MOSSY_GRANITE_SLAB)
            .add(ModBlocks.MOSSY_GRANITE_WALL)
            .add(ModBlocks.MOSSY_POLISHED_GRANITE)
            .add(ModBlocks.MOSSY_POLISHED_GRANITE_STAIRS)
            .add(ModBlocks.MOSSY_POLISHED_GRANITE_SLAB)
            .add(ModBlocks.MOSSY_POLISHED_GRANITE_WALL)
            .add(ModBlocks.POLISHED_END_STONE)
            .add(ModBlocks.POLISHED_END_STONE_STAIRS)
            .add(ModBlocks.POLISHED_END_STONE_SLAB)
            .add(ModBlocks.POLISHED_END_STONE_WALL)
            .add(ModBlocks.NETHERRACK_BRICK_SLAB)
            .add(ModBlocks.NETHERRACK_BRICK_STAIRS)
            .add(ModBlocks.NETHERRACK_BRICK_WALL)
            .add(ModBlocks.CRACKED_NETHER_BRICK_STAIRS)
            .add(ModBlocks.CRACKED_NETHER_BRICK_SLAB)
            .add(ModBlocks.CRACKED_NETHER_BRICK_WALL)
            .add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB)
            .add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS)
            .add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL)
            .add(ModBlocks.POLISHED_BASALT_BRICK)
            .add(ModBlocks.POLISHED_BASALT_BRICK_STAIRS)
            .add(ModBlocks.POLISHED_BASALT_BRICK_SLAB)
            .add(ModBlocks.POLISHED_BASALT_BRICK_WALL)
            .add(ModBlocks.SMOOTHED_BASALT)
            .add(ModBlocks.SMOOTHED_BASALT_STAIRS)
            .add(ModBlocks.SMOOTHED_BASALT_SLAB)
            .add(ModBlocks.SMOOTHED_BASALT_WALL)
            .add(ModBlocks.POLISHED_PRISMARINE)
            .add(ModBlocks.POLISHED_PRISMARINE_STAIRS)
            .add(ModBlocks.POLISHED_PRISMARINE_SLAB)
            .add(ModBlocks.POLISHED_PRISMARINE_WALL)
            .add(ModBlocks.SCRAP_SHEET_BLOCK)
            .add(ModBlocks.RAW_SCRAP_BLOCK)
            .add(ModBlocks.COPPER_SHEET_BLOCK)
            .add(ModBlocks.EXPOSED_COPPER_SHEET_BLOCK)
            .add(ModBlocks.WEATHERED_COPPER_SHEET_BLOCK)
            .add(ModBlocks.OXIDIZED_COPPER_SHEET_BLOCK)
            .add(ModBlocks.WAXED_COPPER_SHEET_BLOCK)
            .add(ModBlocks.WAXED_EXPOSED_COPPER_SHEET_BLOCK)
            .add(ModBlocks.WAXED_WEATHERED_COPPER_SHEET_BLOCK)
            .add(ModBlocks.WAXED_OXIDIZED_COPPER_SHEET_BLOCK)
            .add(ModBlocks.CUT_CRYSTAL_AMETHYST)
            .add(ModBlocks.IRON_SHEET_BLOCK)
            .add(ModBlocks.GOLD_SHEET_BLOCK)
            .add(ModBlocks.RAW_QUARTZ_BLOCK)
            .add(ModBlocks.LOW_QUALITY_PEARLARIUM_ORE)
            .add(ModBlocks.PEARLARIUM_ORE)
            .add(ModBlocks.DEEPSLATE_PEARLARIUM_ORE)
            .add(ModBlocks.PEARLARIUM_CRYSTAL_BLOCK)
            .add(ModBlocks.PEARLARIUM_ALLOY_SHEET_BLOCK)
            .add(ModBlocks.PEARLARIUM_BLOCK)
            .add(ModBlocks.PEARLARIUM_SLAB)
            .add(ModBlocks.PEARLARIUM_STAIRS)
            .add(ModBlocks.PEARLARIUM_WALL)
            .add(ModBlocks.LOW_QUALITY_NIGRUM_PETRAMIUNIUM_ORE)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_ORE)
            .add(ModBlocks.DEEPSLATE_NIGRUM_PETRAMIUNIUM_ORE)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_CRYSTAL_BLOCK)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_ALLOY_SHEET_BLOCK)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_SLAB)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_STAIRS)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_WALL);
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
            .add(ModBlocks.SCULK_FLORA)
            .add(ModBlocks.SCULKED_DEEPSLATE)
            .add(ModBlocks.SCULKED_COBBLED_DEEPSLATE)
            .add(ModBlocks.SCULKED_DEEPSLATE_BRICK)
            .add(ModBlocks.SCULKED_DEEPSLATE_TILES)
            .add(ModBlocks.SCULKED_POLISHED_DEEPSLATE)
            .add(ModBlocks.SCULKED_NETHERRACK)
            .add(ModBlocks.SCULKED_NETHERRACK_BRICK)
            .add(ModBlocks.SCULKED_END_STONE)
            .add(ModBlocks.SCULKED_END_STONE_BRICK)
            .add(ModBlocks.SCULKED_POLISHED_END_STONE)
            .add(ModBlocks.HONEY_COMB_BRICKS)
            .add(ModBlocks.HONEY_COMB_BRICK_WALL)
            .add(ModBlocks.HONEY_COMB_BRICK_STAIRS)
            .add(ModBlocks.HONEY_COMB_BRICK_SLAB);
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
            .add(ModBlocks.OAK_PLANK_BOOKSHELF)
            .add(ModBlocks.SPRUCE_PLANK_BOOKSHELF)
            .add(ModBlocks.BIRCH_PLANK_BOOKSHELF)
            .add(ModBlocks.JUNGLE_PLANK_BOOKSHELF)
            .add(ModBlocks.ACACIA_PLANK_BOOKSHELF)
            .add(ModBlocks.CHERRY_PLANK_BOOKSHELF)
            .add(ModBlocks.DARK_OAK_PLANK_BOOKSHELF)
            .add(ModBlocks.MANGROVE_PLANK_BOOKSHELF)
            .add(ModBlocks.BAMBOO_PLANK_BOOKSHELF)
            .add(ModBlocks.WARPED_PLANK_BOOKSHELF)
            .add(ModBlocks.CRIMSON_PLANK_BOOKSHELF)
            .add(ModBlocks.MAHOGANY_PLANK_BOOKSHELF)
            .add(ModBlocks.MAHOGANY_LOG)
            .add(ModBlocks.MAHOGANY_WOOD)
            .add(ModBlocks.STRIPPED_MAHOGANY_LOG)
            .add(ModBlocks.STRIPPED_MAHOGANY_WOOD)
            .add(ModBlocks.MAHOGANY_PLANKS)
            .add(ModBlocks.MAHOGANY_SLAB)
            .add(ModBlocks.MAHOGANY_STAIRS)
            .add(ModBlocks.MAHOGANY_FENCE)
            .add(ModBlocks.MAHOGANY_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
            .add(ModBlocks.DIRTY_SAND)
            .add(ModBlocks.DIRTY_SAND_STAIRS)
            .add(ModBlocks.DIRTY_SAND_SLAB)
            .add(ModBlocks.DIRTY_SAND_WALL);
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
            .add(ModBlocks.CHARCOAL_BLOCK)
            .add(ModBlocks.DRIPSTONE_STAIRS)
            .add(ModBlocks.DRIPSTONE_SLAB)
            .add(ModBlocks.DRIPSTONE_WALL)
            .add(ModBlocks.SMOOTH_SANDSTONE_WALL)
            .add(ModBlocks.POLISHED_ANDESITE_WALL)
            .add(ModBlocks.POLISHED_DIORITE_WALL)
            .add(ModBlocks.POLISHED_GRANITE_WALL)
            .add(ModBlocks.CRACKED_STONE_BRICK_WALL)
            .add(ModBlocks.SMOOTH_STONE_STAIRS)
            .add(ModBlocks.SMOOTH_STONE_WALL)
            .add(ModBlocks.POLISHED_MARBLE)
            .add(ModBlocks.POLISHED_MARBLE_STAIRS)
            .add(ModBlocks.POLISHED_MARBLE_SLAB)
            .add(ModBlocks.POLISHED_MARBLE_WALL)
            .add(ModBlocks.POLISHED_MARBLE_BRICK)
            .add(ModBlocks.POLISHED_MARBLE_BRICK_STAIRS)
            .add(ModBlocks.POLISHED_MARBLE_BRICK_SLAB)
            .add(ModBlocks.POLISHED_MARBLE_BRICK_WALL)
            .add(ModBlocks.COBBLED_MARBLE)
            .add(ModBlocks.COBBLED_MARBLE_STAIRS)
            .add(ModBlocks.COBBLED_MARBLE_SLAB)
            .add(ModBlocks.COBBLED_MARBLE_WALL)
            .add(ModBlocks.MOSSY_COBBLED_MARBLE)
            .add(ModBlocks.MOSSY_COBBLED_MARBLE_STAIRS)
            .add(ModBlocks.MOSSY_COBBLED_MARBLE_SLAB)
            .add(ModBlocks.MOSSY_COBBLED_MARBLE_WALL)
            .add(ModBlocks.DENSE_MARBLE)
            .add(ModBlocks.DENSE_MARBLE_STAIRS)
            .add(ModBlocks.DENSE_MARBLE_SLAB)
            .add(ModBlocks.DENSE_MARBLE_WALL)
            .add(ModBlocks.MOSSY_STONE)
            .add(ModBlocks.MOSSY_STONE_STAIRS)
            .add(ModBlocks.MOSSY_STONE_SLAB)
            .add(ModBlocks.MOSSY_STONE_WALL)
            .add(ModBlocks.MOSSY_ANDESITE)
            .add(ModBlocks.MOSSY_ANDESITE_STAIRS)
            .add(ModBlocks.MOSSY_ANDESITE_SLAB)
            .add(ModBlocks.MOSSY_ANDESITE_WALL)
            .add(ModBlocks.MOSSY_POLISHED_ANDESITE)
            .add(ModBlocks.MOSSY_POLISHED_ANDESITE_STAIRS)
            .add(ModBlocks.MOSSY_POLISHED_ANDESITE_SLAB)
            .add(ModBlocks.MOSSY_POLISHED_ANDESITE_WALL)
            .add(ModBlocks.MOSSY_DIORITE)
            .add(ModBlocks.MOSSY_DIORITE_STAIRS)
            .add(ModBlocks.MOSSY_DIORITE_SLAB)
            .add(ModBlocks.MOSSY_DIORITE_WALL)
            .add(ModBlocks.MOSSY_POLISHED_DIORITE)
            .add(ModBlocks.MOSSY_POLISHED_DIORITE_STAIRS)
            .add(ModBlocks.MOSSY_POLISHED_DIORITE_SLAB)
            .add(ModBlocks.MOSSY_POLISHED_DIORITE_WALL)
            .add(ModBlocks.MOSSY_GRANITE)
            .add(ModBlocks.MOSSY_GRANITE_STAIRS)
            .add(ModBlocks.MOSSY_GRANITE_SLAB)
            .add(ModBlocks.MOSSY_GRANITE_WALL)
            .add(ModBlocks.MOSSY_POLISHED_GRANITE)
            .add(ModBlocks.MOSSY_POLISHED_GRANITE_STAIRS)
            .add(ModBlocks.MOSSY_POLISHED_GRANITE_SLAB)
            .add(ModBlocks.MOSSY_POLISHED_GRANITE_WALL)
            .add(ModBlocks.POLISHED_END_STONE)
            .add(ModBlocks.POLISHED_END_STONE_STAIRS)
            .add(ModBlocks.POLISHED_END_STONE_SLAB)
            .add(ModBlocks.POLISHED_END_STONE_WALL)
            .add(ModBlocks.POLISHED_BASALT_BRICK)
            .add(ModBlocks.POLISHED_BASALT_BRICK_STAIRS)
            .add(ModBlocks.POLISHED_BASALT_BRICK_SLAB)
            .add(ModBlocks.POLISHED_BASALT_BRICK_WALL)
            .add(ModBlocks.SMOOTHED_BASALT)
            .add(ModBlocks.SMOOTHED_BASALT_STAIRS)
            .add(ModBlocks.SMOOTHED_BASALT_SLAB)
            .add(ModBlocks.SMOOTHED_BASALT_WALL)
            .add(ModBlocks.POLISHED_PRISMARINE)
            .add(ModBlocks.POLISHED_PRISMARINE_STAIRS)
            .add(ModBlocks.POLISHED_PRISMARINE_SLAB)
            .add(ModBlocks.POLISHED_PRISMARINE_WALL)
            .add(ModBlocks.COPPER_SHEET_BLOCK)
            .add(ModBlocks.EXPOSED_COPPER_SHEET_BLOCK)
            .add(ModBlocks.WEATHERED_COPPER_SHEET_BLOCK)
            .add(ModBlocks.OXIDIZED_COPPER_SHEET_BLOCK)
            .add(ModBlocks.WAXED_COPPER_SHEET_BLOCK)
            .add(ModBlocks.WAXED_EXPOSED_COPPER_SHEET_BLOCK)
            .add(ModBlocks.WAXED_WEATHERED_COPPER_SHEET_BLOCK)
            .add(ModBlocks.WAXED_OXIDIZED_COPPER_SHEET_BLOCK)
            .add(ModBlocks.IRON_SHEET_BLOCK)
            .add(ModBlocks.GOLD_SHEET_BLOCK)
            .add(ModBlocks.RAW_QUARTZ_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
            .add(ModBlocks.SCULK_FLORA)
            .add(ModBlocks.SCULKED_DEEPSLATE)
            .add(ModBlocks.SCULKED_COBBLED_DEEPSLATE)
            .add(ModBlocks.SCULKED_DEEPSLATE_BRICK)
            .add(ModBlocks.SCULKED_DEEPSLATE_TILES)
            .add(ModBlocks.SCULKED_POLISHED_DEEPSLATE)
            .add(ModBlocks.SCULKED_NETHERRACK)
            .add(ModBlocks.SCULKED_NETHERRACK_BRICK)
            .add(ModBlocks.SCULKED_END_STONE)
            .add(ModBlocks.SCULKED_END_STONE_BRICK)
            .add(ModBlocks.SCULKED_POLISHED_END_STONE);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(ModBlocks.PEARLARIUM_CRYSTAL_BLOCK)
            .add(ModBlocks.PEARLARIUM_ALLOY_SHEET_BLOCK)
            .add(ModBlocks.PEARLARIUM_BLOCK)
            .add(ModBlocks.PEARLARIUM_SLAB)
            .add(ModBlocks.PEARLARIUM_STAIRS)
            .add(ModBlocks.PEARLARIUM_WALL)
            .add(ModBlocks.PEARLARIUM_TRAPDOOR)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_CRYSTAL_BLOCK)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_ALLOY_SHEET_BLOCK)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_SLAB)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_STAIRS)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_WALL);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(ModBlocks.SCRAP_SHEET_BLOCK)
            .add(ModBlocks.RAW_SCRAP_BLOCK);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "needs_tool_level_4")))
            .add(ModBlocks.LOW_QUALITY_PEARLARIUM_ORE)
            .add(ModBlocks.PEARLARIUM_ORE)
            .add(ModBlocks.DEEPSLATE_PEARLARIUM_ORE)
            .add(ModBlocks.LOW_QUALITY_NIGRUM_PETRAMIUNIUM_ORE)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_ORE)
            .add(ModBlocks.DEEPSLATE_NIGRUM_PETRAMIUNIUM_ORE);

        getOrCreateTagBuilder(BlockTags.FENCES)
            .add(ModBlocks.MAHOGANY_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
            .add(ModBlocks.MAHOGANY_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALLS)
            .add(ModBlocks.SMOOTH_STONE_WALL)
            .add(ModBlocks.POLISHED_ANDESITE_WALL)
            .add(ModBlocks.POLISHED_DIORITE_WALL)
            .add(ModBlocks.POLISHED_GRANITE_WALL)
            .add(ModBlocks.SMOOTH_STONE_WALL)
            .add(ModBlocks.STONE_WALL)
            .add(ModBlocks.DRIPSTONE_WALL)
            .add(ModBlocks.SANDSTONE_BRICK_WALL)
            .add(ModBlocks.CRACKED_SANDSTONE_BRICK_WALL)
            .add(ModBlocks.SANDSTONE_TILES_WALL)
            .add(ModBlocks.CRACKED_SANDSTONE_TILES_WALL)
            .add(ModBlocks.COBBLE_SANDSTONE_WALL)
            .add(ModBlocks.COBBLING_SANDSTONE_WALL)
            .add(ModBlocks.POLISHED_MARBLE_WALL)
            .add(ModBlocks.POLISHED_MARBLE_BRICK_WALL)
            .add(ModBlocks.COBBLED_MARBLE_WALL)
            .add(ModBlocks.MOSSY_COBBLED_MARBLE_WALL)
            .add(ModBlocks.DENSE_MARBLE_WALL)
            .add(ModBlocks.MOSSY_STONE_WALL)
            .add(ModBlocks.MOSSY_ANDESITE_WALL)
            .add(ModBlocks.MOSSY_POLISHED_ANDESITE_WALL)
            .add(ModBlocks.MOSSY_DIORITE_WALL)
            .add(ModBlocks.MOSSY_POLISHED_DIORITE_WALL)
            .add(ModBlocks.MOSSY_GRANITE_WALL)
            .add(ModBlocks.MOSSY_POLISHED_GRANITE_WALL)
            .add(ModBlocks.POLISHED_PRISMARINE_WALL)
            .add(ModBlocks.NETHERRACK_BRICK_WALL)
            .add(ModBlocks.SMOOTHED_BASALT_WALL)
            .add(ModBlocks.POLISHED_BASALT_BRICK_WALL)
            .add(ModBlocks.POLISHED_END_STONE_WALL)
            .add(ModBlocks.PEARLARIUM_WALL)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_WALL)
            .add(ModBlocks.HONEY_COMB_BRICK_WALL)
            .add(ModBlocks.DIRTY_SAND_WALL)
            .add(ModBlocks.SMOOTH_SANDSTONE_WALL)
            //    .add(ModBlocks.CRACKED_DEEPSLATE_BRICK_TILES)
            .add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL)
            .add(ModBlocks.CRACKED_NETHER_BRICK_WALL)
            .add(ModBlocks.CRACKED_STONE_BRICK_WALL)
            .add(ModBlocks.ANCIENT_NETHERITE_BRICK_WALL)
            .add(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_WALL)
            .add(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_WALL)
            .add(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_WALL)
            .add(ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_WALL)
            .add(ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_WALL)
            .add(ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_WALL)
            .add(ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_WALL)
            ;
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
            .add(ModBlocks.MAHOGANY_LOG)
            .add(ModBlocks.MAHOGANY_WOOD)
            .add(ModBlocks.STRIPPED_MAHOGANY_LOG)
            .add(ModBlocks.STRIPPED_MAHOGANY_WOOD);
        getOrCreateTagBuilder((BlockTags.FLOWERS))
            .add(ModBlocks.GLOWING_WISTERIA)
            .add(ModBlocks.ACONITE)
            .add(ModBlocks.RED_ROSE)
            .add(ModBlocks.BLUE_ASTER)
            .add(ModBlocks.INDIGO_ASTER)
            .add(ModBlocks.PINK_ASTER)
            .add(ModBlocks.VIOLET_ASTER)
            .add(ModBlocks.WHITE_ASTER)
            .add(ModBlocks.CYCLAMEN)
            .add(ModBlocks.DUSTY_MILLER)
            .add(ModBlocks.BLUE_FLOSSFLOWER)
            .add(ModBlocks.MAGENTA_FLOSSFLOWER)
            .add(ModBlocks.PINK_FLOSSFLOWER)
            .add(ModBlocks.WHITE_FLOSSFLOWER)
            .add(ModBlocks.GLOBE_THISTLE)
            .add(ModBlocks.BUTTERCUP)
            .add(ModBlocks.PINK_DAISY)
            .add(ModBlocks.YELLOW_DAISY)
            .add(ModBlocks.WHITE_DAISY)
            .add(ModBlocks.SILVER_MOUND_ARTEMISIA)
            .add(ModBlocks.SOFT_PINK_HELIOTROPE)
            .add(ModBlocks.PINK_HELIOTROPE)
            .add(ModBlocks.WHITE_HELIOTROPE)
            .add(ModBlocks.TRANS_HELIOTROPE)
            .add(ModBlocks.VIOLET_HELIOTROPE)
            .add(ModBlocks.ORANGE_HELIOTROPE)
            .add(ModBlocks.BLACK_HELIOTROPE)
            .add(ModBlocks.ICE_HELIOTROPE)
            .add(ModBlocks.GOMPHRENA)
            .add(ModBlocks.GOMPHRENA_PATCH)
            .add(ModBlocks.DAHLIA)
            .add(ModBlocks.BLOODROOT);
        getOrCreateTagBuilder(ModTags.Blocks.WATER_PLANT_PLANTABLE_BLOCKS)
            .add(Blocks.DIRT)
            .add(Blocks.COARSE_DIRT)
            .add(Blocks.GRASS_BLOCK)
            .add(Blocks.GRAVEL)
            .add(Blocks.SUSPICIOUS_GRAVEL)
            .add(Blocks.SAND)
            .add(Blocks.SUSPICIOUS_SAND)
            .add(Blocks.STONE);
        getOrCreateTagBuilder((BlockTags.TRAPDOORS))
            .add(ModBlocks.PEARLARIUM_TRAPDOOR)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_TRAPDOOR);
        getOrCreateTagBuilder(BlockTags.ENCHANTMENT_POWER_PROVIDER)
            .add(ModBlocks.OAK_PLANK_BOOKSHELF)
            .add(ModBlocks.SPRUCE_PLANK_BOOKSHELF)
            .add(ModBlocks.BIRCH_PLANK_BOOKSHELF)
            .add(ModBlocks.JUNGLE_PLANK_BOOKSHELF)
            .add(ModBlocks.ACACIA_PLANK_BOOKSHELF)
            .add(ModBlocks.CHERRY_PLANK_BOOKSHELF)
            .add(ModBlocks.DARK_OAK_PLANK_BOOKSHELF)
            .add(ModBlocks.MANGROVE_PLANK_BOOKSHELF)
            .add(ModBlocks.BAMBOO_PLANK_BOOKSHELF)
            .add(ModBlocks.WARPED_PLANK_BOOKSHELF)
            .add(ModBlocks.CRIMSON_PLANK_BOOKSHELF)
            .add(ModBlocks.MAHOGANY_PLANK_BOOKSHELF)
        ;
    }
}