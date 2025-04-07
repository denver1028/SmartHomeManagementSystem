public class SmartThermostat extends SmartDevice {
    private int temperature;
    private int minTemp;
    private int maxTemp;

    public SmartThermostat(String brand, String model, int initialTemperature, int minTemp, int maxTemp) {
        super(brand, model); // Llama al constructor de SmartDevice
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;

        // Validar temperatura inicial dentro del rango
        if (initialTemperature >= minTemp && initialTemperature <= maxTemp) {
            this.temperature = initialTemperature;
        } else {
            System.out.println("Temperatura inicial fuera de rango. Se asigna temperatura mínima.");
            this.temperature = minTemp;
        }
    }

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
