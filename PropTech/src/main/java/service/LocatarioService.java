package service;

import model.Locatario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import respositrory.LocatarioRepository;

@Service
public class LocatarioService {

    @Autowired
    private LocatarioRepository locatarioRepository;

    public Locatario salvar(Locatario locatario) {
        return locatarioRepository.save(locatario);
    }

}
