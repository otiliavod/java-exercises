package TheNewBoston.Instances;

public class another {
    private String girlName;
    // Contructor method:
    // public another(String name) {
    // girlName = name;    
    // }
    public void setName(String name){
        girlName = name;
    }
    public String getName() {
        return girlName;
    }
    public void saying() {
        System.out.printf("My name is %s", getName());
    }
}
