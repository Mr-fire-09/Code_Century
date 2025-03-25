import  java.util.Scanner;


public class VowelorConsonent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter   a character :");
        char  ch =  sc.next().charAt(0);



        if (Character.isLetter(ch)) {
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                System.out.println(ch + " is a vowel.");
            
                
            }
            else {
                System.out.println(ch + " is a consonant.");
            }
            
        }

        else {
            System.out.println("Invalid input.");
        }
    }
}