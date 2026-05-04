package com.example.todolist.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContadorController {

    // Variável de instância (compartilhada por todas as requisições, pois o Controller é Singleton)
    private int contador = 0;

    @GetMapping("/contador")
    @ResponseBody
    public String contar() {
        contador++;
        return "Número de acessos: " + contador;
    }
}