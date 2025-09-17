public class SmallCommunityWindMill extends WindTurbine {
    private boolean manualMaintenance;
    private boolean localMaterialsUsed;

    public SmallCommunityWindMill() {
        super();
        this.manualMaintenance = true;
        this.localMaterialsUsed = true;
        System.out.println("Constructed a SmallCommunityWindMill using local materials");
    }

    public SmallCommunityWindMill(String name, double capacity_kwh, String location, double avgWindSpeed_kmh,
                                  boolean manualMaintenance, boolean localMaterialsUsed) {
        super(name, capacity_kwh, location, avgWindSpeed_kmh);
        this.manualMaintenance = manualMaintenance;
        this.localMaterialsUsed = localMaterialsUsed;
        System.out.println("Constructed a SmallCommunityWindMill using local materials");
    }

    @Override
    public double generateEnergy() {
        if (!isActive()) return 0.0;
        double baseEnergy = super.generateEnergy();
        return baseEnergy * 0.8;
    }

    @Override
    public String toString() {
        return "SmallCommunityWindMill{" +
                "manualMaintenance=" + manualMaintenance +
                ", localMaterialsUsed=" + localMaterialsUsed +
                "} " + super.toString();
    }
}