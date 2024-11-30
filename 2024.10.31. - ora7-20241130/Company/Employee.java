import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>{
    private int id;
    private Department department;

    public Employee(int id, String name, LocalDate birtDate) {
        super(name, birtDate);
        this.id = id;
    }

    public Employee(int id, String name, LocalDate birtDate, String nickName) {
       this(id, name, birtDate);
       this.setNickName(nickName);
    }

    public int getId() {
        return id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("id=").append(id);
        sb.append(", department=").append(department);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}
