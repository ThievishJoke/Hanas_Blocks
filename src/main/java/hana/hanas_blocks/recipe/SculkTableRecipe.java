package hana.hanas_blocks.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.*;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.world.World;

import java.util.List;

public record SculkTableRecipe(List<Ingredient> inputItems, ItemStack output, int count, float experience, int cookingTime) implements Recipe<SculkTableRecipeInput> {
    @Override
    public DefaultedList<Ingredient> getIngredients() {
        return (DefaultedList<Ingredient>) inputItems; // Return the DefaultedList directly
    }

    @Override
    public boolean matches(SculkTableRecipeInput input, World world) {
        if (world.isClient()) {
            return false;
        }

        // Check if all ingredients match
        return inputItems.stream().allMatch(ingredient -> ingredient.test(input.getStackInSlot(0)));
    }

    @Override
    public ItemStack craft(SculkTableRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResult(RegistryWrapper.WrapperLookup registriesLookup) {
        return output;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.SCULK_TABLE_SERIALIZER;
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.SCULK_TABLE_TYPE;
    }
}