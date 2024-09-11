package hana.hanas_blocks.enchantment;

import hana.hanas_blocks.HanasBlocks;
import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.effect.AttributeEnchantmentEffect;
import net.minecraft.enchantment.effect.EnchantmentEffectTarget;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModEnchantments {
    private static List<Object> Enchantments;
    //public static final RegistryKey<Enchantment> LUCKY = Enchantment
    //        .builder(Enchantment.definition(ItemTags.WEAPON_ENCHANTABLE), 2, 3, Enchantment.leveledCost(10,10),
    //                Enchantment.leveledCost(25, 10), 4, AttributeModifierSlot.MAINHAND)
    //        .addEffect(EnchantmentEffectComponentTypes.ATTRIBUTES, new AttributeEnchantmentEffect(Identifier.ofVanilla("")));
    //public static Enchantment LUCKY =
    /*
    public static Enchantment LIGHTNING_STRIKER = registerEnchantment("lightning_striker",
        new LightningStrikerEnchantment(Enchantment.builder(Enchantment.definition(Rarity.EPIC,
            EnchantmentEffectTarget.DAMAGING_ENTITY, WEAPON_ENCHANTABLE, EquipmentSlot.MAINHAND))));
    public static Enchantment FROST_THORN = registerEnchantment("frost_thorn",
        new FrostThornEnchantment(Enchantment.builder(Enchantment.definition(Rarity.EPIC,
            EnchantmentEffectTarget.ATTACKER, CHEST_ARMOR_ENCHANTABLE, EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET)));

    //public static Enchantment RAPID_FIRE = registerEnchantment("rapid_fire",

    //        new RapidFireEnchantment(Enchantment.Rarity.VERY_RARE,
    //        EnchantmentTarget.CROSSBOW, EquipmentSlot.MAINHAND));

    private static Enchantment registerEnchantment(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, Identifier.of(HanasBlocks.MOD_ID, name), enchantment);
    }
    */
    public static void registerModEnchantments() {
        HanasBlocks.LOGGER.info("Registering Mod Enchantments for " + HanasBlocks.MOD_ID);
    }
}