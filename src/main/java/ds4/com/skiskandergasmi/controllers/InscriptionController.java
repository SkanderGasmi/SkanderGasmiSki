package ds4.com.skiskandergasmi.controllers;
import ds4.com.skiskandergasmi.entities.Inscription;
import ds4.com.skiskandergasmi.services.interfaces.IInscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("inscription")

public class InscriptionController {

    @Autowired
    IInscriptionService inscriptionService;
    @GetMapping
    public List<Inscription> getAll(){
        return inscriptionService.retrieveAllInscription();

    }
    @GetMapping("{numInscription}")

    public Inscription retrieveInscription(@PathVariable Long numInscription) {

        return  inscriptionService.retrieveInscription(numInscription);

    }
    @PostMapping

    public Inscription addInscription(@RequestBody Inscription inscription){

        return inscriptionService.addInscription(inscription);
    }
    @DeleteMapping("{numInscription}")
    public void removeInscription(@PathVariable Long numInscription){

        inscriptionService.removeInscription(numInscription);
    }

    @PutMapping
    public Inscription updateInscription(@RequestBody Inscription inscription) {

        return  inscriptionService.updateInscription(inscription);

    }
}
