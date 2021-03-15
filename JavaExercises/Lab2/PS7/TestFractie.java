package JavaExercises.Lab2.PS7;

public class TestFractie {
    public static void main(String[] args) {
        Fractie f1 = new Fractie();
        f1.setNumarator(5);
        f1.setNumitor(6);

        Fractie f = f1.inversa();
        System.out.println("Fractia inversata: ");
        f.afisare();

        Fractie f2 = new Fractie();
        f2.setNumarator(1);
        f2.setNumitor(2);

        Fractie fsum = f1.suma(f2);
        System.out.println("Suma celor doua fractii: ");
        fsum.afisare();
    }
}
