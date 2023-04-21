package ma.ensaj.medisafe.beans;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@DiscriminatorValue("medicament")
public class RappelMed extends Rappel{

    @ManyToOne
    @JoinColumn(name = "medicament_id")
    private Medicament medicament;

    public RappelMed() {
    }

    public RappelMed(Date debut, Date fin, String horaire, User user, Medicament medicament) {
        super(debut, fin, horaire, user);
        this.medicament = medicament;
    }

    public Medicament getMedicament() {
        return medicament;
    }

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }
}