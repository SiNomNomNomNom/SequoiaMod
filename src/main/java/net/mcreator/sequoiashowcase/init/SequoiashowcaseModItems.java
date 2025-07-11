/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sequoiashowcase.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.sequoiashowcase.SequoiashowcaseMod;

import java.util.function.Function;

public class SequoiashowcaseModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SequoiashowcaseMod.MODID);
	public static final DeferredItem<Item> REDWOOD_LOG = block(SequoiashowcaseModBlocks.REDWOOD_LOG);
	public static final DeferredItem<Item> REDWOOD_WOOD = block(SequoiashowcaseModBlocks.REDWOOD_WOOD);
	public static final DeferredItem<Item> REDWOOD_PLANKS = block(SequoiashowcaseModBlocks.REDWOOD_PLANKS);
	public static final DeferredItem<Item> REDWOOD_LEAVES = block(SequoiashowcaseModBlocks.REDWOOD_LEAVES);
	public static final DeferredItem<Item> REDWOOD_STAIRS = block(SequoiashowcaseModBlocks.REDWOOD_STAIRS);
	public static final DeferredItem<Item> REDWOOD_SLAB = block(SequoiashowcaseModBlocks.REDWOOD_SLAB);
	public static final DeferredItem<Item> REDWOOD_FENCE = block(SequoiashowcaseModBlocks.REDWOOD_FENCE);
	public static final DeferredItem<Item> REDWOOD_FENCE_GATE = block(SequoiashowcaseModBlocks.REDWOOD_FENCE_GATE);
	public static final DeferredItem<Item> REDWOOD_PRESSURE_PLATE = block(SequoiashowcaseModBlocks.REDWOOD_PRESSURE_PLATE);
	public static final DeferredItem<Item> REDWOOD_BUTTON = block(SequoiashowcaseModBlocks.REDWOOD_BUTTON);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}