
package net.mcreator.projectredo.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class RondoOfLoveAndDarknessItem extends RecordItem {
	public RondoOfLoveAndDarknessItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("project_redo:rondoofloveanddarkness")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4600);
	}
}
