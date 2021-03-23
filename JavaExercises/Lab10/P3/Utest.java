package JavaExercises.Lab10.P3;
import java.util.*;
import java.io.*;

public class Utest {
    public static void main(String[] args) throws IOException {
        int N = 2000;
        ArrayList<Umbrela_Addition> al_u = new ArrayList<>();
        String culori[] = {"negru", "verde", "albastru", "galben"};
        Random r = new Random();

        for(int i=0; i<N; i++) {
            al_u.add(new Umbrela_Addition(culori[r.nextInt(4)], 25*(i+1)));
        }
        afisareColectie(al_u);
        scoatePrimulElement(al_u);
        System.out.println();
        afisareColectie(al_u);
        long time1 = durata(al_u, N, 25);
        System.out.println(time1);
        
        System.in.read();

        System.out.println("Colectia Vector: ");
        Vector<Umbrela_Addition> v_u = new Vector<>();
        for(int i=0; i<N; i++) {
            v_u.add(new Umbrela_Addition(culori[r.nextInt(4)], 20*(i+1)));
        }
        afisareColectie(v_u);
        scoatePrimulElement(v_u);
        System.out.println();
        afisareColectie(v_u);
        long time2 = durata(v_u, N, 20);
        System.out.println(time2);
        
        System.in.read();

        System.out.println("Colectia LinkedList: ");
        LinkedList<Umbrela_Addition> l_u = new LinkedList<>();
        for(int i=0; i<N; i++) {
            l_u.add(new Umbrela_Addition(culori[r.nextInt(4)], 30*(i+1)));
        }
        afisareColectie(l_u);
        scoatePrimulElement(l_u);
        System.out.println();
        afisareColectie(l_u);
        long time3 = durata(l_u, N, 30);
        System.out.println(time3);
        
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

    private static long durata(List<Umbrela_Addition> l, int N, int nr) {
        String culori[] = {"negru", "verde", "albastru", "galben"};
        Random r = new Random();
        long t1 = System.currentTimeMillis();
        for(int i=0; i<N; i++) {
            l.add(new Umbrela_Addition(culori[r.nextInt(4)], nr*(i+1)));
        }
        afisareColectie(l);
        scoatePrimulElement(l);
        afisareColectie(l);
        long t2 = System.currentTimeMillis();
        return (t2-t1);
    }
}
