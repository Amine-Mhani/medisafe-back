package ma.ensaj.medisafe.services;

import ma.ensaj.medisafe.beans.RappelRendVous;
import ma.ensaj.medisafe.repositories.RappelRendVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RappelRendVousService {

    @Autowired
    RappelRendVousRepository rappelRendVousRepository;

    public List<RappelRendVous> findAll() {
        return rappelRendVousRepository.findAll();
    }

    public RappelRendVous findById(int id) {
        return rappelRendVousRepository.findById(id).get();
    }

    public RappelRendVous create(RappelRendVous rappelRendVous) {
        return rappelRendVousRepository.save(rappelRendVous);
    }

    public void update(RappelRendVous rappelRendVous) {
        rappelRendVousRepository.save(rappelRendVous);
    }

    public void delete(int id) {
        rappelRendVousRepository.delete(rappelRendVousRepository.findById(id).get());
    }
}

