public class SmartDevice {
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
        System.out.println("Dispositivo encendido.");
    }

    public void turnOff() {
        status = false;
        System.out.println("Dispositivo apagado.");
    }

    public boolean getStatus() {
        return status;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
