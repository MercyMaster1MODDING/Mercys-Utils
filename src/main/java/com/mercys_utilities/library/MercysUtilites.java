package com.mercys_utilities.library;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.apache.logging.log4j.Logger;

import com.mercys_utilities.CommonProxy;
import com.mercys_utilities.init.Init_registar;
import com.mercys_utilities.library.fluid_library.LiquidInfinity;

@Mod(modid = MercysUtilites.MODID, name = MercysUtilites.NAME, version = MercysUtilites.VERSION)
public class MercysUtilites
{
    public static final String MODID = "mercys_utilities";
    public static final String NAME = "Mercys Utils";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "com.mercys_utilities.ClientProxy", serverSide = "yourmod.package.CommonProxy")
    public static CommonProxy proxy;

    private static Logger logger;

    // This is where you access the mod's event bus
     // Registering event handler for the event bus
     {
        MinecraftForge.EVENT_BUS.register(this);
           
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        Init_registar.init();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        proxy.init(event);
    }
    @SubscribeEvent
    public void onRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
        
        new BlockFluidClassic(new LiquidInfinity(), Material.WATER).setRegistryName("liquid_infinity_block"));
    }
}
