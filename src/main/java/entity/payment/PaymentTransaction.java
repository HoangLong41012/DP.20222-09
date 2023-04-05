package entity.payment;

public class PaymentTransaction {
	private String errorCode;
	private CreditCard card;
	private String transactionId;
	private String transactionContent;
	private int amount;
	private String createdAt;
	
	public PaymentTransaction(String errorCode, CreditCard card, String transactionId, String transactionContent,
                              int amount, String createdAt) {
		super();
		this.errorCode = errorCode;
		this.card = card;
		this.transactionId = transactionId;
		this.transactionContent = transactionContent;
		this.amount = amount;
		this.createdAt = createdAt;
	}
	
	public String getErrorCode() {
		return errorCode;
	}
}
/* có common coupling vì các lớp khác nhau (IntroScreenHandler, HomeScreenHandler, ViewsConfig) đều phụ thuộc vào nhau thông qua sử dụng chung 
một biến định nghĩa các đường dẫn đến các tệp FXML (INTRO_SCREEN_PATH, HOME_PATH) trong lớp ViewsConfig.*/