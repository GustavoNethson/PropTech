package controller;

import model.CadastroInquilinos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CadastroInquilinosService;

import java.util.List;
@RestController
@RequestMapping("/inquilinos")
public class CadastroInquilinosController {
    @Autowired
    private CadastroInquilinosService inquilinoService;

    @GetMapping
    public List<CadastroInquilinos> getAllInquilinos() {
        return inquilinoService.getAllInquilinos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CadastroInquilinos> getInquilinoById(@PathVariable Long id) {
        CadastroInquilinos inquilino = inquilinoService.getInquilinoById(id)
                .orElseThrow(() -> new RuntimeException("Inquilino não encontrado"));
        return ResponseEntity.ok(inquilino);
    }

    @PostMapping
    public CadastroInquilinos createInquilino(@RequestBody CadastroInquilinos inquilino) {
        return inquilinoService.createInquilino(inquilino);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CadastroInquilinos> updateInquilino(@PathVariable Long id, @RequestBody CadastroInquilinos inquilinoDetails) {
        CadastroInquilinos updatedInquilino = inquilinoService.updateInquilino(id, inquilinoDetails);
        return ResponseEntity.ok(updatedInquilino);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInquilino(@PathVariable Long id) {
        inquilinoService.deleteInquilino(id);
        return ResponseEntity.noContent().build();
    }
}
