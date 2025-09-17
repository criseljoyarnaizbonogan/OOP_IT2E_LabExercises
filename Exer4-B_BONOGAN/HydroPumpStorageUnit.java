public class HydroPumpStorageUnit extends HydroGenerator {
    private double pumpingCapacity;
    private double storageTankVolume;

    public HydroPumpStorageUnit() {
        super();
        this.pumpingCapacity = 50.0;
        this.storageTankVolume = 1000.0;
        System.out.println("Constructed a HydroPumpStorageUnit with tank volume: " + storageTankVolume + " m³");
    }

    public HydroPumpStorageUnit(String name, double capacity_kwh, String location, double waterFlowRate_lps,
                                double pumpingCapacity, double storageTankVolume) {
        super(name, capacity_kwh, location, waterFlowRate_lps);
        this.pumpingCapacity = pumpingCapacity;
        this.storageTankVolume = storageTankVolume;
        System.out.println("Constructed a HydroPumpStorageUnit with tank volume: " + storageTankVolume + " m³");
    }

    @Override
    public double generateEnergy() {
        if (!isActive()) return 0.0;
        double baseEnergy = super.generateEnergy();
        return baseEnergy * 1.5; 
    }

    @Override
    public String toString() {
        return "HydroPumpStorageUnit{" +
                "pumpingCapacity=" + pumpingCapacity +
                ", storageTankVolume=" + storageTankVolume +
                "} " + super.toString();
    }
}
