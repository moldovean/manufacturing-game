package club.cheapok.entity;

public class CarSpecification {
    String color;
    String model;

    public CarSpecification(final String color, final String model) {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }
}
