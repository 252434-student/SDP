package assignment3;

public class TvDevice implements Device{
    public String type = "TV";
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
}
