package TheNewBostonIntermediate.GenericMethods;

public class Main {
    public static void main(String[] args) {

        Integer[] iray = {1, 2, 3, 4};
        Character[] cray = {'b', 'u', 'k', 'y'};
        
        printMe(iray);
        printMe(cray);

        System.out.println(max(23, 21, 1));
        System.out.println(max("apples", "tots", "chicken"));
    }
    // Overload Methods:
    //public static void printMe(Integer[] i) {
      //  for(Integer x: i) {
           // System.out.printf("%s ", x);
       // }
       // System.out.println();

   // public static void printMe(Character[] c) {
       // for(Character x: c) {
           // System.out.printf("%s ", x);
      //  }
       // System.out.println();
  //  }

    // Generic Method:

    public static <T> void printMe(T[] x) {
        for(T b: x) {
            System.out.printf("%s ", b);
        }
        System.out.println();
    }

    //Generic return types:

    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T m = a;
        if(b.compareTo(a) > 0) {
            m = b;
        }
        if(c.compareTo(m) > 0) {
            m = c;
        }
        return m;
    }
}
