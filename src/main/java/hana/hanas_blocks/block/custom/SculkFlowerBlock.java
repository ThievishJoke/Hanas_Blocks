package hana.hanas_blocks.block.custom;

import java.util.List;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.*;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public abstract class SculkFlowerBlock
extends SculkPlantBlock
    implements SuspiciousStewIngredient {
    protected static MapCodec<SuspiciousStewEffectsComponent> STEW_EFFECT_CODEC;
    public static final MapCodec<FlowerBlock> CODEC;
    protected static final float field_31094 = 3.0f;
    protected static final VoxelShape SHAPE = Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
    private SuspiciousStewEffectsComponent stewEffects;

    //public SculkFlowerBlock(AbstractBlock.Settings settings) {
    //    super(settings);
    public SculkFlowerBlock(RegistryEntry<StatusEffect> stewEffect, float effectLengthInSeconds, Settings settings) {
        this(createStewEffectList(stewEffect, effectLengthInSeconds), settings);
    }

    public SculkFlowerBlock(SuspiciousStewEffectsComponent stewEffects, Settings settings) {
        super(settings);
        this.stewEffects = stewEffects;
    }

    public SculkFlowerBlock(Settings settings) {
        super(settings);
    }

    protected static SuspiciousStewEffectsComponent createStewEffectList(RegistryEntry<StatusEffect> effect, float effectLengthInSeconds) {
        return new SuspiciousStewEffectsComponent(List.of(new SuspiciousStewEffectsComponent.StewEffect(effect, MathHelper.floor(effectLengthInSeconds * 20.0F))));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Vec3d vec3d = state.getModelOffset(world, pos);
        return SHAPE.offset(vec3d.x, vec3d.y, vec3d.z);
    }

    public SuspiciousStewEffectsComponent getStewEffects() {
        return this.stewEffects;
    }
    static {
        STEW_EFFECT_CODEC = SuspiciousStewEffectsComponent.CODEC.fieldOf("suspicious_stew_effects");
        CODEC = RecordCodecBuilder.mapCodec((instance) -> {
            return instance.group(STEW_EFFECT_CODEC.forGetter(FlowerBlock::getStewEffects), createSettingsCodec()).apply(instance, FlowerBlock::new);
        });
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        tooltip.add(Text.translatable("tooltip.hanas_blocks.sculk_flower_block.tooltip"));
        super.appendTooltip(stack, context, tooltip, options);
    }
}
