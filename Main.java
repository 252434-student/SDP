import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Specify delivery method: ROAD or SEA");
        String deliveryTransport = sc.next();
        System.out.println("Specify UI platform: Windows or MacOS");
        String uiPlatform = sc.next();

        if(deliveryTransport.equalsIgnoreCase("ROAD") && uiPlatform.equalsIgnoreCase("WINDOWS")){
            RoadLogistics roadLogistics = new RoadLogistics();
            WindowsFactory windowsFactory = new WindowsFactory();
            DeliveryApplication client = new DeliveryApplication(roadLogistics, windowsFactory);
            Transport truck = client.getTransport();
            Button button = client.getButton();
            Checkbox checkbox = client.getCheckbox();
            truck.deliver();
            button.paint();
            checkbox.paint();
        }
        else if(deliveryTransport.equalsIgnoreCase("ROAD") && uiPlatform.equalsIgnoreCase("MACOS")){
            RoadLogistics roadLogistics = new RoadLogistics();
            MacOSFactory macOSFactory = new MacOSFactory();
            DeliveryApplication client = new DeliveryApplication(roadLogistics, macOSFactory);
            Transport truck = client.getTransport();
            Button button = client.getButton();
            Checkbox checkbox = client.getCheckbox();
            truck.deliver();
            button.paint();
            checkbox.paint();
        }
        else if(deliveryTransport.equalsIgnoreCase("SEA") && uiPlatform.equalsIgnoreCase("WINDOWS")){
            SeaLogistics seaLogistics = new SeaLogistics();
            WindowsFactory windowsFactory = new WindowsFactory();
            DeliveryApplication client = new DeliveryApplication(seaLogistics, windowsFactory);
            Transport truck = client.getTransport();
            Button button = client.getButton();
            Checkbox checkbox = client.getCheckbox();
            truck.deliver();
            button.paint();
            checkbox.paint();
        }
        else if(deliveryTransport.equalsIgnoreCase("SEA") && uiPlatform.equalsIgnoreCase("MACOS")){
            SeaLogistics seaLogistics = new SeaLogistics();
            MacOSFactory macOSFactory = new MacOSFactory();
            DeliveryApplication client = new DeliveryApplication(seaLogistics, macOSFactory);
            Transport truck = client.getTransport();
            Button button = client.getButton();
            Checkbox checkbox = client.getCheckbox();
            truck.deliver();
            button.paint();
            checkbox.paint();
        }
        else{
            System.out.println("Invalid delivery method or UI platform.");
        }
    }
}
