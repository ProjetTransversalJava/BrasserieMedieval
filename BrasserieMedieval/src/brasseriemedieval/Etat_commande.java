/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseriemedieval;

/**
 *
 * @author WorkStation
 */
public class Etat_commande {
    private String nom ;
    
    /**
     * Etat_Commande ; définis l'état de la commande à un instant T
     * @param nom 
     */
    public Etat_commande( String nom)
    {
        this.nom = nom;
    }
    
    /**
     * Etat Commande : constructeur de recopie
     * @param etat_commande 
     */
    public Etat_commande(Etat_commande etat_commande)
    {
        this.nom = etat_commande.nom;
    }
    
    /**
     * Retourne l'etat de la commande actuelle
     * @return 
     */
    public String getNom()
    {
        return nom; 
    }
    
    
}
