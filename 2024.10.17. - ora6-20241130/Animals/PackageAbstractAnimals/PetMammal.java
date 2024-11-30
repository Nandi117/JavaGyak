package PackageAbstractAnimals;

import java.util.ArrayList;

public abstract class PetMammal implements Pet, Vertebrates{
    private String name;
    private int numberOfLegs;
    private String home;

    protected PetMammal(String name, int numerOfLegs, String home) {
        this.name = name;
        this.numberOfLegs = numerOfLegs;
        this.home = home;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String getName() {
        return name;
    }

    protected String getHome() {
        return home;
    }

    protected void setHome(String home) {
        this.home = home;
    }

    abstract public ArrayList<String> getActivityList();

    public int compareTo(Vertebrates o){
        int c = this.numberOfLegs - o.getNumberOfLegs();
        if(c!=0){
            return c;
        }
        if(!(o instanceof PetMammal)){
            return 0;
        }
        PetMammal o2 = (PetMammal) o;
        return this.getName().compareTo(o2.getName());
    }
}
