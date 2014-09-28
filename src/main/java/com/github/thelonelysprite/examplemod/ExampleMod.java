package com.github.thelonelysprite.examplemod;

import com.github.thelonelysprite.examplemod.blocks.ModBlocks;
import com.github.thelonelysprite.examplemod.items.ModItems;
import com.github.thelonelysprite.examplemod.proxy.CommonProxy;
import com.github.thelonelysprite.examplemod.recipes.CraftingRecipes;
import com.github.thelonelysprite.examplemod.recipes.FurnaceRecipes;
import com.github.thelonelysprite.examplemod.recipes.ModComp;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

@Mod(modid = Constants.MODID, version = Constants.VERSION)
public class ExampleMod {

    @Mod.Instance(Constants.MODID)
    public static ExampleMod instance;

    @SidedProxy(clientSide = "com.github.thelonelysprite.examplemod.proxy.ClientProxy", serverSide = "com.github.thelonelysprite.examplemod.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs Tab = new CreativeTabs(Constants.MODID) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.bedrock);
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModBlocks.init();
        CraftingRecipes.init();
        FurnaceRecipes.init();
        ModComp.init();
        Constants.log.info(ModItems.exampleItem.getUnlocalizedName());
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.registerItemRenderers();
        proxy.registerNetworkStuff();
        proxy.registerTileEntities();
        proxy.registerTileRenderers();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
