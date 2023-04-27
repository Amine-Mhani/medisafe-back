package ma.ensaj.medisafe.repositories;

import ma.ensaj.medisafe.beans.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Auth, Integer> {
    Auth findByImei(String imei);
}
