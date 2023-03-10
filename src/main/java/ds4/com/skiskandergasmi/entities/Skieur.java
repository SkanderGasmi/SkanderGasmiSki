package ds4.com.skiskandergasmi.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Entity
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;

    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions;

    @ManyToMany
    private List<Piste> pistes;
    @OneToOne(cascade = CascadeType.REMOVE)
    private Abonnement abonnement;


}

