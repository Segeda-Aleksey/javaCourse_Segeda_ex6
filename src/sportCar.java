public class sportCar extends car{

        private int speed;
        private int numberOfSeats;
        public String model;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public sportCar(int weight, String name, int aLong, int speed, int numberOfSeats, String model) {
        super(weight, name, aLong);
        this.speed = speed;
        this.numberOfSeats = numberOfSeats;
        this.model = model;
    }

    public sportCar(int speed, int numberOfSeats, String model) {
        this.speed = speed;
        this.numberOfSeats = numberOfSeats;
        this.model = model;
    }

    public String go() {
        return "go speed car";
    }
}
