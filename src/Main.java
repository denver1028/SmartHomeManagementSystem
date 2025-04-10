public class Main {
    public static void main(String[] args) {
        SmartLight light = new SmartLight("Philips", "Hue", "White", 75);
        light.turnOn();

        SmartThermostat thermostat = new SmartThermostat("Nest", "T3007ES", 22);
        thermostat.turnOn();

        System.out.println(light);
        System.out.println("SmartThermostat – Brand: " + thermostat.getBrand() +
                ", Model: " + thermostat.getModel() +
                ", Status: " + (thermostat.getStatus() ? "ON" : "OFF") + ",");
        System.out.println("Temperature: " + thermostat.getTemperature() + "°C");

        thermostat.setTemperature(25);
        System.out.println(thermostat.getModel() + " temperature set to " + thermostat.getTemperature() + "°C");

        thermostat.increaseTemperature();
        System.out.println(thermostat.getModel() + " temperature set to " + thermostat.getTemperature() + "°C");

        System.out.println("Energy Saving Mode: " + (thermostat.isEnergySavingMode() ? "true" : "false"));
    }
}
