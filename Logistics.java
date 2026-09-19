public abstract class Logistics {
    public abstract Transport createTransport();
    public Transport planDelivery(){
        Transport transport = createTransport();
        transport.deliver();
        return transport;
    }
}
