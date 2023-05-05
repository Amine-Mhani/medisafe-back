package ma.ensaj.medisafe.controllers;
import ma.ensaj.medisafe.beans.Dose;
import ma.ensaj.medisafe.services.DoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Dose")
@CrossOrigin
public class DoseController {

    @Autowired
    DoseService doseService;

    @GetMapping("/all")
    public List<Dose> getAllDoses() {
        return doseService.findAll();
    }

    @PostMapping("/add")
    public Dose createDose(@RequestBody Dose dose) {
        return doseService.create(dose);
    }

    @DeleteMapping("/delete")
    public void deleteDose(@RequestParam int id) {
        doseService.delete(id);
    }

    @GetMapping("/get")
    public Dose getDoseById(@RequestParam int id) {
        return doseService.findById(id);
    }

    @PostMapping("/update")
    public void updateDose(@RequestBody Dose new_Dose) {
        Dose dose = doseService.findById(new_Dose.getId());

        doseService.update(new_Dose);
    }
}

