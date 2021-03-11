package TheNewBoston.SimplePolymExample;

public class Main {
    public static void main(String args[]) {

        Animal[] thelist = new Animal[2];
        Dog d = new Dog();
        Cat c = new Cat();

        thelist[0] = d;
        thelist[1] = c;

        for(Animal x: thelist) {
            x.noise();
        }
    }
}
