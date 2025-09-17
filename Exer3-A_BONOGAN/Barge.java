public class Barge extends WaterTransport {
    private boolean tugBoatRequired;
    private double length;

    public Barge() {
        super();
        this.tugBoatRequired = true;
        this.length = 100.0;
        System.out.println("Constructed a Barge with Barge()");
    }

    public Barge(String type, double speed, int capacity, String fuelType,
                 double draftDepth, String propulsionType,
                 boolean tugBoatRequired, double length) {
        super(type, speed, capacity, fuelType, draftDepth, propulsionType);
        this.tugBoatRequired = tugBoatRequired;
        this.length = length;
        System.out.println("Constructed a Barge with Barge(...)");
    }

    public boolean isTugBoatRequired() {
        return tugBoatRequired;
    }

    public void setTugBoatRequired(boolean tugBoatRequired) {
        this.tugBoatRequired = tugBoatRequired;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String transportGoods() {
        return "Transporting goods via barge (" + length + "m long).";
    }

    @Override
    public String toString() {
        return "Barge{" + super.toString() +
                ", tugBoatRequired=" + tugBoatRequired +
                ", length=" + length +
                "}";
    }
}