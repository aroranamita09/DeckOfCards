package DeckDesign;

import java.util.ArrayList;
import java.util.List;

public class Card implements Comparable<Card>{
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit(){
        return suit;
    }
    public Rank getRank(){
        return rank;
    }

    static  Card createCard(Suit suit,Rank rank){
       Card card=new Card(suit,rank) ;
       return card;
    }
    @Override
    public int compareTo(Card card2) {
        if(card2==null)
            return 1;

        int suit2 = card2.getSuit().getSuitValue();
        int rank2 = card2.getRank().getCardValue();

        if(suit.getSuitValue()!=suit2)
            return suit.getSuitValue() - suit2;
        if(rank.getCardValue() != rank2)
            return rank.getCardValue()  - rank2;

        return 0;
    }
}
