package JavaExercises.Lab3.PS1;

public class TestComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 1);
        System.out.println("Modulul este: " + c1.modul());

        Complex c2 = new Complex(1, 1);
        c1.suma(c2);
        System.out.println("Partea reala este: " + c1.getRe());
        System.out.println("Partea imaginara este: " + c1.getIm());

        Complex c3 = new Complex(1, 1);
        System.out.println("Sunt egale: " + c1.egale(c3));
    }
}
