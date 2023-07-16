package entity.shippingutils.shippingfee;
import entity.shippingutils.shippingdistance.CalculatingDistanceA;

public class CalculatingFeeA extends CalculatingFee{
  private String address;
  private String province;

  public CalculatingFeeA(String address, String province) {
    this.address = address;
    this.province = province;
  }

  public int calculateShippingFee(){
    CalculatingDistanceA calculatingDistanceA = new CalculatingDistanceA();
    int distance = CalculatingDistanceA.calculateDistance(address, province);
    int fee = (distance * 1.2);
    return (int) fee;
  };
}