package ma.ensaj.medisafe.beans;


import jakarta.persistence.*;

@Entity
public class Mesure {
    @Id
    @Column(name = "mesure_id", nullable = false)
    private int id;

    private String value;
    private String date;
    private String heure;
    @ManyToOne
    @JoinColumn(name = "tracker_id")
    private Tracker idTracker;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Mesure() {
    }

    public Mesure(int id, String value, String date, String heure, Tracker idTracker) {
        this.id = id;
        this.value = value;
        this.date = date;
        this.heure = heure;
        this.idTracker = idTracker;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public Tracker getIdTracker() {
        return idTracker;
    }

    public void setIdTracker(Tracker idTracker) {
        this.idTracker = idTracker;
    }
}
