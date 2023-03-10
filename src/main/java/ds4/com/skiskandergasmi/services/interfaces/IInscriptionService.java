package ds4.com.skiskandergasmi.services.interfaces;
import ds4.com.skiskandergasmi.entities.Inscription;

import java.util.List;

public interface IInscriptionService {

    List<Inscription> retrieveAllInscription();
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    Inscription retrieveInscription(Long numInscription);

    void removeInscription(Long numInscription);
}
