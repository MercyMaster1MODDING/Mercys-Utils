package com.mercys_utilities.library.fluid_library;

import com.mercys_utilities.library.CustomFluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class liquid_infinity extends CustomFluids {
    public static Fluid INSTANCE = new liquid_infinity();

     public liquid_infinity() {
        super(
            "liquid_infinity",
            new ResourceLocation("mercys_utilities", "blocks/liquid_infinity_still"),
            new ResourceLocation("mercys_utilities", "blocks/liquid_infinity_flow")
        );
         
        this.setDensity(2000);
        this.setViscosity(3000);
        this.setLuminosity(0);
        this.setTemperature(1000);
        this.setUnlocalizedName("liquid_infinity");

     }

}
