package repository;

import model.Tabela;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface TabelaRepository extends JpaRepository<Tabela, Long> {

    List<Tabela> findbyID();
}
