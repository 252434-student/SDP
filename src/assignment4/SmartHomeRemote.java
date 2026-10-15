package assignment4;

public class SmartHomeRemote{
    AirConditioner ac;
    Lights lights;
    Radiator radiator;
    CoffeeMachine coffee;

    public SmartHomeRemote(AirConditioner ac, Lights l, Radiator r, CoffeeMachine c){
        this.ac = ac;
        this.lights = l;
        this.radiator = r;
        this.coffee = c;
    }

    public void mourningRoutine(){
        System.out.println("Good morning.");
        lights.turnOn();
        coffee.brewEspresso();
    }
    public void eveningRoutine(){
        System.out.println("Good evening.");
        lights.setBrightness(0.6);
        lights.setColor("warm yellow");
        coffee.brewDecaf();
    }
    public void sleepMode(){
        System.out.println("Good night.");
        lights.turnOff();
    }

    public void summerClimate(){
        System.out.println("Switching to summer climate.");
        ac.turnOn(22, 3);
        radiator.turnOff();
    }
    public void winterClimate(){
        System.out.println("Switching to winter climate.");
        radiator.turnOn();
        ac.turnOff();
    }

    public void adjustLightBrightness(double b){
        lights.setBrightness(b);
    }
    public void adjustLightColor(String color){
        lights.setColor(color);
    }
    public void adjustAcTemperature(double temp){
        ac.changeTemperature(temp);
    }
    public void adjustAcFanSpeed(int s){
        ac.changeFanSpeed(s);
    }
    public void adjustRadiatorTemperature(double temp){
        radiator.changeTemperature(temp);
    }
}
