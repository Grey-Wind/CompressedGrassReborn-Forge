
package net.mcreator.compressedgrass.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.compressedgrass.procedures.NonupleGrassArmorHeadProcedure;
import net.mcreator.compressedgrass.procedures.NonupleGrassArmorChestplateProcedure;
import net.mcreator.compressedgrass.init.CompressedGrassModTabs;
import net.mcreator.compressedgrass.init.CompressedGrassModItems;

public abstract class NonupleGrassArmorItem extends ArmorItem {
	public NonupleGrassArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 200;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{15, 20, 30, 15}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 72;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CompressedGrassModItems.NONUPLE_COMPRESSED_GRASS.get()));
			}

			@Override
			public String getName() {
				return "nonuple_grass_armor";
			}

			@Override
			public float getToughness() {
				return 5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.7f;
			}
		}, slot, properties);
	}

	public static class Helmet extends NonupleGrassArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "compressed_grass:textures/models/armor/nonuplegrass_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			NonupleGrassArmorHeadProcedure.execute(entity);
		}
	}

	public static class Chestplate extends NonupleGrassArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "compressed_grass:textures/models/armor/nonuplegrass_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			NonupleGrassArmorChestplateProcedure.execute(entity);
		}
	}

	public static class Leggings extends NonupleGrassArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "compressed_grass:textures/models/armor/nonuplegrass_layer_2.png";
		}
	}

	public static class Boots extends NonupleGrassArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "compressed_grass:textures/models/armor/nonuplegrass_layer_1.png";
		}
	}
}
