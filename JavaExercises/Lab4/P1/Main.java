/* Citim un numar natural N. Citim N numere intregi intr-un vector
a. Se sa calculeze si afiseze(folosind cinci metode difrite):
- suma elementelor vectorului
- daca toate numerele din vector sunt egale
- daca toate numerele din vector sunt diferite
- cate numere pare sunt in vector
- daca un numar x, citit de la tastatura, este prezent in vector*/

package JavaExercises.Lab4.P1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();

        int a[] = new int[N];
        for(int i=0; i<N; i++) {
            System.out.print("nr = ");
            a[i] = sc.nextInt();
        }

        System.out.println("Suma este: " + suma(a));
        
        boolean rez1 = suntEgale(a);
        if(rez1 == true) {
            System.out.println("Sunt egale");
        }
        else {
            System.out.println("Nu sunt egale");
        }

        boolean rez2 = suntDiferite(a);
        if(rez2 == true) {
            System.out.println("Sunt diferite");
        }
        else {
            System.out.println("Nu sunt diferite");
        }

        int b;
        System.out.print("b = ");
        b = sc.nextInt();
        if(estePrezent(a, b)) {
            System.out.println("Este prezent");
        }
        else {
            System.out.println("Nu este prezent");
        }

        sc.close();
    }

    public static int suma(int x[]) {
        int suma = 0;
        for(int i=0; i<x.length; i++) {
            suma = suma + x[i];
        }
        return suma;
    }

    public static boolean suntEgale(int x[]) {
        for(int i=0; i<x.length; i++) {
            for(int j=i+1; i<x.length-1; j++) {
                if (x[i] != x[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean suntDiferite(int x[]) {
        for(int i=0; i<x.length; i++) {
            for(int j=i+1; j<x.length-1; j++) {
                if(x[i] == x[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean estePrezent(int x[], int y) {
        for(int i=0; i<x.length; i++) {
            if(x[i] == y) {
                return true;
            }
        }
        return false;
    }
}
