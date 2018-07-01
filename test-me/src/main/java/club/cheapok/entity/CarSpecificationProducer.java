package club.cheapok.entity;

import javax.enterprise.inject.Produces;

public class CarSpecificationProducer {
    @Produces
    public CarSpecification defaultCar() {
        return new CarSpecification("White", "Volvo XC60");
    }
}
