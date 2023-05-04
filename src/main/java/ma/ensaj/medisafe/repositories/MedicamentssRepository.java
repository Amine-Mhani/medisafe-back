package ma.ensaj.medisafe.repositories;

import ma.ensaj.medisafe.beans.Medicaments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MedicamentssRepository extends JpaRepository<Medicaments,Integer> {
    @Query("SELECT DISTINCT m FROM Medicaments m WHERE m.nom LIKE %:nom% ORDER BY m.nom desc ")
    public List<Medicaments> medicamentsContainName(@Param("nom") String nom);


}
