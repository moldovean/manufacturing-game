package club.cheapok.model;

import club.cheapok.model.enums.CarModel;
import club.cheapok.model.enums.Color;

import javax.inject.Inject;

public class Car {
    CarModel carModel;

    Color color;

    EngineModel engineModel;

    public Car() {
    }

    public Car(CarSpecification carSpecification) {
        this.carModel = carSpecification.getCarModel();
        this.color = carSpecification.getColor();
        this.engineModel = carSpecification.getEngineModel();
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel=" + carModel +
                ", color=" + color +
                ", engineModel=" + engineModel +
                '}';
    }
}
