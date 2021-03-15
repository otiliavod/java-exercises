package JavaExercises.Lab2.P3;

public class TestPatrat {
    public static void main(String[] args) {

        Patrat p1 = new Patrat(10);
        System.out.println("Perimetrul este: " + p1.calculPerimetru());
        System.out.println("Aria este: " + p1.calculArie());

        Patrat p = new Patrat(10);
        System.out.println("Sunt egale = " + p1.suntEgale(p));
    }
}
