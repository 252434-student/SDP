package assignment3;

public class RadioDevice implements Device{
    private String powerState;
    private int volume;
    @Override
    public void setPowerState(String powerState) {
        this.powerState = powerState;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String returnType() {
        return "Radio";
    }

    @Override
    public String returnPowerState() {
        return powerState;
    }

    @Override
    public int returnVolume() {
        return volume;
    }
    @Override
    public void execute(){
        System.out.println("Device type: "+returnType()+"; device power state: "+returnPowerState()+"; device volume: "+returnVolume());
    }
}
