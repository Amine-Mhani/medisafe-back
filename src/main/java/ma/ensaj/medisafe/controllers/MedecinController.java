package ma.ensaj.medisafe.controllers;

import ma.ensaj.medisafe.beans.Medecin;
import ma.ensaj.medisafe.services.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Medecin")
@CrossOrigin
public class MedecinController {

    @Autowired
    MedecinService medecinService;

    @GetMapping("/all")
    public List<Medecin> getAllMedecins() {
        return medecinService.findAll();
    }

    @PostMapping("/add")
    public Medecin createMedecin(@RequestBody Medecin medecin) {
        return medecinService.create(medecin);
    }

    @DeleteMapping("/delete")
    public void deleteMedecin(@RequestParam int id) {
        medecinService.delete(id);
    }

    @GetMapping("/get")
    public Medecin getMedecinById(@RequestParam int id) {
        return medecinService.findById(id);
    }

    @PostMapping("/update")
    public void updateMedecin(@RequestBody Medecin new_Medecin) {
        Medecin medecin = medecinService.findById(new_Medecin.getId());

        medecinService.update(new_Medecin);
    }
}
