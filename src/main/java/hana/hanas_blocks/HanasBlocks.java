package hana.hanas_blocks;


import hana.hanas_blocks.fluid.ModFluids;
import net.fabricmc.api.ModInitializer;
//import net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents.Register;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import hana.hanas_blocks.block.ModBlocks;
//import hana.hanas_blocks.block.entity.ModBlockEntities;
import hana.hanas_blocks.enchantment.ModEnchantments;
//import hana.hanas_blocks.entity.ModEntities;
//import hana.hanas_blocks.entity.custom.DeerEntity;
import hana.hanas_blocks.item.ModItemGroups;
import hana.hanas_blocks.item.ModItems;
import hana.hanas_blocks.recipe.ModRecipes;
//import hana.hanas_blocks.screen.ModScreenHandlers;
import hana.hanas_blocks.world.gen.ModWorldGeneration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HanasBlocks implements ModInitializer {
      public static final String MOD_ID = "hanas_blocks";
      public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

      @Override
      public void onInitialize() {
      ModItemGroups.registerItemGroups();
      
      ModItems.registerModItems();
      ModBlocks.registerModBlocks();
      
      ModEnchantments.registerModEnchantments();
      //ModBlockEntities.registerBlockEntities();
      //ModScreenHandlers.registerScreenHandlers();
      ModRecipes.registerRecipes();
      
      FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHARCOAL_BLOCK, 5, 90);
      FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.POWDER_KEG, 5, 20);
      FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BURNING_BLAZE_POWDERED_BLOCK, 30, 120);

      FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAHOGANY_LOG, 5, 20);
      FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAHOGANY_WOOD, 5, 20);
      FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAHOGANY_LOG, 5, 20);
      FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAHOGANY_WOOD, 5, 20);

      FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAHOGANY_PLANKS, 5, 20);
      FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAHOGANY_LEAVES, 30, 60);

      OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_SHEET_BLOCK, ModBlocks.EXPOSED_COPPER_SHEET_BLOCK);
      OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_SHEET_BLOCK, ModBlocks.WEATHERED_COPPER_SHEET_BLOCK);
      OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_SHEET_BLOCK, ModBlocks.OXIDIZED_COPPER_SHEET_BLOCK);

      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_SHEET_BLOCK, ModBlocks.WAXED_COPPER_SHEET_BLOCK);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_SHEET_BLOCK, ModBlocks.WAXED_EXPOSED_COPPER_SHEET_BLOCK);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_SHEET_BLOCK, ModBlocks.WAXED_WEATHERED_COPPER_SHEET_BLOCK);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_SHEET_BLOCK, ModBlocks.WAXED_OXIDIZED_COPPER_SHEET_BLOCK);

      OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.ANCIENT_NETHERITE_BRICK, ModBlocks.DULL_ANCIENT_NETHERITE_BRICK);
      OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK, ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK);
      OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK, ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.ANCIENT_NETHERITE_BRICK, ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK, ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK, ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK, ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK);

      OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.ANCIENT_NETHERITE_BRICK_SLAB, ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_SLAB);
      OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_SLAB, ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_SLAB);
      OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_SLAB, ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_SLAB);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.ANCIENT_NETHERITE_BRICK_SLAB, ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_SLAB);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_SLAB, ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_SLAB);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_SLAB, ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_SLAB);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_SLAB, ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_SLAB);

      OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.ANCIENT_NETHERITE_BRICK_STAIRS, ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_STAIRS);
      OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_STAIRS, ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_STAIRS);
      OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_STAIRS, ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_STAIRS);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.ANCIENT_NETHERITE_BRICK_STAIRS, ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_STAIRS);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_STAIRS, ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_STAIRS);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_STAIRS, ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_STAIRS);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_STAIRS, ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_STAIRS );

      OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.ANCIENT_NETHERITE_BRICK_WALL, ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_WALL);
      OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_WALL, ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_WALL);
      OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_WALL, ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_WALL);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.ANCIENT_NETHERITE_BRICK_WALL, ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_WALL);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_WALL, ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_WALL);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_WALL, ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_WALL);
      OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_WALL, ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_WALL);


            FuelRegistry.INSTANCE.add(ModBlocks.CHARCOAL_BLOCK, 16000);
      FuelRegistry.INSTANCE.add(ModBlocks.BURNING_BLAZE_POWDERED_BLOCK, 24000);
      //FabricDefaultAttributeRegistry.register(ModEntities.DEER, DeerEntity.createDeerAttributes());
      
      StrippableBlockRegistry.register(ModBlocks.MAHOGANY_LOG, ModBlocks.STRIPPED_MAHOGANY_LOG);
      StrippableBlockRegistry.register(ModBlocks.MAHOGANY_WOOD, ModBlocks.STRIPPED_MAHOGANY_WOOD);

      ModFluids.registerFluids();

      ModWorldGeneration.generateModWorldGen();

      //todo readd mixin
      //      "mixins": [
      //      "ExampleMixin",
      //      "ench.enchantment.CrossbowItemMixin"
      //],
  }
}