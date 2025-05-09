package com.mercys_utilities.init;

import com.mercys_utilities.library.fluid_library.LiquidInfinity;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Init_registar {

    public static LiquidInfinity LIQUID_INFINITY;
    public static Block LIQUID_INFINITY_BLOCK;

    public static void init() {
        // Register the fluid
        LIQUID_INFINITY = new LiquidInfinity();

        // Create and register the fluid block
        LIQUID_INFINITY_BLOCK = new BlockFluidClassic(LIQUID_INFINITY, Material.WATER)
                .setUnlocalizedName("liquid_infinity")
                .setRegistryName("liquid_infinity");

        // Register the fluid block and item block
        ForgeRegistries.BLOCKS.register(LIQUID_INFINITY_BLOCK);
        ForgeRegistries.ITEMS.register(new ItemBlock(LIQUID_INFINITY_BLOCK).setRegistryName(LIQUID_INFINITY_BLOCK.getRegistryName()));
    }
}
