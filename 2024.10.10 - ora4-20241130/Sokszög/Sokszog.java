public abstract class Sokszog {
    private int szogekSzama;

    public Sokszog(int szogekSzama){
        this.szogekSzama = szogekSzama;
    }

    public int getSzogekSzama() {
        return szogekSzama;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Sokszog{");
        sb.append("szogekSzama=").append(szogekSzama);
        sb.append('}');
        return sb.toString();
    }

    public abstract double getKerulet();
    public abstract double getTerulet();
}
