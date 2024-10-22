package repository;

import model.Tabelas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TabelasRepository extends JpaRepository<Tabelas, Integer> {
}