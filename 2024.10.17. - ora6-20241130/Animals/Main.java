package PackageAnimalRunner;

import PackageAnimals.Cat;
import PackageAnimals.Dog;
import PackageAnimals.GilaMonster;
import PackageAnimals.Snake;

public class Main {
    public static void main(String[] args) {
        GilaMonster g1 = new GilaMonster("Gila", "10");
        Dog d1 = new Dog("Maszat");
        Cat c1 = new Cat("Cirmos");
        Snake s1 = new Snake("Rex", 0.2);

        System.out.println(g1.compareTo(d1));
        System.out.println(c1.getHome());
        c1.setHome("kitchen");
        System.out.println(c1.getHome());
        System.out.println(c1.compareTo(d1));

        System.out.println(d1);
    }
}