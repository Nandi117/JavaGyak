import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //parancssorból fájl nevének beolvasása
        String etel_fajl = null;
        for(int i = 0; i<args.length; i++){
            etel_fajl = args[i];
        }
        ArrayList<Etel> etelekArraylist = new ArrayList<>();

        //fájl tartalmának beolvasása
        try(Scanner sc = new Scanner(new File(etel_fajl))){
            while(sc.hasNextLine()){
                String sor = sc.nextLine();
                String[] elemek = sor.split(";");
                etelekArraylist.add(new Etel(
                        elemek[0],
                        elemek[1],
                        Double.parseDouble(elemek[2]),
                        LocalDate.parse(elemek[3], DateTimeFormatter.ofPattern("yyyy.MM.dd")),
                        elemek[4]
                ));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //Standard inputról beolvasás
        Scanner sc1 = new Scanner(System.in);
        String v;
        System.out.print("Kérek egy ételt: ");
        for(int i=0; i<2; i++){
            v = sc1.nextLine();
            System.out.println("Ez volt: " + v);
            String[] elemek = v.split(";");
            etelekArraylist.add(new Etel(
                    elemek[0],
                    elemek[1],
                    Double.parseDouble(elemek[2]),
                    LocalDate.parse(elemek[3], DateTimeFormatter.ofPattern("yyyy.MM.dd")),
                    elemek[4]
            ));
            System.out.print("Kérek egy ételt: ");
        }
        //mezeskalacs;012;6000;2024.12.31;desszert
        //krumplipure;099;2000;2024.11.30;koret

        //Példányosítás
        etelekArraylist.add(new Etel(
                "paradicsom leves",
                "009",
                5500.0,
                LocalDate.parse("2024.12.15", DateTimeFormatter.ofPattern("yyyy.MM.dd")),
                "leves"
        ));
        System.out.println("ArrayList:");
        for(Etel etel: etelekArraylist){
            System.out.println(etel);
        }

        //List létrehozása
        List<Etel> etelekList = new ArrayList<>();
        for(Etel etel: etelekArraylist){
            etelekList.add(etel);
        }

        System.out.println("List:");
        for(Etel etel: etelekList){
            System.out.println(etel);
        }

        //TreeSet létrehozása
        TreeSet<Etel> etelekTreeSet = new TreeSet<>(new Comparator<Etel>() {
            @Override
            public int compare(Etel o1, Etel o2) {
                return o1.getNev().compareTo(o2.getNev());
            }
        });

        for(Etel etel: etelekArraylist){
            etelekTreeSet.add(etel);
        }

        System.out.println("TreeSet:");
        for(Etel etel: etelekTreeSet){
            System.out.println(etel);
        }

        //HashSet létrehozása
        HashSet<Etel> etelekHashSet = new HashSet<>();

        for(Etel etel: etelekArraylist){
            etelekHashSet.add(etel);
        }

        System.out.println("HashSet:");
        for(Etel etel: etelekHashSet){
            System.out.println(etel);
        }

        //HashMap létrehozása
        HashMap<String, ArrayList<Etel>> etelekHashMap= new HashMap<>();

        for(Etel etel: etelekArraylist){
            ArrayList<Etel> etels;
            if(etelekHashMap.containsKey(etel.getEtelTipus())){
                etels = etelekHashMap.get(etel.getEtelTipus());
            }
            else{
                etels = new ArrayList<>();
            }
            etels.add(etel);
            etelekHashMap.put(etel.getEtelTipus(), etels);
        }

        System.out.println("HashMap:");
        for(Map.Entry<String, ArrayList<Etel>> entry: etelekHashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //drága ételek rendezve
        List<Etel> dragaEtelek = dragaEtel(etelekArraylist);
        Collections.sort(dragaEtelek, new Comparator<Etel>() {
            @Override
            public int compare(Etel o1, Etel o2) {
                int v = (int) (o1.getAr() - o2.getAr());
                if(v!=0) return v;
                return o1.getNev().compareTo(o2.getNev());
            }
        });
        System.out.println("drága ételek:");
        for(Etel etel: dragaEtelek){
            System.out.println(etel);
        }

        //lejáratközeli ételek rendezve
        List<Etel> lejaratkozeliEtelek = lejaratKozel(etelekHashMap, LocalDate.parse("2024.12.10", DateTimeFormatter.ofPattern("yyyy.MM.dd")));
        Collections.sort(lejaratkozeliEtelek, new EtelComparator());

        for(Etel etel: dragaEtelek){
            int maradekEvek = LocalDate.now().getYear() -  etel.getLejaratDatuma().getYear();
            System.out.print("Étel: " + etel.getNev());
            System.out.println("Ev marad: " + maradekEvek);
        }
        ArrayList<Etel> minMaxEtel = olcsoEsDragaEtel(etelekArraylist);
        try(Formatter fm = new Formatter(new File("etel_output.txt"))){
            fm.format("Legolcsóbb: %s, %s Ft", minMaxEtel.get(0).getNev(), minMaxEtel.get(0).getAr());
            fm.format("Legdrágább: %s, %s Ft", minMaxEtel.get(0).getNev(), minMaxEtel.get(0).getAr());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //lejaratKozel metúdus
    public static List<Etel> lejaratKozel(HashMap<String, ArrayList<Etel>> hashMap, LocalDate kozeliLejarat){
        List<Etel> kozeliLejaratList = new ArrayList<>();
        for(Map.Entry<String, ArrayList<Etel>> entry: hashMap.entrySet()){
            for(Etel etel: entry.getValue()){
                if(etel.getLejaratDatuma().isBefore(kozeliLejarat)){
                    kozeliLejaratList.add(etel);
                }
            }
        }
        return kozeliLejaratList;
    }

    public static List<Etel> dragaEtel(ArrayList<Etel> lista){
        double osszeg = 0;
        for(Etel etel: lista){
            osszeg += etel.getAr();
        }
        List<Etel> etelList = new ArrayList<>();
        for(Etel etel: lista){
            if(etel.getAr() > osszeg/lista.size()){
                etelList.add(etel);
            };
        }
        return etelList;
    }

    public static ArrayList<Etel> olcsoEsDragaEtel(ArrayList<Etel> lista){
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for(Etel etel: lista){
            if(etel.getAr()<min) min=etel.getAr();
            if(etel.getAr()>max) max=etel.getAr();
        }
        Etel minEtel = null;
        Etel maxEtel = null;
        for(Etel etel: lista){
            if(etel.getAr()== min) minEtel=etel;
            if(etel.getAr()== max) maxEtel=etel;
        }
        ArrayList<Etel> minMaxEtel = new ArrayList<>();
        minMaxEtel.add(minEtel);
        minMaxEtel.add(maxEtel);
        return minMaxEtel;
    }
}