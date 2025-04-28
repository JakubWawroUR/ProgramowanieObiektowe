import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserDA0 da0 = newUserDA0();

    }
    private static void adminMenu(UserDA0 da0,Scanner scanner) throws  Exception{

    }
    private static void printBanner(String title){
        System.out.println("\n" + "=".repeat(40));
        System.out.print(" " + title);
        System.out.println("\n" + "=".repeat(40));
    }
}