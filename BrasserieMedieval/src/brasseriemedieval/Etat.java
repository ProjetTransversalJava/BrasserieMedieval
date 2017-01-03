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
public class Etat {
    
    private String nom;
    private int index;
    
    public Etat()
    {
    
    }
    
    public Etat (int index)
    {
        this.index = index;
    }
    
    public Etat(String nom)
    {
        this.nom = nom;
    }
    
    public Etat(String nom, int index)
    {
        this.index = index;
        this.nom = nom;
    }
    
    public Etat(Etat e)
    {
        this.nom = e.nom;
        this.index = e.index;
    }
    
    public int getIndex()
    {
        return index;
    }
    public void setIndex( int index)
    {
        this.index = index;
    }
    public String getNom()
    {
        return nom;
    }
    public void setNom( String nom)
    {
        this.nom = nom;
    }
    
    
}
