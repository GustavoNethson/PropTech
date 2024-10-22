package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tabelas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nIdLanc;
    private Integer nIdImov;
    private String stNomImov;
    private String stMesComp;
    private Double dValAlug;
    private Double dValGaragem;
    private Double dValCond;
    private Double dConsAgua;
    private Double dValAgua;
    private Double dConsGas;
    private Double dValGas;
    private Double dValLuz;
    private Double dValTotal;

    public Integer getnIdLanc() {
        return nIdLanc;
    }

    public void setnIdLanc(Integer nIdLanc) {
        this.nIdLanc = nIdLanc;
    }

    public Integer getnIdImov() {
        return nIdImov;
    }

    public void setnIdImov(Integer nIdImov) {
        this.nIdImov = nIdImov;
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

    public Double getdValAlug() {
        return dValAlug;
    }

    public void setdValAlug(Double dValAlug) {
        this.dValAlug = dValAlug;
    }

    public Double getdValGaragem() {
        return dValGaragem;
    }

    public void setdValGaragem(Double dValGaragem) {
        this.dValGaragem = dValGaragem;
    }

    public Double getdValCond() {
        return dValCond;
    }

    public void setdValCond(Double dValCond) {
        this.dValCond = dValCond;
    }

    public Double getdConsAgua() {
        return dConsAgua;
    }

    public void setdConsAgua(Double dConsAgua) {
        this.dConsAgua = dConsAgua;
    }

    public Double getdValAgua() {
        return dValAgua;
    }

    public void setdValAgua(Double dValAgua) {
        this.dValAgua = dValAgua;
    }

    public Double getdConsGas() {
        return dConsGas;
    }

    public void setdConsGas(Double dConsGas) {
        this.dConsGas = dConsGas;
    }

    public Double getdValGas() {
        return dValGas;
    }

    public void setdValGas(Double dValGas) {
        this.dValGas = dValGas;
    }

    public Double getdValLuz() {
        return dValLuz;
    }

    public void setdValLuz(Double dValLuz) {
        this.dValLuz = dValLuz;
    }

    public Double getdValTotal() {
        return dValTotal;
    }

    public void setdValTotal(Double dValTotal) {
        this.dValTotal = dValTotal;
    }
}
