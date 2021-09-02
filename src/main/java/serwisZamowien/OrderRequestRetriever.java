package serwisZamowien;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        User user = new User("Janek", "Kowal");
        Product product = new Product("cup", 30);
        int amount = 2;
        LocalDate dateOfOrder = LocalDate.of(2021, 8, 11);
        return new OrderRequest(user, product, amount, dateOfOrder);
    }
}
