package DeckDesign;

public interface iDeck {
    void shuffle();
    void sort();
    Card getCard(Card c);
    Card getTopCard();
    Card getNthCard(int i);
    Card addCard(Card c);
    void printCard(Card card);
}
