
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beforeandafterragnarok.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BeforeAndAfterRagnarokModTabs {
	public static CreativeModeTab TAB_RAGNAROK;

	public static void load() {
		TAB_RAGNAROK = new CreativeModeTab("tabragnarok") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BeforeAndAfterRagnarokModItems.THELOST_HAMMER.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
