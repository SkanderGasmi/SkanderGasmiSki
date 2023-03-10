package ds4.com.skiskandergasmi.controllers;
import ds4.com.skiskandergasmi.entities.Cours;
import ds4.com.skiskandergasmi.services.interfaces.ICoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cours")
public class CoursController {
    @Autowired
    ICoursService coursService;
    @GetMapping
    public List<Cours> getAll(){
        return coursService.retrieveAllCourses();
    }
    @PostMapping
    public  Cours addCours(@RequestBody Cours cours){
       return coursService.addCours(cours);
    }
    @DeleteMapping("{numCours}")
    public  void deleteCours(@PathVariable Long numCours){coursService.removeCours(numCours);
    }
@PutMapping
    public Cours updateCours(@RequestBody Cours cours){
        return coursService.updateCours(cours);
}
@GetMapping("{numCours}")
public Cours retrieveCours (@PathVariable Long numCours){
      return  coursService.retrieveCours(numCours);
}

}
