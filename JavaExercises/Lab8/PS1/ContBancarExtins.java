package JavaExercises.Lab8.PS1;

public class ContBancarExtins extends ContBancar{
    private double rd;

    public ContBancarExtins(double S, double rata) {
        super(S);
        rd = rata;
    }

    public void adaugaDobandaLunara() {
        double S = this.getSuma();
        double dobanda = S * (rd/12);
        this.adauga(dobanda);
    }

    public void afisare() {
        System.out.println("Suma: " + this.getSuma());
        System.out.println("Rata dobanzii: " + rd);
    }
}
