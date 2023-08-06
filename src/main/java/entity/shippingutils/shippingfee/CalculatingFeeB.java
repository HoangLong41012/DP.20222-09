package entity.shippingutils.shippingfee;
import entity.shippingutils.shippingdistance.CalculatingDistanceB;

public class CalculatingFeeB extends CalculatingFee{

  public static final int CALCULATING_FEE_B_BULKINESS_RATIO = 10;
  public static final int CALCULATING_BULKINESS_RATIO = 6000;
  private int length;
  private int width;
  private int height;

  public CalculatingFeeB(String address, String province, int length, int width, int height) {
    super(address, province);
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public int calculateShippingFee(){
    CalculatingDistanceB calculatingDistanceB = new CalculatingDistanceB();
    int distance = CalculatingDistanceB.calculateDistance(address, province);
    int bulkiness = calculateBulkiness();
    int fee = distance + bulkiness * CALCULATING_FEE_B_BULKINESS_RATIO;
  };

  private int calculateBulkiness() {
    return (int) length * width * height / CALCULATING_BULKINESS_RATIO;
  }
}