package model;


import javax.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nIdUsu;

    private String stNomeUsu;
    private String stEmailUsu;
    private String stSenUsu;


    public Long getnIdUsu() {
        return nIdUsu;
    }

    public void setnIdUsu(Long nIdUsu) {
        this.nIdUsu = nIdUsu;
    }

    public String getStNomeUsu() {
        return stNomeUsu;
    }

    public void setStNomeUsu(String stNomeUsu) {
        this.stNomeUsu = stNomeUsu;
    }

    public String getStEmailUsu() {
        return stEmailUsu;
    }

    public void setStEmailUsu(String stEmailUsu) {
        this.stEmailUsu = stEmailUsu;
    }

    public String getStSenUsu() {
        return stSenUsu;
    }

    public void setStSenUsu(String stSenUsu) {
        this.stSenUsu = stSenUsu;
    }
}
