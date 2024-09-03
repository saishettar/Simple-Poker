public class Card{
    
    // instance variables
    private int suit;
    private int value;

    // default and value constructors
    public Card(int suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public Card(){
        this.suit = 1;
        this.value = 10;
    }

    // getters
    public int getSuit(){
        return this.suit;
    }

    public int getValue(){
        return this.value;
    }

    public char getSuitAsChar(){
        switch(this.suit){
            case 1: return 'H'; 
            case 2: return 'D'; 
            case 3: return 'C'; 
            case 4: return 'S'; 
            default: return '-';
        }
    }

    public String getValueAsStr(){
        if(value == 1){
            return "A";
        }
        else if(value == 11){
            return "J";
        }
        else if(value == 12){
            return "Q";
        }
        else if(value == 13){
            return "K";
        }
        else{
            return this.value + "";
        }
    }

    // toString() and equalsSuit()
    public String toString(){
        return getValueAsStr() + "" + getSuitAsChar();
    }

    public boolean equalsSuit(Card other){
        return this.value == other.value;
    }
}