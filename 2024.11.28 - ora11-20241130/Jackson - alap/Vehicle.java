package Jackson;

public class Vehicle {
    private int id;
    private String licansePlateNumber;
    private double weight;
    private boolean hasEngine;
    private Jackson.Owner owner;
    private Jackson.EnumVehicleType type; //Bicycle, Car, Truck

    public Vehicle() {
    }


    public Vehicle(boolean hasEngine, int id, String licansePlateNumber, Jackson.Owner owner, Jackson.EnumVehicleType type, double weight) {
        this.hasEngine = hasEngine;
        this.id = id;
        this.licansePlateNumber = licansePlateNumber;
        this.owner = owner;
        this.type = type;
        this.weight = weight;
    }


    public boolean isHasEngine() {
        return hasEngine;
    }

    public int getId() {
        return id;
    }

    //@JsonGetter
    public String getLicansePlateNumber() {
        return licansePlateNumber;
    }

    public Owner getOwner() {
        return owner;
    }

    public double getWeight() {
        return weight;
    }

    public EnumVehicleType getType() {
        return type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("hasEngine=").append(hasEngine);
        sb.append(", id=").append(id);
        sb.append(", licansePlateNumber='").append(licansePlateNumber).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", owner=").append(owner);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
