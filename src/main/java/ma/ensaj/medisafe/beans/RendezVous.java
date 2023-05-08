package ma.ensaj.medisafe.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "rendez_vous")
public class RendezVous {
    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "medecin_id")
    private Medecin medecin;
    private String lieu;
    private String heure;
    private String remarque;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public RendezVous() {

    }

    public RendezVous(Integer id, Medecin medecin, String lieu, String heure, String remarque, String nom, User user) {
        this.id = id;
        this.medecin = medecin;
        this.lieu = lieu;
        this.heure = heure;
        this.remarque = remarque;
        this.nom = nom;
        this.user = user;
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

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}