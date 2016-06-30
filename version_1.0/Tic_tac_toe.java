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
        draw.input();
        draw.drawing();
        int[][] arr = new int[3][3];
        int m = 0;
        for (int a = 0; a < 9; a++){
            if (a % 2 == 0) {
                System.out.println("Player " + draw.name1 + " to play");
                m = sc.nextInt()-1;
                if (m >= 0 && m < 3) {
                    if (arr[0][m] != 0) {
                        System.out.println(draw.err_msg);
                        a -= 1;
                    } else {
                        arr[0][m] = 1;
                        log.table(arr, draw.name1);
                    }
                }
                else if (m >= 3 && m < 6){
                    if (arr[1][m-3] != 0){
                        System.out.println(draw.err_msg);
                        a -= 1;
                    } else {
                        arr[1][m-3] = 1;
                        log.table(arr, draw.name1);
                    }
                }
                else if (m >=6 && m < 9){
                    if (arr[2][m-6] != 0){
                        System.out.println(draw.err_msg);
                        a -= 1;
                    } else {
                        arr[2][m-6] = 1;
                        log.table(arr, draw.name1);
                    }
                }
            }
            else {
                System.out.println("Player " + draw.name2 + " to play");
                m = sc.nextInt()-1;
                if (m >= 0 && m < 3) {
                    if (arr[0][m] != 0) {
                        System.out.println(draw.err_msg);
                        a -= 1;
                    } else {
                        arr[0][m] = 2;
                        log.table(arr, draw.name2);
                    }
                } else if (m >= 3 && m < 6){
                    if (arr[1][m-3] != 0){
                        System.out.println(draw.err_msg);
                        a -= 1;
                    } else {
                        arr[1][m-3] = 2;
                        log.table(arr, draw.name2);
                    }
                } else if (m >=6 && m < 9){
                    if (arr[2][m-6] != 0){
                        System.out.println(draw.err_msg);
                        a -= 1;
                    } else {
                        arr[2][m-6] = 2;
                        log.table(arr, draw.name2);
                    }
                }
            }
        }
    }
}