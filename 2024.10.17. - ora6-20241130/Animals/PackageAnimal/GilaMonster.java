package PackageAnimals;

import PackageAbstractAnimals.PetMammal;
import PackageAbstractAnimals.ProtectedAnimal;

import java.util.ArrayList;

public class GilaMonster extends PetMammal implements ProtectedAnimal {

    private String lawNumber;

    public GilaMonster(String name, String lawNumber) {
        super(name, 4, "glasshouse");
        this.lawNumber = lawNumber;
    }

    @Override
    public ArrayList<String> getActivityList() {
        ArrayList<String> al = new ArrayList<>();
        al.add("step");
        al.add("sleep");
        al.add("eat");
        return al;
    }

    @Override
    public String makeSound() {
        return "ssss";
    }

    @Override
    public String getLawNumber() {
        return lawNumber;
    }
}
