package cat.flm;

public class Car {
    String model;
    int doors;
    static final int DEFAULT_DOORS = 4;

    Car(String model, int doors) {
        this.model = model;
        this.doors = doors;
    }

    Car(String model) {
        this(model, DEFAULT_DOORS);
    }
}
