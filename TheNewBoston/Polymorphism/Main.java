package TheNewBoston.Polymorphism;

public class Main {
    public static void main(String args[]) {
        foodie bucky = new foodie();
        food fo = new food();
        food po = new potpie();

        bucky.digest(fo);
        bucky.digest(po);
    }
}
