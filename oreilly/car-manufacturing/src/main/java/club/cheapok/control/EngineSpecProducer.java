package club.cheapok.control;

import club.cheapok.control.engines.Diesel;
import club.cheapok.model.enums.EngineSpec;

import javax.enterprise.inject.Produces;

public class EngineSpecProducer {

    @Produces
    public EngineSpec produceEngineSpecification() {
        return EngineSpec.B4204T299;
    }

    @Produces
    @Diesel
    public EngineSpec produceDieselEngineSpecification() {
        return EngineSpec.D4204T6;
    }
}
