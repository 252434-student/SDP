package assignment4;

public class Lights{
    private boolean power = false;
    private double brightness = 0;
    private String color = "white";
    public Lights(){}

    public void turnOn(){
        if(this.power){
            System.out.println("Lights already on.");
        }
        else{
            this.power = true;
            this.brightness = 1;
            this.color = "white";
            System.out.println("Turning on the lights.");
        }
    }
    public void turnOff(){
        if(!this.power){
            System.out.println("Lights already off.");
        }
        else{
            this.power = false;
            this.brightness = 0;
            System.out.println("Turning off the lights");
        }
    }

    public void setBrightness(double brightness){
        if(brightness >= 0 && brightness <=1){
            this.brightness = brightness;
            System.out.println("Setting brightness to "+this.brightness*100+"%");
        }
        else{
            System.out.println("Brightness should be a 0.n decimal fraction.");
        }
    }
    public void setColor(String color){
        if(color == null){
            throw new NullPointerException();
        }
        this.color = color;
        System.out.println("Changing light color to "+this.color);
    }
}
