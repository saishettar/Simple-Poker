import java.util.ArrayList;
public class Hand{

    // instance variables
    private ArrayList<Card> cards;

    // value and default constructors
    public Hand(int size){
        cards = new ArrayList<Card>(size);
    }

    public Hand(){
        cards = new ArrayList<Card>();
    }

    // getters and setters
    public int getSize(){
        return cards.size();
    }

    public Card getCard(int x){
        return cards.get(x);
    }

    public void addCard(Card card){
        cards.add(card);
    }

    // boolean to confirm x is valid index
    public boolean setCard(int x, Card card){
        if(x < cards.size()){
            cards.set(x, card);
            return true;
        }
        return false;
    }

    // toString()
    public String toString(){
        String output = "";
        
        for(int i = 0; i < cards.size(); i++){
            if(i != cards.size() - 1){
                output += cards.get(i) + ", ";
            }
            else{
                output += cards.get(i);
            }
        }

        return output;
    }
}