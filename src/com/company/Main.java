package com.company;
import java.util.Scanner;
public class Main {

    private static int getInput(String sLabel){
        int nItem;
        Scanner sc = new Scanner(System.in);
        System.out.print(sLabel);
        nItem = sc.nextInt();
        return nItem;
    }

    public static void main(String[] args) {
	// This program demonstrates a do-while loop consisting of menu selection
        int iUserNum;
        String sWelcome = "Welcome to Big Burger.";
        String sIntro = "All Burgers come with lettuce and tomato on the side.";
        String sPattie = "1. Plain Pattie without bun.";
        String sPlain = "2. Plain burger nothing but the pattie on a bun.";
        String sMushSwiss = "3. Mushroom Swiss burger with a garlic sauce.";
        String sHunters = "4. Hunters Special: Gourmet Cheddar, grilled onions & mushrooms. (sub pattie from local " +
                "fresh game (when available))";
        String sColossal = "5.The Colossal: Provolone and Swiss cheeses on top of double 1/2 lb patties, onion " +
                "straws, green peppers, mushrooms,and bacon";
        String sEruption = "6. The Eruption: American cheese, bacon, onion straws, & 2 fried eggs";
        String sExit = "7. Exit";
        do {
            System.out.println(sWelcome);
            System.out.println(sIntro);
            System.out.println(sPattie);
            System.out.println(sPlain);
            System.out.println(sMushSwiss);
            System.out.println(sHunters);
            System.out.println(sColossal);
            System.out.println(sEruption);
            System.out.println(sExit);
            iUserNum = getInput("Please make a selection: ");
            switch (iUserNum){
                case 1:
                    System.out.println("You have chosen a plain pattie without a bun.");
                    break;
                case 2:
                    System.out.println("You have chosen a plain hamburger.");
                    break;
                case 3:
                    System.out.println("You have chosen the Mushroom Swiss Burger.");
                    break;
                case 4:
                    System.out.println("You have chosen the Hunters Special.");
                    break;
                case 5:
                    System.out.println("You have chosen The Colossal.");
                    break;
                case 6:
                    System.out.println("You have chosen The Eruption.");
                    break;
                case 7:
                    System.out.println("You have chosen to exit.");
                    System.out.println("Thank you for coming to Big Burger, we hope to see you again soon!");
                    break;
                default:
                    System.out.println("That was not a valid entry");
            }

        } while(iUserNum != 1 && iUserNum != 2 && iUserNum != 3 && iUserNum != 4 && iUserNum != 5 &&
                iUserNum != 6 && iUserNum != 7);
        System.out.println(sIntro);
        System.out.println(sPattie);
        System.out.println(sPlain);
        System.out.println(sMushSwiss);
        System.out.println(sHunters);
        System.out.println(sColossal);
        System.out.println(sEruption);
        System.out.println(sExit);
        switch (iUserNum){
            case 1:
                System.out.println("You have chosen a plain pattie without a bun.");
                break;
            case 2:
                System.out.println("You have chosen a plain hamburger.");
                break;
            case 3:
                System.out.println("You have chosen the Mushroom Swiss Burger.");
                break;
            case 4:
                System.out.println("You have chosen the Hunters Special.");
                break;
            case 5:
                System.out.println("You have chosen The Colossal.");
                break;
            case 6:
                System.out.println("You have chosen The Eruption.");
                break;
            case 7:
                System.out.println("You have chosen to exit.");
                System.out.println("Thank you for coming to Big Burger, we hope to see you again soon!");
                break;
            default:
                System.out.println("That was not a valid entry");
        }







    }




}
