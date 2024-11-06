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

}
