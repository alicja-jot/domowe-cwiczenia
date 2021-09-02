package serwisZamowien;

public class ProductOrderService implements Service {

    @Override
    public boolean order(OrderRequest orderRequest){
        System.out.println("Przyjalem zamowienie: " + orderRequest.getProduct().getName() + " ilosc: " + orderRequest.getAmount());
        return true;
    }
}
