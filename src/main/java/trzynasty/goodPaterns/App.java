package trzynasty.goodPaterns;

import com.sun.org.apache.xpath.internal.operations.Or;

public class App {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new ProductOrderService(), new SmsInformationService(), new ProductOrderRepository());
        OrderDto orderDto = orderProcessor.process(orderRequest);

        System.out.println(orderDto.getUser().getName()+ " " + orderDto.isOrder());
    }
}
