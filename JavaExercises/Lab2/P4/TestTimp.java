package JavaExercises.Lab2.P4;

public class TestTimp {
    public static void main(String[] args) {

        Timp t1 = new Timp(5, 54, 15);
        System.out.println("In secunde: " + t1.conversieInSecunde());
        
        Timp t = new Timp(3, 55, 11);
        System.out.println("Dupa comparare: " + t1.compare(t));
    }
}
