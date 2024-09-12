package hana.hanas_blocks.enchantment;


import hana.hanas_blocks.HanasBlocks;
import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentLevelBasedValue;
import net.minecraft.enchantment.effect.*;
import net.minecraft.enchantment.effect.entity.DamageEntityEnchantmentEffect;
import net.minecraft.enchantment.effect.entity.DamageItemEnchantmentEffect;
import net.minecraft.enchantment.effect.entity.SummonEntityEnchantmentEffect;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.item.Item;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.provider.number.EnchantmentLevelLootNumberProvider;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.command.EnchantCommand;
import net.minecraft.server.command.SummonCommand;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;

import java.util.Objects;
//todo get the enchantment working
public class ModEnchantments {
    public static final Enchantment.Builder FROST_THORN = new Enchantment.Builder(Enchantment.definition(
            getOrThrow(ItemTags.CHEST_ARMOR_ENCHANTABLE),
            1,
            5,
            Enchantment.constantCost(50),
            Enchantment.constantCost(75),
            8,
            AttributeModifierSlot.CHEST)
    ).addEffect(
            EnchantmentEffectComponentTypes.POST_ATTACK,
            EnchantmentEffectTarget.VICTIM,
            EnchantmentEffectTarget.ATTACKER,
            AllOfEnchantmentEffects.allOf(
                    new DamageEntityEnchantmentEffect(
                            EnchantmentLevelBasedValue.constant(1.0F), EnchantmentLevelBasedValue.constant(5.0F), getOrThrow(DamageTypes.THORNS)
                    ),
                    new DamageItemEnchantmentEffect(EnchantmentLevelBasedValue.constant(2.0F))
            ),
            RandomChanceLootCondition.builder(EnchantmentLevelLootNumberProvider.create(EnchantmentLevelBasedValue.linear(0.15F))))
    .addEffect(
            EnchantmentEffectComponentTypes.ATTRIBUTES,
            new AttributeEnchantmentEffect(
                    Identifier.ofVanilla("enchantment.slowness"),
                    EntityAttributes.GENERIC_MOVEMENT_SPEED,
                    EnchantmentLevelBasedValue.linear(1.0F),
                    EntityAttributeModifier.Operation.ADD_VALUE
            )

    );
    //SummonCommand.summon(Objects.requireNonNull(EntityType.AREA_EFFECT_CLOUD.spawn()))
    private static RegistryEntry<DamageType> getOrThrow(RegistryKey<DamageType> thorns) {
        return null;
    }

    private static TagKey<Item> chestArmorEnchantable;

    private static RegistryEntryList<Item> getOrThrow(TagKey<Item> chestArmorEnchantable) {
        return null;
    }

    private static RegistryKey<Enchantment> of(String name) {
        return RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(HanasBlocks.MOD_ID, "hanas_blocks"));
    }

    public static void registerModEnchantments() {
        HanasBlocks.LOGGER.info("Registering ModEnchantments for " + HanasBlocks.MOD_ID);
    }
}