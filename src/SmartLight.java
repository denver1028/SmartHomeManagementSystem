public class SmartLight extends SmartDevice {
    private int brightness;
    private String color;

    public SmartLight(String brand, String model) {
        super(brand, model);
        this.brightness = 75;
        this.color = "White";
    }

    public void changeColor(String newColor) {
        this.color = newColor;
        System.out.println(getModel() + " color changed to " + newColor);
    }

    public void adjustBrightness(int level) {
        if (level >= 0 && level <= 100) {
            this.brightness = level;
            System.out.println(getModel() + " brightness set to " + level);
        } else {
            System.out.println("Invalid brightness level. Must be between 0 and 100.");
        }
    }

    @Override
    public void deviceInfo() {
        System.out.println("SmartLight - Brand: " + getBrand() + ", Model: " + getModel()
                + ", Status: " + getStatus() + ", Color: " + color + ", Brightness: " + brightness);
    }
}