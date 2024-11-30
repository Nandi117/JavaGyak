package PackageAnimals;

import PackageAbstractAnimals.PetMammal;

import java.util.ArrayList;

public class Cat extends PetMammal {

    public Cat(String name) {
        super(name, 4, "pillow");
    }

    @Override
    public ArrayList<String> getActivityList() {
        ArrayList<String> al = new ArrayList<>();
        al.add("run");
        al.add("sleep");
        al.add("eat");
        return al;
    }

    @Override
    public String makeSound() {
        return "miau";
    }

    public String getHome(){
        return super.getHome();
    }

    public void setHome(String home){
        super.setHome(home);
    }
}
