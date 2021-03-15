package JavaExercises.Lab2.PS6;

public class TestUnghi {
    public static void main(String[] args) {
        Unghi a = new Unghi(30);
        System.out.println("Radiani: " + a.conversieRadiani());
        System.out.println("Sunt complementare = " + a.suntComplementare(new Unghi(60)));
    }
}
