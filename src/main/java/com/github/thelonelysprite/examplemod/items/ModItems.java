package com.github.thelonelysprite.examplemod.items;

import com.github.thelonelysprite.examplemod.Constants;
import com.github.thelonelysprite.examplemod.ExampleMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by justin on 19/09/2014.
 */
public class ModItems {

    public static Item exampleItem;

    public static void init(){
        exampleItem = new ModItem().setCreativeTab(ExampleMod.Tab).setUnlocalizedName(Constants.MODID+":name").setTextureName(Constants.MODID+":name");
        GameRegistry.registerItem(exampleItem, "name");
    }
}
