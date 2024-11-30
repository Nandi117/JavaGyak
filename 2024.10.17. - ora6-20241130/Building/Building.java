import java.util.Objects;

public class Building {
    private String name;
    private String address;

    public Building(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Building{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Building building)) return false;
        return Objects.equals(name.toLowerCase(), building.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase());
    }

    public int compareTo(Building building) {
        return this.name.toLowerCase().compareTo(building.name.toLowerCase());
    }
}
