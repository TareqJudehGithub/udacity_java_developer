package workingWithObjects;

/**
 * Class for creating other house objects.
 * @author Tareq Judeh
 *
 */
public class House {
    // class instances
    private int id;
    private static int idCounter = 0;
    private int floors;
    private int rooms;
    private int bathrooms;

    public House(int floors, int rooms, int bathrooms){
        this.id = ++ idCounter;
        this.floors = floors;
        this.rooms = rooms;
        this.bathrooms = bathrooms;
    }

    // Getters
    public int getId(int id){
        return  id;
    }
    public int getFloors(int floors) {
        return floors;
    }
    public int getRooms(int rooms) {
        return rooms;
    }
    public int getBathrooms(int bathrooms) {
        return bathrooms;
    }

    // Setters
    public void setFloors(int floors) {
        this.floors = floors;
    }
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\nFloors: " + floors + "\nRooms: " + rooms +
                "\nBathrooms" + bathrooms;
    }
}

