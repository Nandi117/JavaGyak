package PackageAnimals;

import PackageAbstractAnimals.PetMammal;

import java.util.ArrayList;

public class Dog extends PetMammal {


    public Dog(String name) {
        super(name, 4, "Doghouse");
    }

    @Override
    public ArrayList<String> getActivityList() {
        ArrayList<String> al = new ArrayList<>();
        al.add("run");
        al.add("sleep");
        al.add("eat");
        al.add("bark");
        return al;
    }

    @Override
    public String makeSound() {
        return "vauvau";
    }
}
