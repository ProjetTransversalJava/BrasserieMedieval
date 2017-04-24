/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseriemedieval;

import java.util.ArrayList;

/**
 *
 * @author WorkStation
 */
public class Etat {
    
    private String nom;
    private int index;
    private static ArrayList<Etat> listeEtats;
    
    /**
     * CONSTRUCTEUR BASIQUE, SET une liste d'états
     */
    public Etat()
    {
        listeEtats = new ArrayList<Etat>();
    }
    
    /**
     * 
     * @param index INT représentant le niveau de cet état
     */
    public Etat (int index)
    {
        this.index = index;
    }
    
    /**
     * 
     * @param nom 
     */
    public Etat(String nom)
    {
        this.nom = nom;
    }
    
    /**
     * constructeur de base d'état
     * 
     * @param nom STRING
     * @param index INT
     */
    public Etat(String nom, int index)
    {
        this.index = index;
        this.nom = nom;
    }
    
    /**
     * Constructeur de recopie
     * 
     * @param e ETAT
     */
    public Etat(Etat e)
    {
        this.nom = e.nom;
        this.index = e.index;
    }
    
    /**
     * 
     * 
     * @return listeEtats 
     */
    public ArrayList<Etat> getListEtat()
    {
        return listeEtats;
    }
    /**
     * 
     * @param listeEtats  ARRAYLIST ETAT
     */
    public void setListEtat(ArrayList<Etat> listeEtats)
    {
        this.listeEtats = listeEtats;
    }
    
    /**
     * 
     * @return index
     */
    public int getIndex()
    {
        return index;
    }
    
    /**
     * 
     * @param index INT représentant le niveau de l'état 
     */
    public void setIndex( int index)
    {
        this.index = index;
    }
    
    /**
     * 
     * @return nom de l'état 
     */
    public String getNom()
    {
        return nom;
    }
    
    /**
     * 
     * @param nom STRING nom de l'état 
     */
    public void setNom( String nom)
    {
        this.nom = nom;
    }
    
    /**
     *Retourne un état en fonction de son nom. 
     * @param nom STRING nom de l'état
     * @return  ETAT
     */
    public Etat getEtat(String nom)
    {
        for (int i=0; i<listeEtats.size();i++)
        {
            if(listeEtats.get(i).getNom().toUpperCase().compareTo(nom.toUpperCase())>0)
            {
                return listeEtats.get(i);
            }
        }
        return null;
    }
    
    /**
     * ajoute un etat dans la liste des états
     * @param e ETAT
     */
    public void add(Etat e)
    {
        this.listeEtats.add(e);
    }
    
}
