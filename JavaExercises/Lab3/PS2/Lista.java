/* Sa se implementze o lista simplu inlantuita de numere intregi. 
Se vor scrie urmatoarele trei clase:
- clasa Nod ce implementeaza un nod al unei liste simplu inlantuite
(contine variabilele publice de instanta nr ce memoreaza informatia
utila din lista si next - adresa urmatorului nod)
- clasa Lista ce are ca variabila de instanta head-ul listei,
si ca metode:
    - contructorul listei
    - inserareLaInceput(), ce insereza un numar dat parametru 
    la inceputul listei
    - nrPare() ce returneaza numarul de numere pare din lista
    - afisare() ce afiseaza numerele din lista
- clasa TestLista ce contine metoda main*/

package JavaExercises.Lab3.PS2;

public class Lista {
    private Nod head;


    public Lista() {
        head = null;
    }

    public void inserareLaInceput(int x) {
        if(head == null) {
            head = new Nod();
            head.nr = x;
            head.next = null;
            return;
        }
        Nod nodNou = new Nod();
        nodNou.nr = x;
        nodNou.next = head;
        head = nodNou;
    }

    public int pare() {
        int contor = 0;
        Nod nodCrt = head;
        while(nodCrt != null) {
            if(nodCrt.nr % 2 == 0) {
                contor ++;
            }
            nodCrt = nodCrt.next;
        }
        return contor;
    }

    public void afisare() {
        if(head == null) {
            System.out.println("List este vida");
        }
        Nod nodCrt = head;
        while(nodCrt != null) {
            System.out.print(nodCrt.nr + " ");
            nodCrt = nodCrt.next;
        }
        System.out.println();
    }
}
