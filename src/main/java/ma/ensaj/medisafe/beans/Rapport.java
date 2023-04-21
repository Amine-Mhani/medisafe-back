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
    private Date debut;
    private Date fin;



    @ManyToOne
    @JoinColumn(name = "tracker_id")
    private Tracker tracker;

    public Rapport() {
    }

    public Rapport(String type, Date debut, Date fin, Tracker tracker) {
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

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }


    public Tracker getTracker() {
        return tracker;
    }

    public void setTracker(Tracker tracker) {
        this.tracker = tracker;
    }
}