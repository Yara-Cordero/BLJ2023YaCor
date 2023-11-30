package MorseCodeTranslator;

import java.util.Scanner;
import java.util.*;
import java.util.HashMap;

import static jdk.internal.org.jline.terminal.spi.TerminalProvider.Stream.Input;

public class Main {
    private static void translateLetterstoMorse() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a phrase:");
        String inputPhrase = scan.nextLine().toUpperCase();

        int i = 0;

        while (i < inputPhrase.length() ) {

            HashMap<Character, String> letterToMorseCode = new HashMap<Character, String>();

            letterToMorseCode.put('A', "·-");
            letterToMorseCode.put('B', "-···");
            letterToMorseCode.put('C', "-·-·");
            letterToMorseCode.put('D', "-..");
            letterToMorseCode.put('E', "·");
            letterToMorseCode.put('F', "··-·");
            letterToMorseCode.put('G', "--·");
            letterToMorseCode.put('H', "····");
            letterToMorseCode.put('I', "··");
            letterToMorseCode.put('J', "·---");
            letterToMorseCode.put('K', "-·-");
            letterToMorseCode.put('L', "·-··");
            letterToMorseCode.put('M', "--");
            letterToMorseCode.put('N', "-·");
            letterToMorseCode.put('O', "---");
            letterToMorseCode.put('P', "·--·");
            letterToMorseCode.put('Q', "--·-");
            letterToMorseCode.put('R', "·-·");
            letterToMorseCode.put('S', "···");
            letterToMorseCode.put('T', "-");
            letterToMorseCode.put('U', "··-");
            letterToMorseCode.put('V', "···-");
            letterToMorseCode.put('W', "·--");
            letterToMorseCode.put('X', "-··-");
            letterToMorseCode.put('Y', "-·--");
            letterToMorseCode.put('Z', "--··");
            letterToMorseCode.put('1', "·----");
            letterToMorseCode.put('2', "··---");
            letterToMorseCode.put('3', "···--");
            letterToMorseCode.put('4', "····-");
            letterToMorseCode.put('5', "·····");
            letterToMorseCode.put('6', "-····");
            letterToMorseCode.put('7', "--···");
            letterToMorseCode.put('8', "---··");
            letterToMorseCode.put('9', "----·");
            letterToMorseCode.put('0', "-----");
            letterToMorseCode.put('?', "··--··");
            letterToMorseCode.put('!', "-·-·--");
            letterToMorseCode.put('.', "·-·-·-");
            letterToMorseCode.put(',', "--··--");
            letterToMorseCode.put(';', "-·-·-·");
            letterToMorseCode.put(':', "---···");
            letterToMorseCode.put('+', "·-·-·");
            letterToMorseCode.put('-', "-····-");
            letterToMorseCode.put('/', "-··-·");
            letterToMorseCode.put('=', "-···-");

            System.out.print(letterToMorseCode.get(inputPhrase.charAt(i)) + " ");

            i++;
        }
    }
    public static void main(String[] args) {

        
        translateLetterstoMorse();




    }
}