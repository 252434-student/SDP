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
    }
    public void sleepMode(){
        System.out.println("Good night.");
        lights.turnOff();
        ac.turnOff();
    }

    public void summerClimate(){

    }
    public void winterClimate(){

    }
}
