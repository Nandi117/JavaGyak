public class Car extends Vehicle{
    private boolean engineIsWorking;
    private int horsePower;

    public Car(String licensePlate) {
        super(licensePlate);
        this.engineIsWorking = false;
    }

    public Car(String licenceplate, int horsePower) {
        super(licenceplate, 4);
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public boolean isEngineIsWorking() {
        return engineIsWorking;
    }

    public void setEngineToWork(){
        this.engineIsWorking = true;
    }

    public void setEngineToStop(){
        this.engineIsWorking = false;
    }

    public void setMove(){
        super.setMove();
        this.setEngineToWork();
    }

    public void setStop(){
        super.setStop();
        this.setEngineToWork();
    }

    public void setPark(){
        super.setPark();
        this.setEngineToStop();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("engineIsWorking=").append(engineIsWorking);
        sb.append(", horsePower=").append(horsePower);
        sb.append(" toString=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }


}
