package com.unasat.vendingmachine.beverages;

public class Beverage {
    private final String merk;
    private final String naam;
    private final String liter;
    private final double prijs;

    public Beverage(String merk, String naam, String liter, double prijs) {
        this.merk = merk;
        this.naam = naam;
        this.liter = liter;
        this.prijs = prijs;
    }

    public void chosenBeverage(){
        System.out.println(merk);
        System.out.println(naam);
        System.out.println(liter);
        System.out.println("Prijs " + prijs + ",- SRD");
        System.out.println("Haalt u uw drank uit de bak");


    }

}
