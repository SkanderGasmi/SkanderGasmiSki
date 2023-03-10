package ds4.com.skiskandergasmi.services;

import ds4.com.skiskandergasmi.entities.Skieur;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    Skieur updateSkieur (Skieur skieur);
    Skieur removeSkieur (Long id);
    Skieur retrieveSkieur (Long numSkieur);
}
