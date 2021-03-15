package JavaExercises.Lab2.PS5;

public class TestDreptunghi {
    public static void main(String[] args) {

        Dreptunghi d = new Dreptunghi(5, 7);
        System.out.println("Perimetrul este: " + d.calculPerimetru());
        System.out.println("Aria este: " + d.calculArie());
        System.out.println("Dreptunghiul este patrat = " + d.estePatrat());
        Dreptunghi d1 = new Dreptunghi(5, 7);
        System.out.println("Sunt egale = " + d.suntEgale(d1));
    }
}
