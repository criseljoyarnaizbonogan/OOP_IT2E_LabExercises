public class RunOfRiverMicroHydro extends HydroGenerator {
    private double channelLength;
    private String environmentalImpact;

    public RunOfRiverMicroHydro() {
        super();
        this.channelLength = 100.0;
        this.environmentalImpact = "Low";
        System.out.println("Constructed a Run-of-River MicroHydro with length: " + channelLength + "m");
    }

    public RunOfRiverMicroHydro(String name, double capacity_kwh, String location, double waterFlowRate_lps,
                                double channelLength, String environmentalImpact) {
        super(name, capacity_kwh, location, waterFlowRate_lps);
        this.channelLength = channelLength;
        this.environmentalImpact = environmentalImpact;
        System.out.println("Constructed a Run-of-River MicroHydro with length: " + channelLength + "m");
    }

    @Override
    public double generateEnergy() {
        if (!isActive()) return 0.0;
        double baseEnergy = super.generateEnergy();
        return baseEnergy * 1.1; 
    }

    @Override
    public String toString() {
        return "RunOfRiverMicroHydro{" +
                "channelLength=" + channelLength +
                ", environmentalImpact='" + environmentalImpact + '\'' +
                "} " + super.toString();
    }
}