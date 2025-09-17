public class HotAirBalloon extends AirTransport {
    private int basketCapacity;
    private String heatSource;

    public HotAirBalloon() {
        super();
        this.basketCapacity = 1;
        this.heatSource = "Propane";
        System.out.println("Constructed a HotAirBalloon with HotAirBalloon()");
    }

    public HotAirBalloon(String type, double speed, int capacity, String fuelType,
                         double maxAltitude, double wingspan,
                         int basketCapacity, String heatSource) {
        super(type, speed, capacity, fuelType, maxAltitude, wingspan);
        this.basketCapacity = basketCapacity;
        this.heatSource = heatSource;
        System.out.println("Constructed a HotAirBalloon with HotAirBalloon(...)");
    }

    public int getBasketCapacity() {
        return basketCapacity;
    }

    public void setBasketCapacity(int basketCapacity) {
        this.basketCapacity = basketCapacity;
    }

    public String getHeatSource() {
        return heatSource;
    }

    public void setHeatSource(String heatSource) {
        this.heatSource = heatSource;
    }

    public String inflate() {
        return "Inflating balloon using " + heatSource + ".";
    }

    public String floatUp() {
        return "Floating up with " + basketCapacity + " person(s).";
    }

    @Override
    public String toString() {
        return "HotAirBalloon{" + super.toString() +
                ", basketCapacity=" + basketCapacity +
                ", heatSource='" + heatSource + '\'' +
                "}";
    }
}
