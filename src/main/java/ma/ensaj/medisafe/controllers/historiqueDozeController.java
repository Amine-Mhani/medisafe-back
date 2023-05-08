package ma.ensaj.medisafe.controllers;

import ma.ensaj.medisafe.beans.HistoriqueDoze;
import ma.ensaj.medisafe.beans.Medecin;
import ma.ensaj.medisafe.services.HistoriqueDozeService;
import ma.ensaj.medisafe.services.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historiqueDoze")
@CrossOrigin
public class historiqueDozeController {

    @Autowired
    HistoriqueDozeService historiqueDozeService;

    @GetMapping("/all")
    public List<HistoriqueDoze> getAllHistoriqueDoze() {
        return historiqueDozeService.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<String> createHistoriqueDoze(@RequestBody HistoriqueDoze historiqueDoze) {
        try {
            historiqueDozeService.create(historiqueDoze);
             return ResponseEntity.status(HttpStatus.OK).body(("ok"));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error");
        }
    }



}
