package online.agatstudio.demoweb.service;

import online.agatstudio.demoweb.model.Order;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class OrdersBusinessService2 implements OrdersBusinessServiceInterface {

    @Override
    public List<Order> getOrders() {

        return List.of(
                new Order(0L, "000", "Sky diving experience", 15010.0f, 1),
                new Order(1L, "001", "Sky diving experience1", 15020.0f, 2),
                new Order(2L, "002", "Sky diving experience2", 15030.0f, 3),
                new Order(3L, "003", "Sky diving experienc3e", 15040.0f, 4),
                new Order(4L, "004", "Sky diving experience4", 15050.0f, 5)
        );
    }
}
