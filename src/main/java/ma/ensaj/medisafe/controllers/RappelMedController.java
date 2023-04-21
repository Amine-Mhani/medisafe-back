package ma.ensaj.medisafe.controllers;

import ma.ensaj.medisafe.beans.RappelMed;
import ma.ensaj.medisafe.services.RappelMedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/RappelMed")
@CrossOrigin
public class RappelMedController {

    @Autowired
    RappelMedService rappelMedService;

    @GetMapping("/all")
    public List<RappelMed> getAllRappelMeds() {
        return rappelMedService.findAll();
    }

    @PostMapping("/add")
    public RappelMed createRappelMed(@RequestBody RappelMed rappelMed) {
        return rappelMedService.create(rappelMed);
    }

    @DeleteMapping("/delete")
    public void deleteRappelMed(@RequestParam int id) {
        rappelMedService.delete(id);
    }

    @GetMapping("/get")
    public RappelMed getRappelMedById(@RequestParam int id) {
        return rappelMedService.findById(id);
    }

    @PostMapping("/update")
    public void updateRappelMed(@RequestBody RappelMed new_RappelMed) {
        RappelMed rappelMed = rappelMedService.findById(new_RappelMed.getId());

        rappelMedService.update(new_RappelMed);
    }
}
