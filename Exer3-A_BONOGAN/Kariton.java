public class Kariton extends LandTransport {
    private int numSeats;
    private boolean manualBrake;

    public Kariton() {
        super();
        this.numSeats = 2;
        this.manualBrake = true;
        System.out.println("Constructed a Kariton with Kariton()");
    }

    public Kariton(String type, double speed, int capacity, String fuelType,
                   int numberOfWheels, String terrainType,
                   int numSeats, boolean manualBrake) {
        super(type, speed, capacity, fuelType, numberOfWheels, terrainType);
        this.numSeats = numSeats;
        this.manualBrake = manualBrake;
        System.out.println("Constructed a Kariton with Kariton(...)");
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public boolean hasManualBrake() {
        return manualBrake;
    }

    public void setManualBrake(boolean manualBrake) {
        this.manualBrake = manualBrake;
    }

    public String push() {
        return "Pushing kariton with " + numSeats + " seats.";
    }

    @Override
    public String toString() {
        return "Kariton{" + super.toString() +
                ", numSeats=" + numSeats +
                ", manualBrake=" + manualBrake +
                "}";
    }
}