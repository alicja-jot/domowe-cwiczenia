package siodmy.stream.forumUser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int id;
    private final String name;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postsAmount;


    public ForumUser(final int id, final String name, final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int postsAmount) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsAmount = postsAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return id == forumUser.id &&
                sex == forumUser.sex &&
                postsAmount == forumUser.postsAmount &&
                Objects.equals(name, forumUser.name) &&
                Objects.equals(dateOfBirth, forumUser.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex, dateOfBirth, postsAmount);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsAmount() {
        return postsAmount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postsAmount=" + postsAmount +
                '}';
    }
}
