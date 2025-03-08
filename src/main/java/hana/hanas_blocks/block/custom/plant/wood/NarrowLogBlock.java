package hana.hanas_blocks.block.custom.plant.wood;

import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class NarrowLogBlock extends PillarBlock {
    public NarrowLogBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView getter, BlockPos pos, ShapeContext context) {
        return switch (state.get(AXIS)) {
            case X -> createCuboidShape(0.0, 4.0, 4.0, 16.0, 12.0, 12.0);
            case Y -> createCuboidShape(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
            case Z -> createCuboidShape(4.0, 4.0, 0.0, 12.0, 12.0, 16.0);
            default -> throw new IllegalArgumentException("Unexpected axis: " + state.get(AXIS));
        };
    }
}
