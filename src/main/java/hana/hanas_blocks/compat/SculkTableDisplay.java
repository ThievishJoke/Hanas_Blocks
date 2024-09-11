package hana.hanas_blocks.compat;

//import hana.hanas_blocks.recipe.SculkTableRecipe;
//import me.shedaniel.rei.api.common.category.CategoryIdentifier;
//import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
//import me.shedaniel.rei.api.common.entry.EntryIngredient;
//import me.shedaniel.rei.api.common.util.EntryIngredients;
//import me.shedaniel.rei.api.common.util.EntryStacks;
//import net.minecraft.recipe.RecipeEntry;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class SculkTableDisplay extends BasicDisplay {
//    public SculkTableDisplay(List<EntryIngredient> inputs, List<EntryIngredient> outputs) {
//        super(inputs, outputs);
//    }
//
//    public SculkTableDisplay(RecipeEntry<SculkTableRecipe> recipe ) {
//        super(getInputList(recipe.value()), List.of(EntryIngredient.of(EntryStacks.of(recipe.value().getResult(null)))));
//    }
//
//    private static List<EntryIngredient> getInputList(SculkTableRecipe recipe) {
//        if(recipe == null) return Collections.emptyList();
//        List<EntryIngredient> list = new ArrayList<>();
//        list.add(EntryIngredients.ofIngredient(recipe.getIngredients().get(0)));
//        return list;
//    }
//
//    @Override
//    public CategoryIdentifier<?> getCategoryIdentifier() {
//        return SculkTableCategory.SCULK_TABLE;
//    }
//}
