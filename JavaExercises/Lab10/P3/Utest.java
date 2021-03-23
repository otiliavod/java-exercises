package JavaExercises.Lab10.P3;
import java.util.*;
import java.io.*;

public class Utest {
    public static void main(String[] args) throws IOException {
        int N = 4;
        ArrayList<Umbrela_Addition> al_u = new ArrayList<>();
        String culori[] = {"negru", "verde", "albastru", "galben"};
        Random r = new Random();

        for(int i=0; i<N; i++) {
            al_u.add(new Umbrela_Addition(culori[r.nextInt(N)], 25*(i+1)));
        }
        afisareColectie(al_u);
        scoatePrimulElement(al_u);
        afisareColectie(al_u);
        durata(al_u, N);

        System.in.read();

        System.out.println("Colectia Vector: ");
        Vector<Umbrela_Addition> v_u = new Vector<>();
        for(int i=0; i<N; i++) {
            v_u.add(new Umbrela_Addition(culori[r.nextInt(N)], 20*(i+1)));
        }
        afisareColectie(v_u);
        scoatePrimulElement(v_u);
        afisareColectie(v_u);
        durata(v_u, N);
        
        System.in.read();

        System.out.println("Colectia LinkedList: ");
        LinkedList<Umbrela_Addition> l_u = new LinkedList<>();
        for(int i=0; i<N; i++) {
            l_u.add(new Umbrela_Addition(culori[r.nextInt(N)], 30*(i+1)));
        }
        afisareColectie(l_u);
        scoatePrimulElement(l_u);
        afisareColectie(l_u);
        durata(l_u, N);
    }

    private static void afisareColectie(List<Umbrela_Addition> l) {
        Iterator<Umbrela_Addition> i = l.iterator();
        while(i.hasNext()) {
            Umbrela_Addition obj = (Umbrela_Addition)i.next();
            obj.afisare();
        }
    }

    private static void scoatePrimulElement(List<Umbrela_Addition> l) {
        int index = 0;
        l.remove(index);
    }

    private static long durata(List<Umbrela_Addition> l, int N) {
        return ((Umbrela_Addition) l).durataCalcul(N);
    }
}
