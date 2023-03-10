package ds4.com.skiskandergasmi.services;

import ds4.com.skiskandergasmi.entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    List<Inscription> retrieveAllInscriptions();
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription (Inscription inscription);
    Inscription removeInscription (Long id);
    Inscription retrieveInscription (Long numInscription);
}
