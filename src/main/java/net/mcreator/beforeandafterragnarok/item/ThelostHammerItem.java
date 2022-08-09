
package net.mcreator.beforeandafterragnarok.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

import net.mcreator.beforeandafterragnarok.init.BeforeAndAfterRagnarokModTabs;

public class ThelostHammerItem extends PickaxeItem {
	public ThelostHammerItem() {
		super(new Tier() {
			public int getUses() {
				return 32;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().tab(BeforeAndAfterRagnarokModTabs.TAB_RAGNAROK).fireResistant());
	}
}
