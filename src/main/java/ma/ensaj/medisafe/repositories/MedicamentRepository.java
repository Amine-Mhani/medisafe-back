package ma.ensaj.medisafe.repositories;

import ma.ensaj.medisafe.beans.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentRepository extends JpaRepository<Medicament, Integer> {
}
