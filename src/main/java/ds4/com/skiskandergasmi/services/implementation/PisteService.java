package ds4.com.skiskandergasmi.services.implementation;

import ds4.com.skiskandergasmi.entities.Piste;
import ds4.com.skiskandergasmi.repositories.IPisteRepository;
import ds4.com.skiskandergasmi.services.interfaces.IPisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PisteService implements IPisteService {

    @Autowired
    IPisteRepository pisteRepository;

    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }
    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public void removePiste(Long id)
    {
        pisteRepository.deleteById(id);
    }
    @Override
    public Optional<Piste> retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste);
    }
}
