package JavaExercises.Lab8.P1;

public class Cerc {
    private int raza;

    public Cerc(int x) {
        raza = x;
    }

    public int getRaza() {
        return raza;
    }

    public double calculArie() {
        return Math.PI * raza * raza;
    }

    public double calculPerimetru() {
        return 2*Math.PI * raza;
    }

    public boolean suntegale(Cerc c) {
        if(this.raza == c.raza) {
            return true;
        }
        else {
            return false;
        }
    }

    public void afisare() {
        System.out.println("Raza: " + raza);
    }
}
