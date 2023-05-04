package ma.ensaj.medisafe.beans;

import jakarta.persistence.*;

@Entity
public class Medicaments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String code;
    private String nom;
    private String DCI1;
    private String DOSAGE1;
    private String UNITE_DOSAGE1;
    private String FORME;
    private String PRESENTATION;
    private Double PPV;
    private Double PH;
    private Double PRIX_BR;
    private String PRINCEPS_GENERIQUE;
    private String TAUX_REMBOURSEMENT;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDCI1() {
        return DCI1;
    }

    public void setDCI1(String DCI1) {
        this.DCI1 = DCI1;
    }

    public String getDOSAGE1() {
        return DOSAGE1;
    }

    public void setDOSAGE1(String DOSAGE1) {
        this.DOSAGE1 = DOSAGE1;
    }

    public String getUNITE_DOSAGE1() {
        return UNITE_DOSAGE1;
    }

    public void setUNITE_DOSAGE1(String UNITE_DOSAGE1) {
        this.UNITE_DOSAGE1 = UNITE_DOSAGE1;
    }

    public String getFORME() {
        return FORME;
    }

    public void setFORME(String FORME) {
        this.FORME = FORME;
    }

    public String getPRESENTATION() {
        return PRESENTATION;
    }

    public void setPRESENTATION(String PRESENTATION) {
        this.PRESENTATION = PRESENTATION;
    }

    public Double getPPV() {
        return PPV;
    }

    public void setPPV(Double PPV) {
        this.PPV = PPV;
    }

    public Double getPH() {
        return PH;
    }

    public void setPH(Double PH) {
        this.PH = PH;
    }

    public Double getPRIX_BR() {
        return PRIX_BR;
    }

    public void setPRIX_BR(Double PRIX_BR) {
        this.PRIX_BR = PRIX_BR;
    }

    public String getPRINCEPS_GENERIQUE() {
        return PRINCEPS_GENERIQUE;
    }

    public void setPRINCEPS_GENERIQUE(String PRINCEPS_GENERIQUE) {
        this.PRINCEPS_GENERIQUE = PRINCEPS_GENERIQUE;
    }

    public String getTAUX_REMBOURSEMENT() {
        return TAUX_REMBOURSEMENT;
    }

    public void setTAUX_REMBOURSEMENT(String TAUX_REMBOURSEMENT) {
        this.TAUX_REMBOURSEMENT = TAUX_REMBOURSEMENT;
    }
}
