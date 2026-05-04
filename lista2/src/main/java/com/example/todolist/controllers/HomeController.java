package com.example.todolist.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // Retorna o nome do arquivo HTML (sem a extensão .html) que está na pasta templates
        return "home"; 
    }
}