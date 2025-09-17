public class LandTransport extends Transportation {
    private int numberOfWheels;
    private String terrainType;

    public LandTransport() {
        super();
        this.numberOfWheels = 4;
        this.terrainType = "Road";
        System.out.println("Constructed a LandTransport with LandTransport()");
    }

    public LandTransport(String type, double speed, int capacity, String fuelType,
                         int numberOfWheels, String terrainType) {
        super(type, speed, capacity, fuelType);
        this.numberOfWheels = numberOfWheels;
        this.terrainType = terrainType;
        System.out.println("Constructed a LandTransport with LandTransport(...)");
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    public String drive() {
        return "Driving on " + terrainType + " with " + numberOfWheels + " wheels.";
    }

    @Override
    public String toString() {
        return "LandTransport{" + super.toString() +
                ", numberOfWheels=" + numberOfWheels +
                ", terrainType='" + terrainType + '\'' +
                "}";
    }
}