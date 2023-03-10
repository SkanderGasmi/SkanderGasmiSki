package ds4.com.skiskandergasmi.services;

import ds4.com.skiskandergasmi.entities.Cours;
import ds4.com.skiskandergasmi.repositories.ICoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursService implements ICoursService {

    @Autowired
    ICoursRepository CoursRepository;

    @Override
    public List<Cours> retrieveAllCourss() {
        return CoursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours Cours) {
        return CoursRepository.save(Cours);
    }
    @Override
    public Cours updateCours(Cours Cours) {
        return CoursRepository.save(Cours);
    }

    @Override
    public void removeCours(Long id)
    {
        CoursRepository.deleteById(id);
    }
    @Override
    public Cours retrieveCours(Long numCours) {
        return CoursRepository.findById(numCours).orElse(null);
    }
}
