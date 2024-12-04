import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        Adatok adatok = mapper.readValue(new File("json_input.json"), Adatok.class);

        List<Etel> etels = adatok.getAdatok();

        etels.stream()
                .filter(e -> e.getAr() > 2000 && e.getEtelTipus().equals("eloetel"))
                .forEach(System.out::println);

        etels.stream()
                .filter(e -> e.getLejaratDatuma().getYear() > 2024)
                .forEach(System.out::println);

        System.out.println(
        etels.stream()
                .min(new Comparator<Etel>() {
                    @Override
                    public int compare(Etel o1, Etel o2) {
                        return (int) (o1.getAr() - o2.getAr());
                    }
                }).map(Etel::getNev).get()
        );

        System.out.println(
                etels.stream()
                        .mapToDouble(Etel::getAr)
                        .average()
                        .getAsDouble()
        );
        System.out.println(
        etels.stream()
                .collect(Collectors.groupingBy(Etel::getEtelTipus))
        );
    }
}
