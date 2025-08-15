package dev.lpa;

import java.util.ArrayList;

public class Store {

    // Initalizing our ArrayList ofr holding the Products to be sold in the Store:
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();


    public static void main(String[] args){

        storeProducts.add( new ArtObject("Oil Painting", 1350, "Impressionistic work by ABF painted in 2010"));
        storeProducts.add(new ArtObject("Sculpture", 2000, "Brone work by JFK, produced in 1950"));
    }
}
