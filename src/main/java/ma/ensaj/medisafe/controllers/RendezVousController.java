package ma.ensaj.medisafe.controllers;

import ma.ensaj.medisafe.beans.RendezVous;
import ma.ensaj.medisafe.services.RendezVousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rendezVous")
@CrossOrigin
public class RendezVousController {

    @Autowired
    RendezVousService rendezVousService;

    @GetMapping("/all")
    public List<RendezVous> getAllRendezVouss() {
        return rendezVousService.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<String> createRendezVous(@RequestBody RendezVous rendezVous) {
        try{
            rendezVousService.create(rendezVous);
            return ResponseEntity.status(HttpStatus.OK).body(("ok"));
        }catch(Exception e){
            System.out.println(e.toString());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error");
        }

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
