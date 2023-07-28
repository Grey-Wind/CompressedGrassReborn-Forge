
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

import net.mcreator.compressedgrass.init.CompressedGrassModItems;

public abstract class GrassArmorItem extends ArmorItem {
	public GrassArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 45;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{6, 18, 15, 6}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 27;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.armor_stand.place"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CompressedGrassModItems.GRASS_ORE_INGOT.get()));
			}

			@Override
			public String getName() {
				return "grass_ore_armor";
			}

			@Override
			public float getToughness() {
				return 0.1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, type, properties);
	}

	public static class Helmet extends GrassArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "compressed_grass:textures/models/armor/grass_layer_1.png";
		}
	}

	public static class Chestplate extends GrassArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "compressed_grass:textures/models/armor/grass_layer_1.png";
		}
	}

	public static class Leggings extends GrassArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "compressed_grass:textures/models/armor/grass_layer_2.png";
		}
	}

	public static class Boots extends GrassArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "compressed_grass:textures/models/armor/grass_layer_1.png";
		}
	}
}
