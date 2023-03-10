package ds4.com.skiskandergasmi.services;

import ds4.com.skiskandergasmi.entities.Moniteur;

import java.util.List;

public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    void removeMoniteur (Long id);
    Moniteur retrieveMoniteur (Long numMoniteur);
}


