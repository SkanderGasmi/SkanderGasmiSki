package ds4.com.skiskandergasmi.services;

import ds4.com.skiskandergasmi.entities.Piste;

import java.util.List;
public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    void removePiste (Long id);
    Piste retrievePiste (Long numPiste);
}
