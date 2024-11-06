package service;

import model.Tabela;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import respositrory.TabelaRepository;

@Service
public class TabelaService {

    @Autowired
    private TabelaRepository tabelaRepository;

    public Tabela salvar(Tabela tabela) {
        return tabelaRepository.save(tabela);
    }


}
