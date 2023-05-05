package ma.ensaj.medisafe.beans;

import jakarta.persistence.*;

@Entity
public class Dose {
    @Id
    @Column(name = "dose_id", nullable = false)
    private int id;
    @ManyToOne
    @JoinColumn(name = "medicament_id")
    private Medicament idMedicament;
    private String heure;
    private boolean suspend;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Dose() {
    }

    public Dose(int id, Medicament idMedicament, String heure, boolean suspend) {
        this.id = id;
        this.idMedicament = idMedicament;
        this.heure = heure;
        this.suspend = suspend;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Medicament getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(Medicament idMedicament) {
        this.idMedicament = idMedicament;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public boolean isSuspend() {
        return suspend;
    }

    public void setSuspend(boolean suspend) {
        this.suspend = suspend;
    }
}
