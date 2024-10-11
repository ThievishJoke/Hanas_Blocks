package hana.hanas_blocks.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.input.RecipeInput;

import java.util.List;

public record SculkTableRecipeInput(List<ItemStack> inputs) implements RecipeInput {
    @Override
    public ItemStack getStackInSlot(int slot) {
        return inputs.get(slot);
    }

    @Override
    public int getSize() {
        return inputs.size();
    }
}