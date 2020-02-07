package Exercise;

import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args)
    {
        String babyname1;
        String babyname2;
        String babyname3;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first name >>>");
        babyname1 = input.nextLine();
        System.out.print("Please enter the second name >>>");
        babyname2 = input.nextLine();
        System.out.print("Please enter the third name >>>");
        babyname3 = input.nextLine();

        System.out.print("First combo: " + babyname1 + " " + babyname2 +
        "\nSecond combo: " + babyname1 + " " + babyname3 +
        "\nThird combo: " + babyname2 + " " + babyname3);
    }
}
