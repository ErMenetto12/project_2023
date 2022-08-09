
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beforeandafterragnarok.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.beforeandafterragnarok.item.ThelostHammerItem;
import net.mcreator.beforeandafterragnarok.item.SunstonescrapItem;
import net.mcreator.beforeandafterragnarok.item.SunstonepieceItem;
import net.mcreator.beforeandafterragnarok.item.SunstoneingotItem;
import net.mcreator.beforeandafterragnarok.item.ImpuresunstoneingotItem;
import net.mcreator.beforeandafterragnarok.BeforeAndAfterRagnarokMod;

public class BeforeAndAfterRagnarokModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BeforeAndAfterRagnarokMod.MODID);
	public static final RegistryObject<Item> SUNSTONEORE = block(BeforeAndAfterRagnarokModBlocks.SUNSTONEORE,
			BeforeAndAfterRagnarokModTabs.TAB_RAGNAROK);
	public static final RegistryObject<Item> ICESTONE = block(BeforeAndAfterRagnarokModBlocks.ICESTONE, BeforeAndAfterRagnarokModTabs.TAB_RAGNAROK);
	public static final RegistryObject<Item> POLISHED_ICESTONE = block(BeforeAndAfterRagnarokModBlocks.POLISHED_ICESTONE,
			BeforeAndAfterRagnarokModTabs.TAB_RAGNAROK);
	public static final RegistryObject<Item> INFERNALSTONE = block(BeforeAndAfterRagnarokModBlocks.INFERNALSTONE,
			BeforeAndAfterRagnarokModTabs.TAB_RAGNAROK);
	public static final RegistryObject<Item> SUNSTONEPIECE = REGISTRY.register("sunstonepiece", () -> new SunstonepieceItem());
	public static final RegistryObject<Item> SUNSTONESCRAP = REGISTRY.register("sunstonescrap", () -> new SunstonescrapItem());
	public static final RegistryObject<Item> THELOST_HAMMER = REGISTRY.register("thelost_hammer", () -> new ThelostHammerItem());
	public static final RegistryObject<Item> IMPURESUNSTONEINGOT = REGISTRY.register("impuresunstoneingot", () -> new ImpuresunstoneingotItem());
	public static final RegistryObject<Item> SUNSTONEINGOT = REGISTRY.register("sunstoneingot", () -> new SunstoneingotItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
