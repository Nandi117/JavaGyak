import java.time.LocalDate;

public class Konyv {
    private String konyvAzon;
    private String cim;
    private String isbn;
    private String kiado;
    private String tema;
    private Integer ar;
    private Integer oldalszam;
    private LocalDate kiadasDatuma;

    public Konyv(String konyvAzon, String cim, String isbn, String kiado,
                 String tema, Integer ar, LocalDate kiadasDatuma, Integer oldalszam) {
        this.konyvAzon = konyvAzon;
        this.cim = cim;
        this.isbn = isbn;
        this.kiado = kiado;
        this.tema = tema;
        this.ar = ar;
        this.kiadasDatuma = kiadasDatuma;
        this.oldalszam = oldalszam;
    }

    public String getKonyvAzon() {
        return konyvAzon;
    }

    public String getCim() {
        return cim;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getKiado() {
        return kiado;
    }

    public String getTema() {
        return tema;
    }

    public int getAr() {
        return ar;
    }

    public int getOldalszam() {
        return oldalszam;
    }

    public LocalDate getKiadasDatuma() {
        return kiadasDatuma;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Konyv{");
        sb.append("konyvAzon='").append(konyvAzon).append('\'');
        sb.append(", cim='").append(cim).append('\'');
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", kiado='").append(kiado).append('\'');
        sb.append(", tema='").append(tema).append('\'');
        sb.append(", ar=").append(ar);
        sb.append(", oldalszam=").append(oldalszam);
        sb.append(", kiadasDatuma=").append(kiadasDatuma);
        sb.append('}');
        return sb.toString();
    }
}
