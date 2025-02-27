
package net.mcreator.projectredo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MagicStoneNuggetItem extends Item {
	public MagicStoneNuggetItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
