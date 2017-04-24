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
    private static ArrayList<Article> liste_article_generaux = new ArrayList<Article>();
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
   /***
    * 
    * @return id_commande
    */
   public int getId_commande()
   {
       return id_commande;
   }
   /***
    * 
    * @param id_commande INT 
    */
   public void setId_commande(int id_commande)
   {
       this.id_commande = id_commande;
   }
   /**
    * 
    * @return dateCommande
    */
   public Date getDateCommande()
   {
       return dateCommande;
   }
   /***
    * 
    * @param dateCommande DATE 
    */
   public void setDateCommande(Date dateCommande)
   {
       this.dateCommande = dateCommande;
   }
   
      
   /**
    * 
    * @return ETAT de la commande 
    */
   public Etat getEtat()
   {
       return etat;
   }
   
   /***
    * Change l'état de la commande, l'état ne peut être inférieur à la valeur de l'état précédent.
    * (en cours de préparation est avant servie, on ne peut y revenir si servie, est l'état en cours)
    * 
    * @param etat ETAT de la commande
    * @param p PERSONNEL passant la commande
    */
   public void setEtat( Etat etat, Personnel p)
   {
       if(this.etat.getIndex()>etat.getIndex() && etat.getEtat(etat.getNom())!=null)
       {
           this.etat = etat;
       }
   }
   /***
    * Change l'état de la commande.
    * 
    * @param etat
    * @param m 
    */
   public void setEtat(Etat etat, Manager m)
   {
       if(etat.getEtat(etat.getNom())!=null)
       {
           this.etat = etat;
       }
   }
   
   /**
    * Change l'état de la commande. l'état ne peut être inférieur à la valeur de l'état préfédent.
    * (en cours de préparation est avant servie, on ne eput y revenir si servie est l'état en cours)
    * 
    * @param etat
    * @param p 
    */
   public void setEtat(String etat, Personnel p)
   {
       Etat e = new Etat();
       if(e.getEtat(etat)!=null)
       {
           setEtat(e.getEtat(etat),p);
       }
   }
   
   /**
    * 
    * @return liste_article_commande 
    */
   public ArrayList<Article> getListArticleCommande()
   {
       return liste_article_commande;
   }
   
   /**
    * 
    * @param liste_article_commande ARRAYLIST d'articles 
    */
   public void setListeArticleCommande(ArrayList<Article> liste_article_commande)
   {
       this.liste_article_commande = liste_article_commande;
   }
   
   /**
    * 
    * @param a ARTICLE  
    */
   public void setArticleCommande(Article a)
   {
       this.liste_article_commande.add(a);
   }
   
   /**
    * 
    * @param article STRING représentant le nom d'un article
    */
   public void setArticleCommande(String article)
   {
       for(int i =0;i<liste_article_generaux.size();i++)
       {
           if(liste_article_generaux.get(i).getNomArticle().compareTo(article)>0)
           {
               setArticleCommande(liste_article_generaux.get(i));
               break;
           }
       }
   }
   
   /**
    * 
    * @param a ARTICLE 
    */
   public void deleteArticleCommande(Article a)
   {
       liste_article_commande.remove(a);
   }
   
   /**
    * 
    * @param article STRING représentant un article
    */
   public void deleteArticleCommande(String article)
   {
       for (int i =0; i<liste_article_commande.size(); i++)
       {
           if(liste_article_commande.get(i).getNomArticle().compareTo(article)>0)
           {
               deleteArticleCommande(liste_article_commande.get(i));
           }
       }
   }
  
}
