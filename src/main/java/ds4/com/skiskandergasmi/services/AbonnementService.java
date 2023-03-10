package ds4.com.skiskandergasmi.services;

import ds4.com.skiskandergasmi.entities.Abonnement;
import ds4.com.skiskandergasmi.repositories.IAbonnementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbonnementService implements IAbonnementService {

    @Autowired
    IAbonnementRepository abonnementRepository;

    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return null;
    }

    @Override
    public Abonnement removeAbonnement(Long id) {
        return null;
    }

    @Override
    public Abonnement retrieveAbonnement(Long abonnement) {
        return null;
    }
}
