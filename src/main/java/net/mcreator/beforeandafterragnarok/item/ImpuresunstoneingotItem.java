
package net.mcreator.beforeandafterragnarok.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class ImpuresunstoneingotItem extends Item {

	public ImpuresunstoneingotItem() {
		super(new Item.Properties().tab(BeforeAndAfterRagnarokModTabs.TAB_RAGNAROK).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("&5It looks like ice but what you see is not what you need"));
	}

}
