package hana.hanas_blocks.block.custom.plant.tall;

import hana.hanas_blocks.util.ModTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

public class ShrubBlock extends TallPlantBlock {
    public ShrubBlock(AbstractBlock.Settings properties) {
        super(properties);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(HALF, DoubleBlockHalf.LOWER));
    }

    public boolean canPlaceAt(BlockState state, WorldView level, BlockPos pos) {
        if (state.get(HALF) != DoubleBlockHalf.UPPER) {
            BlockPos blockpos = pos.down();
            return this.canPlantOnTop(level.getBlockState(blockpos), level, blockpos);
        } else {
            BlockState blockstate = level.getBlockState(pos.down());
            return blockstate.isOf(this) && blockstate.get(HALF) == DoubleBlockHalf.LOWER;
        }
    }

    protected boolean canPlantOnTop(BlockState state, BlockView getter, BlockPos pos) {
        return state.isIn(ModTags.Blocks.SHRUB_CAN_SURVIVE_ON);
    }
}
