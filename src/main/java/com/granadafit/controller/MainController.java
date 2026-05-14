package com.granadafit.controller;

import com.granadafit.model.Usuario;
import com.granadafit.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/perfil")
    public String verPerfil(Model model) {
        Usuario usuario = usuarioRepository.findById(1L).orElse(null);
        model.addAttribute("usuario", usuario);
        model.addAttribute("usuarioNombre", usuario != null ? usuario.getNombre() : "Usuario GranadaFit");
        return "perfil";
    }

    @PostMapping("/register")
    public String registrarUsuario(@ModelAttribute Usuario usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/productos")
    public String productos() {
        return "productos";
    }
}
