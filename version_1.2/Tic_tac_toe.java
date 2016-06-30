import java.util.Scanner;

public class Tic_tac_toe {
    static String[][] arr = new String[3][3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tic_tac_toe_logic log = new Tic_tac_toe_logic();
        Table_instructions draw = new Table_instructions();
        O_and_X ox = new O_and_X();
        draw.input();
        draw.drawing();
        log.empty_table(arr);
        int m = 0;
        System.out.println("Do you prefer to play with O and X? (Press 1) or with 1 and 2? (Press 2)");
        int f_choice = 0;
        do{
            String n = sc.next();
            m = (int)n.charAt(0)-48;
            switch(m){
                case 1:
                    ox.ox(arr);
                    break;
                case 2:
                    ox.one_two(arr);
                    break;
                default:
                    System.out.println("Bad choice!! Please reread the previous sentence and try again!");
                    f_choice = 1;
            }
        }while(f_choice != 0);
    }
}
