package com.granadafit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/test-usuario")
    public String crearPrueba() {
        Usuario u = new Usuario("Hector", "hector@granada.com", "1234");
        usuarioRepository.save(u); // Esto lo guarda en MySQL
        return "Usuario guardado correctamente!";
    }

    @GetMapping("/usuarios")
    public List<Usuario> verTodos() {
        return usuarioRepository.findAll(); // Devuelve la lista en formato JSON
    }
}