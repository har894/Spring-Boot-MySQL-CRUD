package com.example.crudspringbootmysql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/ui"})
public class DashboardController {

    @GetMapping("/dashboard")
    public String dashboard(Model model) {

        return "dashboard";
    }

    @GetMapping("/view")
    public String main(Model model) {

        return "index";
    }

}
