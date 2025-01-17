
package net.mcreator.projectredo.item;

public class JustSomeItemItem extends Item {
	public JustSomeItemItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(10).saturationMod(0.3f).alwaysEat().meat().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(Items.APPLE);
		super.finishUsingItem(itemstack, world, entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}