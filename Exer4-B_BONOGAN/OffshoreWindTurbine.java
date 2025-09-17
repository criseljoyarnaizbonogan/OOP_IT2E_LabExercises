public class OffshoreWindTurbine extends WindTurbine {
    private String foundationType;
    private int maintenanceInterval;

    public OffshoreWindTurbine() {
        super();
        this.foundationType = "Monopile";
        this.maintenanceInterval = 6;
        System.out.println("Constructed an OffshoreWindTurbine with " + foundationType + " foundation");
    }

    public OffshoreWindTurbine(String name, double capacity_kwh, String location, double avgWindSpeed_kmh,
                               String foundationType, int maintenanceInterval) {
        super(name, capacity_kwh, location, avgWindSpeed_kmh);
        this.foundationType = foundationType;
        this.maintenanceInterval = maintenanceInterval;
        System.out.println("Constructed an OffshoreWindTurbine with " + foundationType + " foundation");
    }

    @Override
    public double generateEnergy() {
        if (!isActive()) return 0.0;
        double baseEnergy = super.generateEnergy();
        return baseEnergy * 1.2; 
    }

    @Override
    public String toString() {
        return "OffshoreWindTurbine{" +
                "foundationType='" + foundationType + '\'' +
                ", maintenanceInterval=" + maintenanceInterval +
                "} " + super.toString();
    }
}