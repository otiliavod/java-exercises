package TheNewBoston.Enumerations;
import java.util.EnumSet;
public class Main {
    public static void main(String args[]) {
        for(Enums plants: Enums.values()) {
            System.out.printf("%s\t%s\t%s\n",plants, plants.getDesc(), plants.getYear());
        }
        System.out.println("\n And now for the range of constants!!!\n");
        for(Enums plants: EnumSet.range(Enums.flower, Enums.leaf)) {
            System.out.printf("%s\t%s\t%s\n",plants, plants.getDesc(), plants.getYear());
        }
    }
}
