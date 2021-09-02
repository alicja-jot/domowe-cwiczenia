package serwisZamowien;

import java.time.LocalDate;

public class OrderRequest {
    private User user;
    private Product product;
    private int amount;
    private LocalDate dateOfOrder;

    public OrderRequest(User user, Product product, int amount, LocalDate dateOfOrder) {
        this.user = user;
        this.product = product;
        this.amount = amount;
        this.dateOfOrder = dateOfOrder;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }
}
