public class Negyzet extends Teglalap{

    public Negyzet(double oldalHossz) {
        super(oldalHossz, oldalHossz);
    }

    public double getOldalHossz(){
        return super.getHosszabbOldal();
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Negyzet{");
        sb.append("oldalHossz=").append(super.getHosszabbOldal());
        sb.append(", terület= ").append(getTerulet());
        sb.append(", kerület= ").append(getKerulet());
        sb.append('}');
        return sb.toString();
    }
}
