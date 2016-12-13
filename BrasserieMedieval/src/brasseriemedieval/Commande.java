/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseriemedieval;
import java.util.*;
/**
 *
 * @author WorkStation
 */
public class Commande {
    private int id_commande;
    private Date dateCommande;
    private int etat;
    
    private ArrayList<Article> liste_article;
    
   /**
    * 
    * @param id_commande
    * @param dateCommande
    * @param liste_article 
    */ 
   public Commande(int id_commande, Date dateCommande, ArrayList<Article> liste_article)
   {
       this.id_commande = id_commande;
       this.dateCommande = dateCommande;
       this.liste_article = liste_article;
   }
   
   /**
    * 
    * @param id_commande
    * @param dateCommande 
    */
   public Commande (int id_commande, Date dateCommande)
   {
       this.id_commande = id_commande;
       this.dateCommande = dateCommande;
   }
   
   /**
    * 
    * @param c 
    */
   public Commande (Commande c)
   {
       this.id_commande = c.id_commande;
       this.dateCommande = c.dateCommande;
       this.liste_article = c.liste_article;
   }
   
   
   /**
    * 
    * @param etat
    * @param p 
    */
   public void modifier_etat(int etat, Personnel p)
   {
       if(this.etat <etat)
       {
           this.etat = etat;
       }
   }
   
    public void modifier_etat(int etat, Manager m)
    {
        this.etat = etat;
    }


}
