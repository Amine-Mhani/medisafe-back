package ma.ensaj.medisafe.repositories;

import ma.ensaj.medisafe.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByEmail(String email);
}
