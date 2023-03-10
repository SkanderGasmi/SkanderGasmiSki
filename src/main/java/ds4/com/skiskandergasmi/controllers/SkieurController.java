package ds4.com.skiskandergasmi.controllers;

import ds4.com.skiskandergasmi.entities.Skieur;
import ds4.com.skiskandergasmi.entities.TypeAbonnement;
import ds4.com.skiskandergasmi.services.interfaces.ISkieurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("skieur")
public class SkieurController {
    @Autowired
    ISkieurService skieurService;
    @GetMapping
    public List<Skieur> getAll(){
        return skieurService.retrieveAllSkieurs();

    }
    @GetMapping("{numSkieur}")

    public Skieur retrieveSkieur(@PathVariable Long numSkieur) {

        return (skieurService.retrieveSkieur(numSkieur).isPresent())
                ? skieurService.retrieveSkieur(numSkieur).get()
                : null;

    }
    @PostMapping

    public Skieur addSkieur(@RequestBody Skieur skieur){

        return skieurService.addSkieur(skieur);
    }
    @DeleteMapping("{numSkieur}")
    public void removeSkieur(@PathVariable Long numSkieur){

        skieurService.removeSkieur(numSkieur);
    }

    @PutMapping
    public Skieur updateSkieur(@RequestBody Skieur Skieur) {

        return  skieurService.updateSkieur(Skieur);

    }
    @PutMapping("p/{numSkieur}/{numPiste}")
    public Skieur assignSkierToPiste(@PathVariable Long numSkieur,@PathVariable Long numPiste){
        return skieurService.assignSkierToPiste(numSkieur, numPiste);
    }

    @PutMapping("s/{numSkieur}/{numAbon}")
    public Skieur AssignSkierToSubscription(@PathVariable Long numSkieur, @PathVariable Long numAbon) {
        return skieurService.AssignSkierToSubscription(numSkieur, numAbon);
    }
    @GetMapping("getSkieurParTypeAbon/{tp}")
    public List<Skieur> getSkieurParTypeAbon(@PathVariable TypeAbonnement tp){
        return  skieurService.getSkieurByAbonnement_TypeAbon(tp);
    }
}
