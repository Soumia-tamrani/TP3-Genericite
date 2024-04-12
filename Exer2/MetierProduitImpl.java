package com.deuxiemTP.Exer2;

import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {
    private List<Produit> listeProduits;

    public MetierProduitImpl(List<Produit> listeProduits) {
        this.listeProduits = listeProduits;
    }

    @Override
    public void add(Produit produit) {
        listeProduits.add(produit);
    }

    @Override
    public List<Produit> getAll() {
        return listeProduits;
    }

    @Override
    public Produit findById(long id) {
        for (Produit produit : listeProduits) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        Produit produit = findById(id);
        if (produit != null) {
            listeProduits.remove(produit);
            return true;
        }
        return false;
    }
}
