package PackageAnimals;

import PackageAbstractAnimals.Pet;

public class Snake implements Pet, Comparable<Snake> {

    private String name;
    private double speedInMeterPerSec;

    public Snake(String name, double speedInMeterPerSec) {
        this.name = name;
        this.speedInMeterPerSec = speedInMeterPerSec;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String makeSound() {
        return "ssssss";
    }

    @Override
    public int compareTo(Snake o) {
        //return (int) (this.speedInMeterPerSec - o.speedInMeterPerSec);
        return Double.compare(this.speedInMeterPerSec, o.speedInMeterPerSec);

    }
}
