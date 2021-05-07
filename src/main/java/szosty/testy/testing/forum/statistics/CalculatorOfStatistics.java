package szosty.testy.testing.forum.statistics;

public class CalculatorOfStatistics {

    private double numberOfUsers = 0;
    private double numberOfPosts = 0;
    private double numberOfComments = 0;

    private double sredniaLiczbaPostowNaUzytkownika;
    private double sredniaLiczbaKomentarzyNaUzytkownika;
    private double sredniaLiczbaKomentarzyNaPost;


    public void calculateStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfComments = statistics.commentsCount();
        numberOfPosts = statistics.postsCount();
        sredniaLiczbaPostowNaUzytkownika = numberOfUsers / numberOfPosts;
        sredniaLiczbaKomentarzyNaUzytkownika = numberOfUsers / numberOfComments;
        sredniaLiczbaKomentarzyNaPost = numberOfComments / numberOfPosts;
    }


    public String showStatistics() {
        return "CalculatorOfStatistics{" +
                "numberOfUsers=" + numberOfUsers +
                ", numberOfPosts=" + numberOfPosts +
                ", numberOfComments=" + numberOfComments +
                ", sredniaLiczbaPostowNaUzytkownika=" + sredniaLiczbaPostowNaUzytkownika +
                ", sredniaLiczbaKomentarzyNaUzytkownika=" + sredniaLiczbaKomentarzyNaUzytkownika +
                ", sredniaLiczbaKomentarzyNaPost=" + sredniaLiczbaKomentarzyNaPost +
                '}';
    }

    public double getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(double numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    public double getNumberOfPosts() {
        return numberOfPosts;
    }

    public void setNumberOfPosts(double numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
    }

    public double getNumberOfComments() {
        return numberOfComments;
    }

    public void setNumberOfComments(double numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public double getSredniaLiczbaPostowNaUzytkownika() {
        return sredniaLiczbaPostowNaUzytkownika;
    }

    public void setSredniaLiczbaPostowNaUzytkownika(double sredniaLiczbaPostowNaUzytkownika) {
        this.sredniaLiczbaPostowNaUzytkownika = sredniaLiczbaPostowNaUzytkownika;
    }

    public double getSredniaLiczbaKomentarzyNaUzytkownika() {
        return sredniaLiczbaKomentarzyNaUzytkownika;
    }

    public void setSredniaLiczbaKomentarzyNaUzytkownika(double sredniaLiczbaKomentarzyNaUzytkownika) {
        this.sredniaLiczbaKomentarzyNaUzytkownika = sredniaLiczbaKomentarzyNaUzytkownika;
    }

    public double getSredniaLiczbaKomentarzyNaPost() {
        return sredniaLiczbaKomentarzyNaPost;
    }

    public void setSredniaLiczbaKomentarzyNaPost(double sredniaLiczbaKomentarzyNaPost) {
        this.sredniaLiczbaKomentarzyNaPost = sredniaLiczbaKomentarzyNaPost;
    }
}
