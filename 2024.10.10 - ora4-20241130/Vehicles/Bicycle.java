public class Bicycle extends Vehicle{

    private int size;

    public Bicycle(String registrationNumber) {
        super(registrationNumber, 2);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bicycle{");
        sb.append("size=").append(size);
        sb.append(" toString=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
