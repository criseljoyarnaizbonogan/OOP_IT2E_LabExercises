public class SUV extends LandTransport {
    private boolean offRoadCapability;
    private boolean roofRack;

    public SUV() {
        super();
        this.offRoadCapability = false;
        this.roofRack = false;
        System.out.println("Constructed an SUV with SUV()");
    }

    public SUV(String type, double speed, int capacity, String fuelType,
               int numberOfWheels, String terrainType,
               boolean offRoadCapability, boolean roofRack) {
        super(type, speed, capacity, fuelType, numberOfWheels, terrainType);
        this.offRoadCapability = offRoadCapability;
        this.roofRack = roofRack;
        System.out.println("Constructed an SUV with SUV(...)");
    }

    public boolean isOffRoadCapable() {
        return offRoadCapability;
    }

    public void setOffRoadCapability(boolean offRoadCapability) {
        this.offRoadCapability = offRoadCapability;
    }

    public boolean hasRoofRack() {
        return roofRack;
    }

    public void setRoofRack(boolean roofRack) {
        this.roofRack = roofRack;
    }

    public String tow() {
        return "Towing with " + (offRoadCapability ? "off-road" : "on-road") + " capability.";
    }

    @Override
    public String toString() {
        return "SUV{" + super.toString() +
                ", offRoadCapability=" + offRoadCapability +
                ", roofRack=" + roofRack +
                "}";
    }
}