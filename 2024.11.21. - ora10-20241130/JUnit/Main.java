public class Main {
    public static void main(String[] args) {
        Haromszog hsz1;
        try{
            hsz1 = new Haromszog(3,4,5);
            System.out.println(hsz1);
        } catch (HaromszogException e) {
            throw new RuntimeException(e);
        }
    }
}