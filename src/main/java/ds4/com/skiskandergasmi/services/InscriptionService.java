package ds4.com.skiskandergasmi.services;

import ds4.com.skiskandergasmi.entities.Inscription;
import ds4.com.skiskandergasmi.repositories.IInscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscriptionService implements IInscriptionService {

    @Autowired
    IInscriptionRepository inscriptionRepository;

    @Override
    public List<Inscription> retrieveAllInscriptions() {
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
    public Inscription removeInscription(Long id) {
        return null;
    }

    @Override
    public Inscription retrieveInscription(Long numInscription) {
        return null;
    }
}
