package TheNewBoston.FinalVariable;

public class Main {
    public static void main(String args[]) {
        fin finObject = new fin(10);
        
        for(int i=0;i<5;i++) {
            finObject.add();
            System.out.printf("%s", finObject);
        }
    }
}
