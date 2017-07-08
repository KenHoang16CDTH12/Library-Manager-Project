package kenhoang.model;

/**
 * Created by sample on 7/7/17.
 */
public class CardModel {
    private int idCard;
    private String cardType;
    private int maxBook;

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getMaxBook() {
        return maxBook;
    }

    public void setMaxBook(int maxBook) {
        this.maxBook = maxBook;
    }

    public CardModel(int idCard, String cardType, int maxBook) {
        this.idCard = idCard;
        this.cardType = cardType;
        this.maxBook = maxBook;
    }

    public CardModel() {
    }
}
