package trzynasty.goodPaterns;

public class OrderProcessor {
    private Service service;
    private  InformationService informationService;
    private Repository repository;


    public OrderProcessor(Service service, InformationService informationService, Repository repository) {
        this.service = service;
        this.informationService = informationService;
        this.repository = repository;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrder= service.order(orderRequest);
        if(isOrder) {
            informationService.inform(orderRequest.getUser());
            repository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getAmount());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}


