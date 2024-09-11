package hana.hanas_blocks.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.effect.EnchantmentEffectTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.BlockPos;

public class LightningStrikerEnchantment extends Enchantments {

    public LightningStrikerEnchantment(Rarity weight, EnchantmentEffectTarget target, EquipmentSlot... slotTypes) {
        super();
    }

    /*
    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(!user.getWorld().isClient()) {
            ServerWorld world = (ServerWorld)user.getWorld();
            BlockPos position = target.getBlockPos();

            if(level == 1) {
                EntityType.LIGHTNING_BOLT.spawn(world, position, null
                );
            }

            if(level == 2) {
                EntityType.LIGHTNING_BOLT.spawn(world, position, null
                );
                EntityType.LIGHTNING_BOLT.spawn(world, position, null
                );
            }
        }

        super.onTargetDamaged(user, user, level);
    }
    @Override
    public int getMaxLevel() {
        return 2;
    }

    public boolean isAvailableForEnchantedBookOffer() {
        return true;
    }
    */
}