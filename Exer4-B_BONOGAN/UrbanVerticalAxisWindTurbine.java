public class UrbanVerticalAxisWindTurbine extends WindTurbine {
    private double noiseLevel;
    private int birdSafetyRating;

    public UrbanVerticalAxisWindTurbine() {
        super();
        this.noiseLevel = 40.0;
        this.birdSafetyRating = 9;
        System.out.println("Constructed a VAWT with noise: " + noiseLevel + " dB");
    }

    public UrbanVerticalAxisWindTurbine(String name, double capacity_kwh, String location, double avgWindSpeed_kmh,
                                        double noiseLevel, int birdSafetyRating) {
        super(name, capacity_kwh, location, avgWindSpeed_kmh);
        this.noiseLevel = noiseLevel;
        this.birdSafetyRating = birdSafetyRating;
        System.out.println("Constructed a VAWT with noise: " + noiseLevel + " dB");
    }

    @Override
    public double generateEnergy() {
        if (!isActive()) return 0.0;
        double baseEnergy = super.generateEnergy();
        return baseEnergy * (birdSafetyRating / 10.0); 
    }

    @Override
    public String toString() {
        return "UrbanVerticalAxisWindTurbine{" +
                "noiseLevel=" + noiseLevel +
                ", birdSafetyRating=" + birdSafetyRating +
                "} " + super.toString();
    }
}