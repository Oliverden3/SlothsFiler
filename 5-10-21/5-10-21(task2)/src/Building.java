import java.util.ArrayList;

public class Building {
    ArrayList<Room> rooms;
    int numberOfBathrooms;
    int numberOfFloors;
    boolean isOfficeBuilding;

    public Building(ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;

    }

    @Override
    public String toString() {
        return "Building{" +
                "rooms=" + rooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", numberOfFloors=" + numberOfFloors +
                ", isOfficeBuilding=" + isOfficeBuilding +
                '}';
    }
}
