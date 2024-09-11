package hana.hanas_blocks.compat;

//import hana.hanas_blocks.block.ModBlocks;
//import hana.hanas_blocks.recipe.SculkTableRecipe;
//import hana.hanas_blocks.screen.SculkTableScreen;
//import me.shedaniel.math.Rectangle;
//import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
//import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
//import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
//import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
//import me.shedaniel.rei.api.common.util.EntryStacks;
//
//
//public class HanasBlocksModREIClientPlugin implements REIClientPlugin {
//    @Override
//    public void registerCategories(CategoryRegistry registry) {
//        registry.add(new SculkTableCategory());
//
//        registry.addWorkstations(SculkTableCategory.SCULK_TABLE, EntryStacks.of(ModBlocks.SCULK_TABLE));
//    }
//
//    @Override
//    public void registerDisplays(DisplayRegistry registry) {
//        registry.registerRecipeFiller(SculkTableRecipe.class, SculkTableRecipe.Type.INSTANCE,
//                SculkTableDisplay::new);
//    }
//
//    @Override
//    public void registerScreens(ScreenRegistry registry) {
//        registry.registerClickArea(screen -> new Rectangle(75, 30, 20, 30), SculkTableScreen.class,
//                SculkTableCategory.SCULK_TABLE);
//    }
//}
