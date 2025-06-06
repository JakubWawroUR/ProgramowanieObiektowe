package RunInput;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);
    public int InputInt(){
        return scanner.nextInt();
    }
    public String InputString(){ return scanner.nextLine();}
    public double InputDouble(){ return scanner.nextDouble();}
}
