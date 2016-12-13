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
public class Article {
    private int id_article;
    private String nom;
    private int prix;
    
    /**
     * 
     * @param id_article INT
     * @param nom STRING
     * @param prix  INT
     */
    public Article(int id_article, String nom, int prix)
    {
        this.id_article = id_article;
        this.nom = nom;
        this.prix = prix; 
    }
    /**
     * 
     * @param id_article STRING
     * @param nom STRING
     * @param prix STRING
     */
    public Article(String id_article, String nom, String prix)
    {
        this.id_article = Integer.parseInt(id_article);
        this.nom = nom;
        this.prix = Integer.parseInt(prix);
    }
    
    /**
     * 
     * @param article ARTICLE
     */
    public Article(Article article)
    {
        this.nom = article.nom;
        this.id_article = article.id_article;
        this.prix = article.prix;
    }
    /**
     * getIdArticle
     * @return 
     */
    public int getIdArticle()
    {
        return id_article;
    }
    /**
     * getNomArticle
     * @return 
     */
    public String getNomArticle()
    {
    
        return nom;
    }
    /**
     * getNomArticle
     * @return 
     */
    public int getPrix()
    {
        return prix; 
    }
    
    /**
     * Article.toString
     * @return 
     */
    public String toString ()
    {
        return id_article + " ; "+ nom + " ; "+ prix + "";
    }
    
    
}
