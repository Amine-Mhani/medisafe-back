package ma.ensaj.medisafe.beans;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class HistoriqueDoze {
    @Id
    private int id;
    @ManyToOne
    private Dose doze;
    @ManyToOne
    private Medicament medicament;
    @ManyToOne
    private User user;
    private String valeur;
    private String remarque;
    private String datePrevu;

    public HistoriqueDoze() {
    }

    public HistoriqueDoze(int id, Dose doze, Medicament medicament, User user, String valeur, String remarque, String datePrevu) {
        this.id = id;
        this.doze = doze;
        this.medicament = medicament;
        this.user = user;
        this.valeur = valeur;
        this.remarque = remarque;
        this.datePrevu = datePrevu;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dose getDoze() {
        return doze;
    }

    public void setDoze(Dose doze) {
        this.doze = doze;
    }

    public Medicament getMedicament() {
        return medicament;
    }

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public String getDatePrevu() {
        return datePrevu;
    }

    public void setDatePrevu(String datePrevu) {
        this.datePrevu = datePrevu;
    }

    @Override
    public String toString() {
        return "HistoriqueDoze{" +
                "id=" + id +
                ", doze=" + doze +
                ", medicament=" + medicament +
                ", valeur='" + valeur + '\'' +
                ", remarque='" + remarque + '\'' +
                ", datePrevu='" + datePrevu + '\'' +
                '}';
    }
}
