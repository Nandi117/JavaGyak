package allatok;

public class SnailEdible extends Snail{


    private static int CsigaDarab = 0;
    public SnailEdible(double speedInMeterPerSecond, String sound, double weight, String snailType) {
        super(speedInMeterPerSecond, sound, weight, snailType);
        CsigaDarab ++;
    }

    @Override
    public String getSound() {
        return this.getSound();
    }

    @Override
    public int getNumberOfLegs() {
        return this.getNumberOfLegs();
    }

    @Override
    public double getWeightInKg() {
        return this.getWeightInKg();
    }

    @Override
    public double getSpeedInMeterPerSecond() {
        return this.getSpeedInMeterPerSecond();
    }

    @Override
    public boolean isEheto() {
        return this.isEheto();
    }

    public static int getCsigaDarab() {
        return CsigaDarab;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("allatok.SnailEdible{");
        sb.append("sound='").append(getSound()).append('\'');
        sb.append(", numberOfLegs=").append(getNumberOfLegs());
        sb.append(", weightInKg=").append(getWeightInKg());
        sb.append(", speedInMeterPerSecond=").append(getSpeedInMeterPerSecond());
        sb.append(", eheto=").append(isEheto());
        sb.append('}');
        return sb.toString();
    }
}
