/* Se citesc de la tastatura doua propozitii in doua siruri s1 si s2. Sa se calculeze si afiseze care sunt
cuvintele comune in cele doua propozitii.*/

package JavaExercises.Lab7.P2;
import javax.swing.*;
import java.util.*;

public class CuvinteComune {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("Sir1: ");
        String s2 = JOptionPane.showInputDialog("Sir2: ");

        StringTokenizer tk = new StringTokenizer(s1);
        int n1 = tk.countTokens();
        String cuv1[] = new String[n1];
        for(int i=0; i<n1; i++) {
            cuv1[i] = tk.nextToken();
        }
    
        tk = new StringTokenizer(s2);
        int n2 = tk.countTokens();
        String cuv2[] = new String[n2];
        for(int i=0; i<n2; i++) {
            cuv2[i] = tk.nextToken();
        }
        String cuvComune[] = new String[n1];
        int k = 0;
        for(int i=0; i<n1; i++) {
            for(int j=0; j<n2; j++) {
                if(cuv1[i].compareTo(cuv2[j]) == 0) {
                    cuvComune[k] = cuv1[i];
                    k++;
                }
            }
        }
        for(int i = 0; i < n1; i++){
            if(cuvComune[i] != null){
                System.out.println(cuvComune[i]);
            }
        }
    }
}
