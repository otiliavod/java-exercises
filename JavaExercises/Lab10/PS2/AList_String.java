/* Se va crea o lista parametrizata de obiecte String. Se va ilustra si folosirea
metodei remove() la parcurgerea listei cu iterator.*/

package JavaExercises.Lab10.PS2;
import java.util.*;

public class AList_String {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("mar");
        al.add("para");
        al.add("kiwi");

        Iterator<String> it = al.iterator();
        while(it.hasNext()) {
            String s = it.next();
            if(s.equals("para")) {
                it.remove();
            }
        }

        System.out.println("Afisam lista: ");
        it = al.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
