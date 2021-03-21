package JavaExercises.Lab8.P3;

public class Punct {
    private int x;
    private int y;

    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void afisare() {
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }

    public void muta(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    public boolean compara(Punct p) {
        if((x == p.x) && (y == p.y)) {
            return true;
        }
        else {
            return false;
        }
    }

    public double distantaOrigine() {
        double dist = Math.sqrt(x*x + y*y);
        return dist;
    }

    public double distanta(Punct p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        double dist = Math.sqrt(dx*dx + dy*dy);
        return dist;
    }
}
