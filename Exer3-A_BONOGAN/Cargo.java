public class Cargo extends AirTransport {
    private double cargoWeight;
    private int containerCount;

    public Cargo() {
        super();
        this.cargoWeight = 0.0;
        this.containerCount = 0;
        System.out.println("Constructed a Cargo with Cargo()");
    }

    public Cargo(String type, double speed, int capacity, String fuelType,
                 double maxAltitude, double wingspan,
                 double cargoWeight, int containerCount) {
        super(type, speed, capacity, fuelType, maxAltitude, wingspan);
        this.cargoWeight = cargoWeight;
        this.containerCount = containerCount;
        System.out.println("Constructed a Cargo with Cargo(...)");
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public int getContainerCount() {
        return containerCount;
    }

    public void setContainerCount(int containerCount) {
        this.containerCount = containerCount;
    }

    public String loadCargo() {
        return "Loading " + cargoWeight + " kg into " + containerCount + " containers.";
    }

    @Override
    public String toString() {
        return "Cargo{" + super.toString() +
                ", cargoWeight=" + cargoWeight +
                ", containerCount=" + containerCount +
                "}";
    }
}