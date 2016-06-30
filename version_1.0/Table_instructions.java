import java.util.Scanner;

public class Table_instructions {
    static String name1;
    static String name2;
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
    static void drawing(){
        System.out.println("name of places");
        System.out.println("---------");
        System.out.println("1 | 2 | 3");
        System.out.println("---------");
        System.out.println("4 | 5 | 6");
        System.out.println("---------");
        System.out.println("7 | 8 | 9");
        System.out.println("---------");
        System.out.println();
        System.out.println();
    }
}
