package TheNewBostonIntermediate.Threads;

public class Main {
    public static void main(String[] args){
        Thread t1 = new Thread(new Second("one"));
    Thread t2 = new Thread(new Second("two"));
    Thread t3 = new Thread(new Second("three"));
    Thread t4 = new Thread(new Second("four"));

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    }
    
}
