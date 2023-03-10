package ds4.com.skiskandergasmi.controllers;
import ds4.com.skiskandergasmi.entities.Abonnement;
import ds4.com.skiskandergasmi.services.interfaces.IAbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("abonnement")

public class AbonnementController {
    @Autowired
    IAbonnementService abonnementService;
    @GetMapping
    public List<Abonnement> getAll(){
        return abonnementService.retrieveAllAbonnement();

    }
    @GetMapping("{numAbon}")

    public Abonnement retrieveAbonnement(@PathVariable Long numAbon) {

        return  abonnementService.retrieveAbonnement(numAbon);

    }
    @PostMapping

    public Abonnement addAbonnement(@RequestBody Abonnement abonnement){

        return abonnementService.addAbonnement(abonnement);
    }
    @DeleteMapping("{numAbon}")
    public void removeAbonnement(@PathVariable Long numAbon){

        abonnementService.removeAbonnement(numAbon);
    }

    @PutMapping
    public Abonnement updateAbonnement(@RequestBody Abonnement abonnement) {

        return  abonnementService.updateAbonnement(abonnement);

    }

    /*@GetMapping("abParType/{tp}")
    public List<Abonnement> getAbonParType(@PathVariable TypeAbonnement tp){
        return  iAbonnementService.getSubParType(tp);
    }

    @GetMapping("abParDate/{dateDebut}/{dateFin}")
    public List<Abonnement>getAbonParDate (@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateDebut, @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateFin){
        return  iAbonnementService.retrieveSubscriptionsByDates(dateDebut,dateFin);
    }*/
}
