package ma.ensaj.medisafe.controllers;

import ma.ensaj.medisafe.beans.Medicaments;
import ma.ensaj.medisafe.beans.User;
import ma.ensaj.medisafe.services.SeggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/api/seggest")
public class SeggestionController {
    @Autowired
    SeggestionService service;
    @GetMapping("/nom={name}&page={page}")
    public ResponseEntity<List<Medicaments>> getUserByImei(@PathVariable String name,@PathVariable int page){
        try {
            return new ResponseEntity<>(service.getMedicaments(name,page), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
