package Tasks;

import RunInput.Input;

public class Palindrom {
    public static void SprawdzaniePalindrom(){
        Input input = new Input();
        String slowo = input.InputString();
        boolean palindrom = true;
        int dlugosc = slowo.length();

        for(int i = 0; i < dlugosc; i++){
            if(slowo.charAt(i) == slowo.charAt(dlugosc-i-1)){
                palindrom = true;
            }else{
                palindrom = false;
                break;
            }
        }
        if(palindrom == true){
            System.out.println("Słowo jest Palindromem");
        }else{
            System.out.println("Słowo nie jest Palindromem");
        }
    }
}
