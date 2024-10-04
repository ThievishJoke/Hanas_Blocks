package hana.hanas_blocks.enchantment;


import hana.hanas_blocks.HanasBlocks;
import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentLevelBasedValue;
import net.minecraft.enchantment.effect.AllOfEnchantmentEffects;
import net.minecraft.enchantment.effect.AttributeEnchantmentEffect;
import net.minecraft.enchantment.effect.EnchantmentEffectTarget;
import net.minecraft.enchantment.effect.entity.DamageItemEnchantmentEffect;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.item.Item;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.provider.number.EnchantmentLevelLootNumberProvider;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;


//todo get the enchantment working
public final class ModEnchantments {
    public static final RegistryKey<Enchantment> FROST_THORN = of("frost_thorn");
    public static void bootstrap(Registerable<Enchantment> registry) {
    }

    private static RegistryEntryList<Item> getOrThrow(TagKey<Item> chestArmorEnchantable) {
        return null;
    }

    private static RegistryEntryList<Item> getOrThrow(RegistryKey<DamageType> thorns) {
        return null;
    }

    private static RegistryKey<Enchantment> of(String name) {
        return RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(HanasBlocks.MOD_ID, name));
    }

    public static void registerModEnchantments() {
        HanasBlocks.LOGGER.info("Registering ModEnchantments for " + HanasBlocks.MOD_ID);
    }
}