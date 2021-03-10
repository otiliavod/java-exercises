package TheNewBoston.Array;

public class MultidimAr {
    public static void main(String args[]) {
        int A[][] = {{8,9,10,11},{12,13,14,15}};
        int B[][] = {{30,31,32,33},{43},{4,5,6}};
        System.out.println("A: ");
        display(A);
        System.out.println("B: ");
        display(B);
    }

    public static void display(int x[][]) {
        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
