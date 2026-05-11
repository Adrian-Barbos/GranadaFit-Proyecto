package com.granadafit.controller;

import com.granadafit.service.IIMCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IMCController {

    @Autowired
    private IIMCService imcService;

    @GetMapping("/calculadora")
    public String mostrarCalculadora() {
        return "calculadora";
    }

    @PostMapping("/calcular-imc")
    public String calcular(@RequestParam("peso") double peso, @RequestParam("altura") double altura, Model model) {
        try {
            double imc = imcService.calcularIMC(peso, altura);
            model.addAttribute("resultado", String.format("%.2f", imc));
            model.addAttribute("mensaje", imcService.clasificarResultado(imc));
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "calculadora";
    }
}