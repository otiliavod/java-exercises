package TheNewBostonIntermediate.StringMethods;

public class Main {
    public static void main (String args[]) {
        String [] words = {"funk", "chunk", "furry", "bacon"};

        //startsWith Method:
        for(String w: words) {
            if(w.startsWith("fu")) {
                System.out.println(w + " starts with fu");
            }
        }

        //endsWith :

       for(String w: words) {
           if(w.endsWith("unk")) {
               System.out.println(w + " ends with unk");
           }
        }
       String s = "buckyrobertsbuckyroberts";

       System.out.println(s.indexOf('k')); //returns the first position of k
       System.out.println(s.indexOf('k', 5)); //return the position of k but it ignores the first 5 positions

       String a = "Lemon ";
       String b = "drink";
       String c = "       abc         ";
       System.out.println(a.concat(b)); // = a + b;

       System.out.println(a.replace('L', 'D')); 
       System.out.println(b.toUpperCase()); //or loLowerCase;
       System.out.println(c.trim()); //it gets rid of the useless spaces;


    }
}
