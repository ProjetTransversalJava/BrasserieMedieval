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
public class Personnel {
    
    
    
    private int id_personnel;
    private String nom;
    private String prenom;
    private String commentaire;
    private boolean en_pause;
    private String mdp;
    private ArrayList<Personnel> liste_personnel;
    private ArrayList<Commande> liste_commande;
    
    public Personnel()
    {
        
    }
    
    public Personnel(int id_personnel)
    {
        this.id_personnel = id_personnel;
    }
    
    /**
     * Personnel : classe destinée à devenir un serveur
     * @param id_personnel INT
     * @param nom STRING
     * @param prenom STRING
     * @param commentaire STRING
     * @param en_pause BOOLEAN
     * @param mdp STRING
     */
    public Personnel(int id_personnel, String nom, String prenom, String commentaire, boolean en_pause, String mdp)
    {
        this.id_personnel = id_personnel;
        this.nom = nom;
        this.prenom = prenom;
        this.commentaire = commentaire;
        this.en_pause = en_pause;
        this.mdp = mdp;
        liste_personnel = new ArrayList<Personnel>();
        liste_commande = new ArrayList<Commande>();
    }
    /**
     * 
     * @param id_personnel INT
     * @param nom STRING
     * @param prenom STRING
     * @param commentaire STRING
     * @param en_pause BOOLEAN
     * @param mdp STRING
     * @param liste_personnel ARRAYLIST DE PERSONNELS 
     */
    public Personnel (int id_personnel, String nom, String prenom, String commentaire, boolean en_pause, String mdp, ArrayList<Personnel> liste_personnel)
    {
        this.id_personnel = id_personnel;
        this.nom = nom;
        this.prenom = prenom;
        this.commentaire= commentaire;
        this.en_pause= en_pause;
        this.mdp = mdp;
        this.liste_personnel = liste_personnel;
    
    }
    /**
     * 
     * @param id_personnel
     * @param nom
     * @param prenom
     * @param commentaire
     * @param en_pause
     * @param mdp
     * @param liste_personnel
     * @param liste_commande 
     */
    public Personnel (int id_personnel, String nom, String prenom, String commentaire, boolean en_pause, String mdp, ArrayList<Personnel> liste_personnel, ArrayList<Commande> liste_commande)
    {
        this.id_personnel = id_personnel;
        this.nom = nom;
        this.prenom = prenom;
        this.commentaire= commentaire;
        this.en_pause= en_pause;
        this.mdp = mdp;
        this.liste_personnel = liste_personnel;
        this.liste_commande = liste_commande;
    }
    
    /**
     * 
     * @param p PERSONNE 
     */
    public Personnel(Personnel p)
    {
        this.id_personnel = p.id_personnel;
        this.nom = p.nom;
        this.prenom = p.prenom;
        this.commentaire = p.commentaire;
        this.en_pause = p.en_pause;
        this.mdp = p.mdp;
        this.liste_personnel = p.liste_personnel;
    }
    
    
    /**
     * 
     * @return id_personnel 
     */
    public int getId()
    {
        return id_personnel;
    }
    /**
     * 
     * @param id_personnel 
     */
    public void setId(int id_personnel)
    {
        this.id_personnel = id_personnel;
    }
    /**
     * 
     * @return nom 
     */
    public String getNom()
    {
        return nom;
    }
    /**
     * 
     * @param nom 
     */
    public void setNom(String nom)
    {
       this.nom = nom;
    }
    /**
     * 
     * @return prenom
     */
    public String getPrenom()
    {
        return prenom;
    }
    /**
     * 
     * @param prenom 
     */
    public void SetPrenom(String prenom)
    {
        this.prenom = prenom;
    }
    /**
     * 
     * @return commentaire 
     */
    public String getCommantaire()
    {
        return commentaire;
    }
    /**
     * 
     * @param commentaire 
     */
    public void setCommentaire( String commentaire)
    {
        this.commentaire = commentaire;
    }
    /**
     * 
     * @return en_pause 
     */
    public boolean getEnPause()
    {
        return en_pause;
    }
    /**
     * 
     * @param en_pause 
     */
    public void setEnPause(boolean en_pause)
    {
        this.en_pause = en_pause;
    }
    /**
     * 
     * @return liste_personnel 
     */
    public ArrayList<Personnel> getListePersonnel ()
    {
        return liste_personnel;
    }
    /**
     * 
     * @return mdp 
     */
    public String getMdp()
    {
        return mdp;
    }
    /**
     * 
     * @param mdp 
     */
    public void setMdp(String mdp)
    {
        this.mdp = mdp;
    }
    /**
     * 
     * @param liste_personnel 
     */
    public void setListePersonnel( ArrayList<Personnel> liste_personnel)
    {
        this.liste_personnel = liste_personnel;
    }
    /**
     * 
     * @return liste_commande 
     */
    public ArrayList<Commande> getListeCommande()
    {
        return liste_commande;
    }
    /**
     * 
     * @param liste_commande 
     */
    public void setListeCommande(ArrayList<Commande> liste_commande)
    {
        this.liste_commande = liste_commande;
    }
    
    @Override
    public String toString()
    {
        return nom+" "+prenom+" "+ commentaire + " " + en_pause +" "+mdp;     
    }
   
    public String setData()
    {
        if(id_personnel >=0)
        {
            
        }
        else
        {
            return "SetData error : l'id du personnel n'est pas attribuée";
        }
    }
}
