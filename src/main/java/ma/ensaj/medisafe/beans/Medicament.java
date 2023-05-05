package ma.ensaj.medisafe.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "medicament")
public class Medicament {
    @Id
    @Column(name = "medicament_id", nullable = false)
    private Integer id;
    private String title;
    private String dateDebut;
    private String dateFin;
    private String type;
    private String category;
    private String forme;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(mappedBy = "idMedicament")
    @JsonIgnore
    private List<Dose> doses;

    public Medicament() {
    }


    public Medicament(Integer id, String title, String dateDebut, String dateFin, String type, String category, String forme, List<Dose> doses) {
        this.id = id;
        this.title = title;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.type = type;
        this.category = category;
        this.forme = forme;
        this.doses = doses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public List<Dose> getDoses() {
        return doses;
    }

    public void setDoses(List<Dose> doses) {
        this.doses = doses;
    }

}