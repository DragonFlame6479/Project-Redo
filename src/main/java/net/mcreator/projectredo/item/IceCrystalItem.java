
package net.mcreator.projectredo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IceCrystalItem extends Item {
	public IceCrystalItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
