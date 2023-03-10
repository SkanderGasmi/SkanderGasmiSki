package ds4.com.skiskandergasmi.controllers;

import ds4.com.skiskandergasmi.entities.Skieur;
import ds4.com.skiskandergasmi.services.ISkieurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Skieur")
@RestController
public class SkieurController {
    @Autowired
    ISkieurService SkieurService;

    @GetMapping
    public List<Skieur> getAll()
    {
        return SkieurService.retrieveAllSkieurs();
    }

    @PostMapping
    public Skieur addSkieur(@RequestBody Skieur Skieur)
    {
        return SkieurService.addSkieur(Skieur);
    }
    @PutMapping
    public Skieur updateSkieur(@RequestBody Skieur Skieur)
    {
        return SkieurService.updateSkieur(Skieur);
    }

    @DeleteMapping("{id}")
    //    public void deleteSkieur(@PathVariable(name = "id") Long num)
    public void deleteSkieur(@PathVariable Long id)
    {
        SkieurService.removeSkieur(id);
    }
    @GetMapping("{id}")
    public Skieur retrieveSkieur(@PathVariable Long id)
    {
        return SkieurService.retrieveSkieur(id);
    }

}
