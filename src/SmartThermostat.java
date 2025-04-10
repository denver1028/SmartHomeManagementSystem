public class SmartThermostat extends SmartDevice {
    private int temperature;

    public SmartThermostat(String brand, String model, int initialTemperature) {
        super(brand, model);
        setTemperature(initialTemperature); // Ya valida el rango dentro del método
    }

    public void setTemperature(int temperature) {
        if (temperature >= 10 && temperature <= 30) {
            this.temperature = temperature;
            System.out.println("Temperatura ajustada a: " + temperature + "°C");
        } else {
            System.out.println("Temperatura fuera de rango (10°C - 30°C). No se aplicó el cambio.");
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        setTemperature(this.temperature + 1);
    }

    public void decreaseTemperature() {
        setTemperature(this.temperature - 1);
    }

    public boolean isEnergySavingMode() {
        return temperature < 20;
    }

    public void showInfo() {
        System.out.println("Termostato - Marca: " + getBrand());
        System.out.println("Modelo: " + getModel());
        System.out.println("Estado: " + getStatus());
        System.out.println("Temperatura actual: " + temperature + "°C");
        System.out.println("Modo ahorro de energía: " + (isEnergySavingMode() ? "ACTIVO" : "INACTIVO"));
    }
}
