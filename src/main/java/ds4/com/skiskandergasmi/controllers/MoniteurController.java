package ds4.com.skiskandergasmi.controllers;

import ds4.com.skiskandergasmi.entities.Moniteur;
import ds4.com.skiskandergasmi.services.IMoniteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Moniteur")
@RestController
public class MoniteurController {
    @Autowired
    IMoniteurService MoniteurService;

    @GetMapping
    public List<Moniteur> getAll()
    {
        return MoniteurService.retrieveAllMoniteurs();
    }

    @PostMapping
    public Moniteur addMoniteur(@RequestBody Moniteur Moniteur)
    {
        return MoniteurService.addMoniteur(Moniteur);
    }
    @PutMapping
    public Moniteur updateMoniteur(@RequestBody Moniteur Moniteur)
    {
        return MoniteurService.updateMoniteur(Moniteur);
    }

    @DeleteMapping("{id}")
    //    public void deleteMoniteur(@PathVariable(name = "id") Long num)
    public void deleteMoniteur(@PathVariable Long id)
    {
        MoniteurService.removeMoniteur(id);
    }
    @GetMapping("{id}")
    public Moniteur retrieveMoniteur(@PathVariable Long id)
    {
        return MoniteurService.retrieveMoniteur(id);
    }

}
