package hana.hanas_blocks.enchantment;

import net.fabricmc.fabric.api.entity.FakePlayer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.effect.EnchantmentEffectTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.Map;

public class FrostThornEnchantment extends Enchantments {

    public FrostThornEnchantment(Rarity weight, EnchantmentEffectTarget attacker, EquipmentSlot... slotTypes) {
        super();
    }
    /*
    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        if (stack.getItem() instanceof ArmorItem) {
            return true;
        }
        return super.isAcceptableItem(stack);
    }

    @Override
    public void attacker(LivingEntity user, Entity attacker, int level) {
        Random random = user.getRandom();
        Map.Entry<EquipmentSlot, ItemStack> entry = EnchantmentHelper.chooseEquipmentWith(ModEnchantments.FROST_THORN, user);
        if(!user.getWorld().isClient()) {
            //ServerWorld world = (ServerWorld)user.getWorld();
            //BlockPos position = user.getBlockPos();
            //ParticleEffect b = getParticles();

            //EntityType.AREA_EFFECT_CLOUD.spawn(world, (NbtCompound) b, null, position,
            //        SpawnReason.TRIGGERED, true, true);

            if(level == 1) {
                if (attacker instanceof LivingEntity ent && !(attacker instanceof FakePlayer)) {
                    ent.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 250, level, false, true, true));
                    attacker.damage(user.getDamageSources().thorns(user), FrostThornEnchantment.getDamageAmount(level, random));
                }
            }
            if(level == 2) {
                if (attacker instanceof LivingEntity ent && !(attacker instanceof FakePlayer)) {
                    ent.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 500, level = level - 1, false, true, true));
                    attacker.damage(user.getDamageSources().thorns(user), FrostThornEnchantment.getDamageAmount(level, random));
                    }
            }
            if(level == 3) {
                if (attacker instanceof LivingEntity ent && !(attacker instanceof FakePlayer)) {
                    ent.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 750, level = level - 1, false, true, true));
                    attacker.damage(user.getDamageSources().thorns(user), FrostThornEnchantment.getDamageAmount(level, random));
                }
            }
            if (entry != null) {
                entry.getValue().damage(2, user, entity -> entity.sendEquipmentBreakStatus(entry.getKey()));
            }
        }
        super(user, attacker, level);
    }

    @Override
    public int getMaxLevel() {
        return  3;
    }

    public static int getDamageAmount(int level, Random random) {
        if (level > 10) {
            return level - 10;
        }
        return 1 + random.nextInt(4);
    }

    public ParticleEffect getParticles() {
        return ParticleTypes.SNOWFLAKE;
    }
    */
}