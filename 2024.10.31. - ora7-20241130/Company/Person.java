import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birtDate;
    private String nickName;

    public Person(String name, LocalDate birtDate) {
        this.name = name;
        this.birtDate = birtDate;
    }

    public Person(String name, LocalDate birtDate, String nickName) {
        this(name, birtDate);
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirtDate() {
        return birtDate;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", birtDate=").append(birtDate);
        sb.append(", nickName='").append(nickName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
