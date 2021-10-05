import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<Room>();


        Room room1 = new Room(4, 1, 8, 6);
        Room room2 = new Room(4, 8, 16, 24);
        Room room3 = new Room(6, 5, 4, 3);
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        Building building1 = new Building(rooms, 3, 5, false);
        int totalNumberOfLamps = 0;

        for (Room room : building1.getRooms()) {
            totalNumberOfLamps += room.getNumberOfLamps();
        }
        System.out.println(totalNumberOfLamps);

        if( building1.numberOfFloors > rooms.size()){
            System.out.println("This is an odd building");
        }
    }
}
