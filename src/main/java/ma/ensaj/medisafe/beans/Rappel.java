package ma.ensaj.medisafe.beans;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "rappel")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public class Rappel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rappel_id", nullable = false)
    private Integer id;
    private String debut;
    private String fin;
    private String horaire;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Rappel() {
    }

    public Rappel(String debut, String fin, String horaire, User user) {
        this.debut = debut;
        this.fin = fin;
        this.horaire = horaire;
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

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}