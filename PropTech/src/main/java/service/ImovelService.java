package service;

import model.Imovel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import respositrory.ImovelRepository;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository imovelRepository;

    public Imovel salvar (Imovel imovel){
        return imovelRepository.save(imovel);
    }

    public void deletar (Imovel imovel){
        imovelRepository.delete(imovel);
    }

    public Imovel atualizar(Imovel imovel){
        return imovelRepository.update(imovel);
    }
}
