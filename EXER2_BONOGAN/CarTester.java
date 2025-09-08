public class CarTester {
    public static void main(String[] args) {
        Car c1 = new Car(
            "Red",
            "ABC789",
            "CHS987654321",
            "Toyota",
            2023,
            "Kent Xander",
            2500
        );

        Car c2 = new Car();

        c2.setBrand("Honda");
        c2.setYearModel(2021);
        c2.setColor("Blue");
        c2.setPlateNo("XYZ123");
        c2.setChassisNo("CHS123456789");
        c2.setOwner("Jollian Arnaiz");
        c2.setEngineCC(1800);

        c1.displayInfo();
        c2.displayInfo();
    }
}