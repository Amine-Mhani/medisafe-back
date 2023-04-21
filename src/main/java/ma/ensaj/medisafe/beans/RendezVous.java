package ma.ensaj.medisafe.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "rendez_vous")
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rendezvous_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "medecin_id")
    private Medecin medecin;
    private String address;
    private Date date;
    private String horaire;

    @OneToOne(mappedBy = "rendezVous")
    @JsonIgnore
    private RappelRendVous rappel;

    public RendezVous() {
    }

    public RendezVous(Medecin medecin, String address, Date date, String horaire) {
        this.medecin = medecin;
        this.address = address;
        this.date = date;
        this.horaire = horaire;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public RappelRendVous getRappel() {
        return rappel;
    }

    public void setRappel(RappelRendVous rappel) {
        this.rappel = rappel;
    }
}