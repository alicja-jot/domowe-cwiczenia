package serwisZamowien;

public class OrderProcessor {
    private InformationService informationService;
    private Service service;
    private Repository orderRepository;

    public OrderProcessor(InformationService informationService, Service service, Repository orderRepository) {
        this.informationService = informationService;
        this.service = service;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = service.order(orderRequest);
        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getAmount());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }



}
