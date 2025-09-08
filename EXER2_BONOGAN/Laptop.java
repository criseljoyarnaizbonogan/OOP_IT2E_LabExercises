public class Laptop {

    private String brand;          
    private String model;           
    private String owner;           
    private int ramGB;              
    private int storageGB;          
    private double screenSizeInches; 
    private String processor;       
    private boolean isOn;           
   
    public Laptop() {
        this.brand = "Unknown Brand";
        this.model = "Unknown Model";
        this.owner = "No Owner";
        this.ramGB = 0;
        this.storageGB = 0;
        this.screenSizeInches = 0.0;
        this.processor = "Unknown Processor";
        this.isOn = false;
    }

    public Laptop(String brand, String model, String owner, int ramGB, int storageGB,
                  double screenSizeInches, String processor, boolean isOn) {
        this.brand = brand;
        this.model = model;
        this.owner = owner;
        this.ramGB = ramGB;
        this.storageGB = storageGB;
        this.screenSizeInches = screenSizeInches;
        this.processor = processor;
        this.isOn = isOn;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }

    public int getRamGB() { return ramGB; }
    public void setRamGB(int ramGB) { this.ramGB = ramGB; }

    public int getStorageGB() { return storageGB; }
    public void setStorageGB(int storageGB) { this.storageGB = storageGB; }

    public double getScreenSizeInches() { return screenSizeInches; }
    public void setScreenSizeInches(double screenSizeInches) { this.screenSizeInches = screenSizeInches; }

    public String getProcessor() { return processor; }
    public void setProcessor(String processor) { this.processor = processor; }

    public boolean isOn() { return isOn; }
    public void setOn(boolean on) { isOn = on; }

    public void powerOn() {
        this.isOn = true;
        System.out.println(brand + " " + model + " is now ON.");
    }

    public void powerOff() {
        this.isOn = false;
        System.out.println(brand + " " + model + " is now OFF.");
    }

    public String displayInfo() {
        String status = isOn ? "ON" : "OFF";
        String info = "=== Laptop Information ===\n";
        info += "Brand: " + brand + "\n";
        info += "Model: " + model + "\n";
        info += "Owner: " + owner + "\n";
        info += "RAM: " + ramGB + " GB\n";
        info += "Storage: " + storageGB + " GB\n";
        info += "Screen Size: " + screenSizeInches + " inches\n";
        info += "Processor: " + processor + "\n";
        info += "Power Status: " + status + "\n";
        info += "==========================\n";

        System.out.println(info);
        return info;
    }
}
    

