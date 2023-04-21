package ma.ensaj.medisafe.services;

import ma.ensaj.medisafe.beans.RappelMed;
import ma.ensaj.medisafe.repositories.RappelMedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RappelMedService {

    @Autowired
    RappelMedRepository rappelMedRepository;

    public List<RappelMed> findAll(){
        return rappelMedRepository.findAll();
    }

    public RappelMed findById(int id){
        return rappelMedRepository.findById(id).get();
    }

    public RappelMed create(RappelMed rappelMed){
        return rappelMedRepository.save(rappelMed);
    }

    public void update(RappelMed rappelMed){
        rappelMedRepository.save(rappelMed);
    }

    public void delete(int id){
        rappelMedRepository.delete(rappelMedRepository.findById(id).get());
    }

}
