
public abstract class CreditCard {

	
	public CreditCard(String cardNumber, String expirationDate, String holderName) {
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.holderName = holderName;
	}
	
	private String cardNumber;
	private String expirationDate;
	private String holderName;
	
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", expirationDate=" + expirationDate + ", holderName="
				+ holderName + "]";
	}
	
	
	
}
