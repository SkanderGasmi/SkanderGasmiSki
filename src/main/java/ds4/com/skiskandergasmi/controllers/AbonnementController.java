package ds4.com.skiskandergasmi.controllers;

import ds4.com.skiskandergasmi.entities.Abonnement;
import ds4.com.skiskandergasmi.services.IAbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Abonnement")
@RestController
public class AbonnementController {
    @Autowired
    IAbonnementService AbonnementService;

    @GetMapping
    public List<Abonnement> getAll()
    {
        return AbonnementService.retrieveAllAbonnements();
    }

    @PostMapping
    public Abonnement addAbonnement(@RequestBody Abonnement Abonnement)
    {
        return AbonnementService.addAbonnement(Abonnement);
    }
    @PutMapping
    public Abonnement updateAbonnement(@RequestBody Abonnement Abonnement)
    {
        return AbonnementService.updateAbonnement(Abonnement);
    }

    @DeleteMapping("{id}")
    //    public void deleteAbonnement(@PathVariable(name = "id") Long num)
    public void deleteAbonnement(@PathVariable Long id)
    {
        AbonnementService.removeAbonnement(id);
    }
    @GetMapping("{id}")
    public Abonnement retrieveAbonnement(@PathVariable Long id)
    {
        return AbonnementService.retrieveAbonnement(id);
    }

}
