package com.github.thelonelysprite.examplemod.proxy;

import com.github.thelonelysprite.examplemod.ExampleMod;
import com.github.thelonelysprite.examplemod.handlers.GUIHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by justin on 14/08/2014.
 */
public abstract class CommonProxy {

    public void registerTileEntities() {

    }

    public void registerNetworkStuff() {
        NetworkRegistry.INSTANCE.registerGuiHandler(ExampleMod.instance, new GUIHandler());
    }

    public abstract void registerItemRenderers();

    public abstract void  registerTileRenderers();
}
