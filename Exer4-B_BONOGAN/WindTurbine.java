public class WindTurbine extends EnergySource {
    protected double avgWindSpeed_kmh;

    public WindTurbine() {
        super();
        this.avgWindSpeed_kmh = 15.0;
        System.out.println("Constructed a WindTurbine with default wind speed.");
    }

    public WindTurbine(String name, double capacity_kwh, String location, double avgWindSpeed_kmh) {
        super(name, capacity_kwh, location);
        this.avgWindSpeed_kmh = avgWindSpeed_kmh;
        System.out.println("Constructed a WindTurbine with wind speed: " + avgWindSpeed_kmh + " km/h");
    }

    @Override
    public double generateEnergy() {
        if (!isActive()) return 0.0;
        double powerFactor = 0.0008;
        return capacity_kwh * (avgWindSpeed_kmh / 10) * powerFactor;
    }

    public double getAvgWindSpeed_kmh() {
        return avgWindSpeed_kmh;
    }

    public void setAvgWindSpeed_kmh(double avgWindSpeed_kmh) {
        this.avgWindSpeed_kmh = avgWindSpeed_kmh;
    }

    @Override
    public String toString() {
        return "WindTurbine{" +
                "avgWindSpeed_kmh=" + avgWindSpeed_kmh +
                "} " + super.toString();
    }
}
