public class MainClass {
    public static void main(String[] args) {
        double h1 = 0.1;
        double h2 = 0.2;

//        for(double i = 0; i <= 10; i++)
//            System.out.println(Rezultat.analitic(i/10D));

        for(int i = 0; i <= 5; i++ )
            System.out.println(Rezultat.eulre(h2));
    }
}
