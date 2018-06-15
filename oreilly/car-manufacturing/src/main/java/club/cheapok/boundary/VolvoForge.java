package club.cheapok.boundary;

import club.cheapok.model.Car;
import club.cheapok.model.CarSpecification;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("volvo")
public class VolvoForge {


    @GET
    @Path("getCar")
    public Car getCar() {
        return new Car(new CarSpecification());
    }

}
