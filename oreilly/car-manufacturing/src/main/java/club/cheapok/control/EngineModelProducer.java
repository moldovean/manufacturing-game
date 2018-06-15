package club.cheapok.control;

import club.cheapok.control.engines.Diesel;
import club.cheapok.control.engines.Hybrid;
import club.cheapok.control.engines.Petrol;
import club.cheapok.model.EngineModel;
import club.cheapok.model.enums.EngineSpec;

public class EngineModelProducer {


    public EngineModel defaultPetrolEngineModel() {
        return new EngineModel(EngineSpec.B4204T44);
    }

    @Diesel
    public EngineModel dieselEngineModel() {
        return new EngineModel(EngineSpec.D4204T6);
    }

    @Petrol
    public EngineModel petrolEngineModel() {
        return new EngineModel(EngineSpec.B4204T27);
    }

    @Hybrid
    public EngineModel hybridlEngineModel() {
        return new EngineModel(EngineSpec.B4204T299);
    }

}
