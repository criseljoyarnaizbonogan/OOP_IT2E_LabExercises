public class Car {
    
    private String color;
    private String plateNo;
    private String chassisNo;
    private String brand;       
    private int yearModel;      
    private String owner;       
    private int engineCC;       

    public Car() {
        this.color = "No Color";
        this.plateNo = "No PlateNumber";
        this.chassisNo = "No Chassis No Yet!";
        this.brand = "Unknown Brand";
        this.yearModel = 0;
        this.owner = "No Owner";
        this.engineCC = 0;
    }

    public Car(String color, String plateNo, String chassisNo,
               String brand, int yearModel, String owner, int engineCC) {
        this.color = color;
        this.plateNo = plateNo;
        this.chassisNo = chassisNo;
        this.brand = brand;
        this.yearModel = yearModel;
        this.owner = owner;
        this.engineCC = engineCC;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getPlateNo() { return plateNo; }
    public void setPlateNo(String plateNo) { this.plateNo = plateNo; }

    public String getChassisNo() { return chassisNo; }
    public void setChassisNo(String chassisNo) { this.chassisNo = chassisNo; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getYearModel() { return yearModel; }
    public void setYearModel(int yearModel) { this.yearModel = yearModel; }

    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }

    public int getEngineCC() { return engineCC; }
    public void setEngineCC(int engineCC) { this.engineCC = engineCC; }

    public String displayInfo() {
        String info = "";
        info += "Brand: " + brand + "\n";
        info += "Year Model: " + yearModel + "\n";
        info += "Color: " + color + "\n";
        info += "Plate No: " + plateNo + "\n";
        info += "Chassis No: " + chassisNo + "\n";
        info += "Owner: " + owner + "\n";
        info += "Engine CC: " + engineCC + " cc\n";
        info += "========================\n";

        System.out.println(info);
        return info;
    }
}