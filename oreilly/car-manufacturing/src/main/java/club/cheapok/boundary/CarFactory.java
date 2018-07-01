package club.cheapok.boundary;

import club.cheapok.model.Car;
import club.cheapok.model.CarSpecification;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.UUID;


@Stateless
public class CarFactory {

    @Inject
    private CarSpecification carSpecification;

    public Car getCar(CarSpecification specification) {
        Car car = new Car(specification);
        car.setIdentifier(UUID.randomUUID().toString());
        return car;
    }

    public void setCarSpecification(final CarSpecification carSpecification) {
        this.carSpecification = carSpecification;
    }
}
