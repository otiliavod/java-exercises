/* Sa se dezvolte clasa Timp ce are ca variabile de instanta trei
numere intregi h, min, sec. Ca metode:
- constructorul
- conversieInSecunde(), ce transforma timpul curent exprimat in
secunde
- compara(), ce are ca parametru un Timp t si care returneaza
1 daca timpul curent este mai mare ca t, 0 daca cei doi timpi 
sunt egali si -1 in caz contrar.
Scrieti si o clasa de test pentru clasa Timp.*/

package JavaExercises.Lab2.P4;

public class Timp {
    private int h;
    private int min;
    private int sec;

    public Timp(int x, int y, int z) {
        h = x;
        min = y;
        sec = z;
    }

    public int conversieInSecunde() {
        h = h * 3600;
        min = min * 60;
        return h + min + sec;
    }

    public int compare(Timp t) {
        if((this.h == t.h) && (this.min == t.min) && (this.sec == t.sec)) {
            return 0;
        }
        else if((this.h > t.h) && (this.min > t.min) &&(this.sec > t.sec)) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
