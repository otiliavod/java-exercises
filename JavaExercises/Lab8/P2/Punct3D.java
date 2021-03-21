/* Sa se construiasca clasa Punct3D, folosita pentru a modela un punct in spatiu,
ce are ca variabile de instanta x, y, z, coordonatele unui punct in spatiu. Ca
metode:
- constructorul
- muta(), ce are trei parametri dx, dy, dz, pe baza carora coordonatele devin
x+dx, y+dy, z+dz
- compara() ce are ca parametru un Punct p si care returneaza true daca punctul
curent este egal cu punctul p
- distanta() ce are ca parametru un Punct p si care returneaza distanta dintre
punctul curent si punctul p
- getX() ce returneaza valoarea coordonatei x
- getY() ce returneaza valoarea coordonatei y
- getZ() ce returneaza valoarea coordonatei z
- afisare() ce afiseaza coordonatele punctului
Pe baza clase Punct3D se va dezvolta clasa Punct3DColor, in care se va adauga
o noua variabila de instanta de tipul String: culoarea punctului si o noua metoda
getCuloare() ce returneaza culoarea punctului. Se va scrie un nou constructor si
se vor redefini metodele compara() si afisare().
Sa se scrie si o clasa de test pentru clasa Punct3DColor.*/

package JavaExercises.Lab8.P2;

public class Punct3D {
    private int x;
    private int y;
    private int z;

    public Punct3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void muta(int dx, int dy, int dz) {
        x = x + dx;
        y = y + dy;
        z = z + dz;
    }

    public boolean compara(Punct3D p) {
        if((x == p.x) && (y == p.y) && (z == p.z)) {
            return true;
        }
        else {
            return false;
        }
    }

    public double distanta(Punct3D p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        double dz = this.z - p.z;
        double dist = Math.sqrt(dx*dx + dy*dy + dz*dz);
        return dist;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void afisare() {
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Z: " + z);
    }
}
