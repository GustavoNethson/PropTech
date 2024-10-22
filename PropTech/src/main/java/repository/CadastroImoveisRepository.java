package repository;

import model.CadastroImoveis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroImoveisRepository extends JpaRepository<CadastroImoveis, Long> {
}
