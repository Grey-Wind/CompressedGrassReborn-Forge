
package net.mcreator.compressedgrass.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PrimaryCompressedGrassArmorSwordItem extends SwordItem {
	public PrimaryCompressedGrassArmorSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 95;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 7;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CompressedGrassModItems.PRIMARY_COMPRESSED_GRASS.get()));
			}
		}, 3, -3f, new Item.Properties());
	}
}
