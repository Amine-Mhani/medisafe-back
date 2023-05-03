package ma.ensaj.medisafe.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "tracker")
public class Tracker {
    @Id
    @Column(name = "tracker_id", nullable = false)
    private Integer id;
    private String nom;
    private String dateDebut;
    private String dateFin;
    private String type;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "idTracker")
    @JsonIgnore
    private List<Mesure> mesures;

    public Tracker() {
    }

    public Tracker(String nom, String dateDebut, String dateFin, String type, User user) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nom = nom;
        this.type = type;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Mesure> getMesures() {
        return mesures;
    }

    public void setMesures(List<Mesure> mesures) {
        this.mesures = mesures;
    }
}