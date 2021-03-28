package TheNewBoston.ToStringMethod;

public class Tsm {
    public static void main(String args[]) {
        potpie potObject = new potpie(4,5,2001);
        another anyObject = new another("Zoe", potObject);

        System.out.println(anyObject);
    }
}
