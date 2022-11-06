
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class CompressedGrassModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == Blocks.GRASS.asItem())
			event.setBurnTime(20);
		else if (itemstack.getItem() == CompressedGrassModItems.COMPRESSED_GRASS.get())
			event.setBurnTime(50);
		else if (itemstack.getItem() == CompressedGrassModItems.DOUBLE_COMPRESSED_GRASS.get())
			event.setBurnTime(250);
		else if (itemstack.getItem() == CompressedGrassModItems.TRIPLE_COMPRESSED_GRASS.get())
			event.setBurnTime(500);
		else if (itemstack.getItem() == CompressedGrassModItems.QUADRUPLE_COMPRESSED_GRASS.get())
			event.setBurnTime(1500);
		else if (itemstack.getItem() == CompressedGrassModItems.QUINTUPLE_COMPRESSED_GRASS.get())
			event.setBurnTime(2000);
		else if (itemstack.getItem() == CompressedGrassModItems.SEXTUPLE_COMPRESSED_GRASS.get())
			event.setBurnTime(2500);
		else if (itemstack.getItem() == CompressedGrassModItems.SEPTUPLE_COMPRESSED_GRASS.get())
			event.setBurnTime(3000);
		else if (itemstack.getItem() == CompressedGrassModItems.OCTUPLE_COMPRESSED_GRASS.get())
			event.setBurnTime(5000);
		else if (itemstack.getItem() == CompressedGrassModItems.NONUPLE_COMPRESSED_GRASS.get())
			event.setBurnTime(7000);
	}
}
