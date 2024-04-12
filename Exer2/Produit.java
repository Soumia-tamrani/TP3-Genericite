package com.deuxiemTP.Exer2;

public class Produit {
    private long id ;
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int nombreStock;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNombreStock() {
        return nombreStock;
    }

    public void setNombreStock(int nombreStock) {
        this.nombreStock = nombreStock;
    }

    public Produit(int id, String nom, double prix) {
    }

    public Produit(long id, String nom, String marque, double prix, String description, int nombreStock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nombreStock = nombreStock;
    }
}
