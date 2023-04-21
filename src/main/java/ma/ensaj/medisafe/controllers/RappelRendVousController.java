package ma.ensaj.medisafe.controllers;

import ma.ensaj.medisafe.beans.RappelRendVous;
import ma.ensaj.medisafe.services.RappelRendVousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/RappelRendVous")
@CrossOrigin
public class RappelRendVousController {

    @Autowired
    RappelRendVousService rappelRendVousService;

    @GetMapping("/all")
    public List<RappelRendVous> getAllRappelRendVouss() {
        return rappelRendVousService.findAll();
    }

    @PostMapping("/add")
    public RappelRendVous createRappelRendVous(@RequestBody RappelRendVous rappelRendVous) {
        return rappelRendVousService.create(rappelRendVous);
    }

    @DeleteMapping("/delete")
    public void deleteRappelRendVous(@RequestParam int id) {
        rappelRendVousService.delete(id);
    }

    @GetMapping("/get")
    public RappelRendVous getRappelRendVousById(@RequestParam int id) {
        return rappelRendVousService.findById(id);
    }

    @PostMapping("/update")
    public void updateRappelRendVous(@RequestBody RappelRendVous new_RappelRendVous) {
        RappelRendVous rappelRendVous = rappelRendVousService.findById(new_RappelRendVous.getId());

        rappelRendVousService.update(new_RappelRendVous);
    }
}
