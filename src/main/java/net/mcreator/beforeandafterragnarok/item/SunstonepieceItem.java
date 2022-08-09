
package net.mcreator.beforeandafterragnarok.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.beforeandafterragnarok.init.BeforeAndAfterRagnarokModTabs;

public class SunstonepieceItem extends Item {
	public SunstonepieceItem() {
		super(new Item.Properties().tab(BeforeAndAfterRagnarokModTabs.TAB_RAGNAROK).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
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
