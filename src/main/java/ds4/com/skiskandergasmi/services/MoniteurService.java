package ds4.com.skiskandergasmi.services;

import ds4.com.skiskandergasmi.entities.Moniteur;
import ds4.com.skiskandergasmi.repositories.IMoniteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoniteurService implements IMoniteurService {

    @Autowired
    IMoniteurRepository MoniteurRepository;

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return MoniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur Moniteur) {
        return MoniteurRepository.save(Moniteur);
    }
    @Override
    public Moniteur updateMoniteur(Moniteur Moniteur) {
        return MoniteurRepository.save(Moniteur);
    }

    @Override
    public void removeMoniteur(Long id)
    {
        MoniteurRepository.deleteById(id);
    }
    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return MoniteurRepository.findById(numMoniteur).orElse(null);
    }
}
