public class Rezultat {
    private static double x = 0;
    private static double u = 1;

    public static double analitic(double h) {
        return Math.pow(h, 3) - h + 1;
    }

    public static double eulre(double h) {

        u = u + h * (3*Math.pow(x,2)-1);
        x = x + h;
        return u;
    }

    public static double eulerModificat(double h){

        return 0;
    }
}
