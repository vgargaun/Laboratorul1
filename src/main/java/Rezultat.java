public class Rezultat {
    private static double x = 0;
    private static double u = 1;
    private static double uModif = 1;
    private static double xModif = 0;

    public static double analitic(double h) {
        return -4 * Math.pow(h, 3) + 3 * Math.pow(h, 2) + 1;
    }

    public static double eulre(double h) {

        u = u + h * mathFun(x);
        x = x + h;
        return u;
    }

    public static double eulerModificat(double h) {

        uModif = uModif + (h / 2) * (mathFun(xModif) + mathFun(xModif + h) );
        xModif = xModif + h;
        return uModif;

    }

    private static double mathFun(double x) {
        return -12 * Math.pow(x, 2) + 6 * x;
    }
}
