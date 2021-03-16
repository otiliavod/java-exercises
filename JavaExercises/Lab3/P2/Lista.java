/* Sa se adauge in clasa Lista urmatoarele metode:
- media() ce returneaza media aritmetica a numerelor din lista
- suntCrescatoare() care returneaza true daca toate numerele
din lista sunt in ordine crescatoare
- suntEgale() ce returneaza true daca toate numerele din lista
sunt egale intre ele*/

package JavaExercises.Lab3.P2;

public class Lista {
    private Nod head;

    // Class Lista Additions:

    public double media(int N) {
        int suma = 0;
        Nod nodCrt = head;
        while(nodCrt != null) {
            suma = suma + nodCrt.nr;
            nodCrt = nodCrt.next;
        }
        return suma / N;
    }

    public boolean suntCrescatoare() {
        Nod nodCrt = head;
        
        while(nodCrt != null) {
            if(nodCrt.nr < nodCrt.nr+1) {
                return true;
            }
        }
        return false;
    }

    public boolean suntEgale() {
        Nod nodCrt = head;

        while(nodCrt != null) {
            if(nodCrt == nodCrt.next) {
                return true;
            }
        }
        return false;
    }
}
