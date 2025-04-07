public class SmartThermostat extends SmartDevice {
    private int temperature;
    private int minTemp;
    private int maxTemp;

    public SmartThermostat(String brand, String model, int initialTemperature, int minTemp, int maxTemp) {
        super(brand, model); // Llama al constructor de SmartDevice
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.temperature = initialTemperature;
    }
    File > Project Structure > SDKs

    public void setTemperature(int temperature) {
        if (temperature >= minTemp && temperature <= maxTemp) {
            this.temperature = temperature;
            System.out.println("Temperatura ajustada a: " + temperature + "°C");
        } else {
            System.out.println("Temperatura fuera de rango (" + minTemp + "°C - " + maxTemp + "°C)");
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void showInfo() {
        System.out.println("Termostato - Marca: " + getBrand()
                + ", Modelo: " + getModel()
                + ", Estado: " + getStatus()
                + ", Temperatura: " + temperature + "°C"
                + " (Rango: " + minTemp + "°C - " + maxTemp + "°C)");
    }
}
