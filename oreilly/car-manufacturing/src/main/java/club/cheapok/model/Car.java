package club.cheapok.model;

import club.cheapok.model.engine.EngineModel;
import club.cheapok.model.enums.CarModel;
import club.cheapok.model.enums.Color;

import javax.enterprise.context.Dependent;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.UUID;

@XmlRootElement
public class Car {
    String identifier;
    CarModel carModel;
    Color color;
    EngineModel engineModel;

    public Car() {
        this.identifier = UUID.randomUUID().toString();
    }

    public Car(CarSpecification carSpecification) {
        this();
        this.carModel = carSpecification.getCarModel();
        this.color = carSpecification.getColor();
        this.engineModel = carSpecification.getEngineModel();
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(final CarModel carModel) {
        this.carModel = carModel;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(final Color color) {
        this.color = color;
    }

    public EngineModel getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(final EngineModel engineModel) {
        this.engineModel = engineModel;
    }

    public void setIdentifier(final String identifier) {
        this.identifier = identifier;
    }
}
