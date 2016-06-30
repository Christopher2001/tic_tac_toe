import java.util.Scanner;

public class O_and_X {

    static Scanner sc = new Scanner (System.in);
    static Tic_tac_toe_logic log = new Tic_tac_toe_logic();
    static Table_instructions draw = new Table_instructions();
    static int m = 0;

    // This is for O and X

    static void ox(String[][] arr){
        for (int a = 0; a < 9; a++){
            if (a % 2 == 0) {
                System.out.println("Player " + draw.name1 + " to play");
                m = sc.nextInt()-1;
                if (m >= 0 && m < 3) {
                    if (arr[0][m] != " ") {
                        System.out.println(draw.err_msg);
                        a -= 1;
                    } else {
                        arr[0][m] = "O";
                        log.table(arr, draw.name1);
                    }
                }
                else if (m >= 3 && m < 6){
                    if (arr[1][m-3] != " "){
                        System.out.println(draw.err_msg);
                        a -= 1;
                    } else {
                        arr[1][m-3] = "O";
                        log.table(arr, draw.name1);
                    }
                }
                else if (m >=6 && m < 9){
                    if (arr[2][m-6] != " "){
                        System.out.println(draw.err_msg);
                        a -= 1;
                    } else {
                        arr[2][m-6] = "O";
                        log.table(arr, draw.name1);
                    }
                }
            }
            else {
                System.out.println("Player " + draw.name2 + " to play");
                m = sc.nextInt()-1;
                if (m >= 0 && m < 3) {
                    if (arr[0][m] != " ") {
                        System.out.println(draw.err_msg);
                        a -= 1;

                    } else {
                        arr[0][m] = "X";
                        log.table(arr, draw.name2);
                    }
                } else if (m >= 3 && m < 6){
                    if (arr[1][m-3] != " "){
                        System.out.println(draw.err_msg);
                        a -= 1;
                    } else {
                        arr[1][m-3] = "X";
                        log.table(arr, draw.name2);
                    }
                } else if (m >=6 && m < 9){
                    if (arr[2][m-6] != " "){
                        System.out.println(draw.err_msg);
                        a -= 1;
                    } else {
                        arr[2][m-6] = "X";
                        log.table(arr, draw.name2);
                    }
                }
            }
        }
    }

    //This is for 1 and 2

    static void one_two(String[][] arr){
        for (int a = 0; a < 9; a++){
            if (a % 2 == 0) {
                System.out.println("Player " + draw.name1 + " to play");
                m = sc.nextInt()-1;
                if (m >= 0 && m < 3) {
                    if (arr[0][m] != " ") {
                        System.out.println(draw.err_msg);
                        a -= 1;
                    } else {
                        arr[0][m] = "1";
                        log.table(arr, draw.name1);
                    }
                }
                else if (m >= 3 && m < 6){
                    if (arr[1][m-3] != " "){
                        System.out.println(draw.err_msg);
                        a -= 1;
                    } else {
                        arr[1][m-3] = "1";
                        log.table(arr, draw.name1);
                    }
                }
                else if (m >=6 && m < 9){
                    if (arr[2][m-6] != " "){
                        System.out.println(draw.err_msg);
                        a -= 1;
                    } else {
                        arr[2][m-6] = "1";
                        log.table(arr, draw.name1);
                    }
                }
            }
            else {
                System.out.println("Player " + draw.name2 + " to play");
                m = sc.nextInt()-1;
                if (m >= 0 && m < 3) {
                    if (arr[0][m] != " ") {
                        System.out.println(draw.err_msg);
                        a -= 1;

                    } else {
                        arr[0][m] = "2";
                        log.table(arr, draw.name2);
                    }
                } else if (m >= 3 && m < 6){
                    if (arr[1][m-3] != " "){
                        System.out.println(draw.err_msg);
                        a -= 1;
                    } else {
                        arr[1][m-3] = "2";
                        log.table(arr, draw.name2);
                    }
                } else if (m >=6 && m < 9){
                    if (arr[2][m-6] != " "){
                        System.out.println(draw.err_msg);
                        a -= 1;
                    } else {
                        arr[2][m-6] = "2";
                        log.table(arr, draw.name2);
                    }
                }
            }
        }
    }
}
