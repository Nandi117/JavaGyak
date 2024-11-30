import java.math.RoundingMode;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(new Building("deik", "kassai ut 26"), "f0"));
        rooms.add(new Room(new Building("deik", "kassai ut 26"), "f1"));
        rooms.add(new Room(new Building("deik", "kassai ut 26"), "ik321"));
        rooms.add(new Room(new Building("deik", "kassai ut 26"), "ik203"));
        rooms.add(new Room(new Building("deik", "kassai ut 25"), "f5"));
        rooms.add(new Room(new Building("foepulet", "egyetem ter 1"), "aud max"));
        rooms.add(new Room(new Building("foepulet", "egyetem ter 1"), "romai 1"));
        rooms.add(new Room(new Building("foepulet", "egyetem ter 1"), "romai 2"));
        rooms.add(new Room(new Building("kemia", "egyetem ter 1"), "k1"));
        rooms.add(new Room(new Building("kemia", "egyetem ter 1"), "k2"));

        HashMap<Building, ArrayList<Room>> hm1 = new HashMap<>();

        for(Room room: rooms){
            ArrayList<Room> al;
            if(hm1.containsKey(room.getBuilding())){
                al = hm1.get(room.getBuilding());
            }
            else {
                al = new ArrayList<>();
            }

            al.add(room);
            hm1.put(room.getBuilding(), al);
        }

        for (Map.Entry<Building, ArrayList<Room>> entry: hm1.entrySet()){
            Building key = entry.getKey();
            ArrayList<Room> value = entry.getValue();

            System.out.println(key);
            System.out.println(value);
        }

        //treemap
        System.out.println("treemap");

        TreeMap<Building, ArrayList<Room>> tm1 = new TreeMap<>();

        for(Room room: rooms){
            ArrayList<Room> al;
            if(tm1.containsKey(room.getBuilding())){
                al = tm1.get(room.getBuilding());
            }
            else{
                al = new ArrayList<>();
            }
            al.add(room);
            tm1.put(room.getBuilding(), al);
        }

        for(Map.Entry<Building, ArrayList<Room>> entry: tm1.entrySet()){
            Building key = entry.getKey();
            ArrayList<Room> value = entry.getValue();

            System.out.println(key);
            System.out.println(value);
        }

        //treemap2
        System.out.println("treemap2");
        TreeMap<Building, ArrayList<Room>> tm2 = new TreeMap<>(new Comparator<Building>() {
            @Override
            public int compare(Building o1, Building o2) {
                int v = o1.getAddress().compareTo(o2.getAddress());
                if(v!=0) return v;
                return o1.getName().compareTo(o2.getName());
            }
        });

        for(Room room: rooms){
            ArrayList<Room> al;
            if(tm2.containsKey(room.getBuilding())){
                al = tm2.get(room.getBuilding());
            }
            else{
                al = new ArrayList<>();
            }
            al.add(room);
            tm2.put(room.getBuilding(), al);
        }

        for(Map.Entry<Building, ArrayList<Room>> entry: tm2.entrySet()){
            Building key = entry.getKey();
            ArrayList<Room> value = entry.getValue();

            System.out.println(key);
            System.out.println(value);
        }
    }
}