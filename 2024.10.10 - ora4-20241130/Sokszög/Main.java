public class Main {
    public static void main(String[] args) {
        Teglalap t1 = new Teglalap(3,5);
        System.out.println(t1.getTerulet());
        System.out.println(t1.getHosszabbOldal());
        System.out.println(t1);

        Sokszog t2 = new Teglalap(6,2);
        System.out.println(t2);

        Teglalap t3 = new Teglalap(0,0);
        System.out.println(t3);

        Negyzet n1 = new Negyzet(5);
        System.out.println(n1);

        Teglalap n2 = new Negyzet(4);
        System.out.println(n2);

        Sokszog n3 = new Negyzet(3);
        System.out.println(n3.getSzogekSzama());
        System.out.println(n3);

        EgyenloOldaluHaromszog e1 = new EgyenloOldaluHaromszog(5);
        System.out.println(e1);

        Sokszog e2 = new EgyenloOldaluHaromszog(3);
        System.out.println(e2);

        Sokszog[] sokszogek = new Sokszog[8];
        sokszogek[0] = (Sokszog) t1;
        sokszogek[1] = t2;
        sokszogek[2] = (Sokszog) t3;
        sokszogek[3] = (Sokszog) n1;
        sokszogek[4] = (Sokszog) n2;
        sokszogek[5] = n3;
        sokszogek[6] = (Sokszog) e1;
        sokszogek[7] = e2;

        for(Sokszog sokszog: sokszogek){
            System.out.println(sokszog);
        }
    }
}