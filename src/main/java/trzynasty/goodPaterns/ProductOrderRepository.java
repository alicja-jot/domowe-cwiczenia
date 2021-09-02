package trzynasty.goodPaterns;

public class ProductOrderRepository implements Repository {
    @Override
    public void createOrder(User user, Product product, int amount){
        System.out.println("Zapisalem w bazie danych.");
    }
}
