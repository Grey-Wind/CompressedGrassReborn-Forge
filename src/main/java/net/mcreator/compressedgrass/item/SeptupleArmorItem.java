
package net.mcreator.compressedgrass.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.compressedgrass.itemgroup.GrassArmorItemGroup;
import net.mcreator.compressedgrass.CompressedGrassModElements;

@CompressedGrassModElements.ModElement.Tag
public class SeptupleArmorItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:septuple_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("compressed_grass:septuple_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("compressed_grass:septuple_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("compressed_grass:septuple_armor_boots")
	public static final Item boots = null;

	public SeptupleArmorItem(CompressedGrassModElements instance) {
		super(instance, 62);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 150;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{1000, 1000, 1000, 1000}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 90;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SeptupleCompressedGrassItem.block));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "septuple_armor";
			}

			@Override
			public float getToughness() {
				return 5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 5f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(GrassArmorItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "compressed_grass:textures/models/armor/septuple_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("septuple_armor_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(GrassArmorItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "compressed_grass:textures/models/armor/septuple_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("septuple_armor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(GrassArmorItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "compressed_grass:textures/models/armor/septuple_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("septuple_armor_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(GrassArmorItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "compressed_grass:textures/models/armor/septuple_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("septuple_armor_boots"));
	}

}
