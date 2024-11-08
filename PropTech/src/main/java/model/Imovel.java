package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long nIdIm;

    private String stNomeIm;
    private Integer nNumIm;
    private String stLogIm;
    private String sttipoIm;
    private Integer nQuartosIm;
    private Double dAreaIm;


    public long getnIdIm() {
        return nIdIm;
    }

    public void setnIdIm(long nIdIm) {
        this.nIdIm = nIdIm;
    }

    public String getStNomeIm() {
        return stNomeIm;
    }

    public void setStNomeIm(String stNomeIm) {
        this.stNomeIm = stNomeIm;
    }

    public Integer getnNumIm() {
        return nNumIm;
    }

    public void setnNumIm(Integer nNumIm) {
        this.nNumIm = nNumIm;
    }

    public String getStLogIm() {
        return stLogIm;
    }

    public void setStLogIm(String stLogIm) {
        this.stLogIm = stLogIm;
    }

    public String getSttipoIm() {
        return sttipoIm;
    }

    public void setSttipoIm(String sttipoIm) {
        this.sttipoIm = sttipoIm;
    }

    public Integer getnQuartosIm() {
        return nQuartosIm;
    }

    public void setnQuartosIm(Integer nQuartosIm) {
        this.nQuartosIm = nQuartosIm;
    }

    public Double getdAreaIm() {
        return dAreaIm;
    }

    public void setdAreaIm(Double dAreaIm) {
        this.dAreaIm = dAreaIm;
    }
}
