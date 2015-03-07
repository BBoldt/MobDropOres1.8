package com.mattdahepic.mobdropores.blocks.ores;

import com.mattdahepic.mobdropores.blocks.MobOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import java.util.Random;

public class OreSpiderEye extends MobOre {
    public static final String NAME = "oreSpiderEye";
    public OreSpiderEye () {
        super(1);
        this.setUnlocalizedName(NAME);
    }
    @Override
    public Item getItemDropped(IBlockState state,Random random,int fortune) {
        return Items.spider_eye;
    }
    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos) {
        return new ItemStack(this);
    }
}
