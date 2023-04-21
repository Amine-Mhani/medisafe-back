package ma.ensaj.medisafe.controllers;

import ma.ensaj.medisafe.beans.Rapport;
import ma.ensaj.medisafe.services.RapportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Rapport")
@CrossOrigin
public class RapportController {

    @Autowired
    RapportService rapportService;

    @GetMapping("/all")
    public List<Rapport> getAllRapports() {
        return rapportService.findAll();
    }

    @PostMapping("/add")
    public Rapport createRapport(@RequestBody Rapport rapport) {
        return rapportService.create(rapport);
    }

    @DeleteMapping("/delete")
    public void deleteRapport(@RequestParam int id) {
        rapportService.delete(id);
    }

    @GetMapping("/get")
    public Rapport getRapportById(@RequestParam int id) {
        return rapportService.findById(id);
    }

    @PostMapping("/update")
    public void updateRapport(@RequestBody Rapport new_Rapport) {
        Rapport rapport = rapportService.findById(new_Rapport.getId());

        rapportService.update(new_Rapport);
    }
}
