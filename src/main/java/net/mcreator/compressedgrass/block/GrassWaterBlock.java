
package net.mcreator.compressedgrass.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.compressedgrass.init.CompressedGrassModFluids;

public class GrassWaterBlock extends LiquidBlock {
	public GrassWaterBlock() {
		super(() -> CompressedGrassModFluids.GRASS_WATER.get(),
				BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}
