package RunInput;
import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);
    public int InputInt(){
        return scanner.nextInt();
    }
    public boolean InputBool(){
        return scanner.nextBoolean();
    }

}