
package net.mcreator.compressedgrass.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.compressedgrass.init.CompressedGrassModItems;
import net.mcreator.compressedgrass.init.CompressedGrassModFluids;
import net.mcreator.compressedgrass.init.CompressedGrassModFluidTypes;
import net.mcreator.compressedgrass.init.CompressedGrassModBlocks;

public abstract class GrassWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(
			() -> CompressedGrassModFluidTypes.GRASS_WATER_TYPE.get(), () -> CompressedGrassModFluids.GRASS_WATER.get(),
			() -> CompressedGrassModFluids.FLOWING_GRASS_WATER.get()).explosionResistance(100f).slopeFindDistance(3)
			.bucket(() -> CompressedGrassModItems.GRASS_WATER_BUCKET.get()).block(() -> (LiquidBlock) CompressedGrassModBlocks.GRASS_WATER.get());

	private GrassWaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends GrassWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends GrassWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
