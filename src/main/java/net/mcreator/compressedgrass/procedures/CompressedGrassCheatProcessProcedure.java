package net.mcreator.compressedgrass.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.compressedgrass.init.CompressedGrassModItems;
import net.mcreator.compressedgrass.init.CompressedGrassModBlocks;

public class CompressedGrassCheatProcessProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = new ItemStack(CompressedGrassModItems.ENCHANTED_SWORD.get());
			_setstack.setCount(1);
			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(1, new ItemStack(CompressedGrassModItems.ENCHANTED_ARMOR_HELMET.get()));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(CompressedGrassModItems.ENCHANTED_ARMOR_HELMET.get()));
			}
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(2, new ItemStack(CompressedGrassModItems.ENCHANTED_ARMOR_CHESTPLATE.get()));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(CompressedGrassModItems.ENCHANTED_ARMOR_CHESTPLATE.get()));
			}
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(3, new ItemStack(CompressedGrassModItems.ENCHANTED_ARMOR_LEGGINGS.get()));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(CompressedGrassModItems.ENCHANTED_ARMOR_LEGGINGS.get()));
			}
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(4, new ItemStack(CompressedGrassModItems.ENCHANTED_ARMOR_BOOTS.get()));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 4),
						new ItemStack(CompressedGrassModItems.ENCHANTED_ARMOR_BOOTS.get()));
			}
		}
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = new ItemStack(CompressedGrassModBlocks.CHRISTMAS_TREE.get());
			_setstack.setCount(1);
			_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
	}
}
