package assignment4;

public class Radiator{
    private boolean power = false;
    private double tempC = 0;
    public Radiator(){}

    public void turnOn(){
        if(this.power){
            System.out.println("Radiator is already on.");
        }
        else{
            this.power = true;
            this.tempC = 35;
        }
    }
    public void turnOff(){
        if(!this.power){
            System.out.println("Radiator is already off.");
        }
        else {
            this.power = false;
            this.tempC = 0;
        }
    }

    public void changeTemperature(double temp){
        if(temp >= 35 && temp <=90){
            this.tempC = temp;
        }
        else if(temp > 90) {
            System.out.println("Radiator can't handle such temperature.");
        }
        else{
            System.out.println("For micromanaging temperature use Air Conditioning instead.");
        }
    }
}
