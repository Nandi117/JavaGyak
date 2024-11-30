public class EgyenloOldaluHaromszog extends Sokszog{

    private double oldalHossz;

    public EgyenloOldaluHaromszog(double oldalHossz) {
        super(3);
        this.oldalHossz = oldalHossz;
    }

    public double getOldalHossz() {
        return oldalHossz;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EgyenloOldaluHaromszog{");
        sb.append("oldalHossz=").append(oldalHossz);
        sb.append(", terület= ").append(getTerulet());
        sb.append(", kerület= ").append(getKerulet());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double getKerulet() {
        return 3 * oldalHossz;
    }

    @Override
    public double getTerulet() {
        return (oldalHossz * oldalHossz * Math.sqrt(3)) / 4;
    }
}
