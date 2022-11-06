
package net.mcreator.compressedgrass.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.compressedgrass.procedures.EnchantedSwordOnHandProcedure;
import net.mcreator.compressedgrass.init.CompressedGrassModTabs;
import net.mcreator.compressedgrass.init.CompressedGrassModItems;

public class EnchantedSwordItem extends SwordItem {
	public EnchantedSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 5250;
			}

			public float getSpeed() {
				return 25f;
			}

			public float getAttackDamageBonus() {
				return 38f;
			}

			public int getLevel() {
				return 20;
			}

			public int getEnchantmentValue() {
				return 120;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CompressedGrassModItems.ENCHANTED_GRASS.get()));
			}
		}, 3, -3f, new Item.Properties().tab(CompressedGrassModTabs.TAB_TOOLS));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			EnchantedSwordOnHandProcedure.execute(entity);
	}
}
