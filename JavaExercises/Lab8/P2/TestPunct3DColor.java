package JavaExercises.Lab8.P2;

public class TestPunct3DColor {
    public static void main(String[] args) {
        Punct3DColor p = new Punct3DColor(1, 2, 1, "negru");
        Punct3DColor p1 = new Punct3DColor(1, 2, 1, "negru");
        p.afisare();
        System.out.println("Distanta: " + p.distanta(p1));
        System.out.println("Sunt egale: " + p.compara(p1));
    }
}
