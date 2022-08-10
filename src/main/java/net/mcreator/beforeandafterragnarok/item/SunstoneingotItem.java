
package net.mcreator.beforeandafterragnarok.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.beforeandafterragnarok.init.BeforeAndAfterRagnarokModTabs;

public class SunstoneingotItem extends Item {
	public SunstoneingotItem() {
		super(new Item.Properties().tab(BeforeAndAfterRagnarokModTabs.TAB_RAGNAROK).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
