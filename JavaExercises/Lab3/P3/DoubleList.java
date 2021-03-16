/* Sa se implementeze o lista dublu inlantuita de numere intregi.*/

package JavaExercises.Lab3.P3;

public class DoubleList {
    private Nod head;
    private Nod tail;

    public DoubleList(){
        head = null;
        tail = head;
    }

    public void inserareLaInceput(int x) {
        Nod nodNou = new Nod();
        if(head == null) {
            head = tail = nodNou;
            head.previous = null;
            tail.next = null;
        }
        nodNou.nr = x;
        tail.next = nodNou;
        nodNou.previous = tail;
        tail = nodNou;
        tail.next = null;
    }

    public void afisare() {
        if(head == null) {
            System.out.println("Lista este vida");
        }
        Nod nodCrt = head;
        while(nodCrt != null) {
            System.out.print(nodCrt.nr + " ");
            nodCrt = nodCrt.next;
        }
        System.out.println();
    }
}
