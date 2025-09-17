public class Motorcycle extends LandTransport {
    private int engineCC;
    private boolean hasSideCar;

    public Motorcycle() {
        super();
        this.engineCC = 0;
        this.hasSideCar = false;
        System.out.println("Constructed a Motorcycle with Motorcycle()");
    }

    public Motorcycle(String type, double speed, int capacity, String fuelType,
                      int numberOfWheels, String terrainType,
                      int engineCC, boolean hasSideCar) {
        super(type, speed, capacity, fuelType, numberOfWheels, terrainType);
        this.engineCC = engineCC;
        this.hasSideCar = hasSideCar;
        System.out.println("Constructed a Motorcycle with Motorcycle(...)");
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    public boolean hasSideCar() {
        return hasSideCar;
    }

    public void setSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public String accelerate() {
        return "Accelerating with " + engineCC + "cc engine.";
    }

    @Override
    public String toString() {
        return "Motorcycle{" + super.toString() +
                ", engineCC=" + engineCC +
                ", hasSideCar=" + hasSideCar +
                "}";
    }
}