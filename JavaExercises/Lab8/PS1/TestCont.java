package JavaExercises.Lab8.PS1;

public class TestCont {
    public static void main(String[] args) {
        ContBancarExtins c = new ContBancarExtins(1000, 0.12);
        c.adauga(1000);
        c.adaugaDobandaLunara();
        c.afisare();
    }
}
