package assignment3;

public class BasicRemote extends RemoteControl {
    public BasicRemote(Device device, int id){
        super(device, id);
    }

    @Override
    public void turnOn() {
        device.setPowerState("On");
        device.setVolume(30);
        device.execute();
    }

    @Override
    public void turnOff() {
        device.setPowerState("Off");
        device.setVolume(0);
        device.execute();
    }
}
