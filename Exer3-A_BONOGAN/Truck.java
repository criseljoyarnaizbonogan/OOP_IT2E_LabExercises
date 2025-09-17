public class Truck extends LandTransport {
    private double payloadCapacity;
    private int axleCount;

    public Truck() {
        super();
        this.payloadCapacity = 5000.0;
        this.axleCount = 2;
        System.out.println("Constructed a Truck with Truck()");
    }

    public Truck(String type, double speed, int capacity, String fuelType,
                 int numberOfWheels, String terrainType,
                 double payloadCapacity, int axleCount) {
        super(type, speed, capacity, fuelType, numberOfWheels, terrainType);
        this.payloadCapacity = payloadCapacity;
        this.axleCount = axleCount;
        System.out.println("Constructed a Truck with Truck(...)");
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public int getAxleCount() {
        return axleCount;
    }

    public void setAxleCount(int axleCount) {
        this.axleCount = axleCount;
    }

    public String haul() {
        return "Hauling goods with " + payloadCapacity + " kg capacity.";
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                ", payloadCapacity=" + payloadCapacity +
                ", axleCount=" + axleCount +
                "}";
    }
}
