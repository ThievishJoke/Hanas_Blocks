package net.hana.hanas_blocks;

import net.hana.hanas_blocks.block.ConcreteBlocks;
import net.hana.hanas_blocks.block.GlassBlocks;
import net.hana.hanas_blocks.block.TintedGlassBlocks;
import net.hana.hanas_blocks.util.ModAttributes;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.hana.hanas_blocks.block.ModBlocks;
import net.hana.hanas_blocks.item.ModItemGroups;
import net.hana.hanas_blocks.item.ModItems;
import net.hana.hanas_blocks.world.gen.ModWorldGeneration;

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
            GlassBlocks.registerModBlocks();
            TintedGlassBlocks.registerModBlocks();
            ConcreteBlocks.registerModBlocks();

            ModAttributes.registerAttributes();

            registerFlammables();
            registerFuels();
            registerOxicizables();
            registerStrippables();

            ModWorldGeneration.generateModWorldGen();
      }

      private static void registerFlammables() {
                  FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHARCOAL_BLOCK, 5, 90);
                  FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.POWDER_KEG, 5, 20);
                  FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BURNING_BLAZE_POWDERED_BLOCK, 30, 120);
      }

      private static void registerOxicizables() {
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
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_STAIRS, ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_STAIRS);

            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.ANCIENT_NETHERITE_BRICK_WALL, ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_WALL);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_WALL, ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_WALL);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_WALL, ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.ANCIENT_NETHERITE_BRICK_WALL, ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_WALL, ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_WALL, ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_WALL, ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_WALL);
      }

      private static void registerFuels() {
            FuelRegistry.INSTANCE.add(ModBlocks.CHARCOAL_BLOCK, 16000);
            FuelRegistry.INSTANCE.add(ModBlocks.BURNING_BLAZE_POWDERED_BLOCK, 24000);
      }

      private static void registerStrippables() {
      }
}