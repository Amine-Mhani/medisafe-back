package ma.ensaj.medisafe.controllers;

import ma.ensaj.medisafe.beans.RendezVous;
import ma.ensaj.medisafe.services.RendezVousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/RendezVous")
@CrossOrigin
public class RendezVousController {

    @Autowired
    RendezVousService rendezVousService;

    @GetMapping("/all")
    public List<RendezVous> getAllRendezVouss() {
        return rendezVousService.findAll();
    }

    @PostMapping("/add")
    public RendezVous createRendezVous(@RequestBody RendezVous rendezVous) {
        return rendezVousService.create(rendezVous);
    }

    @DeleteMapping("/delete")
    public void deleteRendezVous(@RequestParam int id) {
        rendezVousService.delete(id);
    }

    @GetMapping("/get")
    public RendezVous getRendezVousById(@RequestParam int id) {
        return rendezVousService.findById(id);
    }

    @PostMapping("/update")
    public void updateRendezVous(@RequestBody RendezVous new_RendezVous) {
        RendezVous rendezVous = rendezVousService.findById(new_RendezVous.getId());

        rendezVousService.update(new_RendezVous);
    }
}
