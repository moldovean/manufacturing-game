package club.cheapok.control;

import club.cheapok.control.engines.Diesel;
import club.cheapok.control.engines.Hybrid;
import club.cheapok.control.engines.Petrol;
import club.cheapok.model.engine.EngineModel;
import club.cheapok.model.enums.EngineSpec;

import javax.enterprise.inject.Produces;


public class EngineModelProducer {

    /*@Produces
    public EngineModel dPetrolEngineModel() {
        return new EngineModel(EngineSpec.B4204T44);
    }*/


    @Diesel
    @Produces
    public EngineModel dieselEngineModel() {
        return new EngineModel(EngineSpec.D4204T6);
    }

    @Petrol
    @Produces
    public EngineModel petrolEngineModel() {
        return new EngineModel(EngineSpec.B4204T27);
    }

    @Hybrid
    @Produces
    public EngineModel hybridlEngineModel() {
        return new EngineModel(EngineSpec.B4204T299);
    }

}
