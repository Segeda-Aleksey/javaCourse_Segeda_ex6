public class main {

    public static void main(String[] args) {

        car car1 = new car();
        System.out.println(car1.name + " " + car1.getLong());
        car car2 = new car(1500, "Second car", 4200);
        car2.name = "new name";
        System.out.println(car2.getWeight() + " " + car2.name);
        car car3 = new sportCar(1900, "Sport car", 4900, 250, 2, "some model");
        car3.setLong(5500);
        System.out.println("new value long = " + car3.getLong() + " " + car3.name);
        truck truck1 = new truck(5000, "Truck 1", 8000, 5000, 6, "transport kompani");
        System.out.println(truck1.go());
        System.out.println(car2.go());
        System.out.println(car3.go());
    }
}

