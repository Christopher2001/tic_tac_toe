package For_daddy.Tic_tac_toe_game;

/**
 * Created by Satrajit on 2016-06-28.
 */
public class Tic_tac_toe_logic {

    // To clear the table

    static void empty_table(String[][] arrr){
        for (int ro = 0; ro < 3; ro++){
            for (int col = 0; col < 3; col++){
                arrr[ro][col] = " ";
            }
        }
    }

    // To print table after every move and check win, and draw

    static void table(String[][] ar, String player){
        System.out.println("---------------");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(" | " + ar[i][j]);
            }
            System.out.println(" |");
            System.out.println("---------------");
        }

        int count  = 0;
        for (int iii = 0; iii < 3; iii++){
            for (int jjj = 0; jjj < 3; jjj++){
                if (ar[iii][jjj] != " ")
                    count += 1;
            }
        }
        for (int ii = 0; ii < 3; ii++){
            for (int jj = 0; jj < 3; jj++){
                if ((ar[ii][0] == ar[ii][1] && ar[ii][1] == ar[ii][2]) && (ar[ii][0] != " ") && (ar[ii][1] != " ") && (ar[ii][2] != " ")||
                        (ar[0][jj] == ar[1][jj] && ar[1][jj] == ar[2][jj]) && (ar[0][jj] != " ") && (ar[1][jj] != " ") && (ar[2][jj] != " ")||
                        (ar[0][0] == ar[1][1] && ar[1][1] == ar[2][2]) && (ar[0][0] != " ") ||
                        (ar[0][2] == ar[1][1] && ar[1][1] == ar[2][0]) && (ar[0][2] != " ")){
                    System.out.println("Player "+player+" wins!");
                    System.exit(0);
                } else if (count == 9){
                    System.out.println("It's a draw!!!");
                    System.exit(0);
                }
            }
        }
    }
}
