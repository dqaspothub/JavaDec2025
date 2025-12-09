package com.java.learning.controlFlow;

public class ClassRoomSessionSandhya {

    public static void main(String[] args) {
        /*int timer = 5;

        while (timer >= 0) {
            System.out.println("Brushing... Seconds left: " + timer);
            timer--;
        }*/

        int i = 1;
        while(i<=5){
            System.out.println("The output is " + i);
            i++;
        }

       /* int tries = 1;

        boolean wantToPlayAgain = true;

        do {
            System.out.println("Playing the game. Try #" + tries);
            tries++;
        } while (wantToPlayAgain);*/

/*        int j = 0;

        do{
            System.out.println("New ATM Card checked " + j);
            j++;
        } while (j<3);

        System.out.println("The card is blocked");*/

        String status = "PASS";

        switch (status) {
            case "PASS":
                System.out.println("Your Mark is greater than 35");
                break;

            case "FAIL":
                System.out.println("Your Mark is greater than 35");
                break;

            default:
                System.out.println("Unknown Status");
                break;


        }
}
}
