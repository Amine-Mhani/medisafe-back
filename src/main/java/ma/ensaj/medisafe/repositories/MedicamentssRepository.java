package ma.ensaj.medisafe.repositories;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ma.ensaj.medisafe.beans.Medicaments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MedicamentssRepository extends JpaRepository<Medicaments,Integer> {
    @Query("SELECT DISTINCT m FROM Medicaments m WHERE m.nom LIKE %:nom% ORDER BY m.nom desc ")
    public Page<Medicaments> medicamentsContainName(@Param("nom") String nom, Pageable pageable);


}
