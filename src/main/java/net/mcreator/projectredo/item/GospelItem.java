
package net.mcreator.projectredo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GospelItem extends Item {
	public GospelItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}
}
