package assignment3;

public abstract class RemoteControl {
    protected int id=1;
    protected Device device;

    protected RemoteControl(Device device, int id){
        this.device = device;
        this.id = id;
    }
    public int getID(){
        return this.id;
    }
    public void setID(int id){
        this.id = id;
    }
    public Device getImplementation(){
        return this.device;
    }
    public void setImplementation(Device device){
        this.device = device;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}
