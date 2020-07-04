package DeckDesign;

//A card is compose of suit and a rank.
//Suit can be like spade, hearts, diamond and club (in order)
public enum Suit {
        CLUBS(1),
        SPADES(2),
        HEARTS (3),
        DIAMONDS(4) ;

        private int suitValue;
        private Suit(int suitValue){
            suitValue = suitValue;
        }
        public int getSuitValue(){
                return suitValue;
        }
}
