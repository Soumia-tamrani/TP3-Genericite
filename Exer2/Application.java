package com.deuxiemTP.Exer2;

import com.deuxiemTP.Exer2.MetierProduitImpl;
import com.deuxiemTP.Exer2.Produit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    private static Scanner scanner = new Scanner(System.in);
    private static MetierProduitImpl produitMetier;

    public static void main(String[] args) {
        // Initialiser la liste de produits
        List<Produit> listeProduits = initListeProduits();

        produitMetier = new MetierProduitImpl(listeProduits);

        int choix = 0;
        while (choix != 5) {
            afficherMenu();
            choix = scanner.nextInt();
            scanner.nextLine();
            if (choix == 1) {
                List<com.tp4.collections.Produit> p = null;
                afficherListeProduits(null);
            } else if (choix == 2) {
                rechercherProduitParId();
            } else if (choix == 3) {
                ajouterProduit();
            } else if (choix == 4) {
                supprimerProduitParId();
            } else if (choix == 5) {
                System.out.println("Programme quitté.");
            } else {
                System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        }
    }

    // Afficher le menu
    private static void afficherMenu() {
        System.out.println("Menu :");
        System.out.println("1. Afficher la liste des produits");
        System.out.println("2. Rechercher un produit par son id");
        System.out.println("3. Ajouter un nouveau produit dans la liste");
        System.out.println("4. Supprimer un produit par id");
        System.out.println("5. Quitter ce programme");
        System.out.print("Choix : ");
    }

    // Initialiser une liste de produits
    private static List<Produit> initListeProduits() {
        List<Produit> listeProduits = new ArrayList<>();
        return listeProduits;
    }

    // Afficher la liste des produits
    public static void afficherListeProduits(List<com.tp4.collections.Produit> p) {
        List<Produit> listeProduits = produitMetier.getAll();
        if (listeProduits.isEmpty()) {
            System.out.println("Aucun produit dans la liste.");
        } else {
            for (Produit produit : listeProduits) {
                System.out.println("ID: " + produit.getId() + ", Nom: " + produit.getNom() + ", Marque: " + produit.getMarque() + ", Prix: " + produit.getPrix());
            }
        }
    }

    // Rechercher un produit par son id
    private static void rechercherProduitParId() {
        System.out.print("Entrez l'ID du produit à rechercher : ");
        int id = scanner.nextInt();
        Produit produit = (Produit) produitMetier.findById(id);
        if (produit != null) {
            System.out.println("Produit trouvé : " + produit.getNom());
        } else {
            System.out.println("Aucun produit trouvé avec cet ID.");
        }
    }

    // Ajouter un nouveau produit dans la liste
    private static void ajouterProduit() {
        System.out.print("Entrez l'ID du produit : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Entrez le nom du produit : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez la marque du produit : ");
        String marque = scanner.nextLine();
        System.out.print("Entrez le prix du produit : ");
        double prix = scanner.nextDouble();
        System.out.print("Entrez la description du produit : ");
        scanner.nextLine();
        String description = scanner.nextLine();
        System.out.print("Entrez le nombre en stock du produit : ");
        int nombreEnStock = scanner.nextInt();

        Produit nouveauProduit = new Produit(id, nom, marque, prix, description, nombreEnStock);
        produitMetier.add(nouveauProduit);
        System.out.println("Produit ajouté avec succès.");
    }

    // Supprimer un produit par son id
    private static void supprimerProduitParId() {
        System.out.print("Entrez l'ID du produit à supprimer : ");
        int id = scanner.nextInt();
        boolean supprimer = produitMetier.delete(id);
        if (supprimer) {
            System.out.println("Produit supprimé avec succès.");
        } else {
            System.out.println("Aucun produit trouvé avec cet ID.");
        }
    }
}
