package ds4.com.skiskandergasmi.services.implementation;

import ds4.com.skiskandergasmi.entities.Inscription;
import ds4.com.skiskandergasmi.repositories.IInscriptionRepository;
import ds4.com.skiskandergasmi.services.interfaces.IInscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscriptionService implements IInscriptionService {

    @Autowired
    IInscriptionRepository inscriptionRepository;

    @Override
    public List<Inscription> retrieveAllInscription() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription addInscription(Inscription inscription) {

        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return null;
    }

    @Override
    public void removeInscription(Long id) {
    }

    @Override
    public Inscription retrieveInscription(Long numInscription) {
        return inscriptionRepository.findById(numInscription).orElse(null);

    }
}





