package ds4.com.skiskandergasmi.controllers;

import ds4.com.skiskandergasmi.entities.Piste;
import ds4.com.skiskandergasmi.services.IPisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RequestMapping("/Piste")
@RestController
public class PisteController {
    @Autowired
    IPisteService pisteService;

    @GetMapping
    public List<Piste> getAll()
    {
        return pisteService.retrieveAllPistes();
    }

    @PostMapping
    public Piste addPiste(@RequestBody Piste piste)
    {
        return pisteService.addPiste(piste);
    }
    @PutMapping
    public Piste updatePiste(@RequestBody Piste piste)
    {
        return pisteService.updatePiste(piste);
    }

    @DeleteMapping("{id}")
    //    public void deletePiste(@PathVariable(name = "id") Long num)
    public void deletePiste(@PathVariable Long id)
    {
        pisteService.removePiste(id);
    }
    @GetMapping("{id}")
    public Piste retrievePiste(@PathVariable Long id)
    {
        return pisteService.retrievePiste(id);
    }

}
