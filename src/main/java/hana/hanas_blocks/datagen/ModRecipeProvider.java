package hana.hanas_blocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import hana.hanas_blocks.block.ModBlocks;
import hana.hanas_blocks.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

//import net.minecraft.util.Identifier;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> PEARLARIUM_SMELTABLES = List.of(ModItems.RAW_PEARLARIUM,
            ModBlocks.PEARLARIUM_ORE, ModBlocks.DEEPSLATE_PEARLARIUM_ORE);
    private static final List<ItemConvertible> NIGRUM_PETRAMIUNIUM_SMELTABLES = List.of(ModItems.RAW_NIGRUM_PETRAMIUNIUM,
            ModBlocks.NIGRUM_PETRAMIUNIUM_ORE, ModBlocks.DEEPSLATE_NIGRUM_PETRAMIUNIUM_ORE);

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static CraftingRecipeJsonBuilder createHanasStairsRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6).input('#', input).pattern("#  ").pattern("## ").pattern("###");
    }
    
    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, PEARLARIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PEARLARIUM_CRYSTAL,
                0.7f, 200, "pearlarium");
        offerBlasting(exporter, PEARLARIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PEARLARIUM_CRYSTAL,
                0.7f, 100, "pearlarium");
        offerSmelting(exporter, NIGRUM_PETRAMIUNIUM_SMELTABLES, RecipeCategory.MISC, ModItems.NIGRUM_PETRAMIUNIUM_CRYSTAL,
                0.7f, 200, "nigrum_petramiunium");
        offerBlasting(exporter, NIGRUM_PETRAMIUNIUM_SMELTABLES, RecipeCategory.MISC, ModItems.NIGRUM_PETRAMIUNIUM_CRYSTAL,
                0.7f, 100, "nigrum_petramiunium");


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

        //PEARLARIUM

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PEARLARIUM_CRYSTAL, RecipeCategory.DECORATIONS,
                ModBlocks.PEARLARIUM_CRYSTAL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PEARLARIUM_ALLOY_SHEET, RecipeCategory.DECORATIONS,
                ModBlocks.PEARLARIUM_ALLOY_SHEET_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PEARLARIUM_ALLOY_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.PEARLARIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_PEARLARIUM, RecipeCategory.MISC,
                ModBlocks.RAW_PEARLARIUM_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PEARLARIUM_SLAB, ModBlocks.PEARLARIUM_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PEARLARIUM_STAIRS, ModBlocks.PEARLARIUM_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PEARLARIUM_WALL, ModBlocks.PEARLARIUM_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PEARLARIUM_SLAB, ModBlocks.PEARLARIUM_BLOCK);
        createHanasStairsRecipe(ModBlocks.PEARLARIUM_STAIRS, Ingredient.ofItems(ModBlocks.PEARLARIUM_BLOCK)).criterion(hasItem(ModBlocks.PEARLARIUM_BLOCK), 
                FabricRecipeProvider.conditionsFromItem(ModBlocks.PEARLARIUM_BLOCK)).offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PEARLARIUM_WALL, ModBlocks.PEARLARIUM_BLOCK);
                
        //NIGRUM PETRAMIUNIUM

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.NIGRUM_PETRAMIUNIUM_CRYSTAL, RecipeCategory.DECORATIONS,
                ModBlocks.NIGRUM_PETRAMIUNIUM_CRYSTAL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_SHEET, RecipeCategory.DECORATIONS,
                ModBlocks.NIGRUM_PETRAMIUNIUM_ALLOY_SHEET_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_NIGRUM_PETRAMIUNIUM, RecipeCategory.MISC,
                ModBlocks.RAW_NIGRUM_PETRAMIUNIUM_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NIGRUM_PETRAMIUNIUM_SLAB, ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NIGRUM_PETRAMIUNIUM_STAIRS, ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NIGRUM_PETRAMIUNIUM_WALL, ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NIGRUM_PETRAMIUNIUM_SLAB, ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK);
        createHanasStairsRecipe(ModBlocks.NIGRUM_PETRAMIUNIUM_STAIRS, Ingredient.ofItems(ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK)).criterion(hasItem(ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK), 
                FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK)).offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NIGRUM_PETRAMIUNIUM_WALL, ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK);

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

        //Sculk Plants
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SCULK_TENDRIL, 1)
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', ModItems.SCULK_MATERIAL)
                .criterion(hasItem(ModItems.SCULK_MATERIAL), conditionsFromItem(ModItems.SCULK_MATERIAL))
                .offerTo(exporter);
                //.offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SCULK_TENDRIL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SCULK_ROSE, 1)
                .pattern("   ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', ModItems.SCULK_MATERIAL)
                .criterion(hasItem(ModItems.SCULK_MATERIAL), conditionsFromItem(ModItems.SCULK_MATERIAL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GLOWING_SCULK_WISTERIA, 1)
                .pattern("   ")
                .pattern("  S")
                .pattern(" S ")
                .input('S', ModItems.SCULK_MATERIAL)
                .criterion(hasItem(ModItems.SCULK_MATERIAL), conditionsFromItem(ModItems.SCULK_MATERIAL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GLOWING_SCULK_WISTERIA_BUNDLE, 1)
                .pattern("   ")
                .pattern("S S")
                .pattern(" S ")
                .input('S', ModItems.SCULK_MATERIAL)
                .criterion(hasItem(ModItems.SCULK_MATERIAL), conditionsFromItem(ModItems.SCULK_MATERIAL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SCULK_FLORA, 1)
                .pattern("   ")
                .pattern("   ")
                .pattern(" S ")
                .input('S', ModItems.SCULK_MATERIAL)
                .criterion(hasItem(ModItems.SCULK_MATERIAL), conditionsFromItem(ModItems.SCULK_MATERIAL))
                .offerTo(exporter);
                //.offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SCULK_FLORA)));

    }
}