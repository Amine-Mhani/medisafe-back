package ma.ensaj.medisafe.services;

import ma.ensaj.medisafe.beans.Rapport;
import ma.ensaj.medisafe.repositories.RapportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RapportService {

    @Autowired
    RapportRepository rapportRepository;

    public List<Rapport> findAll(){
        return rapportRepository.findAll();
    }

    public Rapport findById(int id){
        return rapportRepository.findById(id).get();
    }

    public Rapport create(Rapport rapport){
        return rapportRepository.save(rapport);
    }

    public void update(Rapport rapport){
        rapportRepository.save(rapport);
    }

    public void delete(int id){
        rapportRepository.delete(rapportRepository.findById(id).get());
    }

}
