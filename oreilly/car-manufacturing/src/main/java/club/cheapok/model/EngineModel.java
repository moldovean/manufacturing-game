package club.cheapok.model;

import club.cheapok.model.enums.EngineSpec;
import club.cheapok.model.enums.FuelType;

public class EngineModel {
    EngineSpec engineSpec;
    // add turbo functionality

    public EngineModel(final EngineSpec engineSpec) {
        this.engineSpec = engineSpec;
    }



    public EngineSpec getEngineSpec() {
        return engineSpec;
    }

    @Override
    public String toString() {
        return "EngineModel{" +
                ", engineSpec=" + engineSpec +
                '}';
    }
}
