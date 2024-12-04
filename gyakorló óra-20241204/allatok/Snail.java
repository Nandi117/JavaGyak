package allatok;

public abstract class Snail implements Animal {
    double speedInMeterPerSecond;
    String sound;
    double weight;
    String snailType;

    public Snail(double speedInMeterPerSecond, String sound, double weight, String snailType) {
        this.speedInMeterPerSecond = speedInMeterPerSecond;
        this.sound = sound;
        this.weight = weight;
        this.snailType = snailType;
    }

    public String getSnailType() {
        return snailType;
    }

    public abstract boolean isEheto();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("allatok.Snail{");
        sb.append("speedInMeterPerSecond=").append(speedInMeterPerSecond);
        sb.append(", sound='").append(sound).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", snailType='").append(snailType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
