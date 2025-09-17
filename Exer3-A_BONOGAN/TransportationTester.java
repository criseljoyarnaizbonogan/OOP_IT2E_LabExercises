public class TransportationTester {
    public static void main(String[] args) {
        System.out.println("=== Testing Transportation Hierarchy ===\n");

        Cargo cargo = new Cargo("Cargo Plane", 800.0, 100, "Jet Fuel", 12000.0, 60.0, 50000.0, 10);
        HotAirBalloon balloon = new HotAirBalloon("Hot Air Balloon", 20.0, 1, "Propane", 3000.0, 0.0, 2, "Natural Gas");

        Truck truck = new Truck("Truck", 80.0, 5000, "Diesel", 6, "Road", 5000.0, 4);
        SUV suv = new SUV("SUV", 120.0, 5, "Gasoline", 4, "Road", true, true);
        Tricycle tricycle = new Tricycle("Tricycle", 20.0, 1, "Human Power", 3, "Road", true, 2);
        Motorcycle motorcycle = new Motorcycle("Motorcycle", 150.0, 1, "Gasoline", 2, "Road", 600, false);
        Kariton kariton = new Kariton("Kariton", 10.0, 2, "Human Power", 3, "Road", 2, true);

        Barge barge = new Barge("Barge", 10.0, 2000, "Diesel", 3.0, "Tug", true, 120.0);
        Ship ship = new Ship("Cargo Ship", 25.0, 5000, "Heavy Fuel", 8.0, "Engine", 5, 10000.0);

        System.out.println(cargo);
        System.out.println(balloon);
        System.out.println(truck);
        System.out.println(suv);
        System.out.println(tricycle);
        System.out.println(motorcycle);
        System.out.println(kariton);
        System.out.println(barge);
        System.out.println(ship);

        System.out.println("\n=== Demonstrating Methods ===");
        System.out.println("Cargo loading: " + cargo.loadCargo());
        System.out.println("Balloon inflating: " + balloon.inflate());
        System.out.println("Truck hauling: " + truck.haul());
        System.out.println("SUV towing: " + suv.tow());
        System.out.println("Tricycle riding: " + tricycle.ride());
        System.out.println("Motorcycle accelerating: " + motorcycle.accelerate());
        System.out.println("Kariton pushing: " + kariton.push());
        System.out.println("Barge transporting: " + barge.transportGoods());
        System.out.println("Ship navigating: " + ship.navigate());
    }
}