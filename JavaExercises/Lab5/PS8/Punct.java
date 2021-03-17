/* Se defineste clasa Punct ce are ca variabile de instanta privata
pe x si pe y, coordonatele unui punct in plan. In aceasta clasa
se definesc constructorul si metodele publice set() si get(). Se
formeaza o matrice patrata de obiecte Punct, de dimensiune N, care 
se citeste de la tastatura. De asemenea, se citesc de la tastatura
cele N^2 obiecte Punct care se memoreaza pe pozitiile corespunzatoare
in matrice.Care linie din matrice are cele mai multe obiecte Punct
ce au coordonatele x si y egale?*/

package JavaExercises.Lab5.PS8;

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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
