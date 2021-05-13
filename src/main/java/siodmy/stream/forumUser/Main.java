package siodmy.stream.forumUser;

import szosty.testy.testing.library.User;

import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(mens -> mens.getDateOfBirth().getYear() < 2000)
                .filter(mens -> mens.getPostsAmount() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("Our result map: ");
        resultMap.entrySet().stream()
                .forEach(System.out::println);


    }
}
