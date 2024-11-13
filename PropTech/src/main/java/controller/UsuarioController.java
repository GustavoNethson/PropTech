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

    @GetMapping("/usuários")
    public String listarUsuarios(Model model) {
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        model.addAttribute("usuários", usuarios);
        return "lista-usuários";
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


    @PostMapping("/salvar_usuario")
    public String salvarUsuario(@ModelAttribute("usuario") Usuario usuario) {
        usuarioService.salvarUsuario(usuario);
        return "redirect:/usuarios/lista-usuários";
    }


    @PostMapping("/loginf")
    public String login(@RequestParam String stNomeUsu, @RequestParam String stSenhaUsu, Model model) {
        Usuario usuario = usuarioService.autenticar(stNomeUsu, stSenhaUsu);
        if (usuario != null) {
            return "welcome";
        } else {
            model.addAttribute("erro", "Credenciais inválidas. Tente novamente.");
            return "login";
        }

    }

    @GetMapping("/loginf")
    public String login() {
        return "Login-form";
    }
}