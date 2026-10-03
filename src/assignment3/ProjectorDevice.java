package assignment3;

public class ProjectorDevice implements Device{
    public String type = "Projector";
    public String powerState;
    public int volume;
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
        return type;
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
    public String toString(){
        return "Device type: "+returnType()+"; device power state: "+returnPowerState()+"; device volume: "+returnVolume();
    }
}
