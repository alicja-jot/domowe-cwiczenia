package trzynasty.goodPaterns;

public class User {
    private String name;
    private String suername;

    public User(String name, String suername) {
        this.name = name;
        this.suername = suername;
    }

    public String getName() {
        return name;
    }

    public String getSuername() {
        return suername;
    }
}
