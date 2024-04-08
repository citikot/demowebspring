package online.agatstudio.demoweb.controller;

import jakarta.validation.Valid;
import online.agatstudio.demoweb.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/")
    public String displayLoginForm(Model model) {

        model.addAttribute("Login", new Login());

        return "loginForm";
    }

    @PostMapping("/processLogin")
    public String processLogin(@Valid Login login, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("bindingResult", bindingResult);
            model.addAttribute("Login", login);
            return "loginForm";
        }

        model.addAttribute("Login", login);

        return "loginResult";
    }

}
