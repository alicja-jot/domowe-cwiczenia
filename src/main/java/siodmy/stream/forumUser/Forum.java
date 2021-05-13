package siodmy.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "David", 'M', 1978, 8, 20, 13));
        userList.add(new ForumUser(2, "Alex", 'M', 1973, 2, 3, 10));
        userList.add(new ForumUser(3, "Kim", 'K', 2000, 12, 3, 99));
        userList.add(new ForumUser(4, "Courtney", 'K', 1989, 6, 2, 40));
        userList.add(new ForumUser(5, "Dan", 'M', 1959, 4, 1, 2));
    }

    @Override
    public String toString() {
        return "Forum{" +
                "userList=" + userList +
                '}';
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
