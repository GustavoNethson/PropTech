package service;
import model.CadastroImoveis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CadastroImoveisRepository;

import java.util.List;
import java.util.Optional;
@Service
public class CadastroImoveisService {
    @Autowired
    private CadastroImoveisRepository imovelRepository;

    public List<CadastroImoveis> getAllImoveis() {
        return imovelRepository.findAll();
    }

    public Optional<CadastroImoveis> getImovelById(Long id) {
        return imovelRepository.findById(id);
    }

    public CadastroImoveis createImovel(CadastroImoveis imovel) {
        return imovelRepository.save(imovel);
    }

    public CadastroImoveis updateImovel(Long id, CadastroImoveis imovelDetails) {
        CadastroImoveis imovel = imovelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Imóvel não encontrado"));

        imovel.setTipo(imovelDetails.getTipo());
        imovel.setCep(imovelDetails.getCep());
        imovel.setNumero(imovelDetails.getNumero());
        imovel.setEndereco(imovelDetails.getEndereco());
        imovel.setComplemento(imovelDetails.getComplemento());

        return imovelRepository.save(imovel);
    }

    public void deleteImovel(Long id) {
        CadastroImoveis imovel = imovelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Imóvel não encontrado"));
        imovelRepository.delete(imovel);
    }
}
