package ma.ensaj.medisafe.services;

import ma.ensaj.medisafe.beans.Medicaments;
import ma.ensaj.medisafe.repositories.MedicamentssRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import java.util.HashMap;
import java.util.List;
@Service
public class SeggestionService {
    @Autowired
    MedicamentssRepository repository;

    public List<Medicaments> getMedicaments(String name,int pageNumber){
        // The first page is page 0, not page 1
        int pageSize = 10;
        Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("nom").descending());
        Page<Medicaments> medicaments = repository.medicamentsContainName(name,pageable);
        return medicaments.getContent();

    }
}
