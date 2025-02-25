
package net.mcreator.projectredo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RefinedmagicstoneItem extends Item {
	public RefinedmagicstoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
