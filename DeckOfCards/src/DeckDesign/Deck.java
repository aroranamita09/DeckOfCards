package DeckDesign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Deck implements iDeck{
    private Stack<Card> cards = new Stack<Card>();

    public Deck() { }

    public Deck(Suit suit ,Rank rank ){
            cards.push(Card.createCard(suit,rank));
    }
    @Override
    public void shuffle() {
        Collections.shuffle(this.cards);
    }
    @Override
    public void sort() {
        Collections.sort(this.cards);
    }

    public void removeAllCards() {
        this.cards.removeAllElements();
    }

    public void removeCard(Card c) {
        int i = this.cards.search(c);
        this.cards.remove(i);
    }
    public Card getCard(Card c) {
        int i = this.cards.search(c);
        return this.cards.get(i);
    }
    public Card getTopCard() {
        return this.cards.pop();
    }
    public Card getNthCard(int i) {
        return this.cards.get(i);
    }
    public Card addCard(Card c) {
        this.cards.push(c);
        return c;
    }
    public void printCard(Card card){
        System.out.print("The selected card is" + card);
    }
}
