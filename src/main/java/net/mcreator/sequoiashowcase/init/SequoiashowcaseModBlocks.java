/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sequoiashowcase.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.sequoiashowcase.block.RedwoodWoodBlock;
import net.mcreator.sequoiashowcase.block.RedwoodStairsBlock;
import net.mcreator.sequoiashowcase.block.RedwoodSlabBlock;
import net.mcreator.sequoiashowcase.block.RedwoodPressurePlateBlock;
import net.mcreator.sequoiashowcase.block.RedwoodPlanksBlock;
import net.mcreator.sequoiashowcase.block.RedwoodLogBlock;
import net.mcreator.sequoiashowcase.block.RedwoodLeavesBlock;
import net.mcreator.sequoiashowcase.block.RedwoodFenceGateBlock;
import net.mcreator.sequoiashowcase.block.RedwoodFenceBlock;
import net.mcreator.sequoiashowcase.block.RedwoodButtonBlock;
import net.mcreator.sequoiashowcase.block.RedwoodBarkBlock;
import net.mcreator.sequoiashowcase.SequoiashowcaseMod;

import java.util.function.Function;

public class SequoiashowcaseModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SequoiashowcaseMod.MODID);
	public static final DeferredBlock<Block> REDWOOD_LOG = register("redwood_log", RedwoodLogBlock::new);
	public static final DeferredBlock<Block> REDWOOD_WOOD = register("redwood_wood", RedwoodWoodBlock::new);
	public static final DeferredBlock<Block> REDWOOD_PLANKS = register("redwood_planks", RedwoodPlanksBlock::new);
	public static final DeferredBlock<Block> REDWOOD_LEAVES = register("redwood_leaves", RedwoodLeavesBlock::new);
	public static final DeferredBlock<Block> REDWOOD_STAIRS = register("redwood_stairs", RedwoodStairsBlock::new);
	public static final DeferredBlock<Block> REDWOOD_SLAB = register("redwood_slab", RedwoodSlabBlock::new);
	public static final DeferredBlock<Block> REDWOOD_FENCE = register("redwood_fence", RedwoodFenceBlock::new);
	public static final DeferredBlock<Block> REDWOOD_FENCE_GATE = register("redwood_fence_gate", RedwoodFenceGateBlock::new);
	public static final DeferredBlock<Block> REDWOOD_PRESSURE_PLATE = register("redwood_pressure_plate", RedwoodPressurePlateBlock::new);
	public static final DeferredBlock<Block> REDWOOD_BUTTON = register("redwood_button", RedwoodButtonBlock::new);
	public static final DeferredBlock<Block> REDWOOD_BARK = register("redwood_bark", RedwoodBarkBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}