public class HydroGenerator extends EnergySource {
    protected double waterFlowRate_lps;

    public HydroGenerator() {
        super();
        this.waterFlowRate_lps = 10.0;
        System.out.println("Constructed a HydroGenerator with default flow rate.");
    }

    public HydroGenerator(String name, double capacity_kwh, String location, double waterFlowRate_lps) {
        super(name, capacity_kwh, location);
        this.waterFlowRate_lps = waterFlowRate_lps;
        System.out.println("Constructed a HydroGenerator with flow rate: " + waterFlowRate_lps + " L/s");
    }

    @Override
    public double generateEnergy() {
        if (!isActive()) return 0.0;
        double conversionFactor = 0.0007;
        return capacity_kwh * waterFlowRate_lps * conversionFactor;
    }

    public double getWaterFlowRate_lps() {
        return waterFlowRate_lps;
    }

    public void setWaterFlowRate_lps(double waterFlowRate_lps) {
        this.waterFlowRate_lps = waterFlowRate_lps;
    }

    @Override
    public String toString() {
        return "HydroGenerator{" +
                "waterFlowRate_lps=" + waterFlowRate_lps +
                "} " + super.toString();
    }
}
