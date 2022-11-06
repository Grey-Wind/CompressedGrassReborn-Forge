
package net.mcreator.compressedgrass.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.compressedgrass.init.CompressedGrassModTabs;
import net.mcreator.compressedgrass.init.CompressedGrassModItems;

public abstract class QuintupleCompressedGrassArmorArmorItem extends ArmorItem {
	public QuintupleCompressedGrassArmorArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{5, 6, 7, 6}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 10;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CompressedGrassModItems.QUINTUPLE_COMPRESSED_GRASS.get()));
			}

			@Override
			public String getName() {
				return "quintuple_compressed_grass_armor_armor";
			}

			@Override
			public float getToughness() {
				return 0.2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.15f;
			}
		}, slot, properties);
	}

	public static class Helmet extends QuintupleCompressedGrassArmorArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "compressed_grass:textures/models/armor/quintuplecompressedgrassarmor_layer_1.png";
		}
	}

	public static class Chestplate extends QuintupleCompressedGrassArmorArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "compressed_grass:textures/models/armor/quintuplecompressedgrassarmor_layer_1.png";
		}
	}

	public static class Leggings extends QuintupleCompressedGrassArmorArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "compressed_grass:textures/models/armor/quintuplecompressedgrassarmor_layer_2.png";
		}
	}

	public static class Boots extends QuintupleCompressedGrassArmorArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "compressed_grass:textures/models/armor/quintuplecompressedgrassarmor_layer_1.png";
		}
	}
}
