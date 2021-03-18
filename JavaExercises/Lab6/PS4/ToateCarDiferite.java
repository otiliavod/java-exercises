/* Se citeste un sir. Sa se afiseze daca are toate caracterele diferite intre ele. Se va folosi o metoda
separata, areToateCarDiferite().*/

package JavaExercises.Lab6.PS4;
import javax.swing.*;

public class ToateCarDiferite {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Sir: ");
        if(areToateCarDiferite(s) == true) {
            System.out.println("Are toate caracterele diferite intre ele");
        }
        else {
            System.out.println("Nu are toate caracterele diferite intre ele");
        }
    }

    private static boolean areToateCarDiferite(String s) {
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) == s.charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
