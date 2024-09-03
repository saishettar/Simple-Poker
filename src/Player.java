public class Player{
    
    // instance variables
    private Hand hand;
    private double money;
    private int score;

    // default and value constructors
    public Player(int size, double amt){
        this.hand = new Hand(size);
        this.money = amt;
        this.score = 0;
    }

    public Player(){
        this.hand = new Hand(5);
        this.money = 500.0;
        this.score = 0;
    }

    // finds the score based on the hand
    private void scoreHand(){
       int hearts = 0;
       int diamonds = 0;
       int clubs = 0;
       int spades = 0; 

       for(int i = 0; i < hand.getSize(); i++){
           if(hand.getCard(i).getSuit() == 1){
               hearts += valueToScore(hand.getCard(i).getValue());
           }
           else if(hand.getCard(i).getSuit() == 2){
               diamonds += valueToScore(hand.getCard(i).getValue());
           }
           else if(hand.getCard(i).getSuit() == 3){
               clubs += valueToScore(hand.getCard(i).getValue());
           }
           else{
               spades += valueToScore(hand.getCard(i).getValue());
           }
       }

       int max = hearts;
       if(diamonds > max){
           max = diamonds;
       } 
       if(clubs > max){
           max = clubs;
       }
       if(spades > max){
           max = spades;
       }

       this.score = max;
    }

    // getters
    public int getScore(){
        scoreHand();
        return this.score;
    }

    public Hand getHand(){
        return this.hand;
    }

    // two draw methods
    public void draw(Deck deck){
        hand.addCard(deck.drawCard());
    }

    public void draw(int numCards, Deck deck){
        for(int i = 0; i < numCards; i++){
            hand.addCard(deck.drawCard());
        }
    }

    // scores face cards as 10 and aces as 1
    private int valueToScore(int value){
        if(value == 1){
            return 1;
        }
        else if(value == 11 || value == 12 || value == 13){
            return 10;
        }
        else{
            return value;
        }
    }

    // prints hand and the score
    public String toString(){
        return this.hand + " - Score " + getScore();
    }

    public int compareTo(Player other){
        if(getScore() -  other.getScore() >= 0){
            return getScore() -  other.getScore();
        }
        else{
            return other.getScore() - getScore();
        }
    }
}