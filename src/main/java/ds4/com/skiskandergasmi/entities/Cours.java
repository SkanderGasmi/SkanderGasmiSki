package ds4.com.skiskandergasmi.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*Ki ykoli données auto incremented mel base*/
    private long numCours;
    @Column /* nzidou controle espace ou nhotou li nhebou alih bech nbadlou fel table esmou*/
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private float prix;
    private int creneau;

    @Transient /* Mankhalihech todhher fel base*/
    private  int sc;

    @OneToMany(mappedBy = "cours")
    private List<Inscription> inscriptions;
}