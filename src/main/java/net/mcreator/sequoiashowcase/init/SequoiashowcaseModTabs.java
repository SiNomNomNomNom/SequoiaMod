/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sequoiashowcase.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.sequoiashowcase.SequoiashowcaseMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class SequoiashowcaseModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SequoiashowcaseMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(SequoiashowcaseModBlocks.REDWOOD_LOG.get().asItem());
			tabData.accept(SequoiashowcaseModBlocks.REDWOOD_WOOD.get().asItem());
			tabData.accept(SequoiashowcaseModBlocks.REDWOOD_PLANKS.get().asItem());
			tabData.accept(SequoiashowcaseModBlocks.REDWOOD_STAIRS.get().asItem());
			tabData.accept(SequoiashowcaseModBlocks.REDWOOD_SLAB.get().asItem());
			tabData.accept(SequoiashowcaseModBlocks.REDWOOD_FENCE.get().asItem());
			tabData.accept(SequoiashowcaseModBlocks.REDWOOD_FENCE_GATE.get().asItem());
			tabData.accept(SequoiashowcaseModBlocks.REDWOOD_PRESSURE_PLATE.get().asItem());
			tabData.accept(SequoiashowcaseModBlocks.REDWOOD_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(SequoiashowcaseModBlocks.REDWOOD_LEAVES.get().asItem());
		}
	}
}