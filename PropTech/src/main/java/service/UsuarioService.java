package service;

import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import respositrory.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> buscarPornIdUsu(Long nIdUsu) {
        return usuarioRepository.findById(nIdUsu);
    }

    public void deletarUsuario(Long nIdUsu) {
        usuarioRepository.deleteBynIdUsu(nIdUsu);
    }

}
