public class SolarCanopy extends SolarPanel {
    private double coverageArea;
    private int connectedDevices;

    public SolarCanopy() {
        super();
        this.coverageArea = 50.0;
        this.connectedDevices = 10;
        System.out.println("Constructed a SolarCanopy covering " + coverageArea + " m²");
    }

    public SolarCanopy(String name, double capacity_kwh, String location, double panelEfficiency,
                       double coverageArea, int connectedDevices) {
        super(name, capacity_kwh, location, panelEfficiency);
        this.coverageArea = coverageArea;
        this.connectedDevices = connectedDevices;
        System.out.println("Constructed a SolarCanopy covering " + coverageArea + " m²");
    }

    @Override
    public double generateEnergy() {
        if (!isActive()) return 0.0;
        double baseEnergy = super.generateEnergy();
        return baseEnergy * (connectedDevices / 10.0);
    }

    @Override
    public String toString() {
        return "SolarCanopy{" +
                "coverageArea=" + coverageArea +
                ", connectedDevices=" + connectedDevices +
                "} " + super.toString();
    }
}
