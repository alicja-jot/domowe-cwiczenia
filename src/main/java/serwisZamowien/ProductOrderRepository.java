package serwisZamowien;

public class ProductOrderRepository implements Repository {

    @Override
    public void createOrder(User user, Product product, int amount){
        System.out.println("Zapisalem zamowienie w bazie danych.");
    }

}
