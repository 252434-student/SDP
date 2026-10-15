import assignment4.*;

import java.util.Scanner;

public class Main {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SmartHomeRemote smr = new SmartHomeRemote(new AirConditioner(),
                new Lights(),
                new Radiator(),
                new CoffeeMachine());
        boolean running = true;
        while(running){
            System.out.println("Welcome to your smart home.\n"+"Choose remote control options below:");
            System.out.println("1. Mourning routine.");
            System.out.println("2. Evening routine.");
            System.out.println("3. Sleep mode.");
            System.out.println("4. Summer climate.");
            System.out.println("5. Winter climate.");
            System.out.println("6. Adjust AC temperature.");
            System.out.println("7. Adjust AC fan speed.");
            System.out.println("8. Adjust light brightness.");
            System.out.println("9. Adjust light color.");
            System.out.println("10. Adjust radiator temperature.");
            System.out.println("0. Exit.");
            System.out.print("Your input here: ");
            int input = sc.nextInt();
            if (input == 1) {
                System.out.println("=========");
                smr.mourningRoutine();
                System.out.println("=========");
            } else if (input == 2) {
                System.out.println("=========");
                smr.eveningRoutine();
                System.out.println("=========");
            } else if (input == 3) {
                System.out.println("=========");
                smr.sleepMode();
                System.out.println("=========");
            } else if (input == 4) {
                System.out.println("=========");
                smr.summerClimate();
                System.out.println("=========");
            } else if (input == 5) {
                System.out.println("=========");
                smr.winterClimate();
                System.out.println("=========");
            } else if (input == 6) {
                System.out.println("=========");
                System.out.println("Enter new temperature: from 16.0 to 35.0");
                double temp = sc.nextDouble();
                smr.adjustAcTemperature(temp);
                System.out.println("=========");
            } else if (input == 7) {
                System.out.println("=========");
                System.out.println("Enter new fan speed: from 1 to 5");
                int speed = sc.nextInt();
                smr.adjustAcFanSpeed(speed);
                System.out.println("=========");
            } else if (input == 8) {
                System.out.println("=========");
                System.out.println("Enter new light brightness: from 0 to 1");
                double bright = sc.nextDouble();
                smr.adjustLightBrightness(bright);
                System.out.println("=========");
            } else if (input == 9) {
                System.out.println("=========");
                System.out.println("Enter new light color: ");
                String color = sc.next();
                smr.adjustLightColor(color);
                System.out.println("=========");
            } else if(input==10){
                System.out.println("=========");
                System.out.println("Enter new temperature: from 35.0 to 90.0");
                double temp = sc.nextDouble();
                smr.adjustRadiatorTemperature(temp);
                System.out.println("=========");
            } else if (input == 0) {
                System.out.println("=========");
                System.out.println("Exiting...");
                System.out.println("=========");
                running = false;
            } else{
                System.out.print("Incorrect input, try again: ");
            }
        }
    }
}
