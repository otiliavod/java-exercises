package TheNewBoston.FinalVariable;

public class fin {
   private int sum;
   private final int NUMBER;
   
   public fin(int x) {
       NUMBER = x;
   }

   public void add() {
       sum += NUMBER;
   }

   public String toString() {
       return String.format("sum= %d\n", sum);
   }
}
