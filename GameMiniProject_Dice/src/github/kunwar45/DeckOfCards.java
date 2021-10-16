package github.kunwar45;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DeckOfCards {

    private ArrayList<Card> deck;

    public DeckOfCards(){

        this.deck = new ArrayList<>();
        for (Card.Suits suit: Card.Suits.values()){
            for (Card.Ranks rank: Card.Ranks.values()){
                Card newCard = new Card(suit, rank);
                deck.add(newCard);
            }
        }
        System.out.println(deck.get(1).toString());

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
