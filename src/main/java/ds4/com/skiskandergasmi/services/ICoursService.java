package ds4.com.skiskandergasmi.services;

import ds4.com.skiskandergasmi.entities.Cours;

import java.util.List;


public interface ICoursService {
    List<Cours> retrieveAllCourss();
    Cours addCours(Cours Cours);
    Cours updateCours (Cours Cours);
    void removeCours (Long id);
    Cours retrieveCours (Long numCours);
}
