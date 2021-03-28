package TheNewBoston.Array;

public class Methods {
    public static void main(String args[]) {
        int A[]={3,4,5,6,7};
        change(A);
        for(int y: A) {
            System.out.println(y);
        }
    }

    public static void change(int x[]) {
        for(int counter=0;counter<x.length;counter++) {
            x[counter] +=5;
        }
    }
}
