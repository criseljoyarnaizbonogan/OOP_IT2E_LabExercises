public class SolarPanel extends EnergySource {
    protected double panelEfficiency;

    public SolarPanel() {
        super();
        this.panelEfficiency = 0.15;
        System.out.println("Constructed a SolarPanel with default efficiency.");
    }

    public SolarPanel(String name, double capacity_kwh, String location, double panelEfficiency) {
        super(name, capacity_kwh, location);
        this.panelEfficiency = panelEfficiency;
        System.out.println("Constructed a SolarPanel with efficiency: " + panelEfficiency);
    }

    @Override
    public double generateEnergy() {
        if (!isActive()) return 0.0;
        double dailyHours = 6.0;
        return capacity_kwh * panelEfficiency * dailyHours;
    }

    public double getPanelEfficiency() {
        return panelEfficiency;
    }

    public void setPanelEfficiency(double panelEfficiency) {
        this.panelEfficiency = panelEfficiency;
    }

    @Override
    public String toString() {
        return "SolarPanel{" +
                "panelEfficiency=" + panelEfficiency +
                "} " + super.toString();
    }
}
