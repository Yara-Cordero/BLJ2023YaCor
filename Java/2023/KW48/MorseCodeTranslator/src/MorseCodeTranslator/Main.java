package MorseCodeTranslator;

import java.util.Scanner;
import java.util.*;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;

            do {
                System.out.println("Welcome to the translator!!!");
                System.out.println("1. text to morse\n2. morse to text\n3. exit");

                String inputChoice = scan.nextLine().toLowerCase();

                if(inputChoice.equals("1") || inputChoice.equals("1.") || inputChoice.equals("text to morse")){
                    Translator.letterstoMorse();
                } else if (inputChoice.equals("2") || inputChoice.equals("2.") || inputChoice.equals("morse to text")) {
                    Translator.morseToLetters();
                } else {
                    repeat = false;
                }


            }while(repeat);




    }
}