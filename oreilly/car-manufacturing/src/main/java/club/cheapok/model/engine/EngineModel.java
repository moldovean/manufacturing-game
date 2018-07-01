package club.cheapok.model.engine;

import club.cheapok.model.enums.EngineSpec;
import club.cheapok.model.enums.FuelType;

import javax.inject.Inject;

public class EngineModel {

    @Inject
    private EngineSpec engineSpec;
    // add turbo functionality

    @Inject
    public EngineModel(final EngineSpec engineSpec) {
        this.engineSpec = engineSpec;
    }



    public EngineSpec getEngineSpec() {
        return engineSpec;
    }

    public void setEngineSpec(final EngineSpec engineSpec) {
        this.engineSpec = engineSpec;
    }

    @Override
    public String toString() {
        return "EngineModel{" +
                ", engineSpec=" + engineSpec +
                '}';
    }
}
