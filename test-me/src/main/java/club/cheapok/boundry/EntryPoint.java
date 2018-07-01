package club.cheapok.boundry;

import club.cheapok.entity.Car;
import club.cheapok.entity.CarSpecification;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("me")
public class EntryPoint {

    @Inject
    CarSpecification carSpecification;

    @GET
    public Car iakaCar() {
        return new Car(carSpecification);
    }

    public void setCarSpecification(final CarSpecification carSpecification) {
        this.carSpecification = carSpecification;
    }
}
