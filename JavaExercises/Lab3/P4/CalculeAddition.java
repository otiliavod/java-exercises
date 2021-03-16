/* Sa se adauge in clasa Calcule si metodele:
- cmmdc() ce are ca parametri doua numere intregi si care returneaza
cmmdc al lor
- suntPrimeIntreEle() ce are ca parametri doua numere intregi si 
care returneaza true daca sunt prime intre ele.*/

package JavaExercises.Lab3.P4;

public class CalculeAddition {
    public static int cmmdc(int a, int b) {
        while(a != b) {
            if(a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        return a;
    }

    public static boolean suntPrimeIntreEle(int a, int b) {
        for(int i = 2; i <= a; i++) {
            if((a % i == 0) && (b % i == 0)) {
                return false;
            }
        }
        return true;
    }
}
