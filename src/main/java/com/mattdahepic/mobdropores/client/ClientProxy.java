package com.mattdahepic.mobdropores.client;

import com.mattdahepic.mobdropores.CommonProxy;
import com.mattdahepic.mobdropores.MobDropOres;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenderers() {
        // This is for rendering entities and so forth later on
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(MobDropOres.oreArrow),0,new ModelResourceLocation("mobdropores:oreArrow","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(MobDropOres.oreBlazeRod),0,new ModelResourceLocation("mobdropores:oreBlazeRod","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(MobDropOres.oreBone),0,new ModelResourceLocation("mobdropores:oreBone","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(MobDropOres.oreEnderpearl),0,new ModelResourceLocation("mobdropores:oreEnderpearl","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(MobDropOres.oreGhastTear),0,new ModelResourceLocation("mobdropores:oreGhastTear","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(MobDropOres.oreGunpowder),0,new ModelResourceLocation("mobdropores:oreGunpowder","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(MobDropOres.oreNetherStar),0,new ModelResourceLocation("mobdropores:oreNetherStar","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(MobDropOres.oreRottenFlesh),0,new ModelResourceLocation("mobdropores:oreRottenFlesh","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(MobDropOres.oreSlimeball),0,new ModelResourceLocation("mobdropores:oreSlimeball","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(MobDropOres.oreSpiderEye),0,new ModelResourceLocation("mobdropores:oreSpiderEye","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(MobDropOres.oreString),0,new ModelResourceLocation("mobdropores:oreString","inventory"));
    }
}
