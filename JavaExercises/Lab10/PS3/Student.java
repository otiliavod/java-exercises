package JavaExercises.Lab10.PS3;

public class Student implements Comparable<Student>{
    private String nume;
    private double medie;

    public Student(String nume, double medie) {
        this.nume = nume;
        this.medie = medie;
    }
    /* Folosim @Override deoarece compilatorul va verifica si ne va avertiza
    daca nu am dat corect parametrii metodei pe care vrem sa o rescriem.
    Metoda compareTo() este singura definita in interfata Comparable*/
    @Override
    public int compareTo(Student s) {
        if(medie > s.medie) {
            return 1;
        }
        else if(medie == s.medie) {
            return 0;
        }
        else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "[" + nume + " : " + medie + "]";
    }
}
