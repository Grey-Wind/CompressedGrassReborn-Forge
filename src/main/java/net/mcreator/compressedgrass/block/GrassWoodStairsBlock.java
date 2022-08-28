
package net.mcreator.compressedgrass.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.compressedgrass.itemgroup.GrassItemGroup;
import net.mcreator.compressedgrass.CompressedGrassModElements;

import java.util.List;
import java.util.Collections;

@CompressedGrassModElements.ModElement.Tag
public class GrassWoodStairsBlock extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:grass_wood_stairs")
	public static final Block block = null;

	public GrassWoodStairsBlock(CompressedGrassModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(GrassItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends StairsBlock {
		public CustomBlock() {
			super(() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(3.5999999999999996f, 2.4f)
					.setLightLevel(s -> 0)).getDefaultState(),
					Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(3.5999999999999996f, 2.4f)
							.setLightLevel(s -> 0));
			setRegistryName("grass_wood_stairs");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 6;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
