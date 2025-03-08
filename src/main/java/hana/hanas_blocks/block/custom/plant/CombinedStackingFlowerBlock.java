package hana.hanas_blocks.block.custom.plant;


import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;

public class CombinedStackingFlowerBlock extends FlowerBlock {
    public CombinedStackingFlowerBlock(SuspiciousStewEffectsComponent stewEffects, Settings settings) {
        super(stewEffects, settings);
    }

    public CombinedStackingFlowerBlock(RegistryEntry<StatusEffect> stewEffect, float effectLengthInSeconds, Settings settings) {
        super(stewEffect, effectLengthInSeconds, settings);
    }
}