package ma.ensaj.medisafe.beans;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "rapport", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"type", "debut", "fin"})
})
public class Rapport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rapport_id", nullable = false)
    private Integer id;
    private String type;
    private String debut;
    private String fin;



    @ManyToOne
    @JoinColumn(name = "tracker_id")
    private Tracker tracker;

    public Rapport() {
    }

    public Rapport(String type, String debut, String fin, Tracker tracker) {
        this.type = type;
        this.debut = debut;
        this.fin = fin;
        this.tracker = tracker;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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


    public Tracker getTracker() {
        return tracker;
    }

    public void setTracker(Tracker tracker) {
        this.tracker = tracker;
    }
}