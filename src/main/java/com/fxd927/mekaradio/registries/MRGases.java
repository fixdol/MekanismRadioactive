package com.fxd927.mekaradio.registries;

import com.fxd927.mekaradio.main.MRChemicalConstants;
import mekanism.api.chemical.attribute.ChemicalAttribute;
import mekanism.api.chemical.gas.Gas;
import mekanism.api.chemical.gas.attribute.GasAttributes;
import mekanism.common.registration.impl.GasDeferredRegister;
import mekanism.common.registration.impl.GasRegistryObject;

public class MRGases {
    public static final GasDeferredRegister GASES = new GasDeferredRegister("mekaradio");
    public static final GasRegistryObject<Gas> BERYLLIUM;
    public static final GasRegistryObject<Gas> AMERICIUM;
    public static final GasRegistryObject<Gas> DECAYED_NUCLEAR_WASTE;
    public static final GasRegistryObject<Gas> DECAYED_AMERICIUM;
    public static final GasRegistryObject<Gas> DECAYED_PLUTONIUM;
    public static final GasRegistryObject<Gas> NEUTRON;
    public static final GasRegistryObject<Gas> CURIUM;
    public static final GasRegistryObject<Gas> CALIFORNIUM;

    private MRGases(){
    }

    static {
        BERYLLIUM = GASES.register(MRChemicalConstants.BERYLLIUM);
        AMERICIUM = GASES.register("americium", 13983840, new ChemicalAttribute[]{new GasAttributes.Radiation(0.05)});
        DECAYED_NUCLEAR_WASTE = GASES.register("decayed_nuclear_waste", 2498581, new ChemicalAttribute[0]);
        DECAYED_AMERICIUM = GASES.register("decayed_americium", 13983840, new ChemicalAttribute[0]);
        DECAYED_PLUTONIUM = GASES.register("decayed_plutonium", 2068892, new ChemicalAttribute[0]);
        NEUTRON = GASES.register("neutron", 16772995, new ChemicalAttribute[0]);
        CURIUM = GASES.register("curium",15725501,new ChemicalAttribute[]{new GasAttributes.Radiation(0.07)});
        CALIFORNIUM = GASES.register("californium",0xFFF08B00,new ChemicalAttribute[]{new GasAttributes.Radiation(1.00)});
    }
}
