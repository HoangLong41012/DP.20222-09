package entity.payment;

/**
 * @author
 */
public class CreditCard {

    private String cardCode;
    private String owner;
    private String dateExpired;
    protected int cvvCode;

    // vi phạm OCP do Nếu thêm các phương thức thanh toán khác, cần thêm lớp mới (DomestricCart),
    // override các phương thức có sử dụng CreditCard ở các lớp trong subsystem
    public CreditCard(String cardCode, String owner, String dateExpired, int cvvCode) {
        this.cardCode = cardCode;
        this.owner = owner;
        this.dateExpired = dateExpired;
        this.cvvCode = cvvCode;
    }
}
