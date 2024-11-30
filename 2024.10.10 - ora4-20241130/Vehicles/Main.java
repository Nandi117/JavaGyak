public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("v1");
        v1.setMove();
        v1.setPark();
        System.out.println(v1.getStatus());
        System.out.println(v1);

        Vehicle v2 = new Vehicle("v2", 3);
        v2.setStop();
        System.out.println(v2);

        System.out.println(v1.equals(v2));

        Car c1 = new Car("abc123");
        System.out.println(c1.equals(v1));
        c1.setEngineToWork();
        c1.setHorsePower(100);
        c1.setMove();
        c1.setPark();
        System.out.println(c1);

        Car c2 = new Car("xyc123", 70);
        System.out.println(c2);
        c2.setMove();
        System.out.println(c2);

        Vehicle c3 =  new Car("abc123");
        System.out.println(c3.equals(c1));

        Bicycle b1 = new Bicycle("1234");
        System.out.println(b1.getSize());
        b1.setMove();
        b1.setSize(10);
        System.out.println(b1);
    }
}