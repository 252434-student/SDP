package assignment4;

public class AirConditioner{
    private boolean power = false;
    private double tempC = 0;
    private int fanSpeed = 0;
    public AirConditioner(){}

    public void turnOn(double temp, int speed) {
        if(this.power){
            System.out.println("AC already on.");
        }
        else {
            this.power = true;
            this.tempC = temp;
            this.fanSpeed = speed;
            System.out.println("Turned on AC, " + this.tempC + " degrees Celsius, fan speed " + this.fanSpeed);
        }
    }
    public void turnOff(){
        if(!this.power){
            System.out.println("AC already shut down.");
        }
        else{
            this.power = false;
            this.tempC = 0;
            this.fanSpeed = 0;
            System.out.println("Turning off AC.");
        }
    }
    public void changeTemperature(double temp){
        if(temp >= 16 && temp <= 35){
            this.tempC = temp;
            System.out.println("Set temperature to "+this.tempC);
        }
        else if(temp == 0){
            this.tempC = 0;
            System.out.println("Switching to fan mode.");
        }
        else if(temp > 35){
            System.out.println("To heat up the room use Radiator instead.");
        }
        else{
            System.out.println("Can't lower the temperature to less than 16 degrees Celsius.");
        }
    }

    public void changeFanSpeed(int speed){
        if(speed >=1 && speed <=5){
            this.fanSpeed = speed;
            System.out.println("Switching fan speed to "+this.fanSpeed);
        }
        else{
            System.out.println("Fan speed is adjusted from 1 to 5.");
        }
    }
}
