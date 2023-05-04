package ma.ensaj.medisafe.services;

import ma.ensaj.medisafe.beans.Medicaments;
import ma.ensaj.medisafe.repositories.MedicamentssRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
@Service
public class SeggestionService {
    @Autowired
    MedicamentssRepository repository;

    public List<Medicaments> getMedicaments(String name){
        return repository.medicamentsContainName(name);

    }
}
