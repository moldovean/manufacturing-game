package club.cheapok.control;

import club.cheapok.model.enums.CarModel;

import javax.enterprise.inject.Produces;


public class CarModelProducer {

    @Produces
    public CarModel newCarModelProducer() {
        return CarModel.V70;
    }
}
