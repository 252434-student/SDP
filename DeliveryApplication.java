public class DeliveryApplication{
    private Transport transport;
    private Button button;
    private Checkbox checkbox;

    public DeliveryApplication(Logistics logistics, GUIFactory guiFactory){
        transport = logistics.createTransport();
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public Transport getTransport() {
        return transport;
    }
    public Button getButton(){
        return button;
    }
    public Checkbox getCheckbox(){
        return checkbox;
    }
}
