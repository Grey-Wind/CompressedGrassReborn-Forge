
package net.mcreator.compressedgrass.world.inventory;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.compressedgrass.init.CompressedGrassModMenus;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class BigGrassBagPlusGUIMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;

	public BigGrassBagPlusGUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(CompressedGrassModMenus.BIG_GRASS_BAG_PLUS_GUI.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(186);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack;
				if (hand == 0)
					itemstack = this.entity.getMainHandItem();
				else
					itemstack = this.entity.getOffhandItem();
				itemstack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) {
				extraData.readByte(); // drop padding
				Entity entity = world.getEntity(extraData.readVarInt());
				if (entity != null)
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				BlockEntity ent = inv.player != null ? inv.player.level.getBlockEntity(pos) : null;
				if (ent != null) {
					ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				}
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 4, 5) {
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 22, 5) {
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 40, 5) {
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 58, 5) {
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 76, 5) {
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 94, 5) {
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 112, 5) {
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 130, 5) {
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 148, 5) {
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 166, 5) {
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 184, 5) {
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 202, 5) {
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 220, 5) {
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 238, 5) {
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 256, 5) {
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 274, 5) {
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 292, 5) {
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 310, 5) {
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 328, 5) {
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 346, 5) {
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 364, 5) {
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 382, 5) {
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 400, 5) {
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 4, 23) {
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 22, 23) {
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 40, 23) {
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 58, 23) {
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 76, 23) {
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 94, 23) {
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 112, 23) {
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 130, 23) {
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 148, 23) {
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 166, 23) {
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 184, 23) {
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 202, 23) {
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 220, 23) {
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 238, 23) {
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 256, 23) {
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 274, 23) {
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 292, 23) {
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 310, 23) {
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 328, 23) {
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 346, 23) {
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 364, 23) {
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 382, 23) {
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 400, 23) {
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 4, 41) {
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 22, 41) {
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 40, 41) {
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 58, 41) {
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 76, 41) {
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 94, 41) {
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 112, 41) {
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 130, 41) {
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 148, 41) {
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 166, 41) {
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 184, 41) {
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 202, 41) {
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 220, 41) {
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 238, 41) {
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 256, 41) {
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 274, 41) {
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 292, 41) {
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 310, 41) {
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 328, 41) {
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 346, 41) {
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 364, 41) {
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 382, 41) {
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 400, 41) {
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 4, 59) {
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 22, 59) {
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 40, 59) {
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 58, 59) {
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 76, 59) {
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 94, 59) {
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 112, 59) {
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 130, 59) {
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 148, 59) {
		}));
		this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 166, 59) {
		}));
		this.customSlots.put(79, this.addSlot(new SlotItemHandler(internal, 79, 184, 59) {
		}));
		this.customSlots.put(80, this.addSlot(new SlotItemHandler(internal, 80, 202, 59) {
		}));
		this.customSlots.put(81, this.addSlot(new SlotItemHandler(internal, 81, 220, 59) {
		}));
		this.customSlots.put(82, this.addSlot(new SlotItemHandler(internal, 82, 238, 59) {
		}));
		this.customSlots.put(83, this.addSlot(new SlotItemHandler(internal, 83, 256, 59) {
		}));
		this.customSlots.put(84, this.addSlot(new SlotItemHandler(internal, 84, 274, 59) {
		}));
		this.customSlots.put(85, this.addSlot(new SlotItemHandler(internal, 85, 292, 59) {
		}));
		this.customSlots.put(86, this.addSlot(new SlotItemHandler(internal, 86, 310, 59) {
		}));
		this.customSlots.put(87, this.addSlot(new SlotItemHandler(internal, 87, 328, 59) {
		}));
		this.customSlots.put(88, this.addSlot(new SlotItemHandler(internal, 88, 346, 59) {
		}));
		this.customSlots.put(89, this.addSlot(new SlotItemHandler(internal, 89, 364, 59) {
		}));
		this.customSlots.put(90, this.addSlot(new SlotItemHandler(internal, 90, 382, 59) {
		}));
		this.customSlots.put(91, this.addSlot(new SlotItemHandler(internal, 91, 400, 59) {
		}));
		this.customSlots.put(92, this.addSlot(new SlotItemHandler(internal, 92, 4, 77) {
		}));
		this.customSlots.put(93, this.addSlot(new SlotItemHandler(internal, 93, 22, 77) {
		}));
		this.customSlots.put(94, this.addSlot(new SlotItemHandler(internal, 94, 40, 77) {
		}));
		this.customSlots.put(95, this.addSlot(new SlotItemHandler(internal, 95, 58, 77) {
		}));
		this.customSlots.put(96, this.addSlot(new SlotItemHandler(internal, 96, 76, 77) {
		}));
		this.customSlots.put(97, this.addSlot(new SlotItemHandler(internal, 97, 94, 77) {
		}));
		this.customSlots.put(98, this.addSlot(new SlotItemHandler(internal, 98, 112, 77) {
		}));
		this.customSlots.put(99, this.addSlot(new SlotItemHandler(internal, 99, 130, 77) {
		}));
		this.customSlots.put(100, this.addSlot(new SlotItemHandler(internal, 100, 148, 77) {
		}));
		this.customSlots.put(101, this.addSlot(new SlotItemHandler(internal, 101, 166, 77) {
		}));
		this.customSlots.put(102, this.addSlot(new SlotItemHandler(internal, 102, 184, 77) {
		}));
		this.customSlots.put(103, this.addSlot(new SlotItemHandler(internal, 103, 202, 77) {
		}));
		this.customSlots.put(104, this.addSlot(new SlotItemHandler(internal, 104, 220, 77) {
		}));
		this.customSlots.put(105, this.addSlot(new SlotItemHandler(internal, 105, 238, 77) {
		}));
		this.customSlots.put(106, this.addSlot(new SlotItemHandler(internal, 106, 256, 77) {
		}));
		this.customSlots.put(107, this.addSlot(new SlotItemHandler(internal, 107, 274, 77) {
		}));
		this.customSlots.put(108, this.addSlot(new SlotItemHandler(internal, 108, 292, 77) {
		}));
		this.customSlots.put(109, this.addSlot(new SlotItemHandler(internal, 109, 310, 77) {
		}));
		this.customSlots.put(110, this.addSlot(new SlotItemHandler(internal, 110, 328, 77) {
		}));
		this.customSlots.put(111, this.addSlot(new SlotItemHandler(internal, 111, 346, 77) {
		}));
		this.customSlots.put(112, this.addSlot(new SlotItemHandler(internal, 112, 364, 77) {
		}));
		this.customSlots.put(113, this.addSlot(new SlotItemHandler(internal, 113, 382, 77) {
		}));
		this.customSlots.put(114, this.addSlot(new SlotItemHandler(internal, 114, 400, 77) {
		}));
		this.customSlots.put(115, this.addSlot(new SlotItemHandler(internal, 115, 4, 95) {
		}));
		this.customSlots.put(116, this.addSlot(new SlotItemHandler(internal, 116, 22, 95) {
		}));
		this.customSlots.put(117, this.addSlot(new SlotItemHandler(internal, 117, 40, 95) {
		}));
		this.customSlots.put(118, this.addSlot(new SlotItemHandler(internal, 118, 58, 95) {
		}));
		this.customSlots.put(119, this.addSlot(new SlotItemHandler(internal, 119, 76, 95) {
		}));
		this.customSlots.put(120, this.addSlot(new SlotItemHandler(internal, 120, 94, 95) {
		}));
		this.customSlots.put(121, this.addSlot(new SlotItemHandler(internal, 121, 112, 95) {
		}));
		this.customSlots.put(122, this.addSlot(new SlotItemHandler(internal, 122, 130, 95) {
		}));
		this.customSlots.put(123, this.addSlot(new SlotItemHandler(internal, 123, 148, 95) {
		}));
		this.customSlots.put(124, this.addSlot(new SlotItemHandler(internal, 124, 166, 95) {
		}));
		this.customSlots.put(125, this.addSlot(new SlotItemHandler(internal, 125, 184, 95) {
		}));
		this.customSlots.put(126, this.addSlot(new SlotItemHandler(internal, 126, 202, 95) {
		}));
		this.customSlots.put(127, this.addSlot(new SlotItemHandler(internal, 127, 220, 95) {
		}));
		this.customSlots.put(128, this.addSlot(new SlotItemHandler(internal, 128, 238, 95) {
		}));
		this.customSlots.put(129, this.addSlot(new SlotItemHandler(internal, 129, 256, 95) {
		}));
		this.customSlots.put(130, this.addSlot(new SlotItemHandler(internal, 130, 274, 95) {
		}));
		this.customSlots.put(131, this.addSlot(new SlotItemHandler(internal, 131, 292, 95) {
		}));
		this.customSlots.put(132, this.addSlot(new SlotItemHandler(internal, 132, 310, 95) {
		}));
		this.customSlots.put(133, this.addSlot(new SlotItemHandler(internal, 133, 328, 95) {
		}));
		this.customSlots.put(134, this.addSlot(new SlotItemHandler(internal, 134, 346, 95) {
		}));
		this.customSlots.put(135, this.addSlot(new SlotItemHandler(internal, 135, 364, 95) {
		}));
		this.customSlots.put(136, this.addSlot(new SlotItemHandler(internal, 136, 382, 95) {
		}));
		this.customSlots.put(137, this.addSlot(new SlotItemHandler(internal, 137, 400, 95) {
		}));
		this.customSlots.put(138, this.addSlot(new SlotItemHandler(internal, 138, 4, 113) {
		}));
		this.customSlots.put(139, this.addSlot(new SlotItemHandler(internal, 139, 22, 113) {
		}));
		this.customSlots.put(140, this.addSlot(new SlotItemHandler(internal, 140, 40, 113) {
		}));
		this.customSlots.put(141, this.addSlot(new SlotItemHandler(internal, 141, 58, 113) {
		}));
		this.customSlots.put(142, this.addSlot(new SlotItemHandler(internal, 142, 76, 113) {
		}));
		this.customSlots.put(143, this.addSlot(new SlotItemHandler(internal, 143, 94, 113) {
		}));
		this.customSlots.put(144, this.addSlot(new SlotItemHandler(internal, 144, 310, 113) {
		}));
		this.customSlots.put(145, this.addSlot(new SlotItemHandler(internal, 145, 328, 113) {
		}));
		this.customSlots.put(146, this.addSlot(new SlotItemHandler(internal, 146, 346, 113) {
		}));
		this.customSlots.put(147, this.addSlot(new SlotItemHandler(internal, 147, 364, 113) {
		}));
		this.customSlots.put(148, this.addSlot(new SlotItemHandler(internal, 148, 382, 113) {
		}));
		this.customSlots.put(149, this.addSlot(new SlotItemHandler(internal, 149, 400, 113) {
		}));
		this.customSlots.put(150, this.addSlot(new SlotItemHandler(internal, 150, 4, 131) {
		}));
		this.customSlots.put(151, this.addSlot(new SlotItemHandler(internal, 151, 22, 131) {
		}));
		this.customSlots.put(152, this.addSlot(new SlotItemHandler(internal, 152, 40, 131) {
		}));
		this.customSlots.put(153, this.addSlot(new SlotItemHandler(internal, 153, 58, 131) {
		}));
		this.customSlots.put(154, this.addSlot(new SlotItemHandler(internal, 154, 76, 131) {
		}));
		this.customSlots.put(155, this.addSlot(new SlotItemHandler(internal, 155, 94, 131) {
		}));
		this.customSlots.put(156, this.addSlot(new SlotItemHandler(internal, 156, 310, 131) {
		}));
		this.customSlots.put(157, this.addSlot(new SlotItemHandler(internal, 157, 328, 131) {
		}));
		this.customSlots.put(158, this.addSlot(new SlotItemHandler(internal, 158, 346, 131) {
		}));
		this.customSlots.put(159, this.addSlot(new SlotItemHandler(internal, 159, 364, 131) {
		}));
		this.customSlots.put(160, this.addSlot(new SlotItemHandler(internal, 160, 382, 131) {
		}));
		this.customSlots.put(161, this.addSlot(new SlotItemHandler(internal, 161, 400, 131) {
		}));
		this.customSlots.put(162, this.addSlot(new SlotItemHandler(internal, 162, 4, 149) {
		}));
		this.customSlots.put(163, this.addSlot(new SlotItemHandler(internal, 163, 22, 149) {
		}));
		this.customSlots.put(164, this.addSlot(new SlotItemHandler(internal, 164, 40, 149) {
		}));
		this.customSlots.put(165, this.addSlot(new SlotItemHandler(internal, 165, 58, 149) {
		}));
		this.customSlots.put(166, this.addSlot(new SlotItemHandler(internal, 166, 76, 149) {
		}));
		this.customSlots.put(167, this.addSlot(new SlotItemHandler(internal, 167, 94, 149) {
		}));
		this.customSlots.put(168, this.addSlot(new SlotItemHandler(internal, 168, 310, 149) {
		}));
		this.customSlots.put(169, this.addSlot(new SlotItemHandler(internal, 169, 328, 149) {
		}));
		this.customSlots.put(170, this.addSlot(new SlotItemHandler(internal, 170, 346, 149) {
		}));
		this.customSlots.put(171, this.addSlot(new SlotItemHandler(internal, 171, 364, 149) {
		}));
		this.customSlots.put(172, this.addSlot(new SlotItemHandler(internal, 172, 382, 149) {
		}));
		this.customSlots.put(173, this.addSlot(new SlotItemHandler(internal, 173, 400, 149) {
		}));
		this.customSlots.put(174, this.addSlot(new SlotItemHandler(internal, 174, 4, 167) {
		}));
		this.customSlots.put(175, this.addSlot(new SlotItemHandler(internal, 175, 22, 167) {
		}));
		this.customSlots.put(176, this.addSlot(new SlotItemHandler(internal, 176, 40, 167) {
		}));
		this.customSlots.put(177, this.addSlot(new SlotItemHandler(internal, 177, 58, 167) {
		}));
		this.customSlots.put(178, this.addSlot(new SlotItemHandler(internal, 178, 76, 167) {
		}));
		this.customSlots.put(179, this.addSlot(new SlotItemHandler(internal, 179, 94, 167) {
		}));
		this.customSlots.put(180, this.addSlot(new SlotItemHandler(internal, 180, 310, 167) {
		}));
		this.customSlots.put(181, this.addSlot(new SlotItemHandler(internal, 181, 328, 167) {
		}));
		this.customSlots.put(182, this.addSlot(new SlotItemHandler(internal, 182, 346, 167) {
		}));
		this.customSlots.put(183, this.addSlot(new SlotItemHandler(internal, 183, 364, 167) {
		}));
		this.customSlots.put(184, this.addSlot(new SlotItemHandler(internal, 184, 382, 167) {
		}));
		this.customSlots.put(185, this.addSlot(new SlotItemHandler(internal, 185, 400, 167) {
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 123 + 8 + sj * 18, 32 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 123 + 8 + si * 18, 32 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 186) {
				if (!this.moveItemStackTo(itemstack1, 186, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 186, false)) {
				if (index < 186 + 27) {
					if (!this.moveItemStackTo(itemstack1, 186 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 186, 186 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0)
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
			if (itemstack1.getCount() == itemstack.getCount())
				return ItemStack.EMPTY;
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override
	protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
		boolean flag = false;
		int i = p_38905_;
		if (p_38907_) {
			i = p_38906_ - 1;
		}
		if (p_38904_.isStackable()) {
			while (!p_38904_.isEmpty()) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot = this.slots.get(i);
				ItemStack itemstack = slot.getItem();
				if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
					int j = itemstack.getCount() + p_38904_.getCount();
					int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
					if (j <= maxSize) {
						p_38904_.setCount(0);
						itemstack.setCount(j);
						slot.set(itemstack);
						flag = true;
					} else if (itemstack.getCount() < maxSize) {
						p_38904_.shrink(maxSize - itemstack.getCount());
						itemstack.setCount(maxSize);
						slot.set(itemstack);
						flag = true;
					}
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		if (!p_38904_.isEmpty()) {
			if (p_38907_) {
				i = p_38906_ - 1;
			} else {
				i = p_38905_;
			}
			while (true) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot1 = this.slots.get(i);
				ItemStack itemstack1 = slot1.getItem();
				if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
					if (p_38904_.getCount() > slot1.getMaxStackSize()) {
						slot1.set(p_38904_.split(slot1.getMaxStackSize()));
					} else {
						slot1.set(p_38904_.split(p_38904_.getCount()));
					}
					slot1.setChanged();
					flag = true;
					break;
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		return flag;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					if (j == 47)
						continue;
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					if (i == 47)
						continue;
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}
