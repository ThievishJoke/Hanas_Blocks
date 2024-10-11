package hana.hanas_blocks.recipe;

import com.mojang.serialization.MapCodec;
import hana.hanas_blocks.HanasBlocks;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {

    public static final RecipeSerializer<SculkTableRecipe> SCULK_TABLE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(HanasBlocks.MOD_ID, "sculk_table"), new ModRecipeSerializer() {});

    public static final RecipeType<SculkTableRecipe> SCULK_TABLE_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(HanasBlocks.MOD_ID, "material_sckulking"), new RecipeType<>() {
                @Override
                public String toString() {
                    return "material_sckulking";
                }
            });

    public static void registerRecipes() {
        HanasBlocks.LOGGER.info("Registering Custom Recipes for " + HanasBlocks.MOD_ID);
    }
}