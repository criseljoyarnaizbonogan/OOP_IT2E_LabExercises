public class WaterTransport extends Transportation {
    private double draftDepth;
    private String propulsionType;

    public WaterTransport() {
        super();
        this.draftDepth = 0.0;
        this.propulsionType = "Sail";
        System.out.println("Constructed a WaterTransport with WaterTransport()");
    }

    public WaterTransport(String type, double speed, int capacity, String fuelType,
                          double draftDepth, String propulsionType) {
        super(type, speed, capacity, fuelType);
        this.draftDepth = draftDepth;
        this.propulsionType = propulsionType;
        System.out.println("Constructed a WaterTransport with WaterTransport(...)");
    }

    public double getDraftDepth() {
        return draftDepth;
    }

    public void setDraftDepth(double draftDepth) {
        this.draftDepth = draftDepth;
    }

    public String getPropulsionType() {
        return propulsionType;
    }

    public void setPropulsionType(String propulsionType) {
        this.propulsionType = propulsionType;
    }

    public String sail() {
        return "Sailing using " + propulsionType + " propulsion.";
    }

    @Override
    public String toString() {
        return "WaterTransport{" + super.toString() +
                ", draftDepth=" + draftDepth +
                ", propulsionType='" + propulsionType + '\'' +
                "}";
    }
}