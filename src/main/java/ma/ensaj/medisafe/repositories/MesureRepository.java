package ma.ensaj.medisafe.repositories;;
import ma.ensaj.medisafe.beans.Mesure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MesureRepository extends JpaRepository<Mesure, Integer> {
}
