package ds4.com.skiskandergasmi.services;

import ds4.com.skiskandergasmi.entities.Skieur;
import ds4.com.skiskandergasmi.repositories.ISkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkieurService implements ISkieurService {

    @Autowired
    ISkieurRepository skieurRepository;

    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return null;
    }

    @Override
    public Skieur removeSkieur(Long id) {
        return null;
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return null;
    }
}
