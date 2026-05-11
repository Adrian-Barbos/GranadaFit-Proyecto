package com.granadafit.controller;

import com.granadafit.model.Usuario;
import com.granadafit.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping("/lista")
    public List<Usuario> listaDePrueba() {
        return usuarioRepository.findAll();
    }
    @GetMapping("/test")
    public String crearPrueba(@RequestParam String nombre,
                              @RequestParam String email,
                              @RequestParam String password) {
        Usuario u = new Usuario(nombre, email, password);
        usuarioRepository.save(u);
        return "Usuario " + nombre + " guardado correctamente en MySQL!";
    }

    @PostMapping("/register")
    public String registrarNuevo(@ModelAttribute Usuario usuario) {
        usuarioRepository.save(usuario);
        return "Usuario " + usuario.getNombre() + " registrado con éxito";
    }

    @GetMapping("/usuarios")
    public List<Usuario> verTodos() {
        return usuarioRepository.findAll();
    }
}