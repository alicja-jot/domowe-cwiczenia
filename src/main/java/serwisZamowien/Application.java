package serwisZamowien;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();

        OrderRequest orderRequest = orderRequestRetriever.retrieve();


        OrderProcessor orderProcessor = new OrderProcessor(new SmsInformService(), new ProductOrderService(), new ProductOrderRepository());
        OrderDto orderDto = orderProcessor.process(orderRequest);

    }
}
