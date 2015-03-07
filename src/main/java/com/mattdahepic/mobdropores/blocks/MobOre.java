package com.mattdahepic.mobdropores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class MobOre extends Block {
    public MobOre (int harvestLevel) {
        super(Material.rock);
        this.setHarvestLevel("pickaxe",harvestLevel);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setStepSound(Block.soundTypePiston);
        this.setHardness(3.0F);
    }
    @Override
    public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
        return true;
    }
}
