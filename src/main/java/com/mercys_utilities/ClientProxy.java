package com.mercys_utilities;

import com.mercys_utilities.library.fluid_library.liquid_infinity;
import com.mercys_utilities.init.Init_registar;

import net.minecraft.block.BlockLiquid;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        // Client-side model and texture registration goes here
        ModelLoader.setCustomStateMapper(Init_registar.LIQUID_INFINITY_BLOCK, new StateMap.Builder().ignore(BlockLiquid.LEVEL).build());

    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        registerFluidRender(liquid_infinity.LIQUID_INFINITY); // or whatever your fluid is called
        // Any additional client-only init code
    }
    @Override
    public void registerFluidRender(Fluid fluid) {
    final Item fluidItem = FluidUtil.getFilledBucket(new FluidStack(fluid, 1000)).getItem();

    ModelResourceLocation location = new ModelResourceLocation(
        new ResourceLocation(fluid.getStill().getResourceDomain(), "fluid_bucket"), "inventory"
    );
    ModelLoader.setCustomModelResourceLocation(fluidItem, 0, location);
    }
}
