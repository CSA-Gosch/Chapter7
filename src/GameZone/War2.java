package GameZone;

public class War2 {
    public static void main(String[] args) {
            int card1;
            int card2;
            int suit1;
            int suit2;
            final int CARDS_IN_SUIT = 13;

            String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

            card1 = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
            card2 = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
            suit1 = ((char) (Math.random() * 100) % 4);
            suit2 = ((char) (Math.random() * 100) % 4);


            System.out.println("Your Card is " + setValue(card1)  + " of " + suits[suit1]);
            System.out.println("The computer's card is " + setValue(card2)  + " of " + suits[suit2]);

            if(card1 < card2)
                System.out.println("You lost, SAD!");
            if(card1 > card2)
                System.out.println("You won, Epic!");
            else if (card1 == card2)
                System.out.println("Tied, bruh moment");

    }
    public static String setValue(int num){
        String type = null;
        if(num == 1)
            type = "Ace";
        if(num == 2)
            type = "2";
        if(num == 3)
            type = "3";
        if(num == 4)
            type = "4";
        if(num == 5)
            type = "5";
        if(num == 6)
            type = "6";
        if(num == 7)
            type = "7";
        if(num == 8)
            type = "8";
        if(num == 9)
            type = "9";
        if(num == 10)
            type = "10";
        if(num == 11)
            type = "Jack";
        if(num == 12)
            type = "Queen";
        if(num == 13)
            type = "King";
        return type;
    }
}
