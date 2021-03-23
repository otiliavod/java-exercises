/* Se citesc de la tastatura niste numere naturala(pana se tasteaza valoarea -1).
Numerele se vor memora intr-o lista ArrayList. Vom afisa apoi daca toate numerele
prime din lista sunt diferite intre ele sau nu. Pentru aceasta vom copia mai intai
toate numerele intr-un vector de numere intregi.*/

package JavaExercises.Lab10.PS5;
import java.util.*;

public class NumerePrimeDiferite {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(;;) {
            System.out.print("Nr: ");
            int nr = sc.nextInt();
            if(nr == -1) {
                break;
            }
            else {
                al.add(nr);
            }
        }

        int a[] = new int[al.size()];
        int i = 0;
        Iterator<Integer> it = al.iterator();
        while(it.hasNext()) {
            int x = it.next();
            if(estePrim(x)) {
                a[i] = x;
                i++;
            }
        }

        int nP = i; //numarul de numere prime
        for(i=0; i<nP; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for(i=0; i<nP; i++) {
            for(int j=i+1; j<nP; j++) {
                if(a[i] == a[j]) {
                    System.out.println("Nu sunt toate diferite");
                    return;
                }
                System.out.println("Sunt toate diferite");
            }
        }

        sc.close();
    }

    private static boolean estePrim(int nr) {
        for(int i=2; i<=Math.sqrt(nr); i++) {
            if(nr % i == 0) {
                return false;
            }
        }
        return true;
    }
}
