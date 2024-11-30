import java.util.ArrayList;

public class Room implements Comparable<Room>{
    private Building building;
    private String roomId;
    private int numberOfSeats;
    private ArrayList<String> attributes;

    public Room(Building building, String roomId) {
        this.building = building;
        this.roomId = roomId;
        this.attributes = new ArrayList<>();
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Building getBuilding() {
        return building;
    }

    public String getRoomId() {
        return roomId;
    }

    public ArrayList<String> getAttributes() {
        return attributes;
    }

    public void addAttribute(String attribute){
        this.attributes.add(attribute);
    }

    public void delAttribute(String attribute){
        this.attributes.remove(attribute);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Room{");
        sb.append("building=").append(building);
        sb.append(", roomId='").append(roomId).append('\'');
        sb.append(", numberOfSeats=").append(numberOfSeats);
        sb.append(", attributes=").append(attributes);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public int compareTo(Room o) {
        int v = this.building.compareTo(o.building);
        if(v!=0) return v;
        return this.roomId.compareTo(o.roomId);
    }
}
