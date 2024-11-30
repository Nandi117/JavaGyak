import java.util.HashSet;
import java.util.Objects;

public class Department implements Comparable<Department>{
    private String id;
    private String name;
    private HashSet<Employee> employees = new HashSet<>();

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashSet<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee emp){
        employees.add(emp);
        emp.setDepartment(this);
    }

    public void removeEmployee(Employee emp){
        employees.remove(emp);
        emp.setDepartment(null);
    }

    public static void employeeMove(Employee emp, Department fromDep, Department toDep){
        fromDep.removeEmployee(emp);
        toDep.addEmployee(emp);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Department{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", employees=").append(employees);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int compareTo(Department o) {
        return this.id.compareTo(o.id);
    }
}
