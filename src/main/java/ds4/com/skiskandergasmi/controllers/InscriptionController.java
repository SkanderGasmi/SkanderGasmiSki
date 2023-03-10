package ds4.com.skiskandergasmi.controllers;

import ds4.com.skiskandergasmi.entities.Inscription;
import ds4.com.skiskandergasmi.services.IInscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Inscription")
@RestController
public class InscriptionController {
    @Autowired
    IInscriptionService InscriptionService;

    @GetMapping
    public List<Inscription> getAll()
    {
        return InscriptionService.retrieveAllInscriptions();
    }

    @PostMapping
    public Inscription addInscription(@RequestBody Inscription Inscription)
    {
        return InscriptionService.addInscription(Inscription);
    }
    @PutMapping
    public Inscription updateInscription(@RequestBody Inscription Inscription)
    {
        return InscriptionService.updateInscription(Inscription);
    }

    @DeleteMapping("{id}")
    //    public void deleteInscription(@PathVariable(name = "id") Long num)
    public void deleteInscription(@PathVariable Long id)
    {
        InscriptionService.removeInscription(id);
    }
    @GetMapping("{id}")
    public Inscription retrieveInscription(@PathVariable Long id)
    {
        return InscriptionService.retrieveInscription(id);
    }

}
