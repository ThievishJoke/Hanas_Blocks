package net.hana.hanas_blocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hana.hanas_blocks.block.ConcreteBlocks;
import net.hana.hanas_blocks.block.GlassBlocks;
import net.hana.hanas_blocks.block.ModBlocks;
import net.hana.hanas_blocks.block.TintedGlassBlocks;
import net.hana.hanas_blocks.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static CraftingRecipeJsonBuilder createHanasStairsRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .input('#', input)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###");
    }

    public static CraftingRecipeJsonBuilder createHanasTintedRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 8)
                .input('#', Blocks.TINTED_GLASS)
                .input('D', input)
                .pattern("###")
                .pattern("#D#")
                .pattern("###");
    }

    public static CraftingRecipeJsonBuilder createHanasVerticalWoodRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .input('#', input)
                .pattern("#  ")
                .pattern("#  ")
                .pattern("#  ");
    }
    
    @Override
    public void generate(RecipeExporter exporter) {

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CHARCOAL, RecipeCategory.DECORATIONS,
                ModBlocks.CHARCOAL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SCRAP_SHEET, RecipeCategory.DECORATIONS,
                ModBlocks.SCRAP_SHEET_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COPPER_SHEET, RecipeCategory.DECORATIONS,
                ModBlocks.COPPER_SHEET_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.IRON_SHEET, RecipeCategory.DECORATIONS,
                ModBlocks.IRON_SHEET_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GOLD_SHEET, RecipeCategory.DECORATIONS,
                ModBlocks.GOLD_SHEET_BLOCK);

        // Concrete

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.RED_CONCRETE_VERTICAL_SLAB, Blocks.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.ORANGE_CONCRETE_VERTICAL_SLAB, Blocks.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.YELLOW_CONCRETE_VERTICAL_SLAB, Blocks.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.LIME_CONCRETE_VERTICAL_SLAB, Blocks.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.GREEN_CONCRETE_VERTICAL_SLAB, Blocks.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.CYAN_CONCRETE_VERTICAL_SLAB, Blocks.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.LIGHT_BLUE_CONCRETE_VERTICAL_SLAB, Blocks.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.BLUE_CONCRETE_VERTICAL_SLAB, Blocks.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.PURPLE_CONCRETE_VERTICAL_SLAB, Blocks.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.MAGENTA_CONCRETE_VERTICAL_SLAB, Blocks.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.PINK_CONCRETE_VERTICAL_SLAB, Blocks.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.BROWN_CONCRETE_VERTICAL_SLAB, Blocks.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.BLACK_CONCRETE_VERTICAL_SLAB, Blocks.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.WHITE_CONCRETE_VERTICAL_SLAB, Blocks.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.LIGHT_GRAY_CONCRETE_VERTICAL_SLAB, Blocks.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.GRAY_CONCRETE_VERTICAL_SLAB, Blocks.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ConcreteBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);

        // Glass
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.GLASS_STAIRS, Blocks.GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.GLASS_SLAB, Blocks.GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.GLASS_VERTICAL_SLAB, Blocks.GLASS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.RED_STAINED_GLASS_STAIRS, Blocks.RED_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.RED_STAINED_GLASS_SLAB, Blocks.RED_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.RED_STAINED_GLASS_VERTICAL_SLAB, Blocks.RED_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.ORANGE_STAINED_GLASS_STAIRS, Blocks.ORANGE_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.ORANGE_STAINED_GLASS_SLAB, Blocks.ORANGE_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.ORANGE_STAINED_GLASS_VERTICAL_SLAB, Blocks.ORANGE_STAINED_GLASS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.YELLOW_STAINED_GLASS_STAIRS, Blocks.YELLOW_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.YELLOW_STAINED_GLASS_SLAB, Blocks.YELLOW_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.YELLOW_STAINED_GLASS_VERTICAL_SLAB, Blocks.YELLOW_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.LIME_STAINED_GLASS_STAIRS, Blocks.LIME_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.LIME_STAINED_GLASS_SLAB, Blocks.LIME_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.LIME_STAINED_GLASS_VERTICAL_SLAB, Blocks.LIME_STAINED_GLASS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.GREEN_STAINED_GLASS_STAIRS, Blocks.GREEN_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.GREEN_STAINED_GLASS_SLAB, Blocks.GREEN_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.GREEN_STAINED_GLASS_VERTICAL_SLAB, Blocks.GREEN_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.CYAN_STAINED_GLASS_STAIRS, Blocks.CYAN_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.CYAN_STAINED_GLASS_SLAB, Blocks.CYAN_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.CYAN_STAINED_GLASS_VERTICAL_SLAB, Blocks.CYAN_STAINED_GLASS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, Blocks.LIGHT_BLUE_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, Blocks.LIGHT_BLUE_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.LIGHT_BLUE_STAINED_GLASS_VERTICAL_SLAB, Blocks.LIGHT_BLUE_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.BLUE_STAINED_GLASS_STAIRS, Blocks.BLUE_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.BLUE_STAINED_GLASS_SLAB, Blocks.BLUE_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.BLUE_STAINED_GLASS_VERTICAL_SLAB, Blocks.BLUE_STAINED_GLASS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.PURPLE_STAINED_GLASS_STAIRS, Blocks.PURPLE_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.PURPLE_STAINED_GLASS_SLAB, Blocks.PURPLE_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.PURPLE_STAINED_GLASS_VERTICAL_SLAB, Blocks.PURPLE_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.MAGENTA_STAINED_GLASS_STAIRS, Blocks.MAGENTA_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.MAGENTA_STAINED_GLASS_SLAB, Blocks.MAGENTA_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.MAGENTA_STAINED_GLASS_VERTICAL_SLAB, Blocks.MAGENTA_STAINED_GLASS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.PINK_STAINED_GLASS_STAIRS, Blocks.PINK_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.PINK_STAINED_GLASS_SLAB, Blocks.PINK_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.PINK_STAINED_GLASS_VERTICAL_SLAB, Blocks.PINK_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.BROWN_STAINED_GLASS_STAIRS, Blocks.BROWN_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.BROWN_STAINED_GLASS_SLAB, Blocks.BROWN_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.BROWN_STAINED_GLASS_VERTICAL_SLAB, Blocks.BROWN_STAINED_GLASS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.BLACK_STAINED_GLASS_STAIRS, Blocks.BLACK_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.BLACK_STAINED_GLASS_SLAB, Blocks.BLACK_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.BLACK_STAINED_GLASS_VERTICAL_SLAB, Blocks.BLACK_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.WHITE_STAINED_GLASS_STAIRS, Blocks.WHITE_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.WHITE_STAINED_GLASS_SLAB, Blocks.WHITE_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.WHITE_STAINED_GLASS_VERTICAL_SLAB, Blocks.WHITE_STAINED_GLASS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, Blocks.LIGHT_GRAY_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, Blocks.LIGHT_GRAY_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.LIGHT_GRAY_STAINED_GLASS_VERTICAL_SLAB, Blocks.LIGHT_GRAY_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.GRAY_STAINED_GLASS_STAIRS, Blocks.GRAY_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.GRAY_STAINED_GLASS_SLAB, Blocks.GRAY_STAINED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, GlassBlocks.GRAY_STAINED_GLASS_VERTICAL_SLAB, Blocks.GRAY_STAINED_GLASS);

        // tinted glass
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.TINTED_GLASS_STAIRS, Blocks.TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.TINTED_GLASS_SLAB, Blocks.TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.TINTED_GLASS_VERTICAL_SLAB, Blocks.TINTED_GLASS);

        createHanasTintedRecipe(TintedGlassBlocks.RED_STAINED_TINTED_GLASS, Ingredient.ofItems(Items.RED_DYE)).criterion(hasItem(Items.RED_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.RED_DYE)).offerTo(exporter);
        createHanasTintedRecipe(TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS, Ingredient.ofItems(Items.ORANGE_DYE)).criterion(hasItem(Items.ORANGE_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.ORANGE_DYE)).offerTo(exporter);
        createHanasTintedRecipe(TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS, Ingredient.ofItems(Items.YELLOW_DYE)).criterion(hasItem(Items.YELLOW_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.YELLOW_DYE)).offerTo(exporter);
        createHanasTintedRecipe(TintedGlassBlocks.LIME_STAINED_TINTED_GLASS, Ingredient.ofItems(Items.LIME_DYE)).criterion(hasItem(Items.LIME_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.LIME_DYE)).offerTo(exporter);

        createHanasTintedRecipe(TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS, Ingredient.ofItems(Items.GREEN_DYE)).criterion(hasItem(Items.GREEN_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.GREEN_DYE)).offerTo(exporter);
        createHanasTintedRecipe(TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS, Ingredient.ofItems(Items.CYAN_DYE)).criterion(hasItem(Items.CYAN_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.CYAN_DYE)).offerTo(exporter);
        createHanasTintedRecipe(TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS, Ingredient.ofItems(Items.LIGHT_BLUE_DYE)).criterion(hasItem(Items.LIGHT_BLUE_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_DYE)).offerTo(exporter);
        createHanasTintedRecipe(TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS, Ingredient.ofItems(Items.BLUE_DYE)).criterion(hasItem(Items.BLUE_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.BLUE_DYE)).offerTo(exporter);

        createHanasTintedRecipe(TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS, Ingredient.ofItems(Items.PURPLE_DYE)).criterion(hasItem(Items.PURPLE_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.PURPLE_DYE)).offerTo(exporter);
        createHanasTintedRecipe(TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS, Ingredient.ofItems(Items.MAGENTA_DYE)).criterion(hasItem(Items.MAGENTA_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.MAGENTA_DYE)).offerTo(exporter);
        createHanasTintedRecipe(TintedGlassBlocks.PINK_STAINED_TINTED_GLASS, Ingredient.ofItems(Items.PINK_DYE)).criterion(hasItem(Items.PINK_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE)).offerTo(exporter);
        createHanasTintedRecipe(TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS, Ingredient.ofItems(Items.BROWN_DYE)).criterion(hasItem(Items.BROWN_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.BROWN_DYE)).offerTo(exporter);

        createHanasTintedRecipe(TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS, Ingredient.ofItems(Items.BLACK_DYE)).criterion(hasItem(Items.BLACK_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.BLACK_DYE)).offerTo(exporter);
        createHanasTintedRecipe(TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS, Ingredient.ofItems(Items.WHITE_DYE)).criterion(hasItem(Items.WHITE_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.WHITE_DYE)).offerTo(exporter);
        createHanasTintedRecipe(TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS, Ingredient.ofItems(Items.LIGHT_GRAY_DYE)).criterion(hasItem(Items.LIGHT_GRAY_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.LIGHT_GRAY_DYE)).offerTo(exporter);
        createHanasTintedRecipe(TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS, Ingredient.ofItems(Items.GRAY_DYE)).criterion(hasItem(Items.GRAY_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.GRAY_DYE)).offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.RED_STAINED_TINTED_GLASS_STAIRS, TintedGlassBlocks.RED_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.RED_STAINED_TINTED_GLASS_SLAB, TintedGlassBlocks.RED_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.RED_STAINED_TINTED_GLASS_VERTICAL_SLAB, TintedGlassBlocks.RED_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS_STAIRS, TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS_SLAB, TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS_VERTICAL_SLAB, TintedGlassBlocks.ORANGE_STAINED_TINTED_GLASS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS_STAIRS, TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS_SLAB, TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS_VERTICAL_SLAB, TintedGlassBlocks.YELLOW_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.LIME_STAINED_TINTED_GLASS_STAIRS, TintedGlassBlocks.LIME_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.LIME_STAINED_TINTED_GLASS_SLAB, TintedGlassBlocks.LIME_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.LIME_STAINED_TINTED_GLASS_VERTICAL_SLAB, TintedGlassBlocks.LIME_STAINED_TINTED_GLASS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS_STAIRS, TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS_SLAB, TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS_VERTICAL_SLAB, TintedGlassBlocks.GREEN_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS_STAIRS, TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS_SLAB, TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS_VERTICAL_SLAB, TintedGlassBlocks.CYAN_STAINED_TINTED_GLASS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS_STAIRS, TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS_SLAB, TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS_VERTICAL_SLAB, TintedGlassBlocks.LIGHT_BLUE_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS_STAIRS, TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS_SLAB, TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS_VERTICAL_SLAB, TintedGlassBlocks.BLUE_STAINED_TINTED_GLASS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS_STAIRS, TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS_SLAB, TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS_VERTICAL_SLAB, TintedGlassBlocks.PURPLE_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS_STAIRS, TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS_SLAB, TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS_VERTICAL_SLAB, TintedGlassBlocks.MAGENTA_STAINED_TINTED_GLASS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.PINK_STAINED_TINTED_GLASS_STAIRS, TintedGlassBlocks.PINK_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.PINK_STAINED_TINTED_GLASS_SLAB, TintedGlassBlocks.PINK_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.PINK_STAINED_TINTED_GLASS_VERTICAL_SLAB, TintedGlassBlocks.PINK_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS_STAIRS, TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS_SLAB, TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS_VERTICAL_SLAB, TintedGlassBlocks.BROWN_STAINED_TINTED_GLASS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS_STAIRS, TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS_SLAB, TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS_VERTICAL_SLAB, TintedGlassBlocks.BLACK_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS_STAIRS, TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS_SLAB, TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS_VERTICAL_SLAB, TintedGlassBlocks.WHITE_STAINED_TINTED_GLASS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS_STAIRS, TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS_SLAB, TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS_VERTICAL_SLAB, TintedGlassBlocks.LIGHT_GRAY_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS_STAIRS, TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS_SLAB, TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS_VERTICAL_SLAB, TintedGlassBlocks.GRAY_STAINED_TINTED_GLASS);

        //HoneyComb
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.HONEY_COMB_BRICK_SLAB, ModBlocks.HONEY_COMB_BRICKS);
        createHanasStairsRecipe(ModBlocks.HONEY_COMB_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.HONEY_COMB_BRICKS)).criterion(hasItem(ModBlocks.HONEY_COMB_BRICKS),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.HONEY_COMB_BRICKS)).offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.HONEY_COMB_BRICK_WALL, ModBlocks.HONEY_COMB_BRICKS);

        //PRISMARINE
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_PRISMARINE, Blocks.PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_PRISMARINE_SLAB, Blocks.PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_PRISMARINE_STAIRS, Blocks.PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_PRISMARINE_WALL, Blocks.PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_PRISMARINE_SLAB, ModBlocks.POLISHED_PRISMARINE_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_PRISMARINE_STAIRS, ModBlocks.POLISHED_PRISMARINE_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_PRISMARINE_WALL, ModBlocks.POLISHED_PRISMARINE_WALL);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_PRISMARINE_SLAB, ModBlocks.POLISHED_PRISMARINE);
        createHanasStairsRecipe(ModBlocks.POLISHED_PRISMARINE_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_PRISMARINE)).criterion(hasItem(ModBlocks.POLISHED_PRISMARINE), 
                FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_PRISMARINE)).offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_PRISMARINE_WALL, ModBlocks.POLISHED_PRISMARINE);

        //NETHERRACK
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_BRICK, Blocks.NETHERRACK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_BRICK_SLAB, Blocks.NETHERRACK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_BRICK_STAIRS, Blocks.NETHERRACK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_BRICK_WALL, Blocks.NETHERRACK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_BRICK_SLAB, ModBlocks.NETHERRACK_BRICK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_BRICK_STAIRS, ModBlocks.NETHERRACK_BRICK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_BRICK_WALL, ModBlocks.NETHERRACK_BRICK);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_BRICK_SLAB, ModBlocks.NETHERRACK_BRICK);
        createHanasStairsRecipe(ModBlocks.NETHERRACK_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.NETHERRACK_BRICK)).criterion(hasItem(ModBlocks.NETHERRACK_BRICK), 
                FabricRecipeProvider.conditionsFromItem(ModBlocks.NETHERRACK_BRICK)).offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_BRICK_WALL, ModBlocks.NETHERRACK_BRICK);

        //END STONE
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_END_STONE, Blocks.END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_END_STONE_SLAB, Blocks.END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_END_STONE_STAIRS, Blocks.END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_END_STONE_WALL, Blocks.END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.NETHERRACK_BRICK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_END_STONE_STAIRS, ModBlocks.NETHERRACK_BRICK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_END_STONE_WALL, ModBlocks.NETHERRACK_BRICK);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.POLISHED_END_STONE);
        createHanasStairsRecipe(ModBlocks.POLISHED_END_STONE_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_END_STONE)).criterion(hasItem(ModBlocks.POLISHED_END_STONE), 
                FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_END_STONE)).offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_END_STONE_WALL, ModBlocks.POLISHED_END_STONE);

        // Vertical slabs
        createHanasVerticalWoodRecipe(ModBlocks.OAK_VERTICAL_SLAB, Ingredient.ofItems(Blocks.OAK_PLANKS)).criterion(hasItem(Blocks.OAK_PLANKS),
                FabricRecipeProvider.conditionsFromItem(Blocks.OAK_PLANKS)).offerTo(exporter);
        createHanasVerticalWoodRecipe(ModBlocks.SPRUCE_VERTICAL_SLAB, Ingredient.ofItems(Blocks.SPRUCE_PLANKS)).criterion(hasItem(Blocks.SPRUCE_PLANKS),
                FabricRecipeProvider.conditionsFromItem(Blocks.SPRUCE_PLANKS)).offerTo(exporter);
        createHanasVerticalWoodRecipe(ModBlocks.BIRCH_VERTICAL_SLAB, Ingredient.ofItems(Blocks.BIRCH_PLANKS)).criterion(hasItem(Blocks.BIRCH_PLANKS),
                FabricRecipeProvider.conditionsFromItem(Blocks.BIRCH_PLANKS)).offerTo(exporter);
        createHanasVerticalWoodRecipe(ModBlocks.JUNGLE_VERTICAL_SLAB, Ingredient.ofItems(Blocks.JUNGLE_PLANKS)).criterion(hasItem(Blocks.JUNGLE_PLANKS),
                FabricRecipeProvider.conditionsFromItem(Blocks.JUNGLE_PLANKS)).offerTo(exporter);
        createHanasVerticalWoodRecipe(ModBlocks.ACACIA_VERTICAL_SLAB, Ingredient.ofItems(Blocks.ACACIA_PLANKS)).criterion(hasItem(Blocks.ACACIA_PLANKS),
                FabricRecipeProvider.conditionsFromItem(Blocks.ACACIA_PLANKS)).offerTo(exporter);
        createHanasVerticalWoodRecipe(ModBlocks.DARK_OAK_VERTICAL_SLAB, Ingredient.ofItems(Blocks.DARK_OAK_PLANKS)).criterion(hasItem(Blocks.DARK_OAK_PLANKS),
                FabricRecipeProvider.conditionsFromItem(Blocks.DARK_OAK_PLANKS)).offerTo(exporter);
        createHanasVerticalWoodRecipe(ModBlocks.MANGROVE_VERTICAL_SLAB, Ingredient.ofItems(Blocks.MANGROVE_PLANKS)).criterion(hasItem(Blocks.MANGROVE_PLANKS),
                FabricRecipeProvider.conditionsFromItem(Blocks.MANGROVE_PLANKS)).offerTo(exporter);
        createHanasVerticalWoodRecipe(ModBlocks.CHERRY_VERTICAL_SLAB, Ingredient.ofItems(Blocks.CHERRY_PLANKS)).criterion(hasItem(Blocks.CHERRY_PLANKS),
                FabricRecipeProvider.conditionsFromItem(Blocks.CHERRY_PLANKS)).offerTo(exporter);
        createHanasVerticalWoodRecipe(ModBlocks.BAMBOO_VERTICAL_SLAB, Ingredient.ofItems(Blocks.BAMBOO_PLANKS)).criterion(hasItem(Blocks.BAMBOO_PLANKS),
                FabricRecipeProvider.conditionsFromItem(Blocks.BAMBOO_PLANKS)).offerTo(exporter);
        createHanasVerticalWoodRecipe(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB, Ingredient.ofItems(Blocks.BAMBOO_MOSAIC)).criterion(hasItem(Blocks.BAMBOO_MOSAIC),
                FabricRecipeProvider.conditionsFromItem(Blocks.BAMBOO_MOSAIC)).offerTo(exporter);
        createHanasVerticalWoodRecipe(ModBlocks.CRIMSON_VERTICAL_SLAB, Ingredient.ofItems(Blocks.CRIMSON_PLANKS)).criterion(hasItem(Blocks.CRIMSON_PLANKS),
                FabricRecipeProvider.conditionsFromItem(Blocks.CRIMSON_PLANKS)).offerTo(exporter);
        createHanasVerticalWoodRecipe(ModBlocks.WARPED_VERTICAL_SLAB, Ingredient.ofItems(Blocks.WARPED_PLANKS)).criterion(hasItem(Blocks.WARPED_PLANKS),
                FabricRecipeProvider.conditionsFromItem(Blocks.WARPED_PLANKS)).offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_VERTICAL_SLAB, Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLESTONE_VERTICAL_SLAB, Blocks.COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, Blocks.MOSSY_COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, Blocks.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_VERTICAL_SLAB, Blocks.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, Blocks.MOSSY_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_VERTICAL_SLAB, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_VERTICAL_SLAB, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_VERTICAL_SLAB, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, Blocks.COBBLED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, Blocks.POLISHED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, Blocks.DEEPSLATE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, Blocks.DEEPSLATE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_VERTICAL_SLAB, Blocks.TUFF);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_TUFF_VERTICAL_SLAB, Blocks.POLISHED_TUFF);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICK_VERTICAL_SLAB, Blocks.TUFF_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICK_VERTICAL_SLAB, Blocks.BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_BRICK_VERTICAL_SLAB, Blocks.MUD_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_VERTICAL_SLAB, Blocks.SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB, Blocks.SMOOTH_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, Blocks.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_VERTICAL_SLAB, Blocks.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, Blocks.SMOOTH_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, Blocks.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_VERTICAL_SLAB, Blocks.PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB, Blocks.PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, Blocks.DARK_PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHER_BRICK_VERTICAL_SLAB, Blocks.NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, Blocks.RED_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_VERTICAL_SLAB, Blocks.BLACKSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, Blocks.POLISHED_BLACKSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, Blocks.POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, Blocks.END_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_VERTICAL_SLAB, Blocks.PURPUR_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_VERTICAL_SLAB, Blocks.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, Blocks.SMOOTH_QUARTZ);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COPPER_VERTICAL_SLAB, Blocks.CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, Blocks.EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, Blocks.WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Blocks.OXIDIZED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, Blocks.WAXED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, Blocks.WAXED_EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, Blocks.WAXED_WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Blocks.WAXED_OXIDIZED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, Blocks.DEEPSLATE);
        //offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_VERTICAL_SLAB, Blocks.DRIPSTONE_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB, ModBlocks.ANCIENT_NETHERITE_BRICK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DULL_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB, ModBlocks.DULL_ANCIENT_NETHERITE_BRICK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB, ModBlocks.TARNISHED_ANCIENT_NETHERITE_BRICK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB, ModBlocks.RUINED_ANCIENT_NETHERITE_BRICK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB, ModBlocks.SEALED_ANCIENT_NETHERITE_BRICK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB, ModBlocks.SEALED_DULL_ANCIENT_NETHERITE_BRICK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB, ModBlocks.SEALED_TARNISHED_ANCIENT_NETHERITE_BRICK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK_VERTICAL_SLAB, ModBlocks.SEALED_RUINED_ANCIENT_NETHERITE_BRICK);

    }
}