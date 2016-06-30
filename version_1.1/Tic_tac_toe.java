package For_daddy.Tic_tac_toe_game;

import java.util.Scanner;

/**
 * Created by Satrajit on 2016-06-28.
 */
public class Tic_tac_toe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tic_tac_toe_logic log = new Tic_tac_toe_logic();
        Table_instructions draw = new Table_instructions();
        O_and_X ox = new O_and_X();
        draw.input();
        draw.drawing();
        String[][] arr = new String[3][3];
        log.empty_table(arr);
        int m = 0;
        System.out.println("Do you prefer to play with O and X? (Press 1) or with 1 and 2? (Press 2)");
        int n = sc.nextInt();
        switch(n){
            case 1:
                ox.ox(arr);
                break;
            case 2:
                ox.one_two(arr);
                break;
            default:
                System.out.println("Bad choice!!");
        }
    }
}