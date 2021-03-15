/* Sa se scrie clasa Cerc ce are ca variabile de instanta pe langa
raza, si coordonatele centrului x0 si y0. In aceasta clasa avem
ca metode:
- constructorul, ce face initializarea razei si a coordonatelor
- setR(), ce seteaza raza
- setX0(), ce seteaza coordonata x0
- setY0(), ce seteaza coordonata y0
- getR(), ce returneaza valoarea razei
- getX0(), ce returneaza valoarea coordonatei x0
- getY0(), ce returneaza valoarea coordonatei y0
- calculArie(), ce returneaza aria cercului
- afisare(), ce afiseaza raza si coordonatele*/

package JavaExercises.Lab2.P1;

public class Cerc {
    private int raza;
    private int x0;
    private int y0;

    public Cerc(int x, int a, int b) {
        raza = x;
        x0 = a;
        y0 = b;
    }

    public void setR(int r) {
        raza = r;
    }

    public void setX0(int x) {
        x0 = x;
    }

    public void setY0(int y) {
        y0 = y;
    }

    public int getR() {
        return raza;
    }

    public int getX0() {
        return x0;
    }

    public int getY0() {
        return y0;
    }

    public double calculArie() {
        return Math.PI*raza*raza;
    }

    public void afisare() {
        System.out.println("Raza: " + raza + " si coordonatele: " + x0 + "," + y0);
    }
}
