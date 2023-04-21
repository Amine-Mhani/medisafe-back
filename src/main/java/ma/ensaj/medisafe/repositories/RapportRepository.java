package ma.ensaj.medisafe.repositories;

import ma.ensaj.medisafe.beans.Rapport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RapportRepository extends JpaRepository<Rapport, Integer> {
}
