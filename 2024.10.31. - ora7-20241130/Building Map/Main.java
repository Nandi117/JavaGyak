import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Building> buildings = new HashSet<Building>();
        buildings.add(new Building("deik", "kassai 26"));
        buildings.add(new Building("deik", "kassai 28"));
        buildings.add(new Building("DEIK", "kassai 27"));
        buildings.add(new Building("teokj", "kassai 26"));
        buildings.add(new Building("kémia", "egyetem tér 1"));

        System.out.println(buildings);

        TreeSet<Room> rooms = new TreeSet<>();
        rooms.add(new Room(new Building("foepulet", "egyetem tér 1"), "aud max"));
        rooms.add(new Room(new Building("deik", "kassai ut 26"), "f0"));
        rooms.add(new Room(new Building("deik", "kassai ut 26"), "f0"));

        System.out.println(rooms);

        Room f1 = new Room(new Building("deik", "kassai ut 26"), "f1");
        f1.setNumberOfSeats(100);
        f1.addAttribute("eloado");
        f1.addAttribute("projektor");

        rooms.add(f1);
        System.out.println(rooms);

        TreeSet<Room> rooms1 = new TreeSet<>(new Comparator<Room>() {
            @Override
            public int compare(Room o1, Room o2) {
                return o1.getRoomId().compareTo(o2.getRoomId());
            }
        });

        rooms1.add(f1);
        rooms1.add(new Room(new Building("foepulet", "egyetem tér 1"), "aud max"));
        rooms1.add(new Room(new Building("deik", "kassai ut 26"), "f0"));
        rooms1.add(new Room(new Building("deik", "kassai ut 26"), "f0"));

        System.out.println(rooms1);
    }
}