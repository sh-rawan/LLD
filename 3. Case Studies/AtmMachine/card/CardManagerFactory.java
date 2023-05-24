package AtmMachine.card;

import AtmMachine.data.CardType;

public class CardManagerFactory {
    private CardManagerFactory() {
    }

    public static CardManager getCardManager(CardType cardType) {
        CardManager cardManager = null;
        if (cardType.equals(CardType.CREDIT)) {
            cardManager = new CreditCard();
        } else if (cardType.equals(CardType.DEBIT)) {
            cardManager = new DebitCard();
        } else {
            throw new IllegalStateException("Random message");
        }
        return cardManager;
    }
}
