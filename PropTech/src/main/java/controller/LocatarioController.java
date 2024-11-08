package controller;


import model.Locatario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.LocatarioService;

@Controller
@RequestMapping("/Locatario")
public class LocatarioController {


    @Autowired
    private LocatarioService locatarioService;

    @PostMapping
    public String SalvarLocatario(@ModelAttribute("Locatario")Locatario locatario){
        locatarioService.salvar(locatario);
        return "redirect/locatario/locatarios";
    }


}
