package club.cheapok.control;

import club.cheapok.model.enums.Color;

import javax.enterprise.inject.Produces;


public class ColorProducer {

    @Produces
    public Color whiteColor() {
        return Color.WHITE;
    }
}
