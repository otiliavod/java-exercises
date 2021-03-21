package JavaExercises.Lab8.PS2;

public class TestCerc {
    public static void main(String[] args) {
        CercExtins c = new CercExtins(3, 0, 1);
        System.out.println("Aria: " + c.calculArie());
        CercExtins c1 = new CercExtins(3, 0, 1);
        System.out.println("Sunt egale: " + c.suntEgale(c1));
    }
}
