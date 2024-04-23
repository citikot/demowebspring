package online.agatstudio.demoweb.controller;

import lombok.RequiredArgsConstructor;
import online.agatstudio.demoweb.model.Order;
import online.agatstudio.demoweb.service.OrdersBusinessService;
import online.agatstudio.demoweb.service.OrdersBusinessServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrdersController {

    private final OrdersBusinessServiceInterface ordersBusinessService;

    @GetMapping("/")
    public String showAllOrders(Model model) {

        List<Order> orders = ordersBusinessService.getOrders();

        model.addAttribute("title", "What to do this summer");
        model.addAttribute("orders", orders);

        return "orders";
    }
}
