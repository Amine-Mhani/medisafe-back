package ma.ensaj.medisafe.beans;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "tracker")
public class Tracker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tracker_id", nullable = false)
    private Integer id;
    private String debut;
    private String fin;
    private String type_suivie;
    private String type_track;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "tracker")
    private List<Rapport> rapports;

    public Tracker() {
    }

    public Tracker(String debut, String fin, String type_suivie, String type_track, User user) {
        this.debut = debut;
        this.fin = fin;
        this.type_suivie = type_suivie;
        this.type_track = type_track;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getType_suivie() {
        return type_suivie;
    }

    public void setType_suivie(String type_suivie) {
        this.type_suivie = type_suivie;
    }

    public String getType_track() {
        return type_track;
    }

    public void setType_track(String type_track) {
        this.type_track = type_track;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Rapport> getRapports() {
        return rapports;
    }

    public void setRapports(List<Rapport> rapports) {
        this.rapports = rapports;
    }
}