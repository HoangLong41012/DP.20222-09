package entity.shippingutils.shippingfee;
import entity.shippingutils.shippingdistance.CalculatingDistanceA;

public class CalculatingFeeA extends CalculatingFee{
  public static final double CALCULATING_FEE_A_DISTANCE_RATIO = 1.2;
  public CalculatingFeeA(String address, String province) {
    super(address, province);
  }

  public int calculateShippingFee(){
    CalculatingDistanceA calculatingDistanceA = new CalculatingDistanceA();
    int distance = CalculatingDistanceA.calculateDistance(address, province);
    int fee = (distance * CALCULATING_FEE_A_DISTANCE_RATIO);
    return (int) fee;
  };
}