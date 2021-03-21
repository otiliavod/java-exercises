package JavaExercises.Lab8.PS4;

public class Student extends Persoana{
    private String numeFacultate;
    private int nrMatricol;

    public Student(String n, String p, int v, String facult, int nr) {
        super(n,p,v);
        numeFacultate = facult;
        nrMatricol = nr;
    }

    public String getFacultate() {
        return numeFacultate;
    }

    public int getNumarMatricol() {
        return nrMatricol;
    }
}
