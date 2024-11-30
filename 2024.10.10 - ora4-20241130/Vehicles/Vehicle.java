import java.util.Objects;

public class Vehicle {
    private int numberOfWheels;
    private String id;
    private VehicleStatus status;

    public Vehicle(String id){
        this.id = id;
        this.status = VehicleStatus.PARK;
    }

    public Vehicle(String id, int numberOfWheels){
        this.id = id;
        this.numberOfWheels = numberOfWheels;
        this.status = VehicleStatus.PARK;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getId() {
        return id;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setMove(){
        status = VehicleStatus.MOVE;
    }

    public void setStop(){
        status = VehicleStatus.STOP;
    }

    public void setPark(){
        status = VehicleStatus.PARK;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vehicle{");
        sb.append("numberOfWheels=").append(numberOfWheels);
        sb.append(", id='").append(id).append('\'');
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(id, vehicle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfWheels, id, status);
    }
}
