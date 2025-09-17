public class ProjectTester {
    public static void main(String[] args) {
        System.out.println("🚀 ENERGY FOR EVERYONE SYSTEM TEST DRIVE 🚀\n");


        EnergySource es = new EnergySource("Generic Source", 100.0, "Unknown");

        RooftopSolarPanel rsvp = new RooftopSolarPanel("Rooftop-01", 50.0, "City A", 0.20, 30.0, 0.1);
        FloatingSolarFarm fsf = new FloatingSolarFarm("FloatFarm-01", 100.0, "Lake B", 0.22, 2000.0, 0.15);
        SolarCanopy sc = new SolarCanopy("Canopy-01", 75.0, "School C", 0.18, 60.0, 15);

        UrbanVerticalAxisWindTurbine vawt = new UrbanVerticalAxisWindTurbine("VAWT-01", 40.0, "Downtown D", 18.0, 45.0, 9);
        OffshoreWindTurbine owt = new OffshoreWindTurbine("Offshore-01", 200.0, "Ocean E", 25.0, "Tripile", 12);
        SmallCommunityWindMill smwm = new SmallCommunityWindMill("VillageMill-01", 15.0, "Village F", 12.0, true, true);

        PicoHydroGenerator phg = new PicoHydroGenerator("Pico-01", 8.0, "Mountain G", 20.0, 1.2, 8.0);
        RunOfRiverMicroHydro ror = new RunOfRiverMicroHydro("RunOfRiver-01", 30.0, "River H", 50.0, 150.0, "Low");
        HydroPumpStorageUnit hpsu = new HydroPumpStorageUnit("Pump-01", 150.0, "Reservoir I", 80.0, 60.0, 2000.0);

        System.out.println("=== ENERGY SOURCE ===");
        System.out.println(es.getStatus());
        System.out.println("Generated Energy: " + es.generateEnergy() + " kWh\n");

        System.out.println("=== SOLAR PANELS ===");
        System.out.println(rsvp.toString());
        System.out.println("Generated Energy: " + rsvp.generateEnergy() + " kWh\n");

        System.out.println(fsf.toString());
        System.out.println("Generated Energy: " + fsf.generateEnergy() + " kWh\n");

        System.out.println(sc.toString());
        System.out.println("Generated Energy: " + sc.generateEnergy() + " kWh\n");

        System.out.println("=== WIND TURBINES ===");
        System.out.println(vawt.toString());
        System.out.println("Generated Energy: " + vawt.generateEnergy() + " kWh\n");

        System.out.println(owt.toString());
        System.out.println("Generated Energy: " + owt.generateEnergy() + " kWh\n");

        System.out.println(smwm.toString());
        System.out.println("Generated Energy: " + smwm.generateEnergy() + " kWh\n");

        System.out.println("=== HYDRO GENERATORS ===");
        System.out.println(phg.toString());
        System.out.println("Generated Energy: " + phg.generateEnergy() + " kWh\n");

        System.out.println(ror.toString());
        System.out.println("Generated Energy: " + ror.generateEnergy() + " kWh\n");

        System.out.println(hpsu.toString());
        System.out.println("Generated Energy: " + hpsu.generateEnergy() + " kWh\n");

        System.out.println("\n✅ All classes tested successfully!");
    }
}