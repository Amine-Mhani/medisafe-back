package ma.ensaj.medisafe.services;
import ma.ensaj.medisafe.beans.Dose;
import ma.ensaj.medisafe.repositories.DoseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class DoseService {

    @Autowired
    DoseRepository doseRepository;

    public List<Dose> findAll() {
        return doseRepository.findAll();
    }

    public Dose findById(int id) {
        return doseRepository.findById(id).get();
    }

    public Dose create(Dose dose) {
        return doseRepository.save(dose);
    }

    public void update(Dose dose) {
        doseRepository.save(dose);
    }

    public void delete(int id) {
        doseRepository.delete(doseRepository.findById(id).get());
    }
}

