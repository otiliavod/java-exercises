/* Sa se construiasca clasa Punct, ce are ca variabile de instanta private doua
numere intregi, x si y, coordonatele unui punct in plan. Ca metode:
- constructorul
- getX() ce returneaza valoarea coordonatei x
- getY() ce returneaza valoarea coordonatei y
- afisare() ce afiseaza coordonatele punctului
Din clasa Punct se deriveaza doua clase: clasa PunctColor si clasa Punct3D. Clasa
PunctColor are in plus fata de clasa Punct o variabila in care in care este 
memorata culoarea punctului, un nou constructor, metoda getCuloare() si se 
redefineste metoda afisare(). Clasa Punct3D, ce reprezinta un punct in spatiu,
are in plus fata de clasa Punct o variabila z, un nou constructor, metoda getZ()
si se redefineste metoda afisare().
Folosind aceste trei clase se va dezvolta o aplicatie in care se citesc N puncte
de la tastatura de tipul PunctColor si Punct3D. Pentru fiecare punct, in momentul
citirii, utilizatorul aplicatiei va specifica daca va introduce un PunctColor
sau un Punct3D. Cele N puncte se vor memora intr-un vector de tip Punct. In final
se vor afisa pentru fiecare punct din cele N informatiile memorate.*/

package JavaExercises.Lab9.P2;

public class Punct {
    private int x;
    private int y;

    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void afisare() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
