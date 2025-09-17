public class Tricycle extends LandTransport {
    private boolean pedalDriven;
    private int carryingBaskets;

    public Tricycle() {
        super();
        this.pedalDriven = true;
        this.carryingBaskets = 0;
        System.out.println("Constructed a Tricycle with Tricycle()");
    }

    public Tricycle(String type, double speed, int capacity, String fuelType,
                    int numberOfWheels, String terrainType,
                    boolean pedalDriven, int carryingBaskets) {
        super(type, speed, capacity, fuelType, numberOfWheels, terrainType);
        this.pedalDriven = pedalDriven;
        this.carryingBaskets = carryingBaskets;
        System.out.println("Constructed a Tricycle with Tricycle(...)");
    }

    public boolean isPedalDriven() {
        return pedalDriven;
    }

    public void setPedalDriven(boolean pedalDriven) {
        this.pedalDriven = pedalDriven;
    }

    public int getCarryingBaskets() {
        return carryingBaskets;
    }

    public void setCarryingBaskets(int carryingBaskets) {
        this.carryingBaskets = carryingBaskets;
    }

    public String ride() {
        return "Riding tricycle with " + carryingBaskets + " baskets.";
    }

    @Override
    public String toString() {
        return "Tricycle{" + super.toString() +
                ", pedalDriven=" + pedalDriven +
                ", carryingBaskets=" + carryingBaskets +
                "}";
    }
}