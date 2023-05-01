package ma.ensaj.medisafe.beans;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "prescription")
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prescription_id", nullable = false)
    private Integer id;
    private String date;
    @Column(unique = true)
    private String reference;

    @ManyToOne
    @JoinColumn(name = "medecin_id")
    private Medecin medecin;

    public Prescription() {
    }

    public Prescription(String date, String reference, Medecin medecin) {
        this.date = date;
        this.reference = reference;
        this.medecin = medecin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
}