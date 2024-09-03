import java.util.ArrayList;
public class Deck{

    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<Card>(52);

        // face cards are left as a number until printed out
        for(int i = 1; i <= 13; i++){
            deck.add(new Card(1, i));
        }
        for(int h = 14; h <= 26; h++){
            deck.add(new Card(2, h - 13));
        }
        for(int j = 27; j <= 39; j++){
            deck.add(new Card(3, j - 26));
        }
        for(int k = 40; k <= 52; k++){
            deck.add(new Card(4, k - 39));
        }
    }

    // shuffle the original deck
    public void shuffle(){
        int i = deck.size();
        
        while(i > 0){
            deck.add(deck.remove((int) (Math.random() * i)));
            i--;
        }
    }

    // draws card from index 0 
    public Card drawCard(){
        return deck.remove(0);
    }
}