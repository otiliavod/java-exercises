/* Citim repetat de la tastatura cate un numar pe care il memoram intr-o colectie
ArrayList, pana cand se tasteaza numarul -1. Sa se afiseze toate numerele
din colectie, si apoi sa se afiseze doar cele mai mici doua numere din colectie.
Daca colectia are mai putin de doua elemente se va afisa un mesaj corespunzator.*/

package JavaExercises.Lab10.PS1;
import java.util.*;

public class C1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(;;) {
            System.out.print("Nr: ");
            int nr = sc.nextInt();
            if(nr == -1) {
                break;
            }
            al.add(nr);
        }

        Iterator<Integer> it = al.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        int n = al.size();
        if(n < 2) {
            System.out.println("Colectia are mai putin de doua elemente");
            System.exit(0);
        }

        Collections.sort(al);
        it = al.iterator();
        System.out.println("Cele mai mici doua elemente: ");
        System.out.print(it.next() + " ");
        System.out.println(it.next());
    }
}
