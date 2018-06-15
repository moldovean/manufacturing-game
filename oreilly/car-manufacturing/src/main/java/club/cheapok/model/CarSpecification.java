package club.cheapok.model;

import club.cheapok.model.enums.CarModel;
import club.cheapok.model.enums.Color;
import club.cheapok.model.enums.EngineSpec;

import javax.inject.Inject;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CarSpecification {
    @Inject
    private CarModel carModel;
    @Inject
    private EngineModel engineModel;
    @Inject
    private Color color;

    public CarSpecification() {
    }

    public CarSpecification(final CarModel carModel) {
        this.carModel = carModel;
    }

    public CarSpecification(final CarModel carModel, final EngineModel engineModel) {
        this.carModel = carModel;
        this.engineModel = engineModel;
    }

    public CarSpecification(final CarModel carModel, final EngineSpec engineSpec, final Color color) {
        this.carModel = carModel;
        this.engineModel = new EngineModel(engineSpec);
        this.color = color;
    }

    public CarSpecification(final CarModel carModel, final EngineModel engineModel, final Color color) {
        this.carModel = carModel;
        this.engineModel = engineModel;
        this.color = color;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(final CarModel carModel) {
        this.carModel = carModel;
    }

    public EngineModel getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(final EngineModel engineModel) {
        this.engineModel = engineModel;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(final Color color) {
        this.color = color;
    }

}
