
package net.mcreator.compressedgrass.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.compressedgrass.init.CompressedGrassModItems;

public abstract class LimitArmorItem extends ArmorItem {
	public LimitArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 210;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{15, 25, 35, 20}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 75;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CompressedGrassModItems.LIMIT_COMPRESSED_GRASS.get()));
			}

			@Override
			public String getName() {
				return "limit_armor";
			}

			@Override
			public float getToughness() {
				return 6f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.8f;
			}
		}, slot, properties);
	}

	public static class Helmet extends LimitArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "compressed_grass:textures/models/armor/limit_layer_1.png";
		}
	}

	public static class Chestplate extends LimitArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "compressed_grass:textures/models/armor/limit_layer_1.png";
		}
	}

	public static class Leggings extends LimitArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "compressed_grass:textures/models/armor/limit_layer_2.png";
		}
	}

	public static class Boots extends LimitArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "compressed_grass:textures/models/armor/limit_layer_1.png";
		}
	}
}
