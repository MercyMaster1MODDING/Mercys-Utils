package com.mercys_utilities;

import com.mercys_utilities.library.fluid_library.LiquidInfinity;
import com.mercys_utilities.init.Init_registar;

import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
           
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        // Client-side model and texture registration goes here
        ModelLoader.setCustomStateMapper(Init_registar.LIQUID_INFINITY_BLOCK, new StateMap.Builder().build());

    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        registerFluidRender(LiquidInfinity.LIQUID_INFINITY);
        // Any additional client-only init code
    }
    private void registerFluidRender(Fluid liquidInfinity) {
    }

}
