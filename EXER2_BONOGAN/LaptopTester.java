public class LaptopTester {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(
            "Apple",
            "MacBook Pro",
            "Chezka Luize",
            16,
            512,
            14.2,
            "Apple M2 Pro",
            false
        );

        Laptop laptop2 = new Laptop();
        laptop2.setBrand("Dell");
        laptop2.setModel("XPS 13");
        laptop2.setOwner("Jamie Sky");
        laptop2.setRamGB(8);
        laptop2.setStorageGB(256);
        laptop2.setScreenSizeInches(13.4);
        laptop2.setProcessor("Intel i7-1250U");
        laptop2.setOn(true); 

        laptop1.displayInfo();
        laptop2.displayInfo();

        laptop1.powerOn();
        laptop2.powerOff();
    }
}