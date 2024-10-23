package controller;

import model.CadastroImoveis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CadastroImoveisService;

@RestController
@RequestMapping("imoveis")
public class CadastroImoveisController {
    @Autowired
    private CadastroImoveisService imovelService;

    @GetMapping
    public List<CadastroImoveis> getAllImoveis() {
        return imovelService.getAllImoveis();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CadastroImoveis> getImovelById(@PathVariable Long id) {
        CadastroImoveis imovel = imovelService.getImovelById(id)
                .orElseThrow(() -> new RuntimeException("Imóvel não encontrado"));
        return ResponseEntity.ok(imovel);
    }

    @PostMapping
    public CadastroImoveis createImovel(@RequestBody CadastroImoveis imovel) {
        return imovelService.createImovel(imovel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CadastroImoveis> updateImovel(@PathVariable Long id, @RequestBody CadastroImoveis imovelDetails) {
        CadastroImoveis updatedImovel = imovelService.updateImovel(id, imovelDetails);
        return ResponseEntity.ok(updatedImovel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteImovel(@PathVariable Long id) {
        imovelService.deleteImovel(id);
        return ResponseEntity.noContent().build();
    }
}
