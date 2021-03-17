/* Sa se construiasca clasa Complex ce modeleaza un numar complex. Clasa va contine si metoda modul(),
ce returneaza modulul unui numar complex. Sa se scrie apoi o clasa separata in a carei metoda main()
citim un vector de N obiecte Complex si in care afisam numarul complex ce are cel mai mare modul.*/

package JavaExercises.Lab4.P6;

public class Complex {
    private double re;
    private double im;

    public Complex(int x, int y) {
        re = x;
        im = y;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public double modul() {
        return Math.sqrt(re * re + im * im);
    }
}
