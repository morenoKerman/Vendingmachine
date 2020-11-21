package com.unasat.vendingmachine.services;

import com.unasat.vendingmachine.beverages.Beverage;

public class VendingMachineServices {

        Beverage beverage1 = new Beverage("Fernades", "Cherry", "0.5l", 5.00);
        Beverage beverage2 = new Beverage("Coca Cola", "Lite", "0.5l", 4.75);

        public void beverageNum(String choice){

            switch (choice){
                case "1":
                    System.out.println("U heeft gekozen");
                    beverage1.chosenBeverage();
                    break;
                case "2":
                    System.out.println("U heeft gekozen");
                    beverage2.chosenBeverage();
                    break;
                default:
                    System.out.println("Maak een andere Keuze");
                    break;
            }
        }
}
