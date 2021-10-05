public class Driver {

    String name;
    int age;

    public Driver(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "is driven by " + name;
    }
}
