package hana.hanas_blocks.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;

public interface ModRecipeSerializer extends RecipeSerializer<SculkTableRecipe> {
    public static final MapCodec<SculkTableRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
            Codec.list(Ingredient.DISALLOW_EMPTY_CODEC).fieldOf("ingredient").forGetter(SculkTableRecipe::inputItems),
            ItemStack.CODEC.fieldOf("result").forGetter(SculkTableRecipe::output),
            Codec.INT.fieldOf("count").forGetter(SculkTableRecipe::count),
            Codec.FLOAT.fieldOf("experience").forGetter(SculkTableRecipe::experience),
            Codec.INT.fieldOf("cookingtime").forGetter(SculkTableRecipe::cookingTime)
    ).apply(inst, SculkTableRecipe::new));

    @Override
    public default MapCodec<SculkTableRecipe> codec() {
        return CODEC;
    }

    @Override
    public default PacketCodec<RegistryByteBuf, SculkTableRecipe> packetCodec() {
        return null;
    }
}