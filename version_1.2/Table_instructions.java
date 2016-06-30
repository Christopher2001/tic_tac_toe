package For_daddy.Tic_tac_toe_game;

import java.util.Scanner;

/**
 * Created by Satrajit on 2016-06-28.
 */
public class Table_instructions {
    static String name1;
    static String name2;

    // To input names of players

    static void input(){
        Scanner sc = new Scanner (System.in);
        System.out.println("This is a tic-tac-toe game");
        System.out.printf("Enter name of player 1: ");
        name1 = sc.next();
        System.out.println();
        System.out.printf("Enter name of player 2: ");
        name2 = sc.next();
        System.out.println();
    }
    String err_msg = "Value already assigned";

    // To write the instructions

    static void drawing(){
        System.out.println("INSTRUCTIONS");
        System.out.println("------------\n\nName of places (Type that number to place your move on that position)\n---------\n" +
                "1 | 2 | 3\n---------\n4 | 5 | 6\n---------\n7 | 8 | 9\n---------\n\n" +
                "Note: If your input is longer than one digit, only the first digit will be considered\n" +
                "Anything typed after the first character will be ignored!\n\nIf you want to exit press 0\n\n");
    }
}
