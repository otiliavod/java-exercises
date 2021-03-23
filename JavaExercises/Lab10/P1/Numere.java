/* Se citesc niste numere naturale(pana se tasteaza -1). Se va folosi un obiect
ArrayList pentru a memora numerele citite. Sa se afiseze apoi doar numerele prime
din ArrayList.*/

package JavaExercises.Lab10.P1;
import java.util.*;

public class Numere {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(;;) {
            System.out.print("Nr: ");
            int nr = sc.nextInt();
            if(nr == -1) {
                break;
            }
            else {
                l.add(nr);
            }
        }

        int a[] = new int[l.size()];
        int i = 0;
        Iterator<Integer> it = l.iterator();
        while(it.hasNext()) {
            int x = it.next();
            if(estePrim(x)) {
                a[i] = x;
                i++;
            }
        }

        int np = i; // numarul de numere prime
        for(i=0; i<np; i++) {
            System.out.print(a[i] + " ");
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
