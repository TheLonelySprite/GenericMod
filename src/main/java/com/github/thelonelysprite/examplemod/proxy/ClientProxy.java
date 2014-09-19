package com.github.thelonelysprite.examplemod.proxy;

import com.github.thelonelysprite.examplemod.Constants;
import com.github.thelonelysprite.examplemod.items.ModItems;
import com.github.thelonelysprite.examplemod.renderers.RenderTransparentItem;
import net.minecraftforge.client.MinecraftForgeClient;

/**
 * Created by justin on 14/08/2014.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerItemRenderers() {
    MinecraftForgeClient.registerItemRenderer(ModItems.exampleItem, new RenderTransparentItem());
    }

    @Override
    public void  registerTileRenderers(){

    }
}
