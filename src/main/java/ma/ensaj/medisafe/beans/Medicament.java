package ma.ensaj.medisafe.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "medicament")
public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medicament_id", nullable = false)
    private Integer id;
    @Column(unique = true)
    private String nom;
    @Column(unique = true)
    private String reference;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonIgnore
    private Category category;

    @OneToMany(mappedBy = "medicament")
    @JsonIgnore
    private List<RappelMed> rappels;

    public Medicament() {
    }

    public Medicament(String nom, String reference, Category category) {
        this.nom = nom;
        this.reference = reference;
        this.category = category;
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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<RappelMed> getRappels() {
        return rappels;
    }

    public void setRappels(List<RappelMed> rappels) {
        this.rappels = rappels;
    }
}