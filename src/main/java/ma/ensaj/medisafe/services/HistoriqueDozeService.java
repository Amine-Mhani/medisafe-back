package ma.ensaj.medisafe.services;

import ma.ensaj.medisafe.beans.Category;
import ma.ensaj.medisafe.beans.HistoriqueDoze;
import ma.ensaj.medisafe.repositories.CategoryRepository;
import ma.ensaj.medisafe.repositories.HistoriqueDozeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HistoriqueDozeService {

    @Autowired
    HistoriqueDozeRepository historiqueDozeRepository;

    public List<HistoriqueDoze> findAll() {
        return historiqueDozeRepository.findAll();
    }

    public HistoriqueDoze findById(int id) {
        return historiqueDozeRepository.findById(id).get();
    }

    public HistoriqueDoze create(HistoriqueDoze historiqueDoze) {
        return historiqueDozeRepository.save(historiqueDoze);
    }

    public void update(HistoriqueDoze historiqueDoze) {
        historiqueDozeRepository.save(historiqueDoze);
    }

    public void delete(int id) {
        historiqueDozeRepository.delete(historiqueDozeRepository.findById(id).get());
    }
}

