public class Driver {

    public static void main(String[] args) {
        
        // creating player and deck objects
        Player player1 = new Player();
        Player player2 = new Player();
        Deck deck = new Deck();

        // shuffling the deck
        deck.shuffle();

        // creating and printing hands and score
        player1.draw(5, deck);
        player2.draw(5, deck);
        System.out.println("Player 1: " + player1);
        System.out.println("Player 2: " + player2);

        // determining winner
        if(player1.getScore() > player2.getScore()){
            System.out.println("Player 1 wins!");
        }
        else if(player1.getScore() == player2.getScore()){
            System.out.println("It's a tie!");
        }
        else{
            System.out.println("Player 2 wins!");
        }
    
    }

}
