package Exercise;

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args)
    {
        String word;
        char vowel;
        String ay = "ay";
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a word to be converted >>>");
        word = input.nextLine();
        vowel = word.charAt(0);

        if(vowel == 'a' || vowel == 'e'||vowel == 'i' ||vowel = 'o' ||vowel = 'u'){
            System.out.print(word + ay);
        }

    }
}
