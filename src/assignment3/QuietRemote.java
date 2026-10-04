package assignment3;

public class QuietRemote extends RemoteControl{
    public QuietRemote(Device device, int id){
        super(device, id);
        this.id = id;
    }
    @Override
    public void turnOn() {
        device.setVolume(5);
        device.setPowerState("On");
        device.execute();
    }

    @Override
    public void turnOff() {
        device.setVolume(0);
        device.setPowerState("Off");
        device.execute();
    }
}
