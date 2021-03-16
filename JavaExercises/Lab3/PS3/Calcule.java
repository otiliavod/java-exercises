/*  Sa se implemnteze clasa Calcule ce contine doar metode statice
si anume:
- afisareDivizori(), ce are ca parametru un numar intreg caruia
ii afiseaza toti divizorii
- nrDivizori(), ce are ca parametru un numar intreg si care
returneaza numarul total de divizori ai lui n
- estePrim(), ce are ca parametru un numar intreg si care retuneaza
true daca numarul exte prim*/

package JavaExercises.Lab3.PS3;

public class Calcule {
    public static void afisareDivizori(int nr) {
        if(nr == 1) {
            System.out.println("1");
            return;
        }
        System.out.print("1 ");
        for(int i = 2; i < nr/2; i++) {
            if(nr % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(nr);
    }

    public static int nrDivizori(int nr) {
        if(nr == 1) {
            return 1;
        }
        int contor = 2;
        for(int i = 2; i < nr/2; i++) {
            if(nr % i == 0) {
                contor ++;
            }
        }
        return contor;
    }

    public static boolean estePrim(int nr) {
        for(int i = 2; i <=Math.sqrt(nr); i++) {
            if(nr % i == 0) {
                return false;
            }
        }
        return true;
    }
}
