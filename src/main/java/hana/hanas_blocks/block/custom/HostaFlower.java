package hana.hanas_blocks.block.custom;

import net.minecraft.block.*;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

/*
public class HostaFlower extends FlowerBlock {
    protected static final float field_31094 = 3.0f;
    private static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 8, 8, 8);

    public HostaFlower(StatusEffect darkness, int i) {
        super(darkness, 10,);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Vec3d vec3d = state.getModelOffset(world, pos);
        return SHAPE.offset(vec3d.x, vec3d.y, vec3d.z);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(Text.literal("Pretty"));
        super.appendTooltip(stack, world, tooltip, options);
    }


}
*/