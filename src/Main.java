import assignment3.*;
import java.util.Scanner;

public class Main {
    public void main(String[] args){
        String inputDeviceType;
        String inputRemoteType;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your remote type: TV, Radio or Projector");
        inputDeviceType = sc.next();
        System.out.println("Which remote do you use: basic or quiet?");
        inputRemoteType = sc.next();
        if(inputDeviceType.equalsIgnoreCase("TV") && inputRemoteType.equalsIgnoreCase("Basic")){
            RemoteControl remote = new BasicRemote(new TvDevice(), 1);
            remote.turnOn();
            remote.turnOff();
        }
        else if(inputDeviceType.equalsIgnoreCase("TV") && inputRemoteType.equalsIgnoreCase("Quiet")){
            RemoteControl remote = new QuietRemote(new TvDevice(),1);
            remote.turnOn();
            remote.turnOff();
        }
        else if(inputDeviceType.equalsIgnoreCase("Radio") && inputRemoteType.equalsIgnoreCase("Basic")){
            RemoteControl remote = new BasicRemote(new RadioDevice(),1);
            remote.turnOn();
            remote.turnOff();
        }
        else if(inputDeviceType.equalsIgnoreCase("Radio") && inputRemoteType.equalsIgnoreCase("Quiet")){
            RemoteControl remote = new QuietRemote(new RadioDevice(),1);
            remote.turnOn();
            remote.turnOff();
        }
        else if(inputDeviceType.equalsIgnoreCase("Projector") && inputRemoteType.equalsIgnoreCase("Basic")){
            RemoteControl remote = new BasicRemote(new ProjectorDevice(),1);
            remote.turnOn();
            remote.turnOff();
        }
        else if(inputDeviceType.equalsIgnoreCase("Projector") && inputRemoteType.equalsIgnoreCase("Quiet")){
            RemoteControl remote = new QuietRemote(new ProjectorDevice(),1);
            remote.turnOn();
            remote.turnOff();
        }
        else{
            System.out.println("Incorrect device or remote type inputted.");
        }
        System.out.println("<---- TEST CASE FOR SWAPPING BEHAVIOURS WITHOUT CREATING NEW INSTANCES ---->");
        RemoteControl testRemote = new BasicRemote(new TvDevice(), 25);
        testRemote.turnOn();
        System.out.println("remote id: "+testRemote.getID());
        testRemote.setImplementation(new RadioDevice());
        testRemote.turnOn();
        System.out.println("remote id: "+testRemote.getID());
    }
}
