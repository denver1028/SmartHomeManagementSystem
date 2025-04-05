public abstract class SmartDevice {
    private String brand;
    private String model;
    private boolean status;

    public SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.status = false;
    }

    public void turnOn() {
        status = true;
        System.out.println(model + " is now ON.");
    }

    public void turnOff() {
        status = false;
        System.out.println(model + " is now OFF.");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getStatus() {
        return status ? "ON" : "OFF";
    }

    public boolean isOn() {
        return status;
    }

    public void deviceInfo() {
        System.out.println("SmartDevice - Brand: " + brand + ", Model: " + model + ", Status: " + getStatus());
    }



}
