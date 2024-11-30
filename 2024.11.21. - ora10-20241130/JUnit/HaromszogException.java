public class HaromszogException extends Exception{
    private double a;
    private double b;
    private double c;

    private double alfa;
    private double beta;
    private double gamma;

    public HaromszogException(String message, double a, double b, double c,
                              double alfa, double beta, double gamma) {
        super(message);
        this.a = a;
        this.b = b;
        this.c = c;
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
    }

    public HaromszogException(String message, double a, double b, double c) {
        super(message);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public HaromszogException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HaromszogException{");
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
