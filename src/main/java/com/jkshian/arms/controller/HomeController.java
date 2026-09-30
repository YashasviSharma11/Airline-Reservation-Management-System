package com.jkshian.arms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/", "/index.html"})
    public String home() {
        return "User/index";
    }

    @GetMapping("/payment.html")
    public String payment() {
        return "User/payment";
    }

    @GetMapping("/select.html")
    public String select() {
        return "User/select";
    }

    @GetMapping("/ticket.html")
    public String ticket() {
        return "User/ticket";
    }

    @GetMapping("/contact.html")
    public String contact() {
        return "User/contact";
    }

    @GetMapping("/confirmation.html")
    public String confirmation() {
        return "User/confirmation";
    }
}
