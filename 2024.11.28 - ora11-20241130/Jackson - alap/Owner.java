package Jackson;

public class Owner {
    private String fname;
    private String lname;

    public Owner() {
    }

    public Owner(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Owner{");
        sb.append("fname='").append(fname).append('\'');
        sb.append(", lname='").append(lname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
