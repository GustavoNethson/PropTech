package repository;

import model.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    void deleteBynIdUsu(Long nIdUsu);

    Usuario findByStNomeUsu(String stNomeUsu);


}
