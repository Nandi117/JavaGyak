import java.time.LocalDate;

public class EmployeeWithSizes extends Employee{

    private int shoeSize;
    private int heightInCm;

    public EmployeeWithSizes(int id, String name, LocalDate birtDate) {
        super(id, name, birtDate);
    }

    public EmployeeWithSizes(int id, String name, LocalDate birtDate, String nickName) {
        super(id, name, birtDate, nickName);
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EmployeeWithSizes{");
        sb.append("shoeSize=").append(shoeSize);
        sb.append(", heightInCm=").append(heightInCm);
        sb.append('}');
        return sb.toString();
    }
}
