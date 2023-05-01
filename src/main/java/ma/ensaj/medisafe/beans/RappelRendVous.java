package ma.ensaj.medisafe.beans;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@DiscriminatorValue("rendez-vous")
public class RappelRendVous extends Rappel{

    @OneToOne
    @JoinColumn(name = "rendezvous_id")
    private RendezVous rendezVous;



    public RappelRendVous() {
    }

    public RappelRendVous(String debut, String fin, String horaire, User user, RendezVous rendezVous) {
        super(debut, fin, horaire, user);
        this.rendezVous = rendezVous;
    }

    public RendezVous getRendezVous() {
        return rendezVous;
    }

    public void setRendezVous(RendezVous rendezVous) {
        this.rendezVous = rendezVous;
    }
}