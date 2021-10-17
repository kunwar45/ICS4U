package github.kunwar45;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {

    private ArrayList<Card> deck;

    public DeckOfCards(){

        Card newCard;

        this.deck = new ArrayList<>();
        for (Card.Suits suit: Card.Suits.values()){
            for (Card.Ranks rank: Card.Ranks.values()){
                newCard = new Card(suit, rank);
                System.out.println(newCard);
                deck.add(newCard);
            }
        }

        for (int i = 0; i < deck.size(); i++){
            System.out.println(deck.get(i).toString());
        }

    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public int getSize(){
        return deck.size();
    }

    public void print(){

    }



}
