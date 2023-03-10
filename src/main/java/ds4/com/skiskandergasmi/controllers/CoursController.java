package ds4.com.skiskandergasmi.controllers;

import ds4.com.skiskandergasmi.entities.Cours;
import ds4.com.skiskandergasmi.services.ICoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Cours")
@RestController
public class CoursController {
    @Autowired
    ICoursService coursService;

    @GetMapping
    public List<Cours> getAll()
    {
        return coursService.retrieveAllCourss();
    }

    @PostMapping
    public Cours addCours(@RequestBody Cours Cours)
    {
        return coursService.addCours(Cours);
    }
    @PutMapping
    public Cours updateCours(@RequestBody Cours Cours)
    {
        return coursService.updateCours(Cours);
    }

    @DeleteMapping("{id}")
    //    public void deleteCours(@PathVariable(name = "id") Long num)
    public void deleteCours(@PathVariable Long id)
    {
        coursService.removeCours(id);
    }
    @GetMapping("{id}")
    public Cours retrieveCours(@PathVariable Long id)
    {
        return coursService.retrieveCours(id);
    }

}
