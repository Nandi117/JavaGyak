public class Haromszog {
    private double a;
    private double b;
    private double c;

    private double alfa;
    private double beta;
    private double gamma;

    public Haromszog(double a, double b, double c) throws HaromszogException {

        if(a<=0 || b<=0 || c<=0){
            throw new HaromszogException("az oldal kisebb, mint 0", a,b,c);
        }

        if(!((a+b > c) && (a+c > b) && (b+c > a))){
            throw new HaromszogException("a haromszogegyenlotlenseg nem teljesul", a,b,c);
        }

        this.a = a;
        this.b = b;
        this.c = c;

        if(this.c < this.a){
            double cs = this.c;
            this.c = this.a;
            this.a = cs;
        }

        if(this.c < this.b){
            double cs = this.c;
            this.c = this.b;
            this.b = cs;
        }

        if(this.b < this.a){
            double cs = this.b;
            this.b = this.a;
            this.a = cs;
        }

        this.alfa = this.szog(this.a,this.b,this.c);
        this.beta = this.szog(this.b,this.a,this.c);
        this.gamma = this.szog(this.c,this.b,this.a);
    }

    private double szog(double oSz, double o1, double o2){
        return Math.acos((oSz * oSz - o1 * o1 - o2 * o2) / (-2 * o1 * o2));

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getAlfa() {
        return alfa;
    }

    public double getBeta() {
        return beta;
    }

    public double getGamma() {
        return gamma;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Haromszog{");
        sb.append("a=").append(a);
        sb.append(", b=").append(b);
        sb.append(", c=").append(c);
        sb.append(", alfa=").append(alfa);
        sb.append(", beta=").append(beta);
        sb.append(", gamma=").append(gamma);
        sb.append('}');
        return sb.toString();
    }
}
