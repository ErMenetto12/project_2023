
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beforeandafterragnarok.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.beforeandafterragnarok.block.SunstoneoreBlock;
import net.mcreator.beforeandafterragnarok.block.PolishedIcestoneBlock;
import net.mcreator.beforeandafterragnarok.block.InfernalstoneBlock;
import net.mcreator.beforeandafterragnarok.block.IcestoneBlock;
import net.mcreator.beforeandafterragnarok.BeforeAndAfterRagnarokMod;

public class BeforeAndAfterRagnarokModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BeforeAndAfterRagnarokMod.MODID);
	public static final RegistryObject<Block> SUNSTONEORE = REGISTRY.register("sunstoneore", () -> new SunstoneoreBlock());
	public static final RegistryObject<Block> POLISHED_ICESTONE = REGISTRY.register("polished_icestone", () -> new PolishedIcestoneBlock());
	public static final RegistryObject<Block> ICESTONE = REGISTRY.register("icestone", () -> new IcestoneBlock());
	public static final RegistryObject<Block> INFERNALSTONE = REGISTRY.register("infernalstone", () -> new InfernalstoneBlock());
}
