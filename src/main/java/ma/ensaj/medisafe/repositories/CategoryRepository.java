package ma.ensaj.medisafe.repositories;

import ma.ensaj.medisafe.beans.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
