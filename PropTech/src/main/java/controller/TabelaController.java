package controller;

import ch.qos.logback.core.model.Model;
import model.Tabela;
import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.TabelaService;
import service.UsuarioService;

import java.util.Optional;

@Controller
@RequestMapping("/Tabelas")
public class TabelaController {

    @Autowired
    private TabelaService tabelaService;

   @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public String salvarDados(@ModelAttribute("tabela") Tabela tabela) {
        tabelaService.salvar(tabela);
        return "redirect:/tabela/usuario/" + tabela.getUsuario().getId();
    }

}
