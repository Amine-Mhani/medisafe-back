package ma.ensaj.medisafe.controllers;

import ma.ensaj.medisafe.beans.Prescription;
import ma.ensaj.medisafe.services.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Prescription")
@CrossOrigin
public class PrescriptionController {

    @Autowired
    PrescriptionService prescriptionService;

    @GetMapping("/all")
    public List<Prescription> getAllPrescriptions() {
        return prescriptionService.findAll();
    }

    @PostMapping("/add")
    public Prescription createPrescription(@RequestBody Prescription prescription) {
        return prescriptionService.create(prescription);
    }

    @DeleteMapping("/delete")
    public void deletePrescription(@RequestParam int id) {
        prescriptionService.delete(id);
    }

    @GetMapping("/get")
    public Prescription getPrescriptionById(@RequestParam int id) {
        return prescriptionService.findById(id);
    }

    @PostMapping("/update")
    public void updatePrescription(@RequestBody Prescription new_Prescription) {
        Prescription prescription = prescriptionService.findById(new_Prescription.getId());

        prescriptionService.update(new_Prescription);
    }
}
