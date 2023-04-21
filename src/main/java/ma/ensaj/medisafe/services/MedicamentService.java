package ma.ensaj.medisafe.services;

import ma.ensaj.medisafe.beans.Medicament;
import ma.ensaj.medisafe.repositories.MedicamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MedicamentService {

    @Autowired
    MedicamentRepository medicamentRepository;

    public List<Medicament> findAll(){
        return medicamentRepository.findAll();
    }

    public Medicament findById(int id){
        return medicamentRepository.findById(id).get();
    }

    public Medicament create(Medicament medicament){
        return medicamentRepository.save(medicament);
    }

    public void update(Medicament medicament){
        medicamentRepository.save(medicament);
    }

    public void delete(int id){
        medicamentRepository.delete(medicamentRepository.findById(id).get());
    }

}
