package allatok;

public class Lorry implements MeansOfTransport {
    private static final int numberOfWheels = 4;
    private double enginePowerInKw;

    private double speedInMeterPerSec;
    private double carryingCapacityInKg;
    private double weight;



    public Lorry(double enginePowerInKw, double speedInMeterPerSec, double carryingCapacityInKg,
                 double weight) {
        super();
        this.enginePowerInKw = enginePowerInKw;
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.carryingCapacityInKg = carryingCapacityInKg;
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Lorry [numberOfWheels=");
        builder.append(numberOfWheels);
        builder.append(", enginePowerInKw=");
        builder.append(enginePowerInKw);
        builder.append(", speedInMeterPerSec=");
        builder.append(speedInMeterPerSec);
        builder.append(", carryingCapacityInKg=");
        builder.append(carryingCapacityInKg);
        builder.append(", weight=");
        builder.append(weight);
        builder.append("]");
        return builder.toString();
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public double getEnginePowerInKw() {
        return enginePowerInKw;
    }

    @Override
    public double getCarryingCapacity() {
        return 0;
    }

    @Override
    public double getWeightInKg() {
        return weight;
    }

    @Override
    public double getSpeedInMeterPerSecond() {
        return 0;
    }
}
