public class Main {

    public static void main(String[] args) {
        int age = 22;
        String name = "Oliver";

        Car carMine = new Car("Audi", "a8", 2021, "Awesome");
        Car carNew = new Car("BMW", "Shredder", 2070, "Hurtig");

        carNew.setDriver(new Driver(age, name));
        carMine.setDriver(new Driver(age, name));
        System.out.println(carMine);
        System.out.println(carMine.getDriver());
        System.out.println(carNew);
        System.out.println(carNew.getDriver());
    }

}
