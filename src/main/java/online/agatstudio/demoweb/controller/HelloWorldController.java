package online.agatstudio.demoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String showHelloPage(Model model) {

        model.addAttribute("message", " It's a message from thymeleaf ");
        model.addAttribute("rating", 99);
        model.addAttribute("code", 123);

        return "helloPage";
    }

    @GetMapping("/mav")
    public ModelAndView printHello() {

        ModelAndView mv = new ModelAndView();
        mv.addObject("message","Have a superday!");
        mv.addObject("rating", 55);
        mv.setViewName("helloPage");
        return mv;
    }

    @GetMapping("/mavr")
    public String showHelloPageWithRequest(@RequestParam("message") String message, Model model) {

        model.addAttribute("message", message);
        model.addAttribute("rating", 100);
        model.addAttribute("code", 12345);

        return "helloPage";
    }
}
