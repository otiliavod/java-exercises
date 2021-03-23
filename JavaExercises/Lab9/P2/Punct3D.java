package JavaExercises.Lab9.P2;

public class Punct3D extends Punct{
    private int z;

    public Punct3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void afisare() {
        System.out.println("x: " + getX());
        System.out.println("y: " + getY());
        System.out.println("z: " + z);
    }
}
