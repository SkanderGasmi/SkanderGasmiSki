package ds4.com.skiskandergasmi.controllers;

import ds4.com.skiskandergasmi.entities.Moniteur;
import ds4.com.skiskandergasmi.services.interfaces.IMoniteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("moniteur")

public class MoniteurController {
    @Autowired
    IMoniteurService moniteurService;
    @GetMapping
    public List<Moniteur> getAll(){
        return moniteurService.retrieveAllMoniteurs();

    }
    @GetMapping("{numMoniteur}")

    public Moniteur retrieveMoniteur(@PathVariable Long numMoniteur) {

        return  moniteurService.retrieveMoniteur(numMoniteur);

    }
    @PostMapping

    public Moniteur addMoniteur(@RequestBody Moniteur moniteur){

        return moniteurService.addMoniteur(moniteur);
    }
    @DeleteMapping("{numMoniteur}")
    public void removeMoniteur(@PathVariable Long numMoniteur){

        moniteurService.removeMoniteur(numMoniteur);
    }

    @PutMapping
    public Moniteur updateMoniteur(@RequestBody Moniteur Moniteur) {

        return  moniteurService.updateMoniteur(Moniteur);

    }
}
