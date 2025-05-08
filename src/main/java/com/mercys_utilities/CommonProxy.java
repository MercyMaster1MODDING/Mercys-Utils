package com.mercys_utilities;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void registerFluidRender(Fluid fluid) {

    }

    public void preInit(FMLPreInitializationEvent event) {
        // Register blocks, items, etc. here
    }

    public void init(FMLInitializationEvent event) {
        // Setup world gen, recipes, etc. here
    }

    public void postinit(FMLInitializationEvent event){

    }
}
