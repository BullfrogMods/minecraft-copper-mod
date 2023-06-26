
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CopperModModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(CopperModModItems.COPPER_SWORD.get());
			tabData.accept(CopperModModItems.COPPER_ARMOR_HELMET.get());
			tabData.accept(CopperModModItems.COPPER_ARMOR_CHESTPLATE.get());
			tabData.accept(CopperModModItems.COPPER_ARMOR_LEGGINGS.get());
			tabData.accept(CopperModModItems.COPPER_ARMOR_BOOTS.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CopperModModItems.COPPER_PICKAXE.get());
			tabData.accept(CopperModModItems.COPPER_SHOVEL.get());
			tabData.accept(CopperModModItems.COPPER_AXE.get());
			tabData.accept(CopperModModItems.COPPER_HOE.get());
		}
	}
}
