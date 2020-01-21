import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.makeADeck();
        ArrayList<Card> chosen = deck.assign(10);
        System.out.println(chosen);
        deck.printAllSpades(chosen);
        /*
        System.out.println(deck.collectAllHearts(chosen)
                + "\n" + deck.cardColour(chosen)
                + "\n" + deck.sumOfCards(chosen)
                + "\n" + deck.anyQueenOfSpades(chosen)
                + "\n" + deck.pokerFlush(chosen));

         */
        System.out.println(deck.pokerFlush(chosen));
    }
}
