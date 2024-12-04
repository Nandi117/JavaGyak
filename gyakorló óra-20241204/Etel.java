import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.sound.midi.Track;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

 class Etel implements Comparable<Etel> {
    @JsonProperty("nev")
    private String nev;
    @JsonProperty("vonalkod")
    private String vonalkod;
    @JsonProperty("ar")
    private double ar;
    @JsonProperty("lejaratDatuma")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd")
    private LocalDate lejaratDatuma;
    @JsonProperty("etelTipus")
    private String etelTipus;

    private final static int minAr = 100;

    /**
     * Egy példányt hoz létre az Etel osztályhoz
     * @param nev az étel neve
     * @param vonalkod az étel vonalkódja
     * @param ar az étel ára
     * @param lejaratDatuma az étel lejárati dátuma
     * @param etelTipus az étel típusa
     */
    public Etel(){

    }
    public Etel(String nev, String vonalkod, double ar, LocalDate lejaratDatuma, String etelTipus) {
        this.nev = nev;
        this.vonalkod = vonalkod;
        this.ar = ar;
        this.lejaratDatuma = lejaratDatuma;
        this.etelTipus = etelTipus;
    }

    /**
     *
     * @return visszaadja az étel nevét
     */
    public String getNev() {
        return nev;
    }

    public String getVonalkod() {
        return vonalkod;
    }

    public double getAr() {
        return ar;
    }

    public LocalDate getLejaratDatuma() {
        return lejaratDatuma;
    }

    public String getEtelTipus() {
        return etelTipus;
    }

    /**
     * 2 étel összehasonlításáért fellelős metódus.
     * @param o Az étel, amivel hasonlítunk
     * @return igazat, ha a vonalkód és a típus is egyezik, minden más esetben hamisat
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etel etel = (Etel) o;
        return Objects.equals(vonalkod, etel.vonalkod) && Objects.equals(etelTipus, etel.etelTipus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(etelTipus);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Etel{");
        sb.append("nev='").append(nev).append('\'');
        sb.append(", vonalkod='").append(vonalkod).append('\'');
        sb.append(", ar=").append(ar);
        sb.append(", lejaratDatuma=").append(lejaratDatuma);
        sb.append(", etelTipus='").append(etelTipus).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Etel o) {
        int v = o.etelTipus.compareTo(this.etelTipus);
        if (v!=0) return v;
        return this.nev.compareTo(o.nev);
    }
}
