
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
				return 500;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 9.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -2.7999999999999998f, new Item.Properties().tab(BeforeAndAfterRagnarokModTabs.TAB_RAGNAROK).fireResistant());
	}
}
