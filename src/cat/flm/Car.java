package cat.flm;

interface Driveable {
    boolean startEngine();
    void stopEngine();
    float accelerate(float acc);
}

public class Car implements Driveable {
    String model;
    int doors;
    static final int DEFAULT_DOORS = 4;
    private boolean engineRunning = false;

    Car(String model, int doors) {
        this.model = model;
        this.doors = doors;
    }

    Car(String model) {
        this(model, DEFAULT_DOORS);
    }


    public boolean startEngine() {
        if (!engineRunning) {
            engineRunning = true;
            System.out.println("Car started");
            return true;
        } else {
            System.out.println("Car already started");
            return false;
        }
    }

    @Override
    public void stopEngine() {
        engineRunning = false;
        System.out.println("Car has been stopped");
    }

    @Override
    public float accelerate(float acc) {
        return 0;
    }
}
