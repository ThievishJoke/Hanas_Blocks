package hana.hanas_blocks.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent Tomato = new FoodComponent.Builder()
            .nutrition(2).saturationModifier(0.25f).build();
    public static final FoodComponent Buns = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.6f).build();
    public static final FoodComponent Tomato_Bread = new FoodComponent.Builder()
            .nutrition(7).saturationModifier(0.9f).build();
    public static final FoodComponent Hamburger = new FoodComponent.Builder()
            .nutrition(9).saturationModifier(1.3f).build();

}