public class MainClass {
    public static void main(String[] args) {
        double h1 = 0.1;
        double h2 = 0.2;

        System.out.println("Rezolvare prin metoda analitica");
        for(double i = 0; i <= 10; i++)
            System.out.println(Rezultat.analitic(i/10D));

        System.out.println("Rezolvare prin metoda Euler");
        for(int i = 0; i < 11; i++ )
            System.out.println(Rezultat.eulre(h1));

        System.out.println("Rezolvare prin metoda Euler Modificata");
        for(double i = 0; i < 10; i++)
            System.out.println(Rezultat.eulerModificat(h1));


    }
}
