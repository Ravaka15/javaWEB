/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ZoR
 */
public class Produit {
    private int idProduit;
    private String nomProduit;
    private int quantiteProduit;
    private int prixUnitaire;

    public Produit(int idProduit, String nomProduit, int quantiteProduit, int prixUnitaire) {
        this.idProduit = idProduit;
        this.nomProduit = nomProduit;
        this.quantiteProduit = quantiteProduit;
        this.prixUnitaire = prixUnitaire;
    }

    public Produit() {
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public int getQuantiteProduit() {
        return quantiteProduit;
    }

    public void setQuantiteProduit(int quantiteProduit) {
        this.quantiteProduit = quantiteProduit;
    }

    public int getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(int prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }   
    
    public String execute(){
        return "success";
    }
}
