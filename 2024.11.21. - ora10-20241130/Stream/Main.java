import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        ArrayList<Konyv> konyvek = new ArrayList<>();
        try(Scanner sc = new Scanner(new File("konyv.txt"))){
            while(sc.hasNextLine()){
                String s = sc.nextLine();
                String[] sElements = s.split(";");
                if(i!=0){
                    Konyv k1;
                    try {
                        k1 = new Konyv(sElements[0],
                                sElements[1],
                                sElements[2],
                                sElements[3],
                                sElements[6],
                                Integer.parseInt(sElements[5]),
                                LocalDate.parse(sElements[4], DateTimeFormatter.ofPattern("yyyy.MM.dd")),
                                Integer.parseInt(sElements[7]));
                    } catch (ArrayIndexOutOfBoundsException e) {
                        try {
                            k1 = new Konyv(sElements[0],
                                    sElements[1],
                                    sElements[2],
                                    sElements[3],
                                    sElements[6],
                                    Integer.parseInt(sElements[5]),
                                    LocalDate.parse(sElements[4], DateTimeFormatter.ofPattern("yyyy.MM.dd")),
                                    null);
                        } catch (ArrayIndexOutOfBoundsException e1) {
                            k1 = new Konyv(sElements[0],
                                    sElements[1],
                                    sElements[2],
                                    null,
                                    null,
                                    null,
                                    null,
                                    null);
                        }
                    }
                    konyvek.add(k1);
                }
                i++;

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        /*for(Konyv konyv: konyvek){
            System.out.println(konyv);
        }*/

        konyvek.stream().forEach(e -> System.out.println(e));

        System.out.println();

        konyvek.stream().filter(e -> e.getCim().contains("i"))
                .forEach(e -> System.out.println(e));


    }
}