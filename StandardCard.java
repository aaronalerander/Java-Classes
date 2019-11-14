

public class StandardCard extends Card{





    public StandardCard(String rank, String suit){
        super(suit,rank);
        if(rank.equals("Joker")){
            super.suit = Card.SUITS[4];


        }
    }
    public StandardCard(int rank, String suit){
        super(suit, Card.RANKS[0]);
        if(rank == 1 ) {
            super.rank = Card.RANKS[1];
            super.suit = Card.SUITS[4];

        }if(rank == 2){
            super.rank = Card.RANKS[2];
        }if(rank == 3){
            super.rank = Card.RANKS[3];
        }if(rank == 4){
            super.rank = Card.RANKS[4];
        }if(rank == 5){
            super.rank = Card.RANKS[5];
        }if(rank == 6){
            super.rank = Card.RANKS[6];
        }if(rank == 7){
            super.rank = Card.RANKS[7];
        }if(rank == 8){
            super.rank = Card.RANKS[8];
        }if(rank == 9){
            super.rank = Card.RANKS[9];
        }if(rank == 10){
            super.rank = Card.RANKS[10];
        }if(rank == 11){
            super.rank = Card.RANKS[11];
        }if(rank == 12){
            super.rank = Card.RANKS[12];
        }if(rank == 13){
            super.rank = Card.RANKS[13];
        }if(rank == 14){
            super.rank = Card.RANKS[14];
        }
    }

    public int getRankValue(){
        if(this.getRank().equals(Card.RANKS[1])){
            return 1;
        }if(this.getRank().equals(Card.RANKS[2])){
            return 2;
        }if(this.getRank().equals(Card.RANKS[3])){
            return 3;
        }if(this.getRank().equals(Card.RANKS[4])){
            return 4;
        }if(this.getRank().equals(Card.RANKS[5])){
            return 5;
        }if(this.getRank().equals(Card.RANKS[6])){
            return 6;
        }if(this.getRank().equals(Card.RANKS[7])){
            return 7;
        }if(this.getRank().equals(Card.RANKS[8])){
            return 8;
        }if(this.getRank().equals(Card.RANKS[9])){
            return 9;
        }if(this.getRank().equals(Card.RANKS[10])){
            return 10;
        }if(this.getRank().equals(Card.RANKS[11])){
            return 11;
        }if(this.getRank().equals(Card.RANKS[12])){
            return 12;
        }if(this.getRank().equals(Card.RANKS[13])){
            return 13;
        }if(this.getRank().equals(Card.RANKS[14])){
            return 14;
        }else{
            return 0;
        }
    }
    public static int getSuitValue(Card card){
        if(card.getSuit().equals(Card.SUITS[0])){
            return 0;
        }if(card.getSuit().equals(Card.SUITS[1])){
            return 1;
        }if(card.getSuit().equals(Card.SUITS[2])){
            return 2;
        }if(card.getSuit().equals(Card.SUITS[3])){
            return 3;
        }else{
            return 4;
        }
    }




    @Override
    public int compareTo(Card otherCard){
        int cardSuitValue = StandardCard.getSuitValue(this);
        int otherCardSuitValue = StandardCard.getSuitValue(otherCard);


        if(cardSuitValue > otherCardSuitValue){
            return 1;
        }else if(cardSuitValue < otherCardSuitValue){
            return -1;
        }else{
            int cardRankValue = this.getRankValue();
            int otherCardRankValue = otherCard.getRankValue();

            if(cardRankValue == 0){
                cardRankValue = 15;
            }if(otherCardRankValue == 0){
                otherCardRankValue = 15;
            }

            if(cardRankValue > otherCardRankValue){
                return 1;
            }if(cardRankValue < otherCardRankValue){
                return -1;
            }else{
                return 0;
            }
        }

    }










}
