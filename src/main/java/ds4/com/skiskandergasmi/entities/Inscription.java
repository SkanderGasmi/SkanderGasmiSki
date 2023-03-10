package ds4.com.skiskandergasmi.entities;

import javax.persistence.Entity;

import javax.persistence.*;

@Entity
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInscrption;
    private int numSemaine;

    @ManyToOne
    private Cours cours;

    @ManyToOne
    private Skieur skieur;

}
