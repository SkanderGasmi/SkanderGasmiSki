package ds4.com.skiskandergasmi.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Moniteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private LocalDate dateRecru;

    @OneToMany
    private List<Cours> cours;

}