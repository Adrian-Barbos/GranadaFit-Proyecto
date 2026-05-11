package com.granadafit.controller; // Si la carpeta se llama solo controller

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/productos")
    public String productos() {
        return "productos"; }

    @GetMapping("/register")
    public String register() {
        return "register"; }

    @GetMapping("/perfil")
    public String perfil() {
        return "perfil";
    }

    @GetMapping("/precios")
    public String mostrarPrecios() {
        return "precios";
    }

    @GetMapping("/pasarela")
    public String mostrarPasarela() {
        return "pasarela"; }

    @GetMapping("/pago-exitoso")
    public String pagoExitoso() {
        return "pago-exitoso";
    }

    @GetMapping("/carrito")
    public String carrito() {
        return "carrito";
    }

    @GetMapping("/pasarela-producto")
    public String pasarelaproducto() {
        return "pasarela-producto";
    }

}