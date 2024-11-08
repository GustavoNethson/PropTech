package respositrory;

import model.Locatario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocatarioRepository extends JpaRepository<Locatario, Long> {

    List<Locatario> findById();
}
