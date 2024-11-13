package service;

import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/salvar")
    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public void deletarUsuario(Long nIdUsu) {
        usuarioRepository.deleteBynIdUsu(nIdUsu);
    }

    public Usuario autenticar(String stNomeUsu, String stSenhaUsu) {
        Usuario usuario = usuarioRepository.findByStNomeUsu(stNomeUsu);
        if (stNomeUsu.equals("asd") && stSenhaUsu.equals("123")) {
            return usuario;
        }
        return null;
    }

    public Optional<Usuario> buscarPornIdUsu(Long nIdUsu) {
        return null;
    }
}
