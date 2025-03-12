package net.hana.hanas_blocks.block.custom.glass;

import com.mojang.serialization.MapCodec;
import net.hana.hanas_blocks.block.custom.ModVerticalSlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class TintedModGlassVerticalSlabBlock extends ModVerticalSlabBlock {

    public static final MapCodec<TintedModGlassVerticalSlabBlock> CODEC =
            TintedModGlassVerticalSlabBlock.createCodec(TintedModGlassVerticalSlabBlock::new);

    @Override
    public MapCodec<? extends TintedModGlassVerticalSlabBlock> getCodec() {
        return CODEC;
    }

    public TintedModGlassVerticalSlabBlock(Settings settings) {
        super(settings.nonOpaque().sounds(BlockSoundGroup.GLASS));
    }

    @Override
    protected boolean hasSidedTransparency(BlockState state) {
        return true;
    }

    @Override
    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    @Override
    public int getOpacity(BlockState state, BlockView world, BlockPos pos) {
        return world.getMaxLightLevel();
    }

    @Override
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return Blocks.TINTED_GLASS.getDefaultState().getCullingShape(world, pos);
    }
}