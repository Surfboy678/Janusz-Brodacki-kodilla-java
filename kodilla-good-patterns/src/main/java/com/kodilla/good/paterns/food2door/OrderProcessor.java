package com.kodilla.good.paterns.food2door;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;

    public OrderProcessor(InformationService informationService, OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
    }
    public OrderDto createOrderDto(Order order)
    {
        boolean isOrdered = orderService.order(order.getProvider(), order.getQuantity(), order.getFoodType());

        if(isOrdered)
        {
            informationService.info(order.getProvider(), order);
            return new OrderDto(order, true);
        } else
        {
            return new OrderDto(order, false);
        }
    }
}


