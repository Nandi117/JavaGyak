public class Teglalap extends Sokszog{

    private double hosszabbOldal;
    private double rovidebbOldal;

    public Teglalap(double hosszabbOldal, double rovidebbOldal) {
        super(4);
        if(hosszabbOldal == (double) 0){
            hosszabbOldal = 1;
        }
        if(rovidebbOldal == (double) 0){
            rovidebbOldal = 1;
        }
        if(hosszabbOldal < rovidebbOldal){
            this.rovidebbOldal = hosszabbOldal;
            this.hosszabbOldal = rovidebbOldal;
        }
        else{
            this.hosszabbOldal = hosszabbOldal;
            this.rovidebbOldal = rovidebbOldal;
        }
    }

    public double getHosszabbOldal() {
        return hosszabbOldal;
    }

    public double getRovidebbOldal() {
        return rovidebbOldal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Teglalap{");
        sb.append("hosszabbOldal=").append(hosszabbOldal);
        sb.append(", rovidebbOldal=").append(rovidebbOldal);
        sb.append(", terület= ").append(getTerulet());
        sb.append(", kerület= ").append(getKerulet());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double getKerulet() {
        return 2 * (hosszabbOldal + rovidebbOldal);
    }

    @Override
    public double getTerulet() {
        return hosszabbOldal * rovidebbOldal;
    }
}
