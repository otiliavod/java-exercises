package JavaExercises.Lab8.P1;

public class TestCercColor {
    public static void main(String[] args) {
        CercColor c = new CercColor(2, "negru");
        CercColor c1 = new CercColor(2, "negru");
        System.out.println("Sunt egale: " + c.suntEgale(c1));
    }
}
