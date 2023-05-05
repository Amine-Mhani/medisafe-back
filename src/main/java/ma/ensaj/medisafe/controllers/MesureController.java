package ma.ensaj.medisafe.controllers;
import ma.ensaj.medisafe.beans.Mesure;
import ma.ensaj.medisafe.services.MesureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Mesure")
@CrossOrigin
public class MesureController {

    @Autowired
    MesureService mesureService;

    @GetMapping("/all")
    public List<Mesure> getAllMesures() {
        return mesureService.findAll();
    }

    @PostMapping("/add")
    public Mesure createMesure(@RequestBody Mesure mesure) {
        return mesureService.create(mesure);
    }

    @DeleteMapping("/delete")
    public void deleteMesure(@RequestParam int id) {
        mesureService.delete(id);
    }

    @GetMapping("/get")
    public Mesure getMesureById(@RequestParam int id) {
        return mesureService.findById(id);
    }

    @PostMapping("/update")
    public void updateMesure(@RequestBody Mesure new_Mesure) {
        Mesure mesure = mesureService.findById(new_Mesure.getId());

        mesureService.update(new_Mesure);
    }
}

