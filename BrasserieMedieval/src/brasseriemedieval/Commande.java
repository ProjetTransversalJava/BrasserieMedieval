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
    private Etat etat;
    private static ArrayList<Article> liste_article_généraux = new ArrayList<Article>();
    private static ArrayList<Etat> liste_etats = new ArrayList<Etat>();    
    private ArrayList<Article> liste_article_commande;
    
    
   /**
    * 
    * @param id_commande
    * @param dateCommande
    * @param liste_article 
    */ 
   public Commande(int id_commande, Date dateCommande, ArrayList<Article> liste_article_commande)
   {
       this.id_commande = id_commande;
       this.dateCommande = dateCommande;
       this.liste_article_commande = liste_article_commande;
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
       this.liste_article_commande = c.liste_article_commande;
   }
   
   public int getId_commande()
   {
       return id_commande;
   }
   public void setId_commande(int id_commande)
   {
       this.id_commande = id_commande;
   }
   public Date getDateCommande()
   {
       return dateCommande;
   }
   public void setDateCommande(Date dateCommande)
   {
       this.dateCommande = dateCommande;
   }
   public Etat getEtat()
   {
       return etat;
   }
   public void setEtat( Etat etat, Personnel p)
   {
        if(this.etat.getIndex()>etat.getIndex())
       {
           this.etat = etat;
       }
   }
   public void setEtat(Etat etat, Manager m)
   {
       this.etat = etat;
   }
   public ArrayList<Article> getListArticleCommande()
   {
       return liste_article_commande;
   }
   public void setListeArticleCommande(ArrayList<Article> liste_article_commande)
   {
       this.liste_article_commande = liste_article_commande;
   }
   
   

}
