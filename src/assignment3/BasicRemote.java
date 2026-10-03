package assignment3;

public class BasicRemote extends RemoteControl {
    public BasicRemote(Device device, int id){
        super(device, id);
        this.id = id;
    }

    @Override
    public void turnOn() {
        device.setPowerState("On");
        device.setVolume(30);
        System.out.println(device);
    }

    @Override
    public void turnOff() {
        device.setPowerState("Off");
        device.setVolume(0);
        System.out.println(device);
    }
}
