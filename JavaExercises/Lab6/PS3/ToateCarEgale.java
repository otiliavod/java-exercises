/* Se citeste un sir. Sa se afiseze daca are toate caracterele egale intre ele sau nu. Se va folosi o metoda
separata, areToateCarEgale().*/

package JavaExercises.Lab6.PS3;
import javax.swing.*;

public class ToateCarEgale {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Sir = ");
        if(areToateCarEgale(s) == true) {
            System.out.println("Are toate caracterele egale");
        }
        else {
            System.out.println("Nu are toate caracterele egale");
        }
    }

    private static boolean areToateCarEgale(String s) {
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) != s.charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
