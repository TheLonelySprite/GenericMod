package com.github.thelonelysprite.examplemod.blocks;

import com.github.thelonelysprite.examplemod.Constants;
import com.github.thelonelysprite.examplemod.ExampleMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

/**
 * Created by justin on 19/09/2014.
 */
public class ModBlocks {
    public static Block exampleBlock;

    public static void init(){
        exampleBlock  = new ModBlock(Material.ground).setCreativeTab(ExampleMod.Tab).setBlockName(Constants.MODID+":block").setBlockTextureName(Constants.MODID+":block");
        GameRegistry.registerBlock(exampleBlock, "block");
    }
}
