package com.mercys_utilities.library.fluid_library;

import com.mercys_utilities.library.CustomFluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class LiquidInfinity extends CustomFluids {
    public static final Fluid LIQUID_INFINITY = new LiquidInfinity();

     public LiquidInfinity() {
        super(
            "liquid_infinity",
            new ResourceLocation("mercys_utilities:textures/blocks/liquid_infinity_still"),
            new ResourceLocation("mercys_utilities:textures/blocks/liquid_infinity_flow")
        );
         
        this.setDensity(2000);
        this.setViscosity(3000);
        this.setLuminosity(0);
        this.setTemperature(1000);
        this.setUnlocalizedName("liquid_infinity");

     }

}
