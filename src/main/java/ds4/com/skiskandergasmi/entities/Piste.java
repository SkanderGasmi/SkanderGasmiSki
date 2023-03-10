package ds4.com.skiskandergasmi.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private int longueur;
    private int pente;

    @ManyToMany
    private List<Skieur> skieurs;
}