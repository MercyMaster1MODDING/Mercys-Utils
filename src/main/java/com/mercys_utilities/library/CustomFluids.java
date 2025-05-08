package com.mercys_utilities.library;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class CustomFluids extends Fluid{

    public CustomFluids(String name, ResourceLocation still, ResourceLocation flowing) {
        //TODO Auto-generated constructor stub
        super(name, still, flowing);

        // Register the fluid if it's not already registered
        if (!FluidRegistry.isFluidRegistered(name)) {
            FluidRegistry.registerFluid(this);
            FluidRegistry.addBucketForFluid(this); // Adds bucket support
        }
    }
    
}
