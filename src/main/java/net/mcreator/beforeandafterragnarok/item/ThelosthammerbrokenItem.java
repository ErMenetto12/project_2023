
package net.mcreator.beforeandafterragnarok.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.beforeandafterragnarok.init.BeforeAndAfterRagnarokModTabs;

public class ThelosthammerbrokenItem extends Item {
	public ThelosthammerbrokenItem() {
		super(new Item.Properties().tab(BeforeAndAfterRagnarokModTabs.TAB_RAGNAROK).stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
