package ma.ensaj.medisafe.services;

import ma.ensaj.medisafe.beans.RendezVous;
import ma.ensaj.medisafe.repositories.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RendezVousService {

    @Autowired
    RendezVousRepository rendezVousRepository;

    public List<RendezVous> findAll(){
        return rendezVousRepository.findAll();
    }

    public RendezVous findById(int id){
        return rendezVousRepository.findById(id).get();
    }

    public RendezVous create(RendezVous rendezVous){
        return rendezVousRepository.save(rendezVous);
    }

    public void update(RendezVous rendezVous){
        rendezVousRepository.save(rendezVous);
    }

    public void delete(int id){
        rendezVousRepository.delete(rendezVousRepository.findById(id).get());
    }

}
