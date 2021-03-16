package JavaExercises.Lab3.P3;

public class TestList {
    public static void main(String[] args) {
        DoubleList ls = new DoubleList();
        for(int i=1; i<10; i++) {
            ls.inserareLaInceput(i);
        }
        ls.afisare();
    }
}
