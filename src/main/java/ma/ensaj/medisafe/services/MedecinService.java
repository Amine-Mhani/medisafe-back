package ma.ensaj.medisafe.services;

import ma.ensaj.medisafe.beans.Medecin;
import ma.ensaj.medisafe.repositories.MedecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MedecinService {

    @Autowired
    MedecinRepository medecinRepository;

    public List<Medecin> findAll(){
        return medecinRepository.findAll();
    }

    public Medecin findById(int id){
        return medecinRepository.findById(id).get();
    }

    public Medecin create(Medecin medecin){
        return medecinRepository.save(medecin);
    }

    public void update(Medecin medecin){
        medecinRepository.save(medecin);
    }

    public void delete(int id){
        medecinRepository.delete(medecinRepository.findById(id).get());
    }

}
