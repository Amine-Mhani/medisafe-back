package ma.ensaj.medisafe.controllers;

import ma.ensaj.medisafe.beans.Medicament;
import ma.ensaj.medisafe.services.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Medicament")
@CrossOrigin
public class MedicamentController {

    @Autowired
    MedicamentService medicamentService;

    @GetMapping("/all")
    public List<Medicament> getAllMedicaments() {
        return medicamentService.findAll();
    }

    @PostMapping("/add")
    public Medicament createMedicament(@RequestBody Medicament medicament) {
        return medicamentService.create(medicament);
    }

    @DeleteMapping("/delete")
    public void deleteMedicament(@RequestParam int id) {
        medicamentService.delete(id);
    }

    @GetMapping("/get")
    public Medicament getMedicamentById(@RequestParam int id) {
        return medicamentService.findById(id);
    }

    @PostMapping("/update")
    public void updateMedicament(@RequestBody Medicament new_Medicament) {
        Medicament medicament = medicamentService.findById(new_Medicament.getId());

        medicamentService.update(new_Medicament);
    }
}