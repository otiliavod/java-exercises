package TheNewBoston.StaticVariables;

public class Static {
    public static void main(String args[]) {
        vars member1 = new vars("Meghan", "Fox");
        vars member2 = new vars("Natalie", "Portman");
        vars member3 = new vars("Taylor", "Swift");

        //System.out.println(vars.getMembers());
        System.out.println();
        System.out.println(member1.getFirst());
        System.out.println(member1.getLast());
        System.out.println(vars.getMembers());

        System.out.println();
        System.out.println(member2.getFirst());
        System.out.println(member2.getLast());
        System.out.println(vars.getMembers());

        System.out.println();
        System.out.println(member3.getFirst());
        System.out.println(member3.getLast());
        System.out.println(vars.getMembers());

    }
}
