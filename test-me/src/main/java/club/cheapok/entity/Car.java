package club.cheapok.entity;


public class Car {
    String color;
    String model;

    public Car(CarSpecification carSpecification) {
        this.color = carSpecification.getColor();
        this.model = carSpecification.getModel();
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

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
