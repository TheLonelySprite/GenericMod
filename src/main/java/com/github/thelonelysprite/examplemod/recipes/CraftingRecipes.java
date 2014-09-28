package com.github.thelonelysprite.examplemod.recipes;

import com.github.thelonelysprite.examplemod.blocks.ModBlocks;
import com.github.thelonelysprite.examplemod.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by justin on 28/09/2014.
 */
public class CraftingRecipes {
    public static void init() {
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.book), "materialPaper", "materialPaper", "materialPaper", ModItems.exampleItem));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.exampleItem,10),  "A A", " B ", "A A", 'A', ModBlocks.exampleBlock, 'B',
                "dyeBlack" ));
    }
}
