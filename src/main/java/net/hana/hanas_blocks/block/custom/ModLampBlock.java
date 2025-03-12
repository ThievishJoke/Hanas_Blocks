package net.hana.hanas_blocks.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BulbBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class ModLampBlock extends Block {
    public static final BooleanProperty CLICKED = BooleanProperty.of("clicked");

    public ModLampBlock(Settings settings) {
        super(settings);
        setDefaultState(this.getDefaultState().with(CLICKED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(CLICKED);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient()) {
            boolean clicked = !state.get(CLICKED);
            world.setBlockState(pos, state.with(CLICKED, clicked));
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        if (!world.isClient()) {
            boolean powered = world.isReceivingRedstonePower(pos);
            boolean wasPowered = state.get(CLICKED);

            if (powered && !wasPowered) {
                world.setBlockState(pos, state.with(CLICKED, true));
            }

            if (!powered && wasPowered) {
                world.setBlockState(pos, state.with(CLICKED, false));
            }
        }
    }
}
