package ma.ensaj.medisafe.repositories;

import ma.ensaj.medisafe.beans.Tracker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackerRepository extends JpaRepository<Tracker, Integer> {
}
