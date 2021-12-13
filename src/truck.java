public class truck extends car{


    private int loadCapacity;
    private int numberOfWheels;
    public String transportCompani;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public truck(int weight, String name, int aLong, int loadCapacity, int numberOfWheels, String transportCompani) {
        super(weight, name, aLong);
        this.loadCapacity = loadCapacity;
        this.numberOfWheels = numberOfWheels;
        this.transportCompani = transportCompani;
    }

    public truck(int loadCapacity, int numberOfWheels, String transportCompani) {
        this.loadCapacity = loadCapacity;
        this.numberOfWheels = numberOfWheels;
        this.transportCompani = transportCompani;
    }

    public String go() {
        return "go";
    }
}
