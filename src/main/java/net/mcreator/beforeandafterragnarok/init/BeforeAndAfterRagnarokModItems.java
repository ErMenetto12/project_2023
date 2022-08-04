
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beforeandafterragnarok.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.beforeandafterragnarok.item.TestItem;
import net.mcreator.beforeandafterragnarok.BeforeAndAfterRagnarokMod;

public class BeforeAndAfterRagnarokModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BeforeAndAfterRagnarokMod.MODID);
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());
}
