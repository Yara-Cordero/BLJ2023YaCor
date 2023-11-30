package MorseCodeTranslator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translator {
    protected static void letterstoMorse() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a phrase:");
        String inputPhrase = scan.nextLine().toUpperCase(); //saves the input in string and makes all uppercase

        int i = 0;

        //loops as long as the length of input phrase
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

            //takes phrase puts into a char and translates it with given hash map
            //space at end to read it better
            System.out.print(letterToMorseCode.get(inputPhrase.charAt(i)) + " ");

            //repeat
            i++;
        }
    }

    protected static void morseToLetters() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the morse code:");
        String inputMorse = scan.nextLine().trim(); //gets input and trims any white space before

        //input morse will be split with (.split"\\s+) as it recognizes
        //white space and splits it up to then put each morse code section into the array
        //the "\\s+" is special as it recognizes one or more whitespaces
        String[] morseWords = inputMorse.split("\\s+");

        Map<String, Character> morseToLetter = new HashMap<>();

        morseToLetter.put("·-", 'A');
        morseToLetter.put("-···", 'B');
        morseToLetter.put("-·-·", 'C');
        morseToLetter.put("-..", 'D');
        morseToLetter.put("·", 'E');
        morseToLetter.put("··-·", 'F');
        morseToLetter.put("--·", 'G');
        morseToLetter.put("····", 'H');
        morseToLetter.put("··", 'I');
        morseToLetter.put("·---", 'J');
        morseToLetter.put("-·-", 'K');
        morseToLetter.put("·-··", 'L');
        morseToLetter.put("--", 'M');
        morseToLetter.put("-·", 'N');
        morseToLetter.put("---", 'O');
        morseToLetter.put("·--·", 'P');
        morseToLetter.put("--·-", 'Q');
        morseToLetter.put("·-·", 'R');
        morseToLetter.put("···", 'S');
        morseToLetter.put("-", 'T');
        morseToLetter.put("··-", 'U');
        morseToLetter.put("···-", 'V');
        morseToLetter.put("·--", 'W');
        morseToLetter.put("-··-", 'X');
        morseToLetter.put("-·--", 'Y');
        morseToLetter.put("--··", 'Z');
        morseToLetter.put("·----", '1');
        morseToLetter.put("··---", '2');
        morseToLetter.put("···--", '3');
        morseToLetter.put("····-", '4');
        morseToLetter.put("·····", '5');
        morseToLetter.put("-····", '6');
        morseToLetter.put("--···", '7');
        morseToLetter.put("---··", '8');
        morseToLetter.put("----·", '9');
        morseToLetter.put("-----", '0');
        morseToLetter.put("··--··", '?');
        morseToLetter.put("-·-·--", '!');
        morseToLetter.put("·-·-·-", '.');
        morseToLetter.put("--··--", ',');
        morseToLetter.put("-·-·-·", ';');
        morseToLetter.put("---···", ':');
        morseToLetter.put("·-·-·", '+');
        morseToLetter.put("-····-", '-');
        morseToLetter.put("-··-·", '/');
        morseToLetter.put("-···-", '=');

        //iterates through each element in morsewords array and puts it into the string
        for (String morseWord : morseWords) {
            //if the string morseword contains a key it prints the result
            if (morseToLetter.containsKey(morseWord)) {
                System.out.print(morseToLetter.get(morseWord));
            }
            //if it doesn't find it prints out what..
            else {
                System.out.println("What...");
            }
        }
    }



}
