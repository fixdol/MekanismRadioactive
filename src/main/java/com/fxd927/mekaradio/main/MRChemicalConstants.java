package com.fxd927.mekaradio.main;

import mekanism.common.base.IChemicalConstant;

public enum MRChemicalConstants implements IChemicalConstant {
    BERYLLIUM("beryllium",0xFF00DB1B,0,1560.15F,1850F);

    private final String name;
    private final int color;
    private final int luminosity;
    private final float temperature;
    private final float density;

    MRChemicalConstants(String name,int color,int luminosity,float temperature,float density){
        this.name = name;
        this.color = color;
        this.luminosity = luminosity;
        this.temperature = temperature;
        this.density = density;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public float getTemperature() {
        return temperature;
    }

    @Override
    public float getDensity() {
        return density;
    }

    @Override
    public int getLuminosity() {
        return luminosity;
    }
}
