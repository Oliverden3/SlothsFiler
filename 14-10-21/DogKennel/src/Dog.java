import java.util.ArrayList;

public class Dog {
    private boolean isHungry = true;
    private String name;
    private Owner owner;
    private ArrayList<Dog> offSpring;

    public Dog(String name, boolean isHungry, Owner owner) {
        this.isHungry = isHungry;
        this.name = name;
        this.owner = owner;
        offSpring = new ArrayList<>();
    }

    public boolean isHungry() {
        return isHungry;
    }

    public String feedDog() {
        if (isHungry == true) {
            isHungry = false;
        }
        return "Dog has been fed";
    }

    public void setOffSpring(String offSpring) {
        Dog dog = new Dog(offSpring, true, owner);
        this.offSpring.add(dog);
    }

    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }

    public ArrayList<Dog> getOffSpring() {
        return offSpring;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "isHungry=" + isHungry +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                ", offSpring=" + offSpring +
                '}';
    }

}


