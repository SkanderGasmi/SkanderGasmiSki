package ds4.com.skiskandergasmi.services.implementation;

import ds4.com.skiskandergasmi.entities.Abonnement;
import ds4.com.skiskandergasmi.entities.Piste;
import ds4.com.skiskandergasmi.entities.Skieur;
import ds4.com.skiskandergasmi.entities.TypeAbonnement;
import ds4.com.skiskandergasmi.repositories.IAbonnementRepository;
import ds4.com.skiskandergasmi.repositories.IPisteRepository;
import ds4.com.skiskandergasmi.repositories.ISkieurRepository;
import ds4.com.skiskandergasmi.services.interfaces.ISkieurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class SkieurService implements ISkieurService {
    @Autowired
    ISkieurRepository skieurRepository;
    @Autowired
    IPisteRepository pisteRepo;
    @Autowired
    IAbonnementRepository abonnementRepository;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return  skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }


    @Override
    public void removeSkieur(Long numSkieur) {
        skieurRepository.deleteById(numSkieur);
    }

    @Override
    public Optional<Skieur> retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById(numSkieur);
    }

    @Override
    public Skieur updateSkieur(Skieur Skieur) {
        return skieurRepository.save(Skieur);
    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {

        Skieur skieur =  skieurRepository.findById(numSkieur).orElse(null);
        Piste piste = pisteRepo.findById(numPiste).orElse(null);

        if(skieur!=null && piste!=null){

            // piste.getSkieurs().add(skieur);
            List<Piste> pistes = skieur.getPistes();
            pistes.add(piste);
            skieur.setPistes(pistes);
            return skieurRepository.save(skieur);
        }
        //return skieurRepository.findById(numSkieur).orElse(null);
        return  null ;
    }

    @Override
    public Skieur AssignSkierToSubscription(Long numSkieur, Long  numAbon) {
        Skieur skieur =  skieurRepository.findById(numSkieur).orElse(null);
        Assert.notNull(skieur,"skieur not found");
        Abonnement abonnement = abonnementRepository.findById(numAbon).orElse(null);
        Assert.notNull(abonnement,"abonnement not found");
        //if(skieur!=null && abonnement!=null) {
        skieur.setAbonnement(abonnement);
        return skieurRepository.save(skieur);
        //}
        //return null;
    }
    @Override
    public List<Skieur> getSkieurByAbonnement_TypeAbon(TypeAbonnement typeAbonnement){
        return skieurRepository.findSkieurByAbonnement_TypeAbon(typeAbonnement);
    }
}
