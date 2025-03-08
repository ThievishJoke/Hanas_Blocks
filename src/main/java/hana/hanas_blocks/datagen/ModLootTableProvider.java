package hana.hanas_blocks.datagen;

import hana.hanas_blocks.HanasBlocks;
import hana.hanas_blocks.block.GlassBlocks;
import hana.hanas_blocks.block.TintedGlassBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import hana.hanas_blocks.block.ModBlocks;
import hana.hanas_blocks.item.ModItems;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.ConditionalLootFunction;
import net.minecraft.loot.function.LootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

import static hana.hanas_blocks.HanasBlocks.MOD_ID;
import static org.spongepowered.asm.mixin.FabricUtil.getModId;

public class ModLootTableProvider extends FabricBlockLootTableProvider{

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registeryLookup) {
        super(dataOutput, registeryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CHARCOAL_BLOCK);
        
        addDrop(ModBlocks.NETHERRACK_BRICK);
        addDrop(ModBlocks.NETHERRACK_BRICK_WALL);
        addDrop(ModBlocks.NETHERRACK_BRICK_STAIRS);
        addDrop(ModBlocks.NETHERRACK_BRICK_SLAB, slabDrops(ModBlocks.NETHERRACK_BRICK_SLAB));

        addDrop(ModBlocks.POLISHED_BASALT_BRICK);
        addDrop(ModBlocks.POLISHED_BASALT_BRICK_WALL);
        addDrop(ModBlocks.POLISHED_BASALT_BRICK_STAIRS);
        addDrop(ModBlocks.POLISHED_BASALT_BRICK_SLAB, slabDrops(ModBlocks.POLISHED_BASALT_BRICK_SLAB));
        
        addDrop(ModBlocks.POLISHED_END_STONE);
        addDrop(ModBlocks.POLISHED_END_STONE_WALL);
        addDrop(ModBlocks.POLISHED_END_STONE_STAIRS);
        addDrop(ModBlocks.POLISHED_END_STONE_SLAB, slabDrops(ModBlocks.POLISHED_END_STONE_SLAB));

        addDrop(ModBlocks.HONEY_COMB_BRICKS);
        addDrop(ModBlocks.HONEY_COMB_BRICK_WALL);
        addDrop(ModBlocks.HONEY_COMB_BRICK_STAIRS);
        addDrop(ModBlocks.HONEY_COMB_BRICK_SLAB, slabDrops(ModBlocks.HONEY_COMB_BRICK_SLAB));

        addDrop(ModBlocks.BURNING_BLAZE_POWDERED_BLOCK);
        addDrop(ModBlocks.POWDER_KEG);
        addDrop(ModBlocks.CHARCOAL_BLOCK);

        addDrop(ModBlocks.COPPER_SHEET_BLOCK);
        addDrop(ModBlocks.EXPOSED_COPPER_SHEET_BLOCK);
        addDrop(ModBlocks.WEATHERED_COPPER_SHEET_BLOCK);
        addDrop(ModBlocks.OXIDIZED_COPPER_SHEET_BLOCK);
        addDrop(ModBlocks.WAXED_COPPER_SHEET_BLOCK);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_SHEET_BLOCK);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_SHEET_BLOCK);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_SHEET_BLOCK);

        addDrop(ModBlocks.IRON_SHEET_BLOCK);
        addDrop(ModBlocks.GOLD_SHEET_BLOCK);

        addDrop(ModBlocks.RAW_QUARTZ_BLOCK);

        addDrop(TintedGlassBlocks.TINTED_GLASS_STAIRS);
        addDrop(TintedGlassBlocks.TINTED_GLASS_SLAB);
        addDrop(TintedGlassBlocks.TINTED_GLASS_VERTICAL_SLAB);

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

        slabDrops(TintedGlassBlocks.RED_STAINED_TINTED_GLASS_SLAB);
        slabDrops(TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS_SLAB);
        slabDrops(TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS_SLAB);
        slabDrops(TintedGlassBlocks.LIME_STAINED_TINTED_GLASS_SLAB);
        slabDrops(TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS_SLAB);
        slabDrops(TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS_SLAB);
        slabDrops(TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS_SLAB);
        slabDrops(TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS_SLAB);
        slabDrops(TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS_SLAB);
        slabDrops(TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS_SLAB);
        slabDrops(TintedGlassBlocks.PINK_STAINED_TINTED_GLASS_SLAB);
        slabDrops(TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS_SLAB);
        slabDrops(TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS_SLAB);
        slabDrops(TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS_SLAB);
        slabDrops(TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS_SLAB);
        slabDrops(TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS_SLAB);

        slabDrops(TintedGlassBlocks.RED_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        slabDrops(TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        slabDrops(TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        slabDrops(TintedGlassBlocks.LIME_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        slabDrops(TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        slabDrops(TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        slabDrops(TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        slabDrops(TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        slabDrops(TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        slabDrops(TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        slabDrops(TintedGlassBlocks.PINK_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        slabDrops(TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        slabDrops(TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        slabDrops(TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        slabDrops(TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS_VERTICAL_SLAB);
        slabDrops(TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS_VERTICAL_SLAB);

        addDrop(GlassBlocks.GLASS_STAIRS);
        addDrop(GlassBlocks.GLASS_SLAB);
        addDrop(GlassBlocks.GLASS_VERTICAL_SLAB);

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

        slabDrops(GlassBlocks.RED_STAINED_GLASS_SLAB);
        slabDrops(GlassBlocks.ORANGE_STAINED_GLASS_SLAB);
        slabDrops(GlassBlocks.YELLOW_STAINED_GLASS_SLAB);
        slabDrops(GlassBlocks.LIME_STAINED_GLASS_SLAB);
        slabDrops(GlassBlocks.GREEN_STAINED_GLASS_SLAB);
        slabDrops(GlassBlocks.CYAN_STAINED_GLASS_SLAB);
        slabDrops(GlassBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB);
        slabDrops(GlassBlocks.BLUE_STAINED_GLASS_SLAB);
        slabDrops(GlassBlocks.PURPLE_STAINED_GLASS_SLAB);
        slabDrops(GlassBlocks.MAGENTA_STAINED_GLASS_SLAB);
        slabDrops(GlassBlocks.PINK_STAINED_GLASS_SLAB);
        slabDrops(GlassBlocks.GRAY_STAINED_GLASS_SLAB);
        slabDrops(GlassBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB);
        slabDrops(GlassBlocks.BLACK_STAINED_GLASS_SLAB);
        slabDrops(GlassBlocks.BROWN_STAINED_GLASS_SLAB);
        slabDrops(GlassBlocks.WHITE_STAINED_GLASS_SLAB);

        slabDrops(GlassBlocks.RED_STAINED_GLASS_VERTICAL_SLAB);
        slabDrops(GlassBlocks.ORANGE_STAINED_GLASS_VERTICAL_SLAB);
        slabDrops(GlassBlocks.YELLOW_STAINED_GLASS_VERTICAL_SLAB);
        slabDrops(GlassBlocks.LIME_STAINED_GLASS_VERTICAL_SLAB);
        slabDrops(GlassBlocks.GREEN_STAINED_GLASS_VERTICAL_SLAB);
        slabDrops(GlassBlocks.CYAN_STAINED_GLASS_VERTICAL_SLAB);
        slabDrops(GlassBlocks.LIGHT_BLUE_STAINED_GLASS_VERTICAL_SLAB);
        slabDrops(GlassBlocks.BLUE_STAINED_GLASS_VERTICAL_SLAB);
        slabDrops(GlassBlocks.PURPLE_STAINED_GLASS_VERTICAL_SLAB);
        slabDrops(GlassBlocks.MAGENTA_STAINED_GLASS_VERTICAL_SLAB);
        slabDrops(GlassBlocks.PINK_STAINED_GLASS_VERTICAL_SLAB);
        slabDrops(GlassBlocks.GRAY_STAINED_GLASS_VERTICAL_SLAB);
        slabDrops(GlassBlocks.LIGHT_GRAY_STAINED_GLASS_VERTICAL_SLAB);
        slabDrops(GlassBlocks.BLACK_STAINED_GLASS_VERTICAL_SLAB);
        slabDrops(GlassBlocks.BROWN_STAINED_GLASS_VERTICAL_SLAB);
        slabDrops(GlassBlocks.WHITE_STAINED_GLASS_VERTICAL_SLAB);
    }
}


