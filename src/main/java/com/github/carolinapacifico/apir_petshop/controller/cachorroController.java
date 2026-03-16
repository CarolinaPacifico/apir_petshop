package com.github.carolinapacifico.apir_petshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/petshop")
public class cachorroController {

    @GetMapping ("/cachorro")
    public String cachorro(){
        return "Au-au";
    }

    @GetMapping ("/auau")
    public String auau(){
        return "Cachorro";
    }
}
