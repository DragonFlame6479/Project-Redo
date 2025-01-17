
package net.mcreator.projectredo.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class StraightBetItem extends RecordItem {
	public StraightBetItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("project_redo:straightbet")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5000);
	}
}
