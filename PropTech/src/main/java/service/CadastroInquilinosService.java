package service;

import model.CadastroInquilinos;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import repository.CadastroInquilinosRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CadastroInquilinosService {
    @Autowired
    private CadastroInquilinosRepository inquilinoRepository;

    public List<CadastroInquilinos> getAllInquilinos() {
        return inquilinoRepository.findAll();
    }

    public Optional<CadastroInquilinos> getInquilinoById(Long id) {
        return inquilinoRepository.findById(id);
    }

    public CadastroInquilinos createInquilino(CadastroInquilinos inquilino) {
        return inquilinoRepository.save(inquilino);
    }

    public CadastroInquilinos updateInquilino(Long id, CadastroInquilinos inquilinoDetails) {
        CadastroInquilinos inquilino = inquilinoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Inquilino não encontrado"));

        inquilino.setNome(inquilinoDetails.getNome());
        inquilino.setImovelAlugado(inquilinoDetails.getImovelAlugado());
        inquilino.setCpf(inquilinoDetails.getCpf());
        inquilino.setTelefone(inquilinoDetails.getTelefone());
        inquilino.setDataInicioContrato(inquilinoDetails.getDataInicioContrato());
        inquilino.setDataFimContrato(inquilinoDetails.getDataFimContrato());

        return inquilinoRepository.save(inquilino);
    }

    public void deleteInquilino(Long id) {
        CadastroInquilinos inquilino = inquilinoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Inquilino não encontrado"));
        inquilinoRepository.delete(inquilino);
    }
}

