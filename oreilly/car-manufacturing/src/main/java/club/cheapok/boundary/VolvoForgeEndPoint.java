package club.cheapok.boundary;

import club.cheapok.model.Car;
import club.cheapok.model.CarSpecification;
import club.cheapok.model.engine.EngineModel;
import club.cheapok.model.enums.CarModel;
import club.cheapok.model.enums.EngineSpec;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("volvo")
public class VolvoForgeEndPoint {

    @Inject
    CarFactory carFactory;
    @Inject
    CarSpecification carSpecification;


    @GET
    @Path("getCar2")
    public Car getCar2() {
        return carFactory.getCar(carSpecification);
    }

    public void setCarFactory(final CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public void setCarSpecification(final CarSpecification carSpecification) {
        this.carSpecification = carSpecification;
    }
}
