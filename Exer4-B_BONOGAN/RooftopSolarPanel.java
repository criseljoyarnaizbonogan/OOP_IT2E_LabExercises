public class RooftopSolarPanel extends SolarPanel {
    private double roofTiltAngle;
    private double shadingFactor;

    public RooftopSolarPanel() {
        super();
        this.roofTiltAngle = 30.0;
        this.shadingFactor = 0.1;
        System.out.println("Constructed a RooftopSolarPanel with tilt: " + roofTiltAngle + "°");
    }

    public RooftopSolarPanel(String name, double capacity_kwh, String location, double panelEfficiency,
                             double roofTiltAngle, double shadingFactor) {
        super(name, capacity_kwh, location, panelEfficiency);
        this.roofTiltAngle = roofTiltAngle;
        this.shadingFactor = shadingFactor;
        System.out.println("Constructed a RooftopSolarPanel with tilt: " + roofTiltAngle + "°, shading: " + shadingFactor);
    }

    @Override
    public double generateEnergy() {
        if (!isActive()) return 0.0;
        double baseEnergy = super.generateEnergy();
        return baseEnergy * (1 - shadingFactor) * (roofTiltAngle / 45); 
    }

    @Override
    public String toString() {
        return "RooftopSolarPanel{" +
                "roofTiltAngle=" + roofTiltAngle +
                ", shadingFactor=" + shadingFactor +
                "} " + super.toString();
    }
}
