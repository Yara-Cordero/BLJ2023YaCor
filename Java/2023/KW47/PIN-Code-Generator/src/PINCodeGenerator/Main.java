package PINCodeGenerator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the PIN-Code-Generator!");

        int digit = 0;
        do{
            String pin = String.format("%04d", digit);
            System.out.println(pin);
            digit++;
        }while(digit < 10000);
    }
}