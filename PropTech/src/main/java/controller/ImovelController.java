package controller;

import model.Imovel;
import model.Tabela;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ImovelService;

@Controller
@RequestMapping("/Imovel")
public class ImovelController {

    @Autowired
    private ImovelService imovelService;



    @PostMapping
    @RequestMapping("/salvar")
    public String salvarImoveis(@ModelAttribute("Imovel") Imovel imovel) {
        imovelService.salvar(imovel);
        return "redirect:/Imovel";
    }

    @PostMapping
    @RequestMapping("/deletar")
    public String deletarImoveis(@ModelAttribute("Imovel") Imovel imovel){
        imovelService.deletar(imovel);
        return "redirect:/imovel";
    }

    @PostMapping
    @RequestMapping("/Atualizar")
    public String atualizaImoveis(@ModelAttribute("Imoveis") Imovel imovel){
        imovelService.atualizar(imovel);
        return "redirect:/imovel";
    }

}
