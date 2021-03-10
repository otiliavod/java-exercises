package TheNewBoston.Enumerations;

public enum Enums {
    tree("tall", "22"),
    flower("small", "1"),
    forrest("big", "200"),
    leaf("tiny", "1"),
    branch("brown", "22");

    private final String desc;
    private final String year;

    Enums(String description, String age) {
        desc = description;
        year = age;
    }

    public String getDesc() {
        return desc;
    }
    public String getYear() {
        return year;
    }
}
