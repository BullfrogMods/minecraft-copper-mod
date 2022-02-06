
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.test.item.CopperSwordItem;
import net.mcreator.test.item.CopperShovelItem;
import net.mcreator.test.item.CopperPickaxeItem;
import net.mcreator.test.item.CopperHoeItem;
import net.mcreator.test.item.CopperAxeItem;
import net.mcreator.test.item.CopperArmorItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CopperModModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item COPPER_SWORD = register(new CopperSwordItem());
	public static final Item COPPER_PICKAXE = register(new CopperPickaxeItem());
	public static final Item COPPER_SHOVEL = register(new CopperShovelItem());
	public static final Item COPPER_AXE = register(new CopperAxeItem());
	public static final Item COPPER_HOE = register(new CopperHoeItem());
	public static final Item COPPER_ARMOR_HELMET = register(new CopperArmorItem.Helmet());
	public static final Item COPPER_ARMOR_CHESTPLATE = register(new CopperArmorItem.Chestplate());
	public static final Item COPPER_ARMOR_LEGGINGS = register(new CopperArmorItem.Leggings());
	public static final Item COPPER_ARMOR_BOOTS = register(new CopperArmorItem.Boots());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
