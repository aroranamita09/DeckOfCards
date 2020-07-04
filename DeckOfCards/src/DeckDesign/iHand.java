package DeckDesign;

public interface iHand {
    void addCard(iCard card);
    void removeCard(iCard card);
    void showHand();
    int calculateValue();
}
