package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import javax.net.ssl.SSLSession;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Tabela {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nIdImv;

    private String stNomImov;
    private String stMesComp;
    private BigDecimal getdValAlug;
    private BigDecimal dValGaragem;
    private BigDecimal dValCond;
    private BigDecimal dConsAgua;
    private BigDecimal dValAgua;
    private BigDecimal dConsGas;
    private BigDecimal dValGas;
    private BigDecimal dValLuz;
    private BigDecimal dValTotal;

    public Long getnIdImv() {
        return nIdImv;
    }

    public void setnIdImv(Long nIdImv) {
        this.nIdImv = nIdImv;
    }

    public String getStNomImov() {
        return stNomImov;
    }

    public void setStNomImov(String stNomImov) {
        this.stNomImov = stNomImov;
    }

    public String getStMesComp() {
        return stMesComp;
    }

    public void setStMesComp(String stMesComp) {
        this.stMesComp = stMesComp;
    }

    public BigDecimal getGetdValAlug() {
        return getdValAlug;
    }

    public void setGetdValAlug(BigDecimal getdValAlug) {
        this.getdValAlug = getdValAlug;
    }

    public BigDecimal getdValGaragem() {
        return dValGaragem;
    }

    public void setdValGaragem(BigDecimal dValGaragem) {
        this.dValGaragem = dValGaragem;
    }

    public BigDecimal getdValCond() {
        return dValCond;
    }

    public void setdValCond(BigDecimal dValCond) {
        this.dValCond = dValCond;
    }

    public BigDecimal getdConsAgua() {
        return dConsAgua;
    }

    public void setdConsAgua(BigDecimal dConsAgua) {
        this.dConsAgua = dConsAgua;
    }

    public BigDecimal getdValAgua() {
        return dValAgua;
    }

    public void setdValAgua(BigDecimal dValAgua) {
        this.dValAgua = dValAgua;
    }

    public BigDecimal getdConsGas() {
        return dConsGas;
    }

    public void setdConsGas(BigDecimal dConsGas) {
        this.dConsGas = dConsGas;
    }

    public BigDecimal getdValGas() {
        return dValGas;
    }

    public void setdValGas(BigDecimal dValGas) {
        this.dValGas = dValGas;
    }

    public BigDecimal getdValLuz() {
        return dValLuz;
    }

    public void setdValLuz(BigDecimal dValLuz) {
        this.dValLuz = dValLuz;
    }

    public BigDecimal getdValTotal() {
        return dValTotal;
    }

    public void setdValTotal(BigDecimal dValTotal) {
        this.dValTotal = dValTotal;
    }

    public SSLSession getUsuario() {
        return null;
    }
}
