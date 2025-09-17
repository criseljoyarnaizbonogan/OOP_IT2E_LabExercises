public class Ship extends WaterTransport {
    private int deckCount;
    private double cargoHoldVolume;

    public Ship() {
        super();
        this.deckCount = 1;
        this.cargoHoldVolume = 1000.0;
        System.out.println("Constructed a Ship with Ship()");
    }

    public Ship(String type, double speed, int capacity, String fuelType,
                double draftDepth, String propulsionType,
                int deckCount, double cargoHoldVolume) {
        super(type, speed, capacity, fuelType, draftDepth, propulsionType);
        this.deckCount = deckCount;
        this.cargoHoldVolume = cargoHoldVolume;
        System.out.println("Constructed a Ship with Ship(...)");
    }

    public int getDeckCount() {
        return deckCount;
    }

    public void setDeckCount(int deckCount) {
        this.deckCount = deckCount;
    }

    public double getCargoHoldVolume() {
        return cargoHoldVolume;
    }

    public void setCargoHoldVolume(double cargoHoldVolume) {
        this.cargoHoldVolume = cargoHoldVolume;
    }

    public String navigate() {
        return "Navigating ship with " + deckCount + " decks.";
    }

    @Override
    public String toString() {
        return "Ship{" + super.toString() +
                ", deckCount=" + deckCount +
                ", cargoHoldVolume=" + cargoHoldVolume +
                "}";
    }
}
