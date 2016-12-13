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
    ArrayList<Personnel> liste_personnel;
    
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
     * @param p PERSONNE 
     */
    public Personnel(Personnel p)
    {
        this.id_personnel = p.id_personnel;
        this.nom = p.nom;
        this.prenom = p.prenom;
        this.commentaire = p.commentaire;
        this.en_pause = p.en_pause;
        this.mdp = mdp;
        this.liste_personnel = p.liste_personnel;
    }
    
    
}
