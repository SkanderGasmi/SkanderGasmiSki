package ds4.com.skiskandergasmi.services;

import ds4.com.skiskandergasmi.entities.Abonnement;

import java.util.List;

public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnements();
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement (Abonnement abonnement);
    Abonnement removeAbonnement (Long id);
    Abonnement retrieveAbonnement (Long numAbonnement);
}


