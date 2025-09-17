public class FloatingSolarFarm extends SolarPanel {
    private double waterSurfaceArea;
    private double coolingEffect;

    public FloatingSolarFarm() {
        super();
        this.waterSurfaceArea = 1000.0;
        this.coolingEffect = 0.1;
        System.out.println("Constructed a FloatingSolarFarm with area: " + waterSurfaceArea + " m²");
    }

    public FloatingSolarFarm(String name, double capacity_kwh, String location, double panelEfficiency,
                             double waterSurfaceArea, double coolingEffect) {
        super(name, capacity_kwh, location, panelEfficiency);
        this.waterSurfaceArea = waterSurfaceArea;
        this.coolingEffect = coolingEffect;
        System.out.println("Constructed a FloatingSolarFarm with area: " + waterSurfaceArea + " m²");
    }

    @Override
    public double generateEnergy() {
        if (!isActive()) return 0.0;
        double baseEnergy = super.generateEnergy();
        return baseEnergy * (1 + coolingEffect); 
    }

    @Override
    public String toString() {
        return "FloatingSolarFarm{" +
                "waterSurfaceArea=" + waterSurfaceArea +
                ", coolingEffect=" + coolingEffect +
                "} " + super.toString();
    }
}
    private double waterSurfaceArea;
    private double coolingEffect;

    public FloatingSolarFarm() {
        super();
        this.waterSurfaceArea = 1000.0;
        this.coolingEffect = 0.1;
        System.out.println("Constructed a FloatingSolarFarm with area: " + waterSurfaceArea + " m²");
    }

    public FloatingSolarFarm(String name, double capacity_kwh, String location, double panelEfficiency,
                             double waterSurfaceArea, double coolingEffect) {
        super(name, capacity_kwh, location, panelEfficiency);
        this.waterSurfaceArea = waterSurfaceArea;
        this.coolingEffect = coolingEffect;
        System.out.println("Constructed a FloatingSolarFarm with area: " + waterSurfaceArea + " m²");
    }

    @Override
    public double generateEnergy() {
        if (!isActive()) return 0.0;
        double baseEnergy = super.generateEnergy();
        return baseEnergy * (1 + coolingEffect); 
    }

    @Override
    public String toString() {
        return "FloatingSolarFarm{" +
                "waterSurfaceArea=" + waterSurfaceArea +
                ", coolingEffect=" + coolingEffect +
                "} " + super.toString();
    }
}