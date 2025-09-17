public class PicoHydroGenerator extends HydroGenerator {
    private double streamWidth;
    private double headHeight;

    public PicoHydroGenerator() {
        super();
        this.streamWidth = 1.0;
        this.headHeight = 5.0;
        System.out.println("Constructed a PicoHydroGenerator with head height: " + headHeight + "m");
    }

    public PicoHydroGenerator(String name, double capacity_kwh, String location, double waterFlowRate_lps,
                              double streamWidth, double headHeight) {
        super(name, capacity_kwh, location, waterFlowRate_lps);
        this.streamWidth = streamWidth;
        this.headHeight = headHeight;
        System.out.println("Constructed a PicoHydroGenerator with head height: " + headHeight + "m");
    }

    @Override
    public double generateEnergy() {
        if (!isActive()) return 0.0;
        double baseEnergy = super.generateEnergy();
        return baseEnergy * (headHeight / 10.0); 
    }

    @Override
    public String toString() {
        return "PicoHydroGenerator{" +
                "streamWidth=" + streamWidth +
                ", headHeight=" + headHeight +
                "} " + super.toString();
    }
}