package ds4.com.skiskandergasmi.repositories;

import ds4.com.skiskandergasmi.entities.Skieur;
import ds4.com.skiskandergasmi.entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISkieurRepository extends JpaRepository<Skieur,Long>{
    List<Skieur> findSkieurByAbonnement_TypeAbon(TypeAbonnement typeAbonnement);
}
