package ds4.com.skiskandergasmi.services.interfaces;

import ds4.com.skiskandergasmi.entities.Moniteur;

import java.util.List;
import java.util.Optional;

public interface IMoniteurService {


    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);
    void removeMoniteur  (Long numMoniteur);
}
