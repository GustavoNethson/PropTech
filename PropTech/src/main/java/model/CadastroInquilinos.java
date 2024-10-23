package model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;


@Entity
public class CadastroInquilinos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String imovelAlugado;
    private String cpf;
    private String telefone;
    private LocalDate dataInicioContrato;
    private LocalDate dataFimContrato;

    // Getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getImovelAlugado() { return imovelAlugado; }
    public void setImovelAlugado(String imovelAlugado) { this.imovelAlugado = imovelAlugado; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public LocalDate getDataInicioContrato() { return dataInicioContrato; }
    public void setDataInicioContrato(LocalDate dataInicioContrato) { this.dataInicioContrato = dataInicioContrato; }

    public LocalDate getDataFimContrato() { return dataFimContrato; }
    public void setDataFimContrato(LocalDate dataFimContrato) { this.dataFimContrato = dataFimContrato; }
}

