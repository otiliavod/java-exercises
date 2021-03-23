package JavaExercises.Lab10.PS6;
import java.util.*;
import java.io.*;

public class UTest {
    public static void main(String[] args) throws IOException {
        int N = 4;
        ArrayList<Umbrela> al_u = new ArrayList<>();
        String culori[] = {"negru", "verde", "albastru", "galben"};
        Random r = new Random();

        for(int i=0; i<N; i++) {
            al_u.add(new Umbrela(culori[r.nextInt(N)], 25*(i+1)));
        }
        afisareColectie(al_u);

        System.in.read();

        System.out.println("Colectia Vector: ");
        Vector<Umbrela> v_u = new Vector<>();
        for(int i=0; i<N; i++) {
            v_u.add(new Umbrela(culori[r.nextInt(N)], 20*(i+1)));
        }
        afisareColectie(v_u);

        System.in.read();

        System.out.println("Colectia LinkedList: ");
        LinkedList<Umbrela> l_u = new LinkedList<>();
        for(int i=0; i<N; i++) {
            l_u.add(new Umbrela(culori[r.nextInt(N)], 30*(i+1)));
        }
        afisareColectie(l_u);
    }

    private static void afisareColectie(List<Umbrela> l) {
        Iterator<Umbrela> i = l.iterator();
        while(i.hasNext()) {
            Umbrela obj = (Umbrela)i.next();
            obj.afisare();
        }
    }
}
