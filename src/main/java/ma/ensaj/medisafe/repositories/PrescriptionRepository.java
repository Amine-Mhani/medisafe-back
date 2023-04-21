package ma.ensaj.medisafe.repositories;

import ma.ensaj.medisafe.beans.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {
}
