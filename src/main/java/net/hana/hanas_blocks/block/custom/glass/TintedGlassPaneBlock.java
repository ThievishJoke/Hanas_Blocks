package net.hana.hanas_blocks.block.custom.glass;

import net.minecraft.block.BlockState;
import net.minecraft.block.PaneBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class TintedGlassPaneBlock extends PaneBlock {

    public TintedGlassPaneBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    @Override
    public int getOpacity(BlockState state, BlockView world, BlockPos pos) {
        return 15;
    }
}