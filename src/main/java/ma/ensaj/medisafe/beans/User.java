package ma.ensaj.medisafe.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Integer id;
    private String nom;
    private String prenom;
    @Column(unique = true)
    private String cin;
    private Date date_naissance;
    private String address;
    private int age;
    private Double taille;
    private Double poids;
    @Column(unique = true)
    private String email;
    private String password;
    @Column(unique = true)
    private String tele;
    private String blood;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Medecin> contacts;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Tracker> trackers;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Rappel> rappels;

    public User() {}

    public User(String nom, String prenom, String cin, Date date_naissance, String address, int age, Double taille, Double poids, String email, String password, String tele, String blood) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.date_naissance = date_naissance;
        this.address = address;
        this.taille = taille;
        this.poids = poids;
        this.email = email;
        this.password = password;
        this.tele = tele;
        this.blood = blood;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getTaille() {
        return taille;
    }

    public void setTaille(Double taille) {
        this.taille = taille;
    }

    public Double getPoids() {
        return poids;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public List<Medecin> getContacts() {
        return contacts;
    }

    public void setContacts(List<Medecin> contacts) {
        this.contacts = contacts;
    }

    public List<Tracker> getTrackers() {
        return trackers;
    }

    public void setTrackers(List<Tracker> trackers) {
        this.trackers = trackers;
    }

    public List<Rappel> getRappels() {
        return rappels;
    }

    public void setRappels(List<Rappel> rappels) {
        this.rappels = rappels;
    }
}