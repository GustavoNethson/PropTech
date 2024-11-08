package respositrory;

import model.Imovel;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long> {

    List<Imovel> findByStNomeIm();

    Imovel deletar(Imovel imovel);

    Imovel update(Imovel imovel);
}
