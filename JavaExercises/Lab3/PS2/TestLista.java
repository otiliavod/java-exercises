package JavaExercises.Lab3.PS2;

public class TestLista {
    public static void main(String[] args) {
        Lista ls = new Lista();
        for(int i=1; i<10; i++) {
            ls.inserareLaInceput(i);
        }
        ls.afisare();
        System.out.println("Lista are " + ls.pare() + " numere pare");
    }
}
