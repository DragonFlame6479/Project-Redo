
package net.mcreator.projectredo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MagicStoneItem extends Item {
	public MagicStoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
