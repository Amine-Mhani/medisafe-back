package ma.ensaj.medisafe.repositories;

import ma.ensaj.medisafe.beans.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, Integer> {

}
