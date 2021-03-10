package TheNewBoston.Statements;

public class ForLoop {
    public static void main(String args[]) {
        int A[]={3,4,5,6,7};
        int total=0;
        for(int x:  A) {
            total += x;
        }
        System.out.println(total);
    }
}
