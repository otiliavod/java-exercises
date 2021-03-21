/* Sa se construiasca clasa Punct, folosita pentru a modela un punct in plan, ce 
are ca variabile de instanta x si y, coordonatele unui punct in plan. Ca metode:
- constructorul
- muta(), ce are doi parametri dx si dy pe baza carora noile coordonate devin
x + dx, y + dy
- compara() ce are ca parametru un Punct p si care returneaza true daca punctul
curent este egal cu punctul p
- distantaOrigine() ce returneaza distanta dintre punctul curent si origine
- distanta() ce are ca parametru un Punct p si care returneaza distanta dintre
punctul curent si punctul p
- getX() ce returneaza valoarea coordonatei x
- getY() ce returneaza valoarea coordontei y
- setX() ce seteaza valoarea coordonatei x
- setY() ce seteaza valoarea coordonatei y
- afisare() ce afiseaza coordonatele punctului
Pe baza clasei Punct se va dezvolta prin mostenire clasa PunctColor, in care se
va adauga o noua variabila de instanta de tipul String, culoarea punctului si
noile metode getCuloare() ce returneaza culoarea punctului si setCuloarer() ce
seteaza culoarea punctului. Se vor redefini metodele compara() si afisare() si 
noul constructor.
Sa se creeze si o clasa de test pentru clasa PunctColor.*/

package JavaExercises.Lab8.PS3;

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

    public void afisare() {
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }

    public void muta(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    public boolean compara(Punct p) {
        if((x == p.x) && (y == p.y)) {
            return true;
        }
        else {
            return false;
        }
    }

    public double distantaOrigine() {
        double dist = Math.sqrt(x*x + y*y);
        return dist;
    }

    public double distanta(Punct p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        double dist = Math.sqrt(dx*dx + dy*dy);
        return dist;
    }
}
