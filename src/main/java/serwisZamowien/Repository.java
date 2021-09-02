package serwisZamowien;

public interface Repository {
    void createOrder(User user, Product product, int amount);
}
