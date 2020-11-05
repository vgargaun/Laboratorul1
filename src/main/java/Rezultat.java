public class Rezultat {
    private static double x = 0;
    private static double u = 1;

    public static double analitic(double h) {
        return -4*Math.pow(h, 3) + 3*Math.pow(h,2) + 1;
    }

    public static double eulre(double h) {

        u = u + h * (-12*Math.pow(x,2)+6*x);
        x = x + h;
        return u;
    }

    public static double eulerModificat(double h){

        return 0;
    }
}
