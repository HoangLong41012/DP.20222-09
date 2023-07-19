package entity.shippingutils.shippingfee;
import entity.shippingutils.shippingdistance.CalculatingDistanceA;

public class CalculatingFeeA extends CalculatingFee{

  public CalculatingFeeA(String address, String province) {
    super(address, province);
  }

  public int calculateShippingFee(){
    CalculatingDistanceA calculatingDistanceA = new CalculatingDistanceA();
    int distance = CalculatingDistanceA.calculateDistance(address, province);
    int fee = (distance * 1.2);
    return (int) fee;
  };
}