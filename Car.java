public class Car {
    private String mark;
    private String maxSpeed;
    private int seats;
    private boolean toning;

    public void setMark(String mark){this.mark = mark;}
    public void setMaxSpeed(String maxSpeed){this.maxSpeed = maxSpeed;}
    public void setSeats(int seats){this.seats = seats;}
    public void setToning(boolean toning){this.toning = toning;}

    public void showCar(){
        System.out.println("Car config: "+"mark = "+mark+
                ", max speed = "+maxSpeed+
                ", seats = "+seats+
                ", toning is applied = "+toning);
    }
    //1. Builder pattern with a director
    interface Builder{
        void buildMark();
        void buildMaxSpeed();
        void buildSeats();
        void buildToning();
        Car buildCar();
    }

    static class directedCarBuilder implements Builder {
        private Car car = new Car();
        @Override
        public void buildMark() {
            car.setMark("Aston Martin");
        }

        @Override
        public void buildMaxSpeed() {
            car.setMaxSpeed("250km/h");
        }

        @Override
        public void buildSeats() {
            car.setSeats(4);
        }

        @Override
        public void buildToning() {
            car.setToning(false);
        }

        @Override
        public Car buildCar() {
            return car;
        }
    }

    static class carDirector{
        public void construct(Builder builder){
            builder.buildMark();
            builder.buildMaxSpeed();
            builder.buildSeats();
            builder.buildToning();
        }
    }
    //2. Builder pattern with fluid API method chaining
    private Car() {}

    public static class carBuilder {
        private final Car car;
        public carBuilder(){
            car = new Car();
        }
        public carBuilder mark(String mark){
            car.mark = mark;
            return this;
        }
        public carBuilder maxSpeed(String maxSpeed){
            car.maxSpeed = maxSpeed;
            return this;
        }
        public carBuilder seats(int seats){
            car.seats = seats;
            return this;
        }
        public carBuilder toning(boolean toning){
            car.toning = toning;
            return this;
        }
        public Car build(){
            if(car.mark == null){
                throw new IllegalArgumentException("Mark must be specified");
            }
            return car;
        }
    }

    @Override
    public String toString(){
        return "Car description -> "+"Mark: " + mark +
                ", Max Speed: " + maxSpeed +
                ", Number of seats: " + seats +
                ", toned windows: " + toning + ".";
    }

    public static void main(String[] args){
        directedCarBuilder directedBuilder = new directedCarBuilder();
        carDirector director = new carDirector();
        director.construct(directedBuilder);
        Car directedCar = directedBuilder.buildCar();
        directedCar.showCar();

        Car car = new carBuilder()
                .mark("BMW")
                .maxSpeed("240km/h")
                .seats(4)
                .toning(true)
                .build();
        System.out.println(car);
    }
}
