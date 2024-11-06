package controller;

import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.UsuarioService;

import java.util.List;
import java.util.Optional;
@Controller
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;


    @GetMapping("/form")
    public String exibirFormUsuario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuario-form";
    }


    @PostMapping("/salvar")
    public String salvarUsuario(@ModelAttribute("usuario") Usuario usuario) {
        usuarioService.salvarUsuario(usuario);
        return "redirect:/usuarios/listar";
    }

    @GetMapping("/listar")
    public String listarUsuarios(Model model) {
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "usuario-lista";
    }

    @GetMapping("/editar/{id}")
    public String editarUsuario(@PathVariable("id") Long nIdUsu, Model model) {
        Optional<Usuario> usuario = usuarioService.buscarPornIdUsu(nIdUsu);
        usuario.ifPresent(u -> model.addAttribute("usuario", u));
        return "usuario-form";
    }


    @GetMapping("/deletar/{id}")
    public String deletarUsuario(@PathVariable("id") Long nIdUsu) {
        usuarioService.deletarUsuario(nIdUsu);
        return "redirect:/usuarios/listar";
    }
}
