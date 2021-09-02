package trzynasty.goodPaterns;

public class ProductOrderService implements Service {

    @Override
    public boolean order(OrderRequest orderRequest){
        System.out.println("Przyjalem zamowienie. Produkt: " + orderRequest.getProduct().getName() + ", ilosc: " + orderRequest.getAmount());
        return true;
    }

}
