/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseriemedieval;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author WorkStation
 */
public class Manager extends Personnel{
    
    
    
    
    
    /**
     * constructeur de base de MANAGER
     */
    public Manager()
    {
         
    }
    /***
     * actuellement vide
     */
    public void getManager()
    {
    
    }
    
    
    
    /***
     * Permet de récupérer modifier un membre de personnel
     * 
     * @param id_personnel_modifier INT permettant de trouver la personne à modifier
     * @param nom STRING nom
     * @param prenom STRING prenom
     * @param commentaire STRING commentaire
     * @param en_pause BOOLEAN true = est en pause, false = n'est pas en pause
     * @param mdp STRING mot de passe crypté
     */
    public void modifier_personnel(int id_personnel_modifier, String nom, String prenom, String commentaire, boolean en_pause, String mdp)
    {
       
    }
    
    /**
     * not implemented yet
     */
    public void supprimer_personnel()
    {
    
    }
    
    /**
     * Permet de modifier une commande.
     * champ : 
     *  champ - Valeur DATE -> change la date de la commande passée en id. value doit pouvoir être convertis en DATE
     *  champ - Valeur ETAT -> change l'etat d'une commande passée en id. value doit pouvoir prendre une valeur STRING nom d'un etat
     *  champ - Valeur ADD_ARTICLE -> ajoute un article dont le nom STRING value est dans la liste d'articles. 
     *  champ - Valeur DELETE_ARTICLE -> Supprime un article d'une commande pour une personne
     *  champ - Valeur Serveur -> donne la commande du serveur champ au serveur id_personnel
     *  champ - Valeur DELETE_COMMANDE -> 
     * 
     * 
     * @param id_personne
     * @param id_commande
     * @param champ 
     * @param value 
     */
    public void modifier_commande(int id_personne, int id_commande, String champ, String value)
    {
        champ = champ.toUpperCase();
        switch(champ)
        {
            case "DATE":
                this.getListePersonnel().get(id_personne).getListeCommande().get(id_commande).setDateCommande(Date.valueOf(value));
                break;
            case "ETAT":
                this.getListePersonnel().get(id_personne).getListeCommande().get(id_commande).setEtat(value, this);
                break;
            case "ADD_ARTICLE":
                this.getListePersonnel().get(id_personne).getListeCommande().get(id_commande).setArticleCommande(value);
                break;
            case "DELETE_ARTICLE":
                this.getListePersonnel().get(id_personne).getListeCommande().get(id_commande).deleteArticleCommande(value);
                break;
            case "SERVEUR"://permet de donner à un serveur la commande d'un autre, puis de supprimer la commande aprés transfert
                int i = Integer.parseInt(champ);
                this.getListePersonnel().get(id_personne).getListeCommande().add(this.getListePersonnel().get(i).getListeCommande().get(id_commande));
                this.getListePersonnel().get(i).getListeCommande().remove(id_commande);
                break;
            case "DELETE_COMMANDE":
                this.getListePersonnel().get(id_personne).getListeCommande().remove(id_commande);
                break;
            
            default:
                break;
        
        }
        
    }
    
    public ArrayList<Commande> consulter_liste_commandes()
    {
        ArrayList<Commande> commandes = new ArrayList<Commande>();
        for(int i = 0;i<this.liste_personnel.size();i++)
        {
            commandes.addAll(liste_personnel.get(i).getListeCommande());
        }
        
        
        return commandes;
    }
    
    
}
