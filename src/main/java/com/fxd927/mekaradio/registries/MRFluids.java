package com.fxd927.mekaradio.registries;

import com.fxd927.mekaradio.main.MRChemicalConstants;
import com.fxd927.mekaradio.main.MekanismRadioactive;
import mekanism.common.registration.impl.FluidDeferredRegister;
import mekanism.common.registration.impl.FluidRegistryObject;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public class MRFluids {
    private MRFluids(){
    }
    public static final FluidDeferredRegister FLUIDS = new FluidDeferredRegister(MekanismRadioactive.MODID);
    public static final FluidRegistryObject<ForgeFlowingFluid.Source,ForgeFlowingFluid.Flowing,LiquidBlock,BucketItem> BERYLLIUM = FLUIDS.registerLiquidChemical(MRChemicalConstants.BERYLLIUM);
}
