package hana.hanas_blocks.block.custom.plant.tall;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class NetherShrubBlock extends ShrubBlock {
    public NetherShrubBlock(AbstractBlock.Settings properties) {
        super(properties);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(HALF, DoubleBlockHalf.LOWER));
    }

    protected boolean canPlantOnTop(BlockState state, BlockView getter, BlockPos pos) {
        return state.isIn(BlockTags.NYLIUM);
    }
}