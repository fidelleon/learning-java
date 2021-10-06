package cat.flm.models;

public class Apple {
    public float mass;
    private float diameter;
    public int x;
    public int y;
    public  static final float gravAccel = 9.8f;
    static final int SMALL = 0, MEDIUM = 1, LARGE = 2;

    public static String[] getAppleSizes() {
        return new String[] {"SMALL", "MEDIUM", "LARGE"};
    }


    public void printDetails() {
        System.out.println("  mass: " + mass);
        String[] niceNames = getAppleSizes();
        if (diameter < 5.0f) {
            System.out.println(niceNames[SMALL]);
        } else if (diameter < 10.0f) {
            System.out.println(niceNames[MEDIUM]);
        } else {
            System.out.println(niceNames[LARGE]);
        }
        System.out.println("  position: (" + x + ", " + y + ")");
    }

    public void setDiameter(float newDiameter) {
        diameter = newDiameter;
    }

    public float getDiameter() {
        return diameter;
    }

    public boolean isTouching(Apple other) {
        double xdiff = x - other.x;
        double ydiff = y - other.y;
        double distance = Math.sqrt(xdiff * xdiff + ydiff * ydiff);
        return distance < diameter / 2 + other.diameter / 2;
    }
}
