package online.agatstudio.demoweb.service;

import lombok.Setter;
import online.agatstudio.demoweb.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersBusinessService implements OrdersBusinessServiceInterface {

    @Override
    public List<Order> getOrders() {

        return List.of(
                new Order(0L, "000", "Sky diving experience", 15010.0f, 1),
                new Order(1L, "001", "Sky diving experience1", 15020.0f, 2),
                new Order(2L, "002", "Sky diving experience2", 15030.0f, 3),
                new Order(3L, "003", "Sky diving experienc3e", 15040.0f, 4),
                new Order(4L, "004", "Sky diving experience4", 15050.0f, 5),
                new Order(5L, "005", "Sky diving experience5", 15060.0f, 6),
                new Order(6L, "006", "Sky diving experience6", 15070.0f, 7),
                new Order(7L, "007", "Sky diving experience7", 15080.0f, 8),
                new Order(8L, "008", "Sky diving experience8", 15090.0f, 9),
                new Order(9L, "009", "Sky diving experience9", 15300.0f, 10),
                new Order(10L, "010", "Sky diving experience10", 15100.0f, 11)
        );
    }
}
