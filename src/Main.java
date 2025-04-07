//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        SmartThermostat termostato1 = new SmartThermostat("Termostato Principal", 22);
        SmartThermostat termostato2 = new SmartThermostat("Samsung", "T100", 20, -10, 40);

        termostato2.turnOn();
        termostato2.setTemperature(30);  // válida
        termostato2.setTemperature(-15); // fuera de rango
        termostato2.turnOff();


        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}