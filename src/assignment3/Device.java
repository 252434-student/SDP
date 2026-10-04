package assignment3;

public interface Device {
    void setPowerState(String powerState);
    void setVolume(int volume);

    String returnType();
    String returnPowerState();
    int returnVolume();

    void execute();
}
