package hana.hanas_blocks.datagen;

import hana.hanas_blocks.HanasBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import hana.hanas_blocks.block.ModBlocks;
import hana.hanas_blocks.item.ModItems;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;

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

        addDrop(ModBlocks.LOW_QUALITY_PEARLARIUM_ORE, PearlariumOreDrops(ModBlocks.LOW_QUALITY_NIGRUM_PETRAMIUNIUM_ORE));
        addDrop(ModBlocks.PEARLARIUM_ORE, PearlariumOreDrops(ModBlocks.PEARLARIUM_ORE));
        addDrop(ModBlocks.DEEPSLATE_PEARLARIUM_ORE, PearlariumOreDrops(ModBlocks.DEEPSLATE_PEARLARIUM_ORE));
        addDrop(ModBlocks.PEARLARIUM_CRYSTAL_BLOCK);
        addDrop(ModBlocks.PEARLARIUM_ALLOY_SHEET_BLOCK);
        addDrop(ModBlocks.PEARLARIUM_BLOCK);
        addDrop(ModBlocks.PEARLARIUM_SLAB, slabDrops(ModBlocks.PEARLARIUM_SLAB));
        addDrop(ModBlocks.PEARLARIUM_STAIRS);
        addDrop(ModBlocks.PEARLARIUM_WALL);

        addDrop(ModBlocks.LOW_QUALITY_NIGRUM_PETRAMIUNIUM_ORE, NigrumPetramiuniumOreDrops(ModBlocks.LOW_QUALITY_NIGRUM_PETRAMIUNIUM_ORE));
        addDrop(ModBlocks.NIGRUM_PETRAMIUNIUM_ORE, NigrumPetramiuniumOreDrops(ModBlocks.NIGRUM_PETRAMIUNIUM_ORE));
        addDrop(ModBlocks.DEEPSLATE_NIGRUM_PETRAMIUNIUM_ORE, NigrumPetramiuniumOreDrops(ModBlocks.DEEPSLATE_NIGRUM_PETRAMIUNIUM_ORE));
        addDrop(ModBlocks.NIGRUM_PETRAMIUNIUM_CRYSTAL_BLOCK);
        addDrop(ModBlocks.NIGRUM_PETRAMIUNIUM_ALLOY_SHEET_BLOCK);
        addDrop(ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK);
        addDrop(ModBlocks.NIGRUM_PETRAMIUNIUM_SLAB, slabDrops(ModBlocks.NIGRUM_PETRAMIUNIUM_SLAB));
        addDrop(ModBlocks.NIGRUM_PETRAMIUNIUM_STAIRS);
        addDrop(ModBlocks.NIGRUM_PETRAMIUNIUM_WALL);
        
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

    //plants
        addDrop(ModBlocks.GLOWING_WISTERIA);
        addPottedPlantDrops(ModBlocks.POTTED_GLOWING_WISTERIA);
        addDrop(ModBlocks.ACONITE);
        addPottedPlantDrops(ModBlocks.POTTED_ACONITE);
        addDrop(ModBlocks.RED_ROSE);
        addPottedPlantDrops(ModBlocks.POTTED_RED_ROSE);
        addDrop(ModBlocks.BLUE_ASTER);
        addPottedPlantDrops(ModBlocks.POTTED_BLUE_ASTER);
        addDrop(ModBlocks.INDIGO_ASTER);
        addPottedPlantDrops(ModBlocks.POTTED_INDIGO_ASTER);
        addDrop(ModBlocks.PINK_ASTER);
        addPottedPlantDrops(ModBlocks.POTTED_PINK_ASTER);
        addDrop(ModBlocks.VIOLET_ASTER);
        addPottedPlantDrops(ModBlocks.POTTED_VIOLET_ASTER);
        addDrop(ModBlocks.WHITE_ASTER);
        addPottedPlantDrops(ModBlocks.POTTED_WHITE_ASTER);
        addDrop(ModBlocks.CYCLAMEN);
        addPottedPlantDrops(ModBlocks.POTTED_CYCLAMEN);
        addDrop(ModBlocks.DUSTY_MILLER);
        addPottedPlantDrops(ModBlocks.POTTED_DUSTY_MILLER);
        addDrop(ModBlocks.BLUE_FLOSSFLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_BLUE_FLOSSFLOWER);
        addDrop(ModBlocks.MAGENTA_FLOSSFLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_MAGENTA_FLOSSFLOWER);
        addDrop(ModBlocks.PINK_FLOSSFLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_PINK_FLOSSFLOWER);
        addDrop(ModBlocks.WHITE_FLOSSFLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_WHITE_FLOSSFLOWER);

        //addDrop(ModBlocks.VIOLET_AUBRIETA);
        //addPottedPlantDrops(ModBlocks.POTTED_VIOLET_AUBRIETA);

        addDrop(ModBlocks.SCULK_TENDRIL);
        addPottedPlantDrops(ModBlocks.POTTED_SCULK_TENDRIL);
        addDrop(ModBlocks.SCULK_ROSE);
        addPottedPlantDrops(ModBlocks.POTTED_SCULK_ROSE);
        addDrop(ModBlocks.GLOWING_SCULK_WISTERIA);
        addPottedPlantDrops(ModBlocks.POTTED_GLOWING_SCULK_WISTERIA);
        addDrop(ModBlocks.GLOWING_SCULK_WISTERIA_BUNDLE);
        addPottedPlantDrops(ModBlocks.POTTED_GLOWING_SCULK_WISTERIA_BUNDLE);

        //addDrop(ModBlocks.RUBY_DOOR, doorDrops(ModBlocks."example_door"));

        addDrop(ModBlocks.MAHOGANY_LOG);
        addDrop(ModBlocks.MAHOGANY_WOOD);
        addDrop(ModBlocks.STRIPPED_MAHOGANY_LOG);
        addDrop(ModBlocks.STRIPPED_MAHOGANY_WOOD);
        addDrop(ModBlocks.MAHOGANY_PLANKS);

        addDrop(ModBlocks.MAHOGANY_LEAVES, leavesDrops(ModBlocks.MAHOGANY_LEAVES, ModBlocks.NIGRUM_PETRAMIUNIUM_SLAB, 0.0025f)); //TODO

        //addDropwithSilkTouch(ModBlocks.<BlockName>);
    }
    
    public LootTable.Builder PearlariumOreDrops(Block drop) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ItemEntry.builder(ModItems.RAW_PEARLARIUM)
            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }

    public LootTable.Builder NigrumPetramiuniumOreDrops(Block drop) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ItemEntry.builder(ModItems.RAW_NIGRUM_PETRAMIUNIUM)
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }

}


