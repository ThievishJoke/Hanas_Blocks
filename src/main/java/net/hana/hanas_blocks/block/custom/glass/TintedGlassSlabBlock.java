package net.hana.hanas_blocks.block.custom.glass;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import com.mojang.serialization.MapCodec;

public class TintedGlassSlabBlock extends SlabBlock {
    public static final MapCodec<TintedGlassSlabBlock> CODEC = createCodec(TintedGlassSlabBlock::new);

    public TintedGlassSlabBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends SlabBlock> getCodec() {
        return CODEC;
    }

    @Override
    public int getOpacity(BlockState state, BlockView world, BlockPos pos) {
        return world.getMaxLightLevel();
    }
}
