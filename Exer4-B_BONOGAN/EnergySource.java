public class EnergySource {

    private String name;
    private double capacity_kwh;
    private String location;
    private boolean isActive;

    public EnergySource() {
        this.name = "Unknown";
        this.capacity_kwh = 0.0;
        this.location = "Unknown";
        this.isActive = true;
        System.out.println("Constructed an EnergySource with default values.");
    }

    public EnergySource(String name, double capacity_kwh, String location) {
        this.name = name;
        this.capacity_kwh = capacity_kwh;
        this.location = location;
        this.isActive = true;
        System.out.println("Constructed an EnergySource with name: " + name);
    }

    public double generateEnergy() {
        return 0.0; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity_kwh() {
        return capacity_kwh;
    }

    public void setCapacity_kwh(double capacity_kwh) {
        this.capacity_kwh = capacity_kwh;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getStatus() {
        return "Name: " + name + ", Capacity: " + capacity_kwh + " kWh, Location: " + location + ", Status: " + (isActive ? "Active" : "Inactive");
    }

    @Override
    public String toString() {
        return "EnergySource{" +
                "name='" + name + '\'' +
                ", capacity_kwh=" + capacity_kwh +
                ", location='" + location + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}