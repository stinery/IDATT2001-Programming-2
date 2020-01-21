import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();

    //a)
    public void makeADeck(){
        for(int i = 1; i < 14; i ++){
            cards.add(new Card('H', i));
            cards.add(new Card('S', i));
            cards.add(new Card('D', i));
            cards.add(new Card('C', i));
        }
    }

    //b)
    public ArrayList<Card> assign(int n){
        if(n < 1 || n > 52) return null;
        ArrayList<Card> assigned = new ArrayList<>();
        Random card = new Random();

        for(int i = 0; i < n; i ++){
            int theCard = card.nextInt(cards.size());
            assigned.add(cards.get(theCard));
            cards.remove(theCard);
        }
        return assigned;
    }

    //c)
    public void printAllSpades(ArrayList<Card> cards){
        cards.stream().filter(p -> p.getSuit() == 'S')
                .forEach(System.out::println);
    }

    //d)
    public ArrayList<Card> collectAllHearts(ArrayList<Card> cards){
        return cards.stream().filter(p -> p.getSuit() == 'H')
                .collect(Collectors.toCollection(ArrayList::new));
    }

    //e)
    public Collection<String> cardColour(ArrayList<Card> cards){
        return cards.stream().map(p -> {
            if(p.getSuit() == 'H' || p.getSuit() == 'D'){
                return "Red";
            } else {
                return "Black";
            }
        }).collect(Collectors.toCollection(ArrayList::new));
    }

    //f)
    public int sumOfCards(ArrayList<Card> cards){
        return cards.stream().map(Card::getFace).reduce(Integer::sum).get();
    }

    //g)
    public boolean anyQueenOfSpades(ArrayList<Card> cards){
        return cards.stream().anyMatch(p -> p.getSuit() == 'S' && p.getFace() == 12);
    }

    //h)
    public boolean pokerFlush(ArrayList<Card> cards){
        Map<Character, Long> counter = cards.stream()
                .map(Card::getSuit)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return counter.values().stream().anyMatch(p -> p >= 5);
    }
}
