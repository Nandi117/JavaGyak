import java.util.TreeSet;

public class Company {
    private String name;
    private String nameOfLeader;
    private TreeSet<Department> departments = new TreeSet<>();

    public Company(String name, String nameOfLeader) {
        this.name = name;
        this.nameOfLeader = nameOfLeader;
    }

    public String getName() {
        return name;
    }

    public String getNameOfLeader() {
        return nameOfLeader;
    }

    public TreeSet<Department> getDepartments() {
        return departments;
    }

    public void setNameOfLeader(String nameOfLeader) {
        this.nameOfLeader = nameOfLeader;
    }

    public void addDepartment(Department dep){
        departments.add(dep);
    }

    public void removeDepartment(Department dep){
        departments.remove(dep);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Company{");
        sb.append("name='").append(name).append('\'');
        sb.append(", nameOfLeader='").append(nameOfLeader).append('\'');
        sb.append(", departments=").append(departments);
        sb.append('}');
        return sb.toString();
    }
}
