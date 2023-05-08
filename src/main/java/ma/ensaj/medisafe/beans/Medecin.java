package ma.ensaj.medisafe.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "medecin")
public class Medecin {
    @Id
    private Integer id;
    private String nom;
    private String specialite;
    private String adress;
    private String bureau;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String tele;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @OneToMany(mappedBy = "medecin")
    @JsonIgnore
    private List<RendezVous> rendezVous;

    public Medecin() {
    }

    public Medecin(Integer id, String nom, String specialite, String adress, String bureau, String email, String tele, User user, List<RendezVous> rendezVous) {
        this.id = id;
        this.nom = nom;
        this.specialite = specialite;
        this.adress = adress;
        this.bureau = bureau;
        this.email = email;
        this.tele = tele;
        this.user = user;
        this.rendezVous = rendezVous;
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

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<RendezVous> getRendezVous() {
        return rendezVous;
    }

    public void setRendezVous(List<RendezVous> rendezVous) {
        this.rendezVous = rendezVous;
    }
}