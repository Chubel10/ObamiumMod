package com.chubel.obamiummod.block;

import java.util.Random;

import net.minecraft.block.Block;
import com.chubel.obamiummod.init.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ModOreBlock extends OreBlock {
	public ModOreBlock(Block.Properties properties) {
		super(properties);
	}

	protected int whatOreXP(Random random) {

		return this == ModBlocks.OBAMIUM_ORE.get() ? 0 : MathHelper.nextInt(random, 0, 2);

	}

	public void spawnAdditionalDrops(BlockState state, World worldIn, BlockPos pos, ItemStack stack) {
		super.spawnAdditionalDrops(state, worldIn, pos, stack);
	}

	@Override
	public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune,
			int silktouch) {
		return silktouch == 0 ? this.whatOreXP(RANDOM) : 0;
	}
}
