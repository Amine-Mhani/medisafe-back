package ma.ensaj.medisafe.services;

import ma.ensaj.medisafe.beans.Prescription;

import ma.ensaj.medisafe.repositories.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PrescriptionService {

    @Autowired
    PrescriptionRepository prescriptionRepository;

    public List<Prescription> findAll(){
        return prescriptionRepository.findAll();
    }

    public Prescription findById(int id){
        return prescriptionRepository.findById(id).get();
    }

    public Prescription create(Prescription prescription){
        return prescriptionRepository.save(prescription);
    }

    public void update(Prescription prescription){
        prescriptionRepository.save(prescription);
    }

    public void delete(int id){
        prescriptionRepository.delete(prescriptionRepository.findById(id).get());
    }

}
