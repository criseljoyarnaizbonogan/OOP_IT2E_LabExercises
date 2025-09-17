public class Transportation {
    
    private String type;
    private double speed;
    private int capacity;
    private String fuelType;

    public Transportation() {
        this.type = "Generic";
        this.speed = 0.0;
        this.capacity = 0;
        this.fuelType = "Unknown";
        System.out.println("Constructed a Transportation with Transportation()");
    }

    public Transportation(String type, double speed, int capacity, String fuelType) {
        this.type = type;
        this.speed = speed;
        this.capacity = capacity;
        this.fuelType = fuelType;
        System.out.println("Constructed a Transportation with Transportation(type, speed, capacity, fuelType)");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Transportation{type='" + type + "', speed=" + speed + ", capacity=" + capacity + ", fuelType='" + fuelType + "'}";
    }
}