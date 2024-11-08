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
public class Locatario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long nIdLoc;

    private String stNomeLoc;
    private String stCPFLoc;
    private Integer nTelLoc;
    private Integer nTelRecLoc;

    public long getnIdLoc() {
        return nIdLoc;
    }

    public void setnIdLoc(long nIdLoc) {
        this.nIdLoc = nIdLoc;
    }

    public String getStNomeLoc() {
        return stNomeLoc;
    }

    public void setStNomeLoc(String stNomeLoc) {
        this.stNomeLoc = stNomeLoc;
    }

    public String getStCPFLoc() {
        return stCPFLoc;
    }

    public void setStCPFLoc(String stCPFLoc) {
        this.stCPFLoc = stCPFLoc;
    }

    public Integer getnTelLoc() {
        return nTelLoc;
    }

    public void setnTelLoc(Integer nTelLoc) {
        this.nTelLoc = nTelLoc;
    }

    public Integer getnTelRecLoc() {
        return nTelRecLoc;
    }

    public void setnTelRecLoc(Integer nTelRecLoc) {
        this.nTelRecLoc = nTelRecLoc;
    }
}
