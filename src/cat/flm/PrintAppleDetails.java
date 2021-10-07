package cat.flm;

public class PrintAppleDetails {
    public static void main(String[] args) {
        Car ibiza = new Car("Seat Ibiza");
        System.out.println(ibiza.startEngine());
        ibiza.stopEngine();
        System.out.println(ibiza.doors);
        Driveable vehicle;
        vehicle = ibiza;
        vehicle.startEngine();
        vehicle.startEngine();
        vehicle.stopEngine();
        /*
        System.out.println(Apple.gravAccel);
        Field f = new Field();
        f.setupApples();
        System.out.println("Apple a1:");
        f.a1.printDetails();
        System.out.println("Apple a2:");
        f.a2.printDetails();
        f.detectCollisions();*/
    }
}


