package com.fxd927.mekaradio.main;

import com.fxd927.mekaradio.registries.MRFluids;
import com.fxd927.mekaradio.registries.MRGases;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("mekaradio")
public class MekanismRadioactive {
    public static final String MODID = "mekaradio";
    public MekanismRadioactive(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MRGases.GASES.register(modEventBus);
        MRFluids.FLUIDS.register(modEventBus);
    }
}
