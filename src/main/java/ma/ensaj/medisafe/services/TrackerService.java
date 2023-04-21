package ma.ensaj.medisafe.services;

import ma.ensaj.medisafe.beans.Tracker;
import ma.ensaj.medisafe.repositories.TrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TrackerService {

    @Autowired
    TrackerRepository trackerRepository;

    public List<Tracker> findAll(){
        return trackerRepository.findAll();
    }

    public Tracker findById(int id){
        return trackerRepository.findById(id).get();
    }

    public Tracker create(Tracker tracker){
        return trackerRepository.save(tracker);
    }

    public void update(Tracker tracker){
        trackerRepository.save(tracker);
    }

    public void delete(int id){
        trackerRepository.delete(trackerRepository.findById(id).get());
    }

}
