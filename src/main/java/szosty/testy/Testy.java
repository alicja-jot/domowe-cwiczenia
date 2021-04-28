package szosty.testy;

public class Testy {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("Ferbi", "P");
        String result = simpleUser.getUserName();

        if(result.equals("Ferbi")){
            System.out.println("ok");
        } else {
            System.out.println("wrong");
        }

    }
}
