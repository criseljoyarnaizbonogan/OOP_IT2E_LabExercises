public class AirTransport extends Transportation {
    private double maxAltitude;
    private double wingspan;

    public AirTransport() {
        super();
        this.maxAltitude = 0.0;
        this.wingspan = 0.0;
        System.out.println("Constructed an AirTransport with AirTransport()");
    }

    public AirTransport(String type, double speed, int capacity, String fuelType,
                        double maxAltitude, double wingspan) {
        super(type, speed, capacity, fuelType);
        this.maxAltitude = maxAltitude;
        this.wingspan = wingspan;
        System.out.println("Constructed an AirTransport with AirTransport(...)");
    }

    public double getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(double maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public String fly() {
        return "Flying at altitude: " + maxAltitude + " meters.";
    }

    @Override
    public String toString() {
        return "AirTransport{" + super.toString() +
                ", maxAltitude=" + maxAltitude +
                ", wingspan=" + wingspan +
                "}";
    }
}
