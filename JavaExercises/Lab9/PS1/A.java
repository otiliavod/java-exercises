/* Definim clasa abstracta A care are doua metode: una implementata, si una care
nu este implementata:
- metoda abstracta calcul()
- metoda durataCalcul() ce returneaza durata exprimata in milisecunde a executiei
metodei calcul()
Din clasa abstracta A se va deriva clasa B, ce contine implementarea metodei
calcul(). Se va dezvolta si o clasa de test pentru clasa derivata B.*/

package JavaExercises.Lab9.PS1;

abstract class A {
    abstract public void calcul(int N);
    public long durataCalcul(int N) {
        long t1 = System.currentTimeMillis();
        calcul(N);
        long t2 = System.currentTimeMillis();
        return(t2-t1);
    }
}
