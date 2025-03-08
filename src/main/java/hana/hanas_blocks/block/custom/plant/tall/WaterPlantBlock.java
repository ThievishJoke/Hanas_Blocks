package hana.hanas_blocks.block.custom.plant.tall;

import hana.hanas_blocks.util.ModTags;
import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class WaterPlantBlock extends TallPlantBlock implements Waterloggable {
    public static final BooleanProperty WATERLOGGED;

    public WaterPlantBlock(AbstractBlock.Settings properties) {
        super(properties);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(HALF, DoubleBlockHalf.LOWER)).with(WATERLOGGED, false));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{HALF, WATERLOGGED});
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState state1, WorldAccess level, BlockPos pos, BlockPos pos1) {
        if ((Boolean)state.get(WATERLOGGED)) {
            level.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(level));
        }

        DoubleBlockHalf doubleblockhalf = (DoubleBlockHalf)state.get(HALF);
        if (direction.getAxis() == Direction.Axis.Y && doubleblockhalf == DoubleBlockHalf.LOWER == (direction == Direction.UP) && (!state1.isOf(this) || state1.get(HALF) == doubleblockhalf)) {
            return Blocks.AIR.getDefaultState();
        } else {
            return doubleblockhalf == DoubleBlockHalf.LOWER && direction == Direction.DOWN && !state.canPlaceAt(level, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, state1, level, pos, pos1);
        }
    }

    public FluidState getFluidState(BlockState state) {
        return (Boolean)state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    protected boolean canPlantOnTop(BlockState state, BlockView getter, BlockPos pos) {
        return !getter.getFluidState(pos.up().up()).isOf(Fluids.WATER) ? state.isIn(ModTags.Blocks.WATER_PLANT_CAN_SURVIVE_ON) : false;
    }

    public boolean canPlaceAt(BlockState state, WorldView level, BlockPos pos) {
        BlockPos blockpos = pos.down();
        BlockState groundState = level.getBlockState(blockpos);
        if (state.get(HALF) != DoubleBlockHalf.UPPER) {
            return this.canPlantOnTop(groundState, level, blockpos);
        } else {
            return groundState.isOf(this) && groundState.get(HALF) == DoubleBlockHalf.LOWER;
        }
    }

    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        return false;
    }

    public @Nullable BlockState getPlacementState(ItemPlacementContext context) {
        BlockPos blockpos = context.getBlockPos();
        FluidState fluidstate = context.getWorld().getFluidState(context.getBlockPos());
        World level = context.getWorld();
        return blockpos.getY() < level.getTopY() - 1 && level.getBlockState(blockpos.up()).canReplace(context) ? (BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(HALF, DoubleBlockHalf.LOWER)).with(WATERLOGGED, fluidstate.getFluid() == Fluids.WATER) : super.getPlacementState(context);
    }

    static {
        WATERLOGGED = Properties.WATERLOGGED;
    }
}
