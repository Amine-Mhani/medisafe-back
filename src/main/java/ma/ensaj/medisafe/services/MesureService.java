package ma.ensaj.medisafe.services;
import ma.ensaj.medisafe.beans.Mesure;
import ma.ensaj.medisafe.repositories.MesureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class MesureService {

    @Autowired
    MesureRepository mesureRepository;

    public List<Mesure> findAll() {
        return mesureRepository.findAll();
    }

    public Mesure findById(int id) {
        return mesureRepository.findById(id).get();
    }

    public Mesure create(Mesure mesure) {
        return mesureRepository.save(mesure);
    }

    public void update(Mesure mesure) {
        mesureRepository.save(mesure);
    }

    public void delete(int id) {
        mesureRepository.delete(mesureRepository.findById(id).get());
    }
}

