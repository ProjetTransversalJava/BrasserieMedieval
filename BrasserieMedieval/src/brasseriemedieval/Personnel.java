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
    
    
    
    protected  int    id_personnel;
    protected String  nom;
    protected String  prenom;
    protected String  commentaire;
    protected boolean en_pause;
    protected String  mdp;
    protected static ArrayList<Personnel> liste_personnel = new ArrayList<Personnel>();
    protected ArrayList<Commande> liste_commande = new ArrayList<Commande>();
    
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
    public Personnel (int id_personnel, String nom, String prenom, String commentaire, boolean en_pause, String mdp, ArrayList<Commande> liste_commande)
    {
        this.id_personnel = id_personnel;
        this.nom = nom;
        this.prenom = prenom;
        this.commentaire= commentaire;
        this.en_pause= en_pause;
        this.mdp = mdp;
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
    
    public void donnerCommande(int id_commande, Personnel p)
    {
        for( Commande c :liste_commande)
        {
            if(c.getId_commande() == id_commande)
            {
                p.prendreCommande(c);
                break;
            }
        }
        System.out.println("attention, la commande n'existe pas");
    }
    public void prendreCommande(Commande c)
    {
        liste_commande.add(c);
    }
    
    public void modifierEtat(int id_commande, Etat etat)
    {
        for(Commande c:liste_commande)
        {
            if(c.getId_commande() == id_commande)
            {
                c.setEtat(etat, this);
            }
            break;
        }
    }
   
}
