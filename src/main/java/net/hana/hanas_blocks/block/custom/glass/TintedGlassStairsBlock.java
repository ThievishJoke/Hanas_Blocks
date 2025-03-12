package net.hana.hanas_blocks.block.custom.glass;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class TintedGlassStairsBlock extends StairsBlock {
    public TintedGlassStairsBlock(Block block, Settings settings) {
        super(block.getDefaultState(), settings);
    }

    @Override
    public MapCodec<? extends StairsBlock> getCodec() {
        return CODEC;
    }

    @Override
    public int getOpacity(BlockState state, BlockView world, BlockPos pos) {
        return world.getMaxLightLevel();
    }
}
