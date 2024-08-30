package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showLoginPage() {
        return "index"; // Ruta a la vista index.html
    }

    @PostMapping("/homeController")
    public ModelAndView handleLogin(@RequestParam("usuario") String usuario, @RequestParam("password") String password) {
        ModelAndView modelAndView = new ModelAndView("result"); // Ruta a la vista result.html
        modelAndView.addObject("usuario", usuario);
        modelAndView.addObject("password", password);
        return modelAndView;
    }
}
