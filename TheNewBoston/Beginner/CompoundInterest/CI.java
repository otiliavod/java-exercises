package TheNewBoston.CompoundInterest;

public class CI {
   public static void main(String args[]) {
      double amount;
      double principle = 10000;
      double rate = .01;
      for(int day=1; day<=20; day++) {
          amount = principle*Math.pow(1+ rate, day);
          System.out.println(day + "  " + amount);
      }

   } 
}
// Compound Interest Formula:
// A = P(1+R) ^ n; 