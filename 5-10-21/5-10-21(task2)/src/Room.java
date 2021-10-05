public class Room {
    int walls;
    int numberOfDoors;
    int numberOfLamps;
    int numberOfWindows;

    public Room(int walls, int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        this.walls = walls;
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    public int getWalls(){
        return walls;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    @Override
    public String toString() {
        return "Room{" +
                "walls=" + walls +
                ", numberOfDoors=" + numberOfDoors +
                ", numberOfLamps=" + numberOfLamps +
                ", numberOfWindows=" + numberOfWindows +
                '}';
    }
}
