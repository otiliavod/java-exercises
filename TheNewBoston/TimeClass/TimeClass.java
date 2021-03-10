package TheNewBoston.TimeClass;

public class TimeClass {
    public static void main(String args[]) {
        timeVar timeObject = new timeVar();
        System.out.println(timeObject.toMilitary());
        System.out.println(timeObject.toString());
        timeObject.setTime(13,27,6);
        System.out.println(timeObject.toMilitary());
        System.out.println(timeObject.toString());
    }
    // Multiple Constructors Method:
    //timeVar timeObject = new timeVar();
    //timeVar timeObject2 = new timeVar(5);
    //timeVar timeObject3 = new timeVar(5,13);
    //timeVar timeObject4 = new timeVar(5,13,43);
    //System.out.printf("%s\n", timeObject.toMilitary());
    //System.out.printf("%s\n", timeObject2.toMilitary());
    //System.out.printf("%s\n", timeObject3.toMilitary());
    //System.out.printf("%s\n", timeObject4.toMilitary());
}
