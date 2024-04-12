package com.deuxiemTP.Exer1;

import com.deuxiemTP.Exer1.StorageGenerique;

public class App {
    // Test with Integer
    public static void main(String[] args) {
        StorageGenerique<Integer> s = new StorageGenerique<>();

        // Ajoutez des éléments à l'instance correctement initialisée
        s.addElement(5);
        s.addElement(10);
        s.addElement(13);
        System.out.println("Size: " + s.getSize());
        // Affichez les éléments ajoutés
        for (int i = 0; i < s.getSize(); i++) {
            System.out.println("Element at index " + i + ": " + s.getElement(i));

    }
        s.removeElement(2);
        System.out.println("Size after removal: " + s.getSize());


        // Test with String

            StorageGenerique<String> s2 = new StorageGenerique<>();

            // Ajoutez des éléments à l'instance correctement initialisée
            s2.addElement("PC");
            s2.addElement("Telephone");
            s2.addElement("Four");
            s2.addElement("Cartable");

            // Affichez les éléments ajoutés
            for (int i = 0; i < s2.getSize(); i++) {
                System.out.println("Element de l'index " + i + ": " + s2.getElement(i));

            }
            s2.removeElement(3);
            System.out.println("Size: " + s2.getSize());

        // Test with Double
        StorageGenerique<Double> s3 = new StorageGenerique<>();
        s3.addElement(3.14);
        System.out.println("\nDouble Storage:");
        s3.removeElement(0);
        System.out.println("Element de l'index 0: " + s3.getElement(0));
        System.out.println("Size: " + s3.getSize());

    }
    }

