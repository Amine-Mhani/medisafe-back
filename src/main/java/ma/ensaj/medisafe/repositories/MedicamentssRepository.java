package ma.ensaj.medisafe.repositories;

import ma.ensaj.medisafe.beans.Medicaments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentssRepository extends JpaRepository<Medicaments,Integer> {

}
