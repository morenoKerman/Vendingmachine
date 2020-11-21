package com.unasat.vendingmachine.app;

import com.unasat.vendingmachine.services.VendingMachineServices;


public class Apllication {
    public static void main(String[] args) {

        VendingMachineServices user1 = new VendingMachineServices();
        VendingMachineServices user2 = new VendingMachineServices();
        user1.beverageNum("1");
        System.out.println(" ");
        user1.beverageNum("2");
        System.out.println(" ");
        user2.beverageNum("1");
        System.out.println(" ");
        user2.beverageNum("2");
        System.out.println(" ");
        user1.beverageNum("3");
    }




}
