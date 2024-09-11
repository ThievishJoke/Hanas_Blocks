package hana.hanas_blocks.entity.custom;

//import hana.hanas_blocks.entity.ModEntities;
//import net.minecraft.entity.EntityType;
//import net.minecraft.entity.ai.goal.AnimalMateGoal;
//import net.minecraft.entity.ai.goal.FollowParentGoal;
//import net.minecraft.entity.ai.goal.LookAroundGoal;
//import net.minecraft.entity.ai.goal.LookAtEntityGoal;
//import net.minecraft.entity.ai.goal.SwimGoal;
//import net.minecraft.entity.ai.goal.TemptGoal;
//import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
//import net.minecraft.entity.attribute.DefaultAttributeContainer;
//import net.minecraft.entity.attribute.EntityAttributes;
//import net.minecraft.entity.damage.DamageSource;
//import net.minecraft.entity.mob.MobEntity;
//import net.minecraft.entity.passive.AnimalEntity;
//import net.minecraft.entity.passive.PassiveEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.Items;
//import net.minecraft.recipe.Ingredient;
//import net.minecraft.server.world.ServerWorld;
//import net.minecraft.sound.SoundEvent;
//import net.minecraft.sound.SoundEvents;
//import net.minecraft.world.World;
//
//public class DeerEntity extends AnimalEntity {
//    public DeerEntity(EntityType<? extends AnimalEntity> entityType, World world) {
//        super(entityType, world);
//    }
//
//    @Override
//    protected void initGoals() {
//        this.goalSelector.add(0, new SwimGoal(this));
//
//        this.goalSelector.add(1, new AnimalMateGoal(this, 1.15D));
//        this.goalSelector.add(2, new TemptGoal(this, 1.25D, Ingredient.ofItems(Items.CARROT), true));
//
//        this.goalSelector.add(3, new FollowParentGoal(this, 1D));
//
//        this.goalSelector.add(4, new WanderAroundFarGoal(this, 1D));
//        this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 4f));
//        this.goalSelector.add(6, new LookAroundGoal(this));
//    }
//
//    public static DefaultAttributeContainer.Builder createDeerAttributes() {
//        return MobEntity.createMobAttributes()
//            .add(EntityAttributes.GENERIC_MAX_HEALTH, 20)
//            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.5f)
//            .add(EntityAttributes.GENERIC_ARMOR, 0.25f)
//            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2);
//    }
//
//    @Override
//    public boolean isBreedingItem(ItemStack stack) {
//        return stack.isOf(Items.CARROT);
//    }
//
//    @Nullable
//    @Override
//    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
//        return  ModEntities.DEER.create(world);
//    }
//    @Nullable
//    @Override
//    protected SoundEvent getAmbientSound() {
//        return SoundEvents.ENTITY_HORSE_AMBIENT;
//    }
//
//    @Nullable
//    @Override
//    protected SoundEvent getHurtSound(DamageSource source) {
//        return SoundEvents.ENTITY_HORSE_HURT;
//    }
//
//    @Nullable
//    @Override
//    protected SoundEvent getDeathSound() {
//        return SoundEvents.ENTITY_HORSE_DEATH;
//    }
//}
