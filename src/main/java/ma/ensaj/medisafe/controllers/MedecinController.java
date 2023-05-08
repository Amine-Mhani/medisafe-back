package ma.ensaj.medisafe.controllers;

import ma.ensaj.medisafe.beans.Medecin;
import ma.ensaj.medisafe.services.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medecin")
@CrossOrigin
public class MedecinController {

    @Autowired
    MedecinService medecinService;

    @GetMapping("/all")
    public List<Medecin> getAllMedecins() {
        return medecinService.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<String> createMedecin(@RequestBody Medecin medecin) {
        try {
             medecinService.create(medecin);
             return ResponseEntity.status(HttpStatus.OK).body(("ok"));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error");
        }
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
