package Exercise;

import java.util.Scanner;

public class CountMovieSpaces {
    public static void main(String[] args)
    {
        String movieQuote;
        int numberOfSpaces = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your favorite movie quote >>>");
        movieQuote = input.nextLine();

        for(int i = 0; i < movieQuote.length(); i++)
        {
            if(movieQuote.charAt(i) == ' ')
            {
                numberOfSpaces++;
                ++i;
            }
        }

        System.out.print("The number of spaces: " + numberOfSpaces);

//        numberOfSpaces = movieQuote(Character.isWhitespace(numberOfSpaces));
    }
}
