package net.hana.hanas_blocks.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hana.hanas_blocks.HanasBlocks;
import net.hana.hanas_blocks.block.*;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CONCRETE_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HanasBlocks.MOD_ID, "concrete_item_group"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.concrete_item_group", "Concrete Blocks"))
                    .icon(() -> new ItemStack(Blocks.RED_CONCRETE)).entries((displayContext, entries) -> {
                        entries.add(Blocks.RED_CONCRETE_POWDER);
                        entries.add(Blocks.RED_CONCRETE);
                        entries.add(ConcreteBlocks.RED_CONCRETE_STAIRS);
                        entries.add(ConcreteBlocks.RED_CONCRETE_SLAB);
                        entries.add(ConcreteBlocks.RED_CONCRETE_VERTICAL_SLAB);
                        entries.add(ConcreteBlocks.RED_CONCRETE_WALL);

                        entries.add(Blocks.ORANGE_CONCRETE_POWDER);
                        entries.add(Blocks.ORANGE_CONCRETE);
                        entries.add(ConcreteBlocks.ORANGE_CONCRETE_STAIRS);
                        entries.add(ConcreteBlocks.ORANGE_CONCRETE_SLAB);
                        entries.add(ConcreteBlocks.ORANGE_CONCRETE_VERTICAL_SLAB);
                        entries.add(ConcreteBlocks.ORANGE_CONCRETE_WALL);

                        entries.add(Blocks.YELLOW_CONCRETE_POWDER);
                        entries.add(Blocks.YELLOW_CONCRETE);
                        entries.add(ConcreteBlocks.YELLOW_CONCRETE_STAIRS);
                        entries.add(ConcreteBlocks.YELLOW_CONCRETE_SLAB);
                        entries.add(ConcreteBlocks.YELLOW_CONCRETE_VERTICAL_SLAB);
                        entries.add(ConcreteBlocks.YELLOW_CONCRETE_WALL);

                        entries.add(Blocks.LIME_CONCRETE_POWDER);
                        entries.add(Blocks.LIME_CONCRETE);
                        entries.add(ConcreteBlocks.LIME_CONCRETE_STAIRS);
                        entries.add(ConcreteBlocks.LIME_CONCRETE_SLAB);
                        entries.add(ConcreteBlocks.LIME_CONCRETE_VERTICAL_SLAB);
                        entries.add(ConcreteBlocks.LIME_CONCRETE_WALL);

                        entries.add(Blocks.GREEN_CONCRETE_POWDER);
                        entries.add(Blocks.GREEN_CONCRETE);
                        entries.add(ConcreteBlocks.GREEN_CONCRETE_STAIRS);
                        entries.add(ConcreteBlocks.GREEN_CONCRETE_SLAB);
                        entries.add(ConcreteBlocks.GREEN_CONCRETE_VERTICAL_SLAB);
                        entries.add(ConcreteBlocks.GREEN_CONCRETE_WALL);

                        entries.add(Blocks.CYAN_CONCRETE_POWDER);
                        entries.add(Blocks.CYAN_CONCRETE);
                        entries.add(ConcreteBlocks.CYAN_CONCRETE_STAIRS);
                        entries.add(ConcreteBlocks.CYAN_CONCRETE_SLAB);
                        entries.add(ConcreteBlocks.CYAN_CONCRETE_VERTICAL_SLAB);
                        entries.add(ConcreteBlocks.CYAN_CONCRETE_WALL);

                        entries.add(Blocks.LIGHT_BLUE_CONCRETE_POWDER);
                        entries.add(Blocks.LIGHT_BLUE_CONCRETE);
                        entries.add(ConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
                        entries.add(ConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB);
                        entries.add(ConcreteBlocks.LIGHT_BLUE_CONCRETE_VERTICAL_SLAB);
                        entries.add(ConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL);

                        entries.add(Blocks.BLUE_CONCRETE_POWDER);
                        entries.add(Blocks.BLUE_CONCRETE);
                        entries.add(ConcreteBlocks.BLUE_CONCRETE_STAIRS);
                        entries.add(ConcreteBlocks.BLUE_CONCRETE_SLAB);
                        entries.add(ConcreteBlocks.BLUE_CONCRETE_VERTICAL_SLAB);
                        entries.add(ConcreteBlocks.BLUE_CONCRETE_WALL);

                        entries.add(Blocks.PURPLE_CONCRETE_POWDER);
                        entries.add(Blocks.PURPLE_CONCRETE);
                        entries.add(ConcreteBlocks.PURPLE_CONCRETE_STAIRS);
                        entries.add(ConcreteBlocks.PURPLE_CONCRETE_SLAB);
                        entries.add(ConcreteBlocks.PURPLE_CONCRETE_VERTICAL_SLAB);
                        entries.add(ConcreteBlocks.PURPLE_CONCRETE_WALL);

                        entries.add(Blocks.MAGENTA_CONCRETE_POWDER);
                        entries.add(Blocks.MAGENTA_CONCRETE);
                        entries.add(ConcreteBlocks.MAGENTA_CONCRETE_STAIRS);
                        entries.add(ConcreteBlocks.MAGENTA_CONCRETE_SLAB);
                        entries.add(ConcreteBlocks.MAGENTA_CONCRETE_VERTICAL_SLAB);
                        entries.add(ConcreteBlocks.MAGENTA_CONCRETE_WALL);

                        entries.add(Blocks.PINK_CONCRETE_POWDER);
                        entries.add(Blocks.PINK_CONCRETE);
                        entries.add(ConcreteBlocks.PINK_CONCRETE_STAIRS);
                        entries.add(ConcreteBlocks.PINK_CONCRETE_SLAB);
                        entries.add(ConcreteBlocks.PINK_CONCRETE_VERTICAL_SLAB);
                        entries.add(ConcreteBlocks.PINK_CONCRETE_WALL);

                        entries.add(Blocks.BROWN_CONCRETE_POWDER);
                        entries.add(Blocks.BROWN_CONCRETE);
                        entries.add(ConcreteBlocks.BROWN_CONCRETE_STAIRS);
                        entries.add(ConcreteBlocks.BROWN_CONCRETE_SLAB);
                        entries.add(ConcreteBlocks.BROWN_CONCRETE_VERTICAL_SLAB);
                        entries.add(ConcreteBlocks.BROWN_CONCRETE_WALL);

                        entries.add(Blocks.BLACK_CONCRETE_POWDER);
                        entries.add(Blocks.BLACK_CONCRETE);
                        entries.add(ConcreteBlocks.BLACK_CONCRETE_STAIRS);
                        entries.add(ConcreteBlocks.BLACK_CONCRETE_SLAB);
                        entries.add(ConcreteBlocks.BLACK_CONCRETE_VERTICAL_SLAB);
                        entries.add(ConcreteBlocks.BLACK_CONCRETE_WALL);

                        entries.add(Blocks.WHITE_CONCRETE_POWDER);
                        entries.add(Blocks.WHITE_CONCRETE);
                        entries.add(ConcreteBlocks.WHITE_CONCRETE_STAIRS);
                        entries.add(ConcreteBlocks.WHITE_CONCRETE_SLAB);
                        entries.add(ConcreteBlocks.WHITE_CONCRETE_VERTICAL_SLAB);
                        entries.add(ConcreteBlocks.WHITE_CONCRETE_WALL);

                        entries.add(Blocks.LIGHT_GRAY_CONCRETE_POWDER);
                        entries.add(Blocks.LIGHT_GRAY_CONCRETE);
                        entries.add(ConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
                        entries.add(ConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB);
                        entries.add(ConcreteBlocks.LIGHT_GRAY_CONCRETE_VERTICAL_SLAB);
                        entries.add(ConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL);

                        entries.add(Blocks.GRAY_CONCRETE_POWDER);
                        entries.add(Blocks.GRAY_CONCRETE);
                        entries.add(ConcreteBlocks.GRAY_CONCRETE_STAIRS);
                        entries.add(ConcreteBlocks.GRAY_CONCRETE_SLAB);
                        entries.add(ConcreteBlocks.GRAY_CONCRETE_VERTICAL_SLAB);
                        entries.add(ConcreteBlocks.GRAY_CONCRETE_WALL);

                    }).build());

    public static final ItemGroup GLASS_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HanasBlocks.MOD_ID, "glass_item_group"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.glass_item_group", "Glass Blocks"))
                    .icon(() -> new ItemStack(Blocks.GLASS)).entries((displayContext, entries) -> {
                        entries.add(Blocks.GLASS);
                        entries.add(GlassBlocks.GLASS_SLAB);
                        entries.add(GlassBlocks.GLASS_STAIRS);
                        entries.add(GlassBlocks.GLASS_VERTICAL_SLAB);
                        entries.add(Blocks.GLASS_PANE);
                        entries.add(Blocks.TINTED_GLASS);
                        entries.add(TintedGlassBlocks.TINTED_GLASS_SLAB);
                        entries.add(TintedGlassBlocks.TINTED_GLASS_STAIRS);
                        entries.add(TintedGlassBlocks.TINTED_GLASS_VERTICAL_SLAB);

                        entries.add(Blocks.RED_STAINED_GLASS);
                        entries.add(GlassBlocks.RED_STAINED_GLASS_SLAB);
                        entries.add(GlassBlocks.RED_STAINED_GLASS_STAIRS);
                        entries.add(GlassBlocks.RED_STAINED_GLASS_VERTICAL_SLAB);
                        entries.add(Blocks.RED_STAINED_GLASS_PANE);
                        entries.add(Blocks.ORANGE_STAINED_GLASS);
                        entries.add(GlassBlocks.ORANGE_STAINED_GLASS_SLAB);
                        entries.add(GlassBlocks.ORANGE_STAINED_GLASS_STAIRS);
                        entries.add(GlassBlocks.ORANGE_STAINED_GLASS_VERTICAL_SLAB);
                        entries.add(Blocks.ORANGE_STAINED_GLASS_PANE);

                        entries.add(Blocks.YELLOW_STAINED_GLASS);
                        entries.add(GlassBlocks.YELLOW_STAINED_GLASS_SLAB);
                        entries.add(GlassBlocks.YELLOW_STAINED_GLASS_STAIRS);
                        entries.add(GlassBlocks.YELLOW_STAINED_GLASS_VERTICAL_SLAB);
                        entries.add(Blocks.YELLOW_STAINED_GLASS_PANE);
                        entries.add(Blocks.LIME_STAINED_GLASS);
                        entries.add(GlassBlocks.LIME_STAINED_GLASS_SLAB);
                        entries.add(GlassBlocks.LIME_STAINED_GLASS_STAIRS);
                        entries.add(GlassBlocks.LIME_STAINED_GLASS_VERTICAL_SLAB);
                        entries.add(Blocks.LIME_STAINED_GLASS_PANE);

                        entries.add(Blocks.GREEN_STAINED_GLASS);
                        entries.add(GlassBlocks.GREEN_STAINED_GLASS_SLAB);
                        entries.add(GlassBlocks.GREEN_STAINED_GLASS_STAIRS);
                        entries.add(GlassBlocks.GREEN_STAINED_GLASS_VERTICAL_SLAB);
                        entries.add(Blocks.GREEN_STAINED_GLASS_PANE);
                        entries.add(Blocks.CYAN_STAINED_GLASS);
                        entries.add(GlassBlocks.CYAN_STAINED_GLASS_SLAB);
                        entries.add(GlassBlocks.CYAN_STAINED_GLASS_STAIRS);
                        entries.add(GlassBlocks.CYAN_STAINED_GLASS_VERTICAL_SLAB);
                        entries.add(Blocks.CYAN_STAINED_GLASS_PANE);

                        entries.add(Blocks.LIGHT_BLUE_STAINED_GLASS);
                        entries.add(GlassBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB);
                        entries.add(GlassBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);
                        entries.add(GlassBlocks.LIGHT_BLUE_STAINED_GLASS_VERTICAL_SLAB);
                        entries.add(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE);
                        entries.add(Blocks.BLUE_STAINED_GLASS);
                        entries.add(GlassBlocks.BLUE_STAINED_GLASS_SLAB);
                        entries.add(GlassBlocks.BLUE_STAINED_GLASS_STAIRS);
                        entries.add(GlassBlocks.BLUE_STAINED_GLASS_VERTICAL_SLAB);
                        entries.add(Blocks.BLUE_STAINED_GLASS_PANE);

                        entries.add(Blocks.PURPLE_STAINED_GLASS);
                        entries.add(GlassBlocks.PURPLE_STAINED_GLASS_SLAB);
                        entries.add(GlassBlocks.PURPLE_STAINED_GLASS_STAIRS);
                        entries.add(GlassBlocks.PURPLE_STAINED_GLASS_VERTICAL_SLAB);
                        entries.add(Blocks.PURPLE_STAINED_GLASS_PANE);
                        entries.add(Blocks.MAGENTA_STAINED_GLASS);
                        entries.add(GlassBlocks.MAGENTA_STAINED_GLASS_SLAB);
                        entries.add(GlassBlocks.MAGENTA_STAINED_GLASS_STAIRS);
                        entries.add(GlassBlocks.MAGENTA_STAINED_GLASS_VERTICAL_SLAB);
                        entries.add(Blocks.MAGENTA_STAINED_GLASS_PANE);

                        entries.add(Blocks.PINK_STAINED_GLASS);
                        entries.add(GlassBlocks.PINK_STAINED_GLASS_SLAB);
                        entries.add(GlassBlocks.PINK_STAINED_GLASS_STAIRS);
                        entries.add(GlassBlocks.PINK_STAINED_GLASS_VERTICAL_SLAB);
                        entries.add(Blocks.PINK_STAINED_GLASS_PANE);
                        entries.add(Blocks.BROWN_STAINED_GLASS);
                        entries.add(GlassBlocks.BROWN_STAINED_GLASS_SLAB);
                        entries.add(GlassBlocks.BROWN_STAINED_GLASS_STAIRS);
                        entries.add(GlassBlocks.BROWN_STAINED_GLASS_VERTICAL_SLAB);
                        entries.add(Blocks.BROWN_STAINED_GLASS_PANE);

                        entries.add(Blocks.BLACK_STAINED_GLASS);
                        entries.add(GlassBlocks.BLACK_STAINED_GLASS_SLAB);
                        entries.add(GlassBlocks.BLACK_STAINED_GLASS_STAIRS);
                        entries.add(GlassBlocks.BLACK_STAINED_GLASS_VERTICAL_SLAB);
                        entries.add(Blocks.BLACK_STAINED_GLASS_PANE);
                        entries.add(Blocks.WHITE_STAINED_GLASS);
                        entries.add(GlassBlocks.WHITE_STAINED_GLASS_SLAB);
                        entries.add(GlassBlocks.WHITE_STAINED_GLASS_STAIRS);
                        entries.add(GlassBlocks.WHITE_STAINED_GLASS_VERTICAL_SLAB);
                        entries.add(Blocks.WHITE_STAINED_GLASS_PANE);

                        entries.add(Blocks.LIGHT_GRAY_STAINED_GLASS);
                        entries.add(GlassBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB);
                        entries.add(GlassBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);
                        entries.add(GlassBlocks.LIGHT_GRAY_STAINED_GLASS_VERTICAL_SLAB);
                        entries.add(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE);
                        entries.add(Blocks.GRAY_STAINED_GLASS);
                        entries.add(GlassBlocks.GRAY_STAINED_GLASS_SLAB);
                        entries.add(GlassBlocks.GRAY_STAINED_GLASS_STAIRS);
                        entries.add(GlassBlocks.GRAY_STAINED_GLASS_VERTICAL_SLAB);
                        entries.add(Blocks.GRAY_STAINED_GLASS_PANE);


                        entries.add(TintedGlassBlocks.RED_STAINED_TINTED_GLASS);
                        entries.add(TintedGlassBlocks.RED_STAINED_TINTED_GLASS_SLAB);
                        entries.add(TintedGlassBlocks.RED_STAINED_TINTED_GLASS_STAIRS);
                        entries.add(TintedGlassBlocks.RED_STAINED_TINTED_GLASS_VERTICAL_SLAB);
                        entries.add(TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS);
                        entries.add(TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS_SLAB);
                        entries.add(TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS_STAIRS);
                        entries.add(TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS_VERTICAL_SLAB);

                        entries.add(TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS);
                        entries.add(TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS_SLAB);
                        entries.add(TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS_STAIRS);
                        entries.add(TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS_VERTICAL_SLAB);
                        entries.add(TintedGlassBlocks.LIME_STAINED_TINTED_GLASS);
                        entries.add(TintedGlassBlocks.LIME_STAINED_TINTED_GLASS_SLAB);
                        entries.add(TintedGlassBlocks.LIME_STAINED_TINTED_GLASS_STAIRS);
                        entries.add(TintedGlassBlocks.LIME_STAINED_TINTED_GLASS_VERTICAL_SLAB);

                        entries.add(TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS);
                        entries.add(TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS_SLAB);
                        entries.add(TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS_STAIRS);
                        entries.add(TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS_VERTICAL_SLAB);
                        entries.add(TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS);
                        entries.add(TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS_SLAB);
                        entries.add(TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS_STAIRS);
                        entries.add(TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS_VERTICAL_SLAB);

                        entries.add(TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS);
                        entries.add(TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS_SLAB);
                        entries.add(TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS_STAIRS);
                        entries.add(TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS_VERTICAL_SLAB);
                        entries.add(TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS);
                        entries.add(TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS_SLAB);
                        entries.add(TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS_STAIRS);
                        entries.add(TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS_VERTICAL_SLAB);

                        entries.add(TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS);
                        entries.add(TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS_SLAB);
                        entries.add(TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS_STAIRS);
                        entries.add(TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS_VERTICAL_SLAB);
                        entries.add(TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS);
                        entries.add(TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS_SLAB);
                        entries.add(TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS_STAIRS);
                        entries.add(TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS_VERTICAL_SLAB);

                        entries.add(TintedGlassBlocks.PINK_STAINED_TINTED_GLASS);
                        entries.add(TintedGlassBlocks.PINK_STAINED_TINTED_GLASS_SLAB);
                        entries.add(TintedGlassBlocks.PINK_STAINED_TINTED_GLASS_STAIRS);
                        entries.add(TintedGlassBlocks.PINK_STAINED_TINTED_GLASS_VERTICAL_SLAB);
                        entries.add(TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS);
                        entries.add(TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS_SLAB);
                        entries.add(TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS_STAIRS);
                        entries.add(TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS_VERTICAL_SLAB);

                        entries.add(TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS);
                        entries.add(TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS_SLAB);
                        entries.add(TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS_STAIRS);
                        entries.add(TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS_VERTICAL_SLAB);
                        entries.add(TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS);
                        entries.add(TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS_SLAB);
                        entries.add(TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS_STAIRS);
                        entries.add(TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS_VERTICAL_SLAB);

                        entries.add(TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS);
                        entries.add(TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS_SLAB);
                        entries.add(TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS_STAIRS);
                        entries.add(TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS_VERTICAL_SLAB);
                        entries.add(TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS);
                        entries.add(TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS_SLAB);
                        entries.add(TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS_STAIRS);
                        entries.add(TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS_VERTICAL_SLAB);

                    }).build());

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