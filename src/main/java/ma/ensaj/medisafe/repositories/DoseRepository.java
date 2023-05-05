package ma.ensaj.medisafe.repositories;
import ma.ensaj.medisafe.beans.Dose;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoseRepository extends JpaRepository<Dose, Integer> {
}
