
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beforeandafterragnarok.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.beforeandafterragnarok.block.SunstoneoreBlock;
import net.mcreator.beforeandafterragnarok.block.IcestoneBlock;
import net.mcreator.beforeandafterragnarok.BeforeAndAfterRagnarokMod;

public class BeforeAndAfterRagnarokModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BeforeAndAfterRagnarokMod.MODID);
	public static final RegistryObject<Block> SUNSTONEORE = REGISTRY.register("sunstoneore", () -> new SunstoneoreBlock());
	public static final RegistryObject<Block> ICESTONE = REGISTRY.register("icestone", () -> new IcestoneBlock());
}
